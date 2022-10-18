package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsMultibyteMod {
  
  @JSImport("class-validator/types/decorator/string/IsMultibyte", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsMultibyte", "IS_MULTIBYTE")
  @js.native
  val IS_MULTIBYTE: /* "isMultibyte" */ String = js.native
  
  inline def IsMultibyte_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMultibyte")().asInstanceOf[PropertyDecorator]
  inline def IsMultibyte_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMultibyte")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isMultibyte(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultibyte")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
