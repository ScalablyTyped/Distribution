package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.braintreeStrings.AndroidPayCard
  - typings.braintree.braintreeStrings.ApplePayCard
  - typings.braintree.braintreeStrings.CreditCard
  - typings.braintree.braintreeStrings.MasterpassCard
  - typings.braintree.braintreeStrings.PayPalAccount
  - typings.braintree.braintreeStrings.UsBankAccount
  - typings.braintree.braintreeStrings.VenmoAccount
  - typings.braintree.braintreeStrings.VisaCheckoutCard
  - typings.braintree.braintreeStrings.SamsungPayCard
*/
trait PaymentMethodType extends js.Object

object PaymentMethodType {
  @scala.inline
  def AndroidPayCard: typings.braintree.braintreeStrings.AndroidPayCard = this.cast("AndroidPayCard")
  @scala.inline
  def ApplePayCard: typings.braintree.braintreeStrings.ApplePayCard = this.cast("ApplePayCard")
  @scala.inline
  def CreditCard: typings.braintree.braintreeStrings.CreditCard = this.cast("CreditCard")
  @scala.inline
  def MasterpassCard: typings.braintree.braintreeStrings.MasterpassCard = this.cast("MasterpassCard")
  @scala.inline
  def PayPalAccount: typings.braintree.braintreeStrings.PayPalAccount = this.cast("PayPalAccount")
  @scala.inline
  def SamsungPayCard: typings.braintree.braintreeStrings.SamsungPayCard = this.cast("SamsungPayCard")
  @scala.inline
  def UsBankAccount: typings.braintree.braintreeStrings.UsBankAccount = this.cast("UsBankAccount")
  @scala.inline
  def VenmoAccount: typings.braintree.braintreeStrings.VenmoAccount = this.cast("VenmoAccount")
  @scala.inline
  def VisaCheckoutCard: typings.braintree.braintreeStrings.VisaCheckoutCard = this.cast("VisaCheckoutCard")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

