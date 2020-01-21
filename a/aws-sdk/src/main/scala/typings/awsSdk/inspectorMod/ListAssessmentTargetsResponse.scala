package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssessmentTargetsResponse extends js.Object {
  /**
    * A list of ARNs that specifies the assessment targets that are returned by the action.
    */
  var assessmentTargetArns: ListReturnedArnList = js.native
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListAssessmentTargetsResponse {
  @scala.inline
  def apply(assessmentTargetArns: ListReturnedArnList, nextToken: PaginationToken = null): ListAssessmentTargetsResponse = {
    val __obj = js.Dynamic.literal(assessmentTargetArns = assessmentTargetArns.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentTargetsResponse]
  }
}

