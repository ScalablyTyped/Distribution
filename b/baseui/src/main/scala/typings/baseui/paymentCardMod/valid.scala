package typings.baseui.paymentCardMod

import typings.cardValidator.anon.MinLength
import typings.cardValidator.anon.Month
import typings.cardValidator.mod.validExpirationDate
import typings.cardValidator.mod.validExpirationMonth
import typings.cardValidator.mod.validExpirationYear
import typings.cardValidator.mod.validNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/payment-card", "valid")
@js.native
object valid extends js.Object {
  def cvv(value: String): typings.cardValidator.mod.valid = js.native
  def cvv(value: String, maxLength: Double): typings.cardValidator.mod.valid = js.native
  def expirationDate(value: String): validExpirationDate = js.native
  def expirationDate(value: Month): validExpirationDate = js.native
  def expirationMonth(value: String): validExpirationMonth = js.native
  def expirationYear(value: String): validExpirationYear = js.native
  def number(value: String): validNumber = js.native
  def postalCode(value: String): typings.cardValidator.mod.valid = js.native
  def postalCode(value: String, options: MinLength): typings.cardValidator.mod.valid = js.native
}

