package typings
package cardDashValidatorLib.cardDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("card-validator", JSImport.Namespace)
@js.native
object cardDashValidatorModMembers extends js.Object {
  def cvv(value: java.lang.String): valid = js.native
  def cvv(value: java.lang.String, maxLength: scala.Double): valid = js.native
  def expirationDate(value: cardDashValidatorLib.Anon_Year): validExpirationDate = js.native
  def expirationDate(value: java.lang.String): validExpirationDate = js.native
  def expirationMonth(value: java.lang.String): validExpirationMonth = js.native
  def expirationYear(value: java.lang.String): validExpirationYear = js.native
  def number(value: java.lang.String): validNumber = js.native
  def postalCode(value: java.lang.String): valid = js.native
  def postalCode(value: java.lang.String, options: cardDashValidatorLib.Anon_MinLength): valid = js.native
}

