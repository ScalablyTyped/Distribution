package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsMobilePhoneOptions
import typings.validator.mod.validator.MobilePhoneLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsMobilePhone", JSImport.Namespace)
@js.native
object isMobilePhoneMod extends js.Object {
  
  val IS_MOBILE_PHONE: /* "isMobilePhone" */ String = js.native
  
  @JSName("IsMobilePhone")
  def IsMobilePhone_(): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(
    locale: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(locale: js.UndefOr[scala.Nothing], options: IsMobilePhoneOptions): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(
    locale: js.UndefOr[scala.Nothing],
    options: IsMobilePhoneOptions,
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(locale: MobilePhoneLocale): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(
    locale: MobilePhoneLocale,
    options: js.UndefOr[scala.Nothing],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(locale: MobilePhoneLocale, options: IsMobilePhoneOptions): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(locale: MobilePhoneLocale, options: IsMobilePhoneOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isMobilePhone(value: js.Any): Boolean = js.native
  def isMobilePhone(value: js.Any, locale: js.UndefOr[scala.Nothing], options: IsMobilePhoneOptions): Boolean = js.native
  def isMobilePhone(value: js.Any, locale: MobilePhoneLocale): Boolean = js.native
  def isMobilePhone(value: js.Any, locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Boolean = js.native
}
