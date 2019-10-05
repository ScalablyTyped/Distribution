package typings.chromeDashApps.WebView

import typings.chromeDashApps.chrome.double
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chrome.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRequestDetails extends ResourceRequest {
  /** Standard HTTP method. */
  var method: String
}

object WebRequestDetails {
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
    initiator: String = null
  ): WebRequestDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestId = requestId, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    __obj.asInstanceOf[WebRequestDetails]
  }
}

