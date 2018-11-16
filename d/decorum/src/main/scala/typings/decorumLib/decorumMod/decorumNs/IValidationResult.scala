package typings
package decorumLib.decorumMod.decorumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IValidationResult extends js.Object {
  /**
           * A map of field name to validation errors.
           */
  var errors: js.Array[IFieldValidationError]
  /**
           * Whether or not the model is valid.
           */
  var isValid: scala.Boolean
}

