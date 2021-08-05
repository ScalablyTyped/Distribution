package typings.classValidator

import typings.classValidator.validationArgumentsMod.ValidationArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationUtilsMod {
  
  @JSImport("class-validator/types/validation/ValidationUtils", "ValidationUtils")
  @js.native
  class ValidationUtils () extends StObject
  /* static members */
  object ValidationUtils {
    
    @JSImport("class-validator/types/validation/ValidationUtils", "ValidationUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def replaceMessageSpecialTokens(message: String, validationArguments: ValidationArguments): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceMessageSpecialTokens")(message.asInstanceOf[js.Any], validationArguments.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def replaceMessageSpecialTokens(
      message: js.Function1[/* args */ ValidationArguments, String],
      validationArguments: ValidationArguments
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceMessageSpecialTokens")(message.asInstanceOf[js.Any], validationArguments.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
