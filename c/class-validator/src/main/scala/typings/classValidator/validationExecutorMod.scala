package typings.classValidator

import org.scalablytyped.runtime.StringDictionary
import typings.classValidator.validationErrorMod.ValidationError
import typings.classValidator.validationMetadataMod.ValidationMetadata
import typings.classValidator.validatorMod.Validator
import typings.classValidator.validatorOptionsMod.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/validation/ValidationExecutor", JSImport.Namespace)
@js.native
object validationExecutorMod extends js.Object {
  
  @js.native
  class ValidationExecutor protected () extends js.Object {
    def this(validator: Validator) = this()
    def this(validator: Validator, validatorOptions: ValidatorOptions) = this()
    
    var awaitingPromises: js.Array[js.Promise[_]] = js.native
    
    var conditionalValidations: js.Any = js.native
    
    var createValidationError: js.Any = js.native
    
    var customValidations: js.Any = js.native
    
    def execute(`object`: js.Object, targetSchema: String, validationErrors: js.Array[ValidationError]): Unit = js.native
    
    var generateValidationError: js.Any = js.native
    
    var getConstraintType: js.Any = js.native
    
    var ignoreAsyncValidations: Boolean = js.native
    
    var mapContexts: js.Any = js.native
    
    var metadataStorage: js.Any = js.native
    
    var nestedValidations: js.Any = js.native
    
    var performValidations: js.Any = js.native
    
    def stripEmptyErrors(errors: js.Array[ValidationError]): js.Array[ValidationError] = js.native
    
    var validator: js.Any = js.native
    
    var validatorOptions: js.Any = js.native
    
    def whitelist(
      `object`: js.Any,
      groupedMetadatas: StringDictionary[js.Array[ValidationMetadata]],
      validationErrors: js.Array[ValidationError]
    ): Unit = js.native
  }
}
