package typings.classValidator

import typings.classValidator.typesValidationValidationArgumentsMod.ValidationArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesValidationValidationUtilsMod {
  
  @JSImport("class-validator/types/validation/ValidationUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/validation/ValidationUtils", "ValidationUtils")
  @js.native
  open class ValidationUtils () extends StObject
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
  
  inline def constraintToString(constraint: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("constraintToString")(constraint.asInstanceOf[js.Any]).asInstanceOf[String]
}
