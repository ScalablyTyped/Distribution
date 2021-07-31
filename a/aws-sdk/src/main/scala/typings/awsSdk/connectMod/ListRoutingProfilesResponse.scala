package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRoutingProfilesResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
  
  /**
    * Information about the routing profiles.
    */
  var RoutingProfileSummaryList: js.UndefOr[typings.awsSdk.connectMod.RoutingProfileSummaryList] = js.undefined
}
object ListRoutingProfilesResponse {
  
  @scala.inline
  def apply(): ListRoutingProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoutingProfilesResponse]
  }
  
  @scala.inline
  implicit class ListRoutingProfilesResponseMutableBuilder[Self <: ListRoutingProfilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRoutingProfileSummaryList(value: RoutingProfileSummaryList): Self = StObject.set(x, "RoutingProfileSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileSummaryListUndefined: Self = StObject.set(x, "RoutingProfileSummaryList", js.undefined)
    
    @scala.inline
    def setRoutingProfileSummaryListVarargs(value: RoutingProfileSummary*): Self = StObject.set(x, "RoutingProfileSummaryList", js.Array(value :_*))
  }
}
