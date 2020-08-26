package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRecommendationFeedbackRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the  CodeReview  object. 
    */
  var CodeReviewArn: Arn = js.native
  /**
    *  The recommendation ID that can be used to track the provided recommendations and then to collect the feedback. 
    */
  var RecommendationId: typings.awsSdk.codegurureviewerMod.RecommendationId = js.native
  /**
    *  Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user making the request.   The UserId is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name (ARN). For more information, see  Specifying a Principal in the AWS Identity and Access Management User Guide. 
    */
  var UserId: js.UndefOr[typings.awsSdk.codegurureviewerMod.UserId] = js.native
}

object DescribeRecommendationFeedbackRequest {
  @scala.inline
  def apply(CodeReviewArn: Arn, RecommendationId: RecommendationId): DescribeRecommendationFeedbackRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any], RecommendationId = RecommendationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecommendationFeedbackRequest]
  }
  @scala.inline
  implicit class DescribeRecommendationFeedbackRequestOps[Self <: DescribeRecommendationFeedbackRequest] (val x: Self) extends AnyVal {
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
    def setCodeReviewArn(value: Arn): Self = this.set("CodeReviewArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecommendationId(value: RecommendationId): Self = this.set("RecommendationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: UserId): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
  }
  
}

