package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsCurrencyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsCurrency", JSImport.Namespace)
@js.native
object isCurrencyMod extends js.Object {
  
  val IS_CURRENCY: /* "isCurrency" */ String = js.native
  
  @JSName("IsCurrency")
  def IsCurrency_(): PropertyDecorator = js.native
  @JSName("IsCurrency")
  def IsCurrency_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsCurrency")
  def IsCurrency_(options: IsCurrencyOptions): PropertyDecorator = js.native
  @JSName("IsCurrency")
  def IsCurrency_(options: IsCurrencyOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isCurrency(value: js.Any): Boolean = js.native
  def isCurrency(value: js.Any, options: IsCurrencyOptions): Boolean = js.native
}
