package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestingGateway extends js.Object {
  def settle(transactionId: java.lang.String): js.Promise[ValidatedResponse[Transaction]]
  def settlementConfirm(transactionId: java.lang.String): js.Promise[ValidatedResponse[Transaction]]
  def settlementDecline(transactionId: java.lang.String): js.Promise[ValidatedResponse[Transaction]]
  def settlementOperationWithEnvironmentCheck(transactionId: java.lang.String): js.Promise[ValidatedResponse[Transaction]]
  def settlementPending(transactionId: java.lang.String): js.Promise[ValidatedResponse[Transaction]]
}

object TestingGateway {
  @scala.inline
  def apply(
    settle: java.lang.String => js.Promise[ValidatedResponse[Transaction]],
    settlementConfirm: java.lang.String => js.Promise[ValidatedResponse[Transaction]],
    settlementDecline: java.lang.String => js.Promise[ValidatedResponse[Transaction]],
    settlementOperationWithEnvironmentCheck: java.lang.String => js.Promise[ValidatedResponse[Transaction]],
    settlementPending: java.lang.String => js.Promise[ValidatedResponse[Transaction]]
  ): TestingGateway = {
    val __obj = js.Dynamic.literal(settle = js.Any.fromFunction1(settle), settlementConfirm = js.Any.fromFunction1(settlementConfirm), settlementDecline = js.Any.fromFunction1(settlementDecline), settlementOperationWithEnvironmentCheck = js.Any.fromFunction1(settlementOperationWithEnvironmentCheck), settlementPending = js.Any.fromFunction1(settlementPending))
  
    __obj.asInstanceOf[TestingGateway]
  }
}

