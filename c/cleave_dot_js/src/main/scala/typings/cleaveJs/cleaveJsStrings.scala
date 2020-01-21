package typings.cleaveJs

import typings.cleaveJs.creditCardMod.CreditCardType
import typings.cleaveJs.optionsMod.NumeralThousandsGroupStyleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cleaveJsStrings {
  @js.native
  sealed trait amex extends CreditCardType
  
  @js.native
  sealed trait dankort extends CreditCardType
  
  @js.native
  sealed trait diners extends CreditCardType
  
  @js.native
  sealed trait discover extends CreditCardType
  
  @js.native
  sealed trait instapayment extends CreditCardType
  
  @js.native
  sealed trait jcb extends CreditCardType
  
  @js.native
  sealed trait lakh extends NumeralThousandsGroupStyleType
  
  @js.native
  sealed trait maestro extends CreditCardType
  
  @js.native
  sealed trait mastercard extends CreditCardType
  
  @js.native
  sealed trait mir extends CreditCardType
  
  @js.native
  sealed trait none extends NumeralThousandsGroupStyleType
  
  @js.native
  sealed trait thousand extends NumeralThousandsGroupStyleType
  
  @js.native
  sealed trait uatp extends CreditCardType
  
  @js.native
  sealed trait unionPay extends CreditCardType
  
  @js.native
  sealed trait unknown extends CreditCardType
  
  @js.native
  sealed trait visa extends CreditCardType
  
  @js.native
  sealed trait wan extends NumeralThousandsGroupStyleType
  
  @scala.inline
  def amex: amex = "amex".asInstanceOf[amex]
  @scala.inline
  def dankort: dankort = "dankort".asInstanceOf[dankort]
  @scala.inline
  def diners: diners = "diners".asInstanceOf[diners]
  @scala.inline
  def discover: discover = "discover".asInstanceOf[discover]
  @scala.inline
  def instapayment: instapayment = "instapayment".asInstanceOf[instapayment]
  @scala.inline
  def jcb: jcb = "jcb".asInstanceOf[jcb]
  @scala.inline
  def lakh: lakh = "lakh".asInstanceOf[lakh]
  @scala.inline
  def maestro: maestro = "maestro".asInstanceOf[maestro]
  @scala.inline
  def mastercard: mastercard = "mastercard".asInstanceOf[mastercard]
  @scala.inline
  def mir: mir = "mir".asInstanceOf[mir]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def thousand: thousand = "thousand".asInstanceOf[thousand]
  @scala.inline
  def uatp: uatp = "uatp".asInstanceOf[uatp]
  @scala.inline
  def unionPay: unionPay = "unionPay".asInstanceOf[unionPay]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def visa: visa = "visa".asInstanceOf[visa]
  @scala.inline
  def wan: wan = "wan".asInstanceOf[wan]
}

