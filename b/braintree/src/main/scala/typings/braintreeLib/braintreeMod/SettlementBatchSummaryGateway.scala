package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettlementBatchSummaryGateway extends js.Object {
  def generate(request: braintreeLib.Anon_GroupByCustomField): js.Promise[SettlementBatchSummary]
}

object SettlementBatchSummaryGateway {
  @scala.inline
  def apply(generate: braintreeLib.Anon_GroupByCustomField => js.Promise[SettlementBatchSummary]): SettlementBatchSummaryGateway = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
  
    __obj.asInstanceOf[SettlementBatchSummaryGateway]
  }
}

