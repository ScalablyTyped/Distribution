package typings
package decorumLib.decorumMod.decorumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PatternValidator extends BaseValidator {
  var pattern: stdLib.RegExp
  def isValid(value: js.Any): scala.Boolean
}

