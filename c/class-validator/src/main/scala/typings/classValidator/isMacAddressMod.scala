package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsMACAddressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsMacAddress", JSImport.Namespace)
@js.native
object isMacAddressMod extends js.Object {
  
  val IS_MAC_ADDRESS: /* "isMacAddress" */ String = js.native
  
  @JSName("IsMACAddress")
  def IsMACAddress_(): PropertyDecorator = js.native
  @JSName("IsMACAddress")
  def IsMACAddress_(optionsArg: js.UndefOr[scala.Nothing], validationOptionsArg: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsMACAddress")
  def IsMACAddress_(optionsArg: IsMACAddressOptions): PropertyDecorator = js.native
  @JSName("IsMACAddress")
  def IsMACAddress_(optionsArg: IsMACAddressOptions, validationOptionsArg: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsMACAddress")
  def IsMACAddress_(validationOptionsArg: ValidationOptions): PropertyDecorator = js.native
  
  def isMACAddress(value: js.Any): Boolean = js.native
  def isMACAddress(value: js.Any, options: IsMACAddressOptions): Boolean = js.native
}
