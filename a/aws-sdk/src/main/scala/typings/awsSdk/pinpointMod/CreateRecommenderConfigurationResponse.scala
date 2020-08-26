package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRecommenderConfigurationResponse extends js.Object {
  var RecommenderConfigurationResponse: typings.awsSdk.pinpointMod.RecommenderConfigurationResponse = js.native
}

object CreateRecommenderConfigurationResponse {
  @scala.inline
  def apply(RecommenderConfigurationResponse: RecommenderConfigurationResponse): CreateRecommenderConfigurationResponse = {
    val __obj = js.Dynamic.literal(RecommenderConfigurationResponse = RecommenderConfigurationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecommenderConfigurationResponse]
  }
  @scala.inline
  implicit class CreateRecommenderConfigurationResponseOps[Self <: CreateRecommenderConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setRecommenderConfigurationResponse(value: RecommenderConfigurationResponse): Self = this.set("RecommenderConfigurationResponse", value.asInstanceOf[js.Any])
  }
  
}

