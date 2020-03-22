package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecommenderConfigurationRequest extends js.Object {
  /**
    * The unique identifier for the recommender model configuration. This identifier is displayed as the Recommender ID on the Amazon Pinpoint console.
    */
  var RecommenderId: string = js.native
}

object GetRecommenderConfigurationRequest {
  @scala.inline
  def apply(RecommenderId: string): GetRecommenderConfigurationRequest = {
    val __obj = js.Dynamic.literal(RecommenderId = RecommenderId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRecommenderConfigurationRequest]
  }
}

