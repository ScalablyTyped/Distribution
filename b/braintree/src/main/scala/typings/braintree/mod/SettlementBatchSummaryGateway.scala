package typings.braintree.mod

import typings.braintree.anon.GroupByCustomField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettlementBatchSummaryGateway extends StObject {
  
  def generate(request: GroupByCustomField): js.Promise[SettlementBatchSummary]
}
object SettlementBatchSummaryGateway {
  
  inline def apply(generate: GroupByCustomField => js.Promise[SettlementBatchSummary]): SettlementBatchSummaryGateway = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
    __obj.asInstanceOf[SettlementBatchSummaryGateway]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SettlementBatchSummaryGateway] (val x: Self) extends AnyVal {
    
    inline def setGenerate(value: GroupByCustomField => js.Promise[SettlementBatchSummary]): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
  }
}
