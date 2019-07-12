package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatedResponse[T] extends js.Object {
  var address: Address
  var clientToken: java.lang.String
  var creditCard: CreditCard
  var customer: Customer
  var dispute: Dispute
  var merchantAccount: MerchantAccount
  var message: java.lang.String
  var params: stdLib.Record[java.lang.String, _]
  var paymentMethod: PaymentMethod
  var paymentMethodNonce: PaymentMethodNonce
  var settlementBatchSumary: SettlementBatchSummary
  var subscription: Subscription
  var success: scala.Boolean
  var transaction: Transaction
  def errors(): js.Array[java.lang.String]
}

object ValidatedResponse {
  @scala.inline
  def apply[T](
    address: Address,
    clientToken: java.lang.String,
    creditCard: CreditCard,
    customer: Customer,
    dispute: Dispute,
    errors: () => js.Array[java.lang.String],
    merchantAccount: MerchantAccount,
    message: java.lang.String,
    params: stdLib.Record[java.lang.String, _],
    paymentMethod: PaymentMethod,
    paymentMethodNonce: PaymentMethodNonce,
    settlementBatchSumary: SettlementBatchSummary,
    subscription: Subscription,
    success: scala.Boolean,
    transaction: Transaction
  ): ValidatedResponse[T] = {
    val __obj = js.Dynamic.literal(address = address, clientToken = clientToken, creditCard = creditCard, customer = customer, dispute = dispute, errors = js.Any.fromFunction0(errors), merchantAccount = merchantAccount, message = message, params = params, paymentMethod = paymentMethod, paymentMethodNonce = paymentMethodNonce, settlementBatchSumary = settlementBatchSumary, subscription = subscription, success = success, transaction = transaction)
  
    __obj.asInstanceOf[ValidatedResponse[T]]
  }
}

