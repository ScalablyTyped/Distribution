package typings.braintree.mod

import typings.braintree.anon.GroupByCustomField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettlementBatchSummaryGateway extends js.Object {
  
  def generate(request: GroupByCustomField): js.Promise[SettlementBatchSummary] = js.native
}
object SettlementBatchSummaryGateway {
  
  @scala.inline
  def apply(generate: GroupByCustomField => js.Promise[SettlementBatchSummary]): SettlementBatchSummaryGateway = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
    __obj.asInstanceOf[SettlementBatchSummaryGateway]
  }
  
  @scala.inline
  implicit class SettlementBatchSummaryGatewayOps[Self <: SettlementBatchSummaryGateway] (val x: Self) extends AnyVal {
    
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
    def setGenerate(value: GroupByCustomField => js.Promise[SettlementBatchSummary]): Self = this.set("generate", js.Any.fromFunction1(value))
  }
}
