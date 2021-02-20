package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContactFlowsResponse extends StObject {
  
  /**
    * Information about the contact flows.
    */
  var ContactFlowSummaryList: js.UndefOr[typings.awsSdk.connectMod.ContactFlowSummaryList] = js.native
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
}
object ListContactFlowsResponse {
  
  @scala.inline
  def apply(): ListContactFlowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactFlowsResponse]
  }
  
  @scala.inline
  implicit class ListContactFlowsResponseMutableBuilder[Self <: ListContactFlowsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactFlowSummaryList(value: ContactFlowSummaryList): Self = StObject.set(x, "ContactFlowSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactFlowSummaryListUndefined: Self = StObject.set(x, "ContactFlowSummaryList", js.undefined)
    
    @scala.inline
    def setContactFlowSummaryListVarargs(value: ContactFlowSummary*): Self = StObject.set(x, "ContactFlowSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
