package typings.cloudeventsSdk

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBindingsHttpValidationValidationErrorMod {
  
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
  open class ^ protected ()
    extends StObject
       with ValidationError {
    /**
      * Constructs a new {ValidationError} with the message
      * and array of additional errors.
      * @param {string} message the error message
      * @param {string[]|ErrorObject[]} [errors] any additional errors related to validation
      */
    def this(message: String) = this()
    def this(
      message: String,
      errors: js.Array[
            (typings.ajv.distTypesMod.ErrorObject[String, Record[String, Any], Any]) | String
          ]
    ) = this()
    
    /* CompleteClass */
    var errors: js.Array[
        (typings.ajv.distTypesMod.ErrorObject[String, Record[String, Any], Any]) | String
      ] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  type ErrorObject = typings.ajv.distTypesMod.ErrorObject[String, Record[String, Any], Any]
  
  /**
    * @ignore
    * @typedef {import("ajv").ErrorObject} ErrorObject
    * */
  /**
    * A Error class that will be thrown when a CloudEvent
    * cannot be properly validated against a specification.
    */
  trait ValidationError
    extends StObject
       with Error {
    
    var errors: js.Array[
        (typings.ajv.distTypesMod.ErrorObject[String, Record[String, Any], Any]) | String
      ]
  }
  object ValidationError {
    
    inline def apply(
      errors: js.Array[
          (typings.ajv.distTypesMod.ErrorObject[String, Record[String, Any], Any]) | String
        ],
      message: String,
      name: String
    ): ValidationError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    extension [Self <: ValidationError](x: Self) {
      
      inline def setErrors(
        value: js.Array[
              (typings.ajv.distTypesMod.ErrorObject[String, Record[String, Any], Any]) | String
            ]
      ): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ((typings.ajv.distTypesMod.ErrorObject[String, Record[String, Any], Any]) | String)*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
}
