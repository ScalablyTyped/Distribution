package typings.braintree.mod

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
  var errors: ValidationErrorsCollection
  var merchantAccount: MerchantAccount
  var message: String
  var params: Record[String, _]
  var paymentMethod: PaymentMethod
  var paymentMethodNonce: PaymentMethodNonce
  var settlementBatchSumary: SettlementBatchSummary
  var subscription: Subscription
  var success: Boolean
  var transaction: Transaction
}

object ValidatedResponse {
  @scala.inline
  def apply[T](
    address: Address,
    clientToken: String,
    creditCard: CreditCard,
    customer: Customer,
    dispute: Dispute,
    errors: ValidationErrorsCollection,
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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], clientToken = clientToken.asInstanceOf[js.Any], creditCard = creditCard.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], dispute = dispute.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], paymentMethod = paymentMethod.asInstanceOf[js.Any], paymentMethodNonce = paymentMethodNonce.asInstanceOf[js.Any], settlementBatchSumary = settlementBatchSumary.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidatedResponse[T]]
  }
}

