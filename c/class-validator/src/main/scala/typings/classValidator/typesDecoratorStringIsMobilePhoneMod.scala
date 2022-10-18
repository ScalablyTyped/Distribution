package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsMobilePhoneOptions
import typings.validator.mod.validator.MobilePhoneLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsMobilePhoneMod {
  
  @JSImport("class-validator/types/decorator/string/IsMobilePhone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsMobilePhone", "IS_MOBILE_PHONE")
  @js.native
  val IS_MOBILE_PHONE: /* "isMobilePhone" */ String = js.native
  
  inline def IsMobilePhone_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")().asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: Unit, options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: Unit, options: IsMobilePhoneOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: Unit, options: IsMobilePhoneOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: MobilePhoneLocale): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: MobilePhoneLocale, options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: MobilePhoneLocale, options: IsMobilePhoneOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: MobilePhoneLocale, options: IsMobilePhoneOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isMobilePhone(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isMobilePhone(value: Any, locale: Unit, options: IsMobilePhoneOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMobilePhone(value: Any, locale: MobilePhoneLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMobilePhone(value: Any, locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
