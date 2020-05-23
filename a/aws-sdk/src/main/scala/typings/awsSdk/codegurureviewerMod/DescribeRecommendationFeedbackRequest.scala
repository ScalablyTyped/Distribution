package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRecommendationFeedbackRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) that identifies the code review. 
    */
  var CodeReviewArn: Arn = js.native
  /**
    *  The recommendation ID that can be used to track the provided recommendations and then to collect the feedback. 
    */
  var RecommendationId: typings.awsSdk.codegurureviewerMod.RecommendationId = js.native
  /**
    *  Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user making the request. 
    */
  var UserId: js.UndefOr[typings.awsSdk.codegurureviewerMod.UserId] = js.native
}

object DescribeRecommendationFeedbackRequest {
  @scala.inline
  def apply(CodeReviewArn: Arn, RecommendationId: RecommendationId, UserId: UserId = null): DescribeRecommendationFeedbackRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any], RecommendationId = RecommendationId.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecommendationFeedbackRequest]
  }
}

