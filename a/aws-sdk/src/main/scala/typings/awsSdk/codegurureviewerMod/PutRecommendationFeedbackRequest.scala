package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecommendationFeedbackRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) that identifies the code review. 
    */
  var CodeReviewArn: Arn = js.native
  /**
    *  List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears all your feedback. 
    */
  var Reactions: typings.awsSdk.codegurureviewerMod.Reactions = js.native
  /**
    *  The recommendation ID that can be used to track the provided recommendations and then to collect the feedback. 
    */
  var RecommendationId: typings.awsSdk.codegurureviewerMod.RecommendationId = js.native
}

object PutRecommendationFeedbackRequest {
  @scala.inline
  def apply(CodeReviewArn: Arn, Reactions: Reactions, RecommendationId: RecommendationId): PutRecommendationFeedbackRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any], Reactions = Reactions.asInstanceOf[js.Any], RecommendationId = RecommendationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecommendationFeedbackRequest]
  }
}

