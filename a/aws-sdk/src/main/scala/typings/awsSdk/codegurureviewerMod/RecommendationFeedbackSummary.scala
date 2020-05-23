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
    *  The identifier for the user that gave the feedback. 
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

