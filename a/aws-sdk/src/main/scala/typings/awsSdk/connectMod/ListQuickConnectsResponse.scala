package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQuickConnectsResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
  
  /**
    * Information about the quick connects.
    */
  var QuickConnectSummaryList: js.UndefOr[typings.awsSdk.connectMod.QuickConnectSummaryList] = js.undefined
}
object ListQuickConnectsResponse {
  
  inline def apply(): ListQuickConnectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQuickConnectsResponse]
  }
  
  extension [Self <: ListQuickConnectsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQuickConnectSummaryList(value: QuickConnectSummaryList): Self = StObject.set(x, "QuickConnectSummaryList", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectSummaryListUndefined: Self = StObject.set(x, "QuickConnectSummaryList", js.undefined)
    
    inline def setQuickConnectSummaryListVarargs(value: QuickConnectSummary*): Self = StObject.set(x, "QuickConnectSummaryList", js.Array(value*))
  }
}
