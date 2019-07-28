package typings.chromeDashApps.WebViewNs

import typings.chromeDashApps.chromeNs.double
import typings.chromeDashApps.chromeNs.integer
import typings.chromeDashApps.chromeNs.webRequestNs.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRequestHeadersDetails extends WebRequestDetails {
  /** Optional. The HTTP request headers that are going to be sent out with this request. */
  var requestHeaders: js.UndefOr[js.Array[HttpHeader]] = js.undefined
}

object WebRequestHeadersDetails {
  @scala.inline
  def apply(
    frameId: integer,
    method: String,
    parentFrameId: integer,
    requestId: String,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String,
    initiator: String = null,
    requestHeaders: js.Array[HttpHeader] = null
  ): WebRequestHeadersDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestId = requestId, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders)
    __obj.asInstanceOf[WebRequestHeadersDetails]
  }
}

