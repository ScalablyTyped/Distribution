package typings
package cardDashValidatorLib.cardDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("card-validator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cvv(value: java.lang.String): cardDashValidatorLib.cardDashValidatorMod.valid = js.native
  def cvv(value: java.lang.String, maxLength: scala.Double): cardDashValidatorLib.cardDashValidatorMod.valid = js.native
  def expirationDate(value: cardDashValidatorLib.Anon_Month): cardDashValidatorLib.cardDashValidatorMod.validExpirationDate = js.native
  def expirationDate(value: java.lang.String): cardDashValidatorLib.cardDashValidatorMod.validExpirationDate = js.native
  def expirationMonth(value: java.lang.String): cardDashValidatorLib.cardDashValidatorMod.validExpirationMonth = js.native
  def expirationYear(value: java.lang.String): cardDashValidatorLib.cardDashValidatorMod.validExpirationYear = js.native
  def number(value: java.lang.String): cardDashValidatorLib.cardDashValidatorMod.validNumber = js.native
  def postalCode(value: java.lang.String): cardDashValidatorLib.cardDashValidatorMod.valid = js.native
  def postalCode(value: java.lang.String, options: cardDashValidatorLib.Anon_MinLength): cardDashValidatorLib.cardDashValidatorMod.valid = js.native
}

