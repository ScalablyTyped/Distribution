package typings.braintree.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatedResponse[T] extends js.Object {
  var address: Address = js.native
  var clientToken: String = js.native
  var credentials: OAuthToken = js.native
  var creditCard: CreditCard = js.native
  var customer: Customer = js.native
  var dispute: Dispute = js.native
  var errors: ValidationErrorsCollection = js.native
  var merchantAccount: MerchantAccount = js.native
  var message: String = js.native
  var params: Record[String, _] = js.native
  var paymentMethod: PaymentMethod = js.native
  var paymentMethodNonce: PaymentMethodNonce = js.native
  var settlementBatchSumary: SettlementBatchSummary = js.native
  var subscription: Subscription = js.native
  var success: Boolean = js.native
  var transaction: Transaction = js.native
}

object ValidatedResponse {
  @scala.inline
  def apply[T](
    address: Address,
    clientToken: String,
    credentials: OAuthToken,
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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], clientToken = clientToken.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], creditCard = creditCard.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], dispute = dispute.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], paymentMethod = paymentMethod.asInstanceOf[js.Any], paymentMethodNonce = paymentMethodNonce.asInstanceOf[js.Any], settlementBatchSumary = settlementBatchSumary.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatedResponse[T]]
  }
  @scala.inline
  implicit class ValidatedResponseOps[Self <: ValidatedResponse[_], T] (val x: Self with ValidatedResponse[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: Address): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentials(value: OAuthToken): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreditCard(value: CreditCard): Self = this.set("creditCard", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomer(value: Customer): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispute(value: Dispute): Self = this.set("dispute", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrors(value: ValidationErrorsCollection): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setMerchantAccount(value: MerchantAccount): Self = this.set("merchantAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: Record[String, _]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentMethod(value: PaymentMethod): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentMethodNonce(value: PaymentMethodNonce): Self = this.set("paymentMethodNonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettlementBatchSumary(value: SettlementBatchSummary): Self = this.set("settlementBatchSumary", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription(value: Subscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransaction(value: Transaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
  }
  
}

