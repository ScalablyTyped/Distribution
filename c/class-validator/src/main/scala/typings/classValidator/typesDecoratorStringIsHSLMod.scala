package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsHSLMod {
  
  @JSImport("class-validator/types/decorator/string/IsHSL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsHSL", "IS_HSL")
  @js.native
  val IS_HSL: /* "isHSL" */ String = js.native
  
  inline def IsHSL_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHSL")().asInstanceOf[PropertyDecorator]
  inline def IsHSL_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHSL")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isHSL(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHSL")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
