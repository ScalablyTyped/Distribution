package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssessmentRunAgentsResponse extends js.Object {
  
  /**
    * A list of ARNs that specifies the agents returned by the action.
    */
  var assessmentRunAgents: AssessmentRunAgentList = js.native
  
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListAssessmentRunAgentsResponse {
  
  @scala.inline
  def apply(assessmentRunAgents: AssessmentRunAgentList): ListAssessmentRunAgentsResponse = {
    val __obj = js.Dynamic.literal(assessmentRunAgents = assessmentRunAgents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentRunAgentsResponse]
  }
  
  @scala.inline
  implicit class ListAssessmentRunAgentsResponseOps[Self <: ListAssessmentRunAgentsResponse] (val x: Self) extends AnyVal {
    
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
    def setAssessmentRunAgentsVarargs(value: AssessmentRunAgent*): Self = this.set("assessmentRunAgents", js.Array(value :_*))
    
    @scala.inline
    def setAssessmentRunAgents(value: AssessmentRunAgentList): Self = this.set("assessmentRunAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
