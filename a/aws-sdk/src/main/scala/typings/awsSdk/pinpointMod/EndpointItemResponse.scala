package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointItemResponse extends js.Object {
  /**
    * The custom message that's returned in the response as a result of processing the endpoint data.
    */
  var Message: js.UndefOr[string] = js.native
  /**
    * The status code that's returned in the response as a result of processing the endpoint data.
    */
  var StatusCode: js.UndefOr[integer] = js.native
}

object EndpointItemResponse {
  @scala.inline
  def apply(Message: string = null, StatusCode: js.UndefOr[integer] = js.undefined): EndpointItemResponse = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (!js.isUndefined(StatusCode)) __obj.updateDynamic("StatusCode")(StatusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointItemResponse]
  }
}

