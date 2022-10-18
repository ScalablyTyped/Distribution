package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsCurrencyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsCurrencyMod {
  
  @JSImport("class-validator/types/decorator/string/IsCurrency", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsCurrency", "IS_CURRENCY")
  @js.native
  val IS_CURRENCY: /* "isCurrency" */ String = js.native
  
  inline def IsCurrency_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsCurrency")().asInstanceOf[PropertyDecorator]
  inline def IsCurrency_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsCurrency")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsCurrency_(options: IsCurrencyOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsCurrency")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsCurrency_(options: IsCurrencyOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsCurrency")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isCurrency(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCurrency")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isCurrency(value: Any, options: IsCurrencyOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCurrency")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
