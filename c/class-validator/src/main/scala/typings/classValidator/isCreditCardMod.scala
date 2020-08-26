package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsCreditCard", JSImport.Namespace)
@js.native
object isCreditCardMod extends js.Object {
  val IS_CREDIT_CARD: /* "isCreditCard" */ String = js.native
  @JSName("IsCreditCard")
  def IsCreditCard_(): PropertyDecorator = js.native
  @JSName("IsCreditCard")
  def IsCreditCard_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isCreditCard(value: js.Any): Boolean = js.native
}

