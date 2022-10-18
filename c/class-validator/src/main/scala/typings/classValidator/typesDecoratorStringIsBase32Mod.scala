package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsBase32Mod {
  
  @JSImport("class-validator/types/decorator/string/IsBase32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsBase32", "IS_BASE32")
  @js.native
  val IS_BASE32: /* "isBase32" */ String = js.native
  
  inline def IsBase32_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase32")().asInstanceOf[PropertyDecorator]
  inline def IsBase32_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase32")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isBase32(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase32")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
