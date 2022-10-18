package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsHexadecimalMod {
  
  @JSImport("class-validator/types/decorator/string/IsHexadecimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsHexadecimal", "IS_HEXADECIMAL")
  @js.native
  val IS_HEXADECIMAL: /* "isHexadecimal" */ String = js.native
  
  inline def IsHexadecimal_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHexadecimal")().asInstanceOf[PropertyDecorator]
  inline def IsHexadecimal_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHexadecimal")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isHexadecimal(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexadecimal")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
