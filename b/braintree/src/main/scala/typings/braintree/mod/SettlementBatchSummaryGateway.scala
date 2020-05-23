package typings.braintree.mod

import typings.braintree.anon.GroupByCustomField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettlementBatchSummaryGateway extends js.Object {
  def generate(request: GroupByCustomField): js.Promise[SettlementBatchSummary]
}

object SettlementBatchSummaryGateway {
  @scala.inline
  def apply(generate: GroupByCustomField => js.Promise[SettlementBatchSummary]): SettlementBatchSummaryGateway = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
    __obj.asInstanceOf[SettlementBatchSummaryGateway]
  }
}

