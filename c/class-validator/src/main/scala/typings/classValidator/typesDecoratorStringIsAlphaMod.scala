package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.AlphaLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsAlphaMod {
  
  @JSImport("class-validator/types/decorator/string/IsAlpha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsAlpha", "IS_ALPHA")
  @js.native
  val IS_ALPHA: /* "isAlpha" */ String = js.native
  
  inline def IsAlpha_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAlpha")().asInstanceOf[PropertyDecorator]
  inline def IsAlpha_(locale: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAlpha")(locale.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsAlpha_(locale: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsAlpha")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsAlpha_(locale: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsAlpha")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isAlpha(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlpha")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isAlpha(value: Any, locale: AlphaLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlpha")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
