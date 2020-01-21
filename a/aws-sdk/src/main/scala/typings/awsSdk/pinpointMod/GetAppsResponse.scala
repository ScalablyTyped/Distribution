package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppsResponse extends js.Object {
  var ApplicationsResponse: typings.awsSdk.pinpointMod.ApplicationsResponse = js.native
}

object GetAppsResponse {
  @scala.inline
  def apply(ApplicationsResponse: ApplicationsResponse): GetAppsResponse = {
    val __obj = js.Dynamic.literal(ApplicationsResponse = ApplicationsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAppsResponse]
  }
}

