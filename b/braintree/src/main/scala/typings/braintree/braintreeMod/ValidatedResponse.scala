package typings.braintree.braintreeMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatedResponse[T] extends js.Object {
  var address: Address
  var clientToken: String
  var creditCard: CreditCard
  var customer: Customer
  var dispute: Dispute
  var merchantAccount: MerchantAccount
  var message: String
  var params: Record[String, _]
  var paymentMethod: PaymentMethod
  var paymentMethodNonce: PaymentMethodNonce
  var settlementBatchSumary: SettlementBatchSummary
  var subscription: Subscription
  var success: Boolean
  var transaction: Transaction
  def errors(): js.Array[String]
}

object ValidatedResponse {
  @scala.inline
  def apply[T](
    address: Address,
    clientToken: String,
    creditCard: CreditCard,
    customer: Customer,
    dispute: Dispute,
    errors: () => js.Array[String],
    merchantAccount: MerchantAccount,
    message: String,
    params: Record[String, _],
    paymentMethod: PaymentMethod,
    paymentMethodNonce: PaymentMethodNonce,
    settlementBatchSumary: SettlementBatchSummary,
    subscription: Subscription,
    success: Boolean,
    transaction: Transaction
  ): ValidatedResponse[T] = {
    val __obj = js.Dynamic.literal(address = address, clientToken = clientToken, creditCard = creditCard, customer = customer, dispute = dispute, errors = js.Any.fromFunction0(errors), merchantAccount = merchantAccount, message = message, params = params, paymentMethod = paymentMethod, paymentMethodNonce = paymentMethodNonce, settlementBatchSumary = settlementBatchSumary, subscription = subscription, success = success, transaction = transaction)
  
    __obj.asInstanceOf[ValidatedResponse[T]]
  }
}

