package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestingGateway extends js.Object {
  def settle(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def settlementConfirm(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def settlementDecline(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def settlementOperationWithEnvironmentCheck(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def settlementPending(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
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
  @scala.inline
  implicit class TestingGatewayOps[Self <: TestingGateway] (val x: Self) extends AnyVal {
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
    def setSettle(value: String => js.Promise[ValidatedResponse[Transaction]]): Self = this.set("settle", js.Any.fromFunction1(value))
    @scala.inline
    def setSettlementConfirm(value: String => js.Promise[ValidatedResponse[Transaction]]): Self = this.set("settlementConfirm", js.Any.fromFunction1(value))
    @scala.inline
    def setSettlementDecline(value: String => js.Promise[ValidatedResponse[Transaction]]): Self = this.set("settlementDecline", js.Any.fromFunction1(value))
    @scala.inline
    def setSettlementOperationWithEnvironmentCheck(value: String => js.Promise[ValidatedResponse[Transaction]]): Self = this.set("settlementOperationWithEnvironmentCheck", js.Any.fromFunction1(value))
    @scala.inline
    def setSettlementPending(value: String => js.Promise[ValidatedResponse[Transaction]]): Self = this.set("settlementPending", js.Any.fromFunction1(value))
  }
  
}

