package typings.cloudeventsSdk.validationErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ignore
  * @typedef {import("ajv").ErrorObject} ErrorObject
  * */
/**
  * A Error class that will be thrown when a CloudEvent
  * cannot be properly validated against a specification.
  */
@JSImport("cloudevents-sdk/lib/bindings/http/validation/validation_error", JSImport.Namespace)
@js.native
class ^ protected () extends ValidationError {
  /**
    * Constructs a new {ValidationError} with the message
    * and array of additional errors.
    * @param {string} message the error message
    * @param {string[]|ErrorObject[]} [errors] any additional errors related to validation
    */
  def this(message: String) = this()
  def this(message: String, errors: js.Array[typings.ajv.mod.ErrorObject | String]) = this()
}
