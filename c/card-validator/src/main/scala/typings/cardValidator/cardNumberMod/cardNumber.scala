package typings.cardValidator.cardNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("card-validator/dist/card-number", "cardNumber")
@js.native
object cardNumber extends js.Object {
  
  def apply(value: String): CardNumberVerification = js.native
  def apply(value: String, options: CardNumberOptions): CardNumberVerification = js.native
  def apply(value: js.Any): CardNumberVerification = js.native
  def apply(value: js.Any, options: CardNumberOptions): CardNumberVerification = js.native
}
