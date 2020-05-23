package typings.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointItemResponse extends js.Object {
  /**
    * A custom message associated with the registration of an endpoint when issuing a response.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The status code associated with the merging of an endpoint when issuing a response.
    */
  var StatusCode: js.UndefOr[Double] = js.undefined
}

object EndpointItemResponse {
  @scala.inline
  def apply(Message: String = null, StatusCode: js.UndefOr[Double] = js.undefined): EndpointItemResponse = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (!js.isUndefined(StatusCode)) __obj.updateDynamic("StatusCode")(StatusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointItemResponse]
  }
}

