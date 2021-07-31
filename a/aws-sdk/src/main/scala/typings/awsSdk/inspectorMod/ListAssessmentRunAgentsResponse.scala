package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssessmentRunAgentsResponse extends StObject {
  
  /**
    * A list of ARNs that specifies the agents returned by the action.
    */
  var assessmentRunAgents: AssessmentRunAgentList
  
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAssessmentRunAgentsResponse {
  
  @scala.inline
  def apply(assessmentRunAgents: AssessmentRunAgentList): ListAssessmentRunAgentsResponse = {
    val __obj = js.Dynamic.literal(assessmentRunAgents = assessmentRunAgents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentRunAgentsResponse]
  }
  
  @scala.inline
  implicit class ListAssessmentRunAgentsResponseMutableBuilder[Self <: ListAssessmentRunAgentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentRunAgents(value: AssessmentRunAgentList): Self = StObject.set(x, "assessmentRunAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentRunAgentsVarargs(value: AssessmentRunAgent*): Self = StObject.set(x, "assessmentRunAgents", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
