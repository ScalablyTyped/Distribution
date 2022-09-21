package typings.classValidator

import typings.classValidator.validationArgumentsMod.ValidationArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorConstraintInterfaceMod {
  
  @js.native
  trait ValidatorConstraintInterface extends StObject {
    
    /**
      * Gets default message when validation for this constraint fail.
      */
    var defaultMessage: js.UndefOr[js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String]] = js.native
    
    /**
      * Method to be called to perform custom validation over given value.
      */
    def validate(value: Any): js.Promise[Boolean] | Boolean = js.native
    def validate(value: Any, validationArguments: ValidationArguments): js.Promise[Boolean] | Boolean = js.native
  }
}
