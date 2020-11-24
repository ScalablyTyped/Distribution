package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRecommendationFeedbackRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the  CodeReview  object. 
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
  
  @scala.inline
  implicit class PutRecommendationFeedbackRequestOps[Self <: PutRecommendationFeedbackRequest] (val x: Self) extends AnyVal {
    
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
    def setReactionsVarargs(value: Reaction*): Self = this.set("Reactions", js.Array(value :_*))
    
    @scala.inline
    def setReactions(value: Reactions): Self = this.set("Reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationId(value: RecommendationId): Self = this.set("RecommendationId", value.asInstanceOf[js.Any])
  }
}
