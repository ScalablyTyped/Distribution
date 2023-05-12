package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsBase58Mod {
  
  @JSImport("class-validator/types/decorator/string/IsBase58", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsBase58", "IS_BASE58")
  @js.native
  val IS_BASE58: /* "isBase58" */ String = js.native
  
  inline def IsBase58_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase58")().asInstanceOf[PropertyDecorator]
  inline def IsBase58_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase58")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isBase58(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase58")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
