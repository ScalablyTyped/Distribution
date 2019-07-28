package typings.braintree.braintreeMod

import typings.braintree.Anon_GroupByCustomField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettlementBatchSummaryGateway extends js.Object {
  def generate(request: Anon_GroupByCustomField): js.Promise[SettlementBatchSummary]
}

object SettlementBatchSummaryGateway {
  @scala.inline
  def apply(generate: Anon_GroupByCustomField => js.Promise[SettlementBatchSummary]): SettlementBatchSummaryGateway = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
  
    __obj.asInstanceOf[SettlementBatchSummaryGateway]
  }
}

