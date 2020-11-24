package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFlowsResponse extends js.Object {
  
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
  implicit class ListFlowsResponseOps[Self <: ListFlowsResponse] (val x: Self) extends AnyVal {
    
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
    def setFlowsVarargs(value: ListedFlow*): Self = this.set("Flows", js.Array(value :_*))
    
    @scala.inline
    def setFlows(value: listOfListedFlow): Self = this.set("Flows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlows: Self = this.set("Flows", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
