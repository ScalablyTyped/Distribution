package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRecommendationFeedbackResponse extends js.Object {
  /**
    *  The recommendation feedback given by the user. 
    */
  var RecommendationFeedback: js.UndefOr[typings.awsSdk.codegurureviewerMod.RecommendationFeedback] = js.native
}

object DescribeRecommendationFeedbackResponse {
  @scala.inline
  def apply(RecommendationFeedback: RecommendationFeedback = null): DescribeRecommendationFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    if (RecommendationFeedback != null) __obj.updateDynamic("RecommendationFeedback")(RecommendationFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecommendationFeedbackResponse]
  }
}

