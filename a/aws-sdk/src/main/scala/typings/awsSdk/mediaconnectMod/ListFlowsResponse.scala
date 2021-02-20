package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFlowsResponse extends StObject {
  
  /**
    * A list of flow summaries.
    */
  var Flows: js.UndefOr[listOfListedFlow] = js.native
  
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListFlows request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListFlows request a second time and specify the NextToken value.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListFlowsResponse {
  
  @scala.inline
  def apply(): ListFlowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFlowsResponse]
  }
  
  @scala.inline
  implicit class ListFlowsResponseMutableBuilder[Self <: ListFlowsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlows(value: listOfListedFlow): Self = StObject.set(x, "Flows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowsUndefined: Self = StObject.set(x, "Flows", js.undefined)
    
    @scala.inline
    def setFlowsVarargs(value: ListedFlow*): Self = StObject.set(x, "Flows", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
