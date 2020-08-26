package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEC2InstanceRecommendationsResponse extends js.Object {
  /**
    * An array of objects that describe errors of the request. For example, an error is returned if you request recommendations for an instance of an unsupported instance family.
    */
  var errors: js.UndefOr[GetRecommendationErrors] = js.native
  /**
    * An array of objects that describe instance recommendations.
    */
  var instanceRecommendations: js.UndefOr[InstanceRecommendations] = js.native
  /**
    * The token to use to advance to the next page of instance recommendations. This value is null when there are no more pages of instance recommendations to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetEC2InstanceRecommendationsResponse {
  @scala.inline
  def apply(): GetEC2InstanceRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEC2InstanceRecommendationsResponse]
  }
  @scala.inline
  implicit class GetEC2InstanceRecommendationsResponseOps[Self <: GetEC2InstanceRecommendationsResponse] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: GetRecommendationError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: GetRecommendationErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setInstanceRecommendationsVarargs(value: InstanceRecommendation*): Self = this.set("instanceRecommendations", js.Array(value :_*))
    @scala.inline
    def setInstanceRecommendations(value: InstanceRecommendations): Self = this.set("instanceRecommendations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceRecommendations: Self = this.set("instanceRecommendations", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

