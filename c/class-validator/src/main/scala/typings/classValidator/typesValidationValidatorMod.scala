package typings.classValidator

import typings.classValidator.typesValidationValidationErrorMod.ValidationError
import typings.classValidator.typesValidationValidatorOptionsMod.ValidatorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesValidationValidatorMod {
  
  @JSImport("class-validator/types/validation/Validator", "Validator")
  @js.native
  open class Validator () extends StObject {
    
    /**
      * Performs validation of the given object based on decorators or validation schema.
      * Common method for `validateOrReject` and `validate` methods.
      */
    /* private */ var coreValidate: Any = js.native
    
    /**
      * Performs validation of the given object based on decorators used in given object class.
      */
    def validate(`object`: js.Object): js.Promise[js.Array[ValidationError]] = js.native
    def validate(`object`: js.Object, options: ValidatorOptions): js.Promise[js.Array[ValidationError]] = js.native
    /**
      * Performs validation of the given object based on validation schema.
      */
    def validate(schemaName: String, `object`: js.Object): js.Promise[js.Array[ValidationError]] = js.native
    def validate(schemaName: String, `object`: js.Object, options: ValidatorOptions): js.Promise[js.Array[ValidationError]] = js.native
    
    /**
      * Performs validation of the given object based on decorators used in given object class and reject on error.
      */
    def validateOrReject(`object`: js.Object): js.Promise[Unit] = js.native
    def validateOrReject(`object`: js.Object, options: ValidatorOptions): js.Promise[Unit] = js.native
    /**
      * Performs validation of the given object based on validation schema and reject on error.
      */
    def validateOrReject(schemaName: String, `object`: js.Object): js.Promise[Unit] = js.native
    def validateOrReject(schemaName: String, `object`: js.Object, options: ValidatorOptions): js.Promise[Unit] = js.native
    
    /**
      * Performs validation of the given object based on decorators used in given object class.
      * NOTE: This method completely ignores all async validations.
      */
    def validateSync(`object`: js.Object): js.Array[ValidationError] = js.native
    def validateSync(`object`: js.Object, options: ValidatorOptions): js.Array[ValidationError] = js.native
    /**
      * Performs validation of the given object based on validation schema.
      */
    def validateSync(schemaName: String, `object`: js.Object): js.Array[ValidationError] = js.native
    def validateSync(schemaName: String, `object`: js.Object, options: ValidatorOptions): js.Array[ValidationError] = js.native
  }
}
