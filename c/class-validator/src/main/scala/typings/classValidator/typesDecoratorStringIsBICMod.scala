package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsBICMod {
  
  @JSImport("class-validator/types/decorator/string/IsBIC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsBIC", "IS_BIC")
  @js.native
  val IS_BIC: /* "isBIC" */ String = js.native
  
  inline def IsBIC_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBIC")().asInstanceOf[PropertyDecorator]
  inline def IsBIC_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBIC")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isBIC(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBIC")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
