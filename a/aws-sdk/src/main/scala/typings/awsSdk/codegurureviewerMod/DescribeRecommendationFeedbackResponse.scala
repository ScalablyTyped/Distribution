package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRecommendationFeedbackResponse extends js.Object {
  
  /**
    *  The recommendation feedback given by the user. 
    */
  var RecommendationFeedback: js.UndefOr[typings.awsSdk.codegurureviewerMod.RecommendationFeedback] = js.native
}
object DescribeRecommendationFeedbackResponse {
  
  @scala.inline
  def apply(): DescribeRecommendationFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecommendationFeedbackResponse]
  }
  
  @scala.inline
  implicit class DescribeRecommendationFeedbackResponseOps[Self <: DescribeRecommendationFeedbackResponse] (val x: Self) extends AnyVal {
    
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
    def setRecommendationFeedback(value: RecommendationFeedback): Self = this.set("RecommendationFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationFeedback: Self = this.set("RecommendationFeedback", js.undefined)
  }
}
