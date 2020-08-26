package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoScalingGroupRecommendationsResponse extends js.Object {
  /**
    * An array of objects that describe Auto Scaling group recommendations.
    */
  var autoScalingGroupRecommendations: js.UndefOr[AutoScalingGroupRecommendations] = js.native
  /**
    * An array of objects that describe errors of the request. For example, an error is returned if you request recommendations for an unsupported Auto Scaling group.
    */
  var errors: js.UndefOr[GetRecommendationErrors] = js.native
  /**
    * The token to use to advance to the next page of Auto Scaling group recommendations. This value is null when there are no more pages of Auto Scaling group recommendations to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetAutoScalingGroupRecommendationsResponse {
  @scala.inline
  def apply(): GetAutoScalingGroupRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutoScalingGroupRecommendationsResponse]
  }
  @scala.inline
  implicit class GetAutoScalingGroupRecommendationsResponseOps[Self <: GetAutoScalingGroupRecommendationsResponse] (val x: Self) extends AnyVal {
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
    def setAutoScalingGroupRecommendationsVarargs(value: AutoScalingGroupRecommendation*): Self = this.set("autoScalingGroupRecommendations", js.Array(value :_*))
    @scala.inline
    def setAutoScalingGroupRecommendations(value: AutoScalingGroupRecommendations): Self = this.set("autoScalingGroupRecommendations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingGroupRecommendations: Self = this.set("autoScalingGroupRecommendations", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: GetRecommendationError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: GetRecommendationErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

