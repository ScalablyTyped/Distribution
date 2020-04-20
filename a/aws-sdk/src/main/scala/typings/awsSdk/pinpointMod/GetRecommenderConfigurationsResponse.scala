package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecommenderConfigurationsResponse extends js.Object {
  var ListRecommenderConfigurationsResponse: typings.awsSdk.pinpointMod.ListRecommenderConfigurationsResponse = js.native
}

object GetRecommenderConfigurationsResponse {
  @scala.inline
  def apply(ListRecommenderConfigurationsResponse: ListRecommenderConfigurationsResponse): GetRecommenderConfigurationsResponse = {
    val __obj = js.Dynamic.literal(ListRecommenderConfigurationsResponse = ListRecommenderConfigurationsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommenderConfigurationsResponse]
  }
}

