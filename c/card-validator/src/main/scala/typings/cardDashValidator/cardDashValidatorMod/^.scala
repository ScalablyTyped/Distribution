package typings.cardDashValidator.cardDashValidatorMod

import typings.cardDashValidator.Anon_MinLength
import typings.cardDashValidator.Anon_Month
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("card-validator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cvv(value: String): valid = js.native
  def cvv(value: String, maxLength: Double): valid = js.native
  def expirationDate(value: String): validExpirationDate = js.native
  def expirationDate(value: Anon_Month): validExpirationDate = js.native
  def expirationMonth(value: String): validExpirationMonth = js.native
  def expirationYear(value: String): validExpirationYear = js.native
  def number(value: String): validNumber = js.native
  def postalCode(value: String): valid = js.native
  def postalCode(value: String, options: Anon_MinLength): valid = js.native
}

