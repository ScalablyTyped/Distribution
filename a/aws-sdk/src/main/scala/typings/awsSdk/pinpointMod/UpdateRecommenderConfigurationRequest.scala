package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRecommenderConfigurationRequest extends js.Object {
  /**
    * The unique identifier for the recommender model configuration. This identifier is displayed as the Recommender ID on the Amazon Pinpoint console.
    */
  var RecommenderId: string = js.native
  var UpdateRecommenderConfiguration: typings.awsSdk.pinpointMod.UpdateRecommenderConfiguration = js.native
}

object UpdateRecommenderConfigurationRequest {
  @scala.inline
  def apply(RecommenderId: string, UpdateRecommenderConfiguration: UpdateRecommenderConfiguration): UpdateRecommenderConfigurationRequest = {
    val __obj = js.Dynamic.literal(RecommenderId = RecommenderId.asInstanceOf[js.Any], UpdateRecommenderConfiguration = UpdateRecommenderConfiguration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateRecommenderConfigurationRequest]
  }
}

