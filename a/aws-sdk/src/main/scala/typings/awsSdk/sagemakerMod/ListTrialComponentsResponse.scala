package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTrialComponentsResponse extends js.Object {
  
  /**
    * A token for getting the next set of components, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * A list of the summaries of your trial components.
    */
  var TrialComponentSummaries: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentSummaries] = js.native
}
object ListTrialComponentsResponse {
  
  @scala.inline
  def apply(): ListTrialComponentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrialComponentsResponse]
  }
  
  @scala.inline
  implicit class ListTrialComponentsResponseOps[Self <: ListTrialComponentsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTrialComponentSummariesVarargs(value: TrialComponentSummary*): Self = this.set("TrialComponentSummaries", js.Array(value :_*))
    
    @scala.inline
    def setTrialComponentSummaries(value: TrialComponentSummaries): Self = this.set("TrialComponentSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialComponentSummaries: Self = this.set("TrialComponentSummaries", js.undefined)
  }
}
