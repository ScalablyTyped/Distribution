package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactReferencesResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.  This is always returned as null in the response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
  
  /**
    * Information about the flows.
    */
  var ReferenceSummaryList: js.UndefOr[typings.awsSdk.connectMod.ReferenceSummaryList] = js.undefined
}
object ListContactReferencesResponse {
  
  inline def apply(): ListContactReferencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactReferencesResponse]
  }
  
  extension [Self <: ListContactReferencesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReferenceSummaryList(value: ReferenceSummaryList): Self = StObject.set(x, "ReferenceSummaryList", value.asInstanceOf[js.Any])
    
    inline def setReferenceSummaryListUndefined: Self = StObject.set(x, "ReferenceSummaryList", js.undefined)
    
    inline def setReferenceSummaryListVarargs(value: ReferenceSummary*): Self = StObject.set(x, "ReferenceSummaryList", js.Array(value*))
  }
}
