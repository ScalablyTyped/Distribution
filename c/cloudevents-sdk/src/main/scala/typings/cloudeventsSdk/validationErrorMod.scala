package typings.cloudeventsSdk

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationErrorMod {
  
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
  
  type ErrorObject = typings.ajv.mod.ErrorObject
  
  /**
    * @ignore
    * @typedef {import("ajv").ErrorObject} ErrorObject
    * */
  /**
    * A Error class that will be thrown when a CloudEvent
    * cannot be properly validated against a specification.
    */
  @js.native
  trait ValidationError extends Error {
    
    var errors: js.Array[typings.ajv.mod.ErrorObject | String] = js.native
  }
  object ValidationError {
    
    @scala.inline
    def apply(errors: js.Array[typings.ajv.mod.ErrorObject | String], message: String, name: String): ValidationError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit class ValidationErrorMutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[typings.ajv.mod.ErrorObject | String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: (typings.ajv.mod.ErrorObject | String)*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
}
