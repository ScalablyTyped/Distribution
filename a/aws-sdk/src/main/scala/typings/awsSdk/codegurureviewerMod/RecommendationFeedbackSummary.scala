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
  def apply(): RecommendationFeedbackSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationFeedbackSummary]
  }
  @scala.inline
  implicit class RecommendationFeedbackSummaryOps[Self <: RecommendationFeedbackSummary] (val x: Self) extends AnyVal {
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
    def setReactionsVarargs(value: Reaction*): Self = this.set("Reactions", js.Array(value :_*))
    @scala.inline
    def setReactions(value: Reactions): Self = this.set("Reactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReactions: Self = this.set("Reactions", js.undefined)
    @scala.inline
    def setRecommendationId(value: RecommendationId): Self = this.set("RecommendationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendationId: Self = this.set("RecommendationId", js.undefined)
    @scala.inline
    def setUserId(value: UserId): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
  }
  
}

