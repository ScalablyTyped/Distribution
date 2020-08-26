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
  @scala.inline
  implicit class DeleteRecommenderConfigurationRequestOps[Self <: DeleteRecommenderConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setRecommenderId(value: string): Self = this.set("RecommenderId", value.asInstanceOf[js.Any])
  }
  
}

