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
  def apply(
    errors: GetRecommendationErrors = null,
    instanceRecommendations: InstanceRecommendations = null,
    nextToken: NextToken = null
  ): GetEC2InstanceRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (instanceRecommendations != null) __obj.updateDynamic("instanceRecommendations")(instanceRecommendations.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEC2InstanceRecommendationsResponse]
  }
}

