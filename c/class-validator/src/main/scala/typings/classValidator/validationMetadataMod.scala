package typings.classValidator

import typings.classValidator.validationArgumentsMod.ValidationArguments
import typings.classValidator.validationMetadataArgsMod.ValidationMetadataArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/metadata/ValidationMetadata", JSImport.Namespace)
@js.native
object validationMetadataMod extends js.Object {
  
  @js.native
  class ValidationMetadata protected () extends js.Object {
    def this(args: ValidationMetadataArgs) = this()
    
    /**
      * Indicates if validation must be performed always, no matter of validation groups used.
      */
    var always: Boolean = js.native
    
    /**
      * Constraint class that performs validation. Used only for custom validations.
      */
    var constraintCls: js.Function = js.native
    
    /**
      * Array of constraints of this validation.
      */
    var constraints: js.Array[_] = js.native
    
    var context: js.UndefOr[js.Any] = js.native
    
    /**
      * Specifies if validated value is an array and each of its item must be validated.
      */
    var each: Boolean = js.native
    
    /**
      * Validation groups used for this validation.
      */
    var groups: js.Array[String] = js.native
    
    /**
      * Validation message to be shown in the case of error.
      */
    var message: String | (js.Function1[/* args */ ValidationArguments, String]) = js.native
    
    /**
      * Property of the object to be validated.
      */
    var propertyName: String = js.native
    
    /**
      * Target class to which this validation is applied.
      */
    var target: js.Function | String = js.native
    
    /**
      * Validation type.
      */
    var `type`: String = js.native
    
    /**
      * Extra options specific to validation type.
      */
    var validationTypeOptions: js.Any = js.native
  }
}
