package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRecommenderConfigurationRequest extends js.Object {
  /**
    * The unique identifier for the recommender model configuration. This identifier is displayed as the Recommender ID on the Amazon Pinpoint console.
    */
  var RecommenderId: string = js.native
}

object DeleteRecommenderConfigurationRequest {
  @scala.inline
  def apply(RecommenderId: string): DeleteRecommenderConfigurationRequest = {
    val __obj = js.Dynamic.literal(RecommenderId = RecommenderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecommenderConfigurationRequest]
  }
}

