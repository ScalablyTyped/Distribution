package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsFQDNOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsFQDN", JSImport.Namespace)
@js.native
object isFQDNMod extends js.Object {
  val IS_FQDN: /* "isFqdn" */ String = js.native
  @JSName("IsFQDN")
  def IsFQDN_(): PropertyDecorator = js.native
  @JSName("IsFQDN")
  def IsFQDN_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsFQDN")
  def IsFQDN_(options: IsFQDNOptions): PropertyDecorator = js.native
  @JSName("IsFQDN")
  def IsFQDN_(options: IsFQDNOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isFQDN(value: js.Any): Boolean = js.native
  def isFQDN(value: js.Any, options: IsFQDNOptions): Boolean = js.native
}

