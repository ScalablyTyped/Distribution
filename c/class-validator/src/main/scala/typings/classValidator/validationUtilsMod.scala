package typings.classValidator

import typings.classValidator.validationArgumentsMod.ValidationArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/validation/ValidationUtils", JSImport.Namespace)
@js.native
object validationUtilsMod extends js.Object {
  
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
