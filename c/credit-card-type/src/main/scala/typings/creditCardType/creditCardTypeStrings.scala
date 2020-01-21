package typings.creditCardType

import typings.creditCardType.mod.CardBrand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object creditCardTypeStrings {
  @js.native
  sealed trait `american-express` extends CardBrand
  
  @js.native
  sealed trait `diners-club` extends CardBrand
  
  @js.native
  sealed trait discover extends CardBrand
  
  @js.native
  sealed trait jcb extends CardBrand
  
  @js.native
  sealed trait maestro extends CardBrand
  
  @js.native
  sealed trait mastercard extends CardBrand
  
  @js.native
  sealed trait unionpay extends CardBrand
  
  @js.native
  sealed trait visa extends CardBrand
  
  @scala.inline
  def `american-express`: `american-express` = "american-express".asInstanceOf[`american-express`]
  @scala.inline
  def `diners-club`: `diners-club` = "diners-club".asInstanceOf[`diners-club`]
  @scala.inline
  def discover: discover = "discover".asInstanceOf[discover]
  @scala.inline
  def jcb: jcb = "jcb".asInstanceOf[jcb]
  @scala.inline
  def maestro: maestro = "maestro".asInstanceOf[maestro]
  @scala.inline
  def mastercard: mastercard = "mastercard".asInstanceOf[mastercard]
  @scala.inline
  def unionpay: unionpay = "unionpay".asInstanceOf[unionpay]
  @scala.inline
  def visa: visa = "visa".asInstanceOf[visa]
}

