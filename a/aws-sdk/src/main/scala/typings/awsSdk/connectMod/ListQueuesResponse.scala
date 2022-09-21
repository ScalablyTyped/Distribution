package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueuesResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
  
  /**
    * Information about the queues.
    */
  var QueueSummaryList: js.UndefOr[typings.awsSdk.connectMod.QueueSummaryList] = js.undefined
}
object ListQueuesResponse {
  
  inline def apply(): ListQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesResponse]
  }
  
  extension [Self <: ListQueuesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueueSummaryList(value: QueueSummaryList): Self = StObject.set(x, "QueueSummaryList", value.asInstanceOf[js.Any])
    
    inline def setQueueSummaryListUndefined: Self = StObject.set(x, "QueueSummaryList", js.undefined)
    
    inline def setQueueSummaryListVarargs(value: QueueSummary*): Self = StObject.set(x, "QueueSummaryList", js.Array(value*))
  }
}
