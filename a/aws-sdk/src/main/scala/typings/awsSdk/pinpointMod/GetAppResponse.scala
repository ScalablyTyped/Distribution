package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppResponse extends js.Object {
  var ApplicationResponse: typings.awsSdk.pinpointMod.ApplicationResponse = js.native
}

object GetAppResponse {
  @scala.inline
  def apply(ApplicationResponse: ApplicationResponse): GetAppResponse = {
    val __obj = js.Dynamic.literal(ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppResponse]
  }
}

