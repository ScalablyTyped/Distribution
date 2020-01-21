package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestingGateway extends js.Object {
  def settle(transactionId: String): js.Promise[ValidatedResponse[Transaction]]
  def settlementConfirm(transactionId: String): js.Promise[ValidatedResponse[Transaction]]
  def settlementDecline(transactionId: String): js.Promise[ValidatedResponse[Transaction]]
  def settlementOperationWithEnvironmentCheck(transactionId: String): js.Promise[ValidatedResponse[Transaction]]
  def settlementPending(transactionId: String): js.Promise[ValidatedResponse[Transaction]]
}

object TestingGateway {
  @scala.inline
  def apply(
    settle: String => js.Promise[ValidatedResponse[Transaction]],
    settlementConfirm: String => js.Promise[ValidatedResponse[Transaction]],
    settlementDecline: String => js.Promise[ValidatedResponse[Transaction]],
    settlementOperationWithEnvironmentCheck: String => js.Promise[ValidatedResponse[Transaction]],
    settlementPending: String => js.Promise[ValidatedResponse[Transaction]]
  ): TestingGateway = {
    val __obj = js.Dynamic.literal(settle = js.Any.fromFunction1(settle), settlementConfirm = js.Any.fromFunction1(settlementConfirm), settlementDecline = js.Any.fromFunction1(settlementDecline), settlementOperationWithEnvironmentCheck = js.Any.fromFunction1(settlementOperationWithEnvironmentCheck), settlementPending = js.Any.fromFunction1(settlementPending))
  
    __obj.asInstanceOf[TestingGateway]
  }
}

