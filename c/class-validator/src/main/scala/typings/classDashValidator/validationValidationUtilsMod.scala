package typings.classDashValidator

import typings.classDashValidator.validationValidationArgumentsMod.ValidationArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/validation/ValidationUtils", JSImport.Namespace)
@js.native
object validationValidationUtilsMod extends js.Object {
  @js.native
  class ValidationUtils () extends js.Object
  
  /* static members */
  @js.native
  object ValidationUtils extends js.Object {
    def replaceMessageSpecialTokens(message: String, validationArguments: ValidationArguments): String = js.native
    def replaceMessageSpecialTokens(
      message: js.Function1[/* args */ ValidationArguments, String],
      validationArguments: ValidationArguments
    ): String = js.native
  }
  
}

