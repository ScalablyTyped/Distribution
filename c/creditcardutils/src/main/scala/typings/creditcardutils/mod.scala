package typings.creditcardutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("creditcardutils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def formatCardExpiry(expiration: String): String = js.native
  def formatCardNumber(unformatted: String): String = js.native
  def parseCardExpiry(expiration: String): js.Object = js.native
  def parseCardType(cardNumber: String): String = js.native
  def validateCardCVC(cvc: String): Boolean = js.native
  def validateCardCVC(cvc: String, `type`: String): Boolean = js.native
  def validateCardExpiry(month: String, year: String): Boolean = js.native
  def validateCardNumber(cardNumber: String): Boolean = js.native
}

