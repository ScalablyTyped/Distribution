package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointItemResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EndpointItemResponse extends js.Object {
  /**
    * A custom message associated with the registration of an endpoint when issuing a response.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The status code associated with the merging of an endpoint when issuing a response.
    */
  var StatusCode: js.UndefOr[Double] = js.undefined
}

object _EndpointItemResponse {
  @scala.inline
  def apply(Message: String = null, StatusCode: Int | Double = null): _EndpointItemResponse = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EndpointItemResponse]
  }
}

