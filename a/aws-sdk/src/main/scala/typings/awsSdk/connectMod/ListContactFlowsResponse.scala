package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContactFlowsResponse extends js.Object {
  
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
  implicit class ListContactFlowsResponseOps[Self <: ListContactFlowsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContactFlowSummaryListVarargs(value: ContactFlowSummary*): Self = this.set("ContactFlowSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setContactFlowSummaryList(value: ContactFlowSummaryList): Self = this.set("ContactFlowSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactFlowSummaryList: Self = this.set("ContactFlowSummaryList", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
