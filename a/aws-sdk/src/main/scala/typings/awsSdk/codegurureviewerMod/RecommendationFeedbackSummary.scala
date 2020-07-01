package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendationFeedbackSummary extends js.Object {
  /**
    *  List for storing reactions. Reactions are utf-8 text code for emojis. 
    */
  var Reactions: js.UndefOr[typings.awsSdk.codegurureviewerMod.Reactions] = js.native
  /**
    *  The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. 
    */
  var RecommendationId: js.UndefOr[typings.awsSdk.codegurureviewerMod.RecommendationId] = js.native
  /**
    *  The ID of the user that gave the feedback.   The UserId is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name (ARN). For more information, see  Specifying a Principal in the AWS Identity and Access Management User Guide. 
    */
  var UserId: js.UndefOr[typings.awsSdk.codegurureviewerMod.UserId] = js.native
}

object RecommendationFeedbackSummary {
  @scala.inline
  def apply(Reactions: Reactions = null, RecommendationId: RecommendationId = null, UserId: UserId = null): RecommendationFeedbackSummary = {
    val __obj = js.Dynamic.literal()
    if (Reactions != null) __obj.updateDynamic("Reactions")(Reactions.asInstanceOf[js.Any])
    if (RecommendationId != null) __obj.updateDynamic("RecommendationId")(RecommendationId.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationFeedbackSummary]
  }
}

