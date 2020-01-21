package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(assessmentRunAgents: AssessmentRunAgentList, nextToken: PaginationToken = null): ListAssessmentRunAgentsResponse = {
    val __obj = js.Dynamic.literal(assessmentRunAgents = assessmentRunAgents.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentRunAgentsResponse]
  }
}

