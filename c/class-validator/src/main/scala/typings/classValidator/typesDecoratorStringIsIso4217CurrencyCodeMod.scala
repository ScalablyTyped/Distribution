package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsIso4217CurrencyCodeMod {
  
  @JSImport("class-validator/types/decorator/string/is-iso4217-currency-code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/is-iso4217-currency-code", "IS_ISO4217_CURRENCY_CODE")
  @js.native
  val IS_ISO4217_CURRENCY_CODE: /* "isISO4217CurrencyCode" */ String = js.native
  
  inline def IsISO4217CurrencyCode_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO4217CurrencyCode")().asInstanceOf[PropertyDecorator]
  inline def IsISO4217CurrencyCode_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO4217CurrencyCode")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isISO4217CurrencyCode(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISO4217CurrencyCode")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
