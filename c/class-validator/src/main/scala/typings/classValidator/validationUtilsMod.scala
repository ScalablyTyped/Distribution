package typings.classValidator

import typings.classValidator.validationArgumentsMod.ValidationArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationUtilsMod {
  
  @JSImport("class-validator/types/validation/ValidationUtils", "ValidationUtils")
  @js.native
  class ValidationUtils () extends StObject
  /* static members */
  object ValidationUtils {
    
    @JSImport("class-validator/types/validation/ValidationUtils", "ValidationUtils.replaceMessageSpecialTokens")
    @js.native
    def replaceMessageSpecialTokens(message: String, validationArguments: ValidationArguments): String = js.native
    @JSImport("class-validator/types/validation/ValidationUtils", "ValidationUtils.replaceMessageSpecialTokens")
    @js.native
    def replaceMessageSpecialTokens(
      message: js.Function1[/* args */ ValidationArguments, String],
      validationArguments: ValidationArguments
    ): String = js.native
  }
}
