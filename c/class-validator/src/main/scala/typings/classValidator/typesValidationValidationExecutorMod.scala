package typings.classValidator

import org.scalablytyped.runtime.StringDictionary
import typings.classValidator.typesMetadataValidationMetadataMod.ValidationMetadata
import typings.classValidator.typesValidationValidationErrorMod.ValidationError
import typings.classValidator.typesValidationValidatorMod.Validator
import typings.classValidator.typesValidationValidatorOptionsMod.ValidatorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesValidationValidationExecutorMod {
  
  @JSImport("class-validator/types/validation/ValidationExecutor", "ValidationExecutor")
  @js.native
  open class ValidationExecutor protected () extends StObject {
    def this(validator: Validator) = this()
    def this(validator: Validator, validatorOptions: ValidatorOptions) = this()
    
    var awaitingPromises: js.Array[js.Promise[Any]] = js.native
    
    /* private */ var conditionalValidations: Any = js.native
    
    /* private */ var createValidationError: Any = js.native
    
    /* private */ var customValidations: Any = js.native
    
    def execute(`object`: js.Object, targetSchema: String, validationErrors: js.Array[ValidationError]): Unit = js.native
    
    /* private */ var generateValidationError: Any = js.native
    
    /* private */ var getConstraintType: Any = js.native
    
    var ignoreAsyncValidations: Boolean = js.native
    
    /* private */ var mapContexts: Any = js.native
    
    /* private */ var metadataStorage: Any = js.native
    
    /* private */ var nestedValidations: Any = js.native
    
    /* private */ var performValidations: Any = js.native
    
    def stripEmptyErrors(errors: js.Array[ValidationError]): js.Array[ValidationError] = js.native
    
    /* private */ var validator: Any = js.native
    
    /* private */ var validatorOptions: Any = js.native
    
    def whitelist(
      `object`: Any,
      groupedMetadatas: StringDictionary[js.Array[ValidationMetadata]],
      validationErrors: js.Array[ValidationError]
    ): Unit = js.native
  }
}
