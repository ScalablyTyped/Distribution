package typings.braintree.mod

import typings.braintree.AnonGroupByCustomField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettlementBatchSummaryGateway extends js.Object {
  def generate(request: AnonGroupByCustomField): js.Promise[SettlementBatchSummary]
}

object SettlementBatchSummaryGateway {
  @scala.inline
  def apply(generate: AnonGroupByCustomField => js.Promise[SettlementBatchSummary]): SettlementBatchSummaryGateway = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
    __obj.asInstanceOf[SettlementBatchSummaryGateway]
  }
}

