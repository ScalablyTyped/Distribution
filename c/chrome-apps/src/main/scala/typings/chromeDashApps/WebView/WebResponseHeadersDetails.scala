package typings.chromeDashApps.WebView

import typings.chromeDashApps.chrome.double
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chrome.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponseHeadersDetails extends WebResponseDetails {
  /** standard HTTP method i.e. GET, POST, PUT, etc. */
  var method: String
  /** Optional. The HTTP response headers that have been received with this response. */
  var responseHeaders: js.UndefOr[js.Array[HttpHeader]] = js.undefined
}

object WebResponseHeadersDetails {
  @scala.inline
  def apply(
    frameId: integer,
    method: String,
    parentFrameId: integer,
    requestId: String,
    statusCode: integer,
    statusLine: String,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String,
    initiator: String = null,
    responseHeaders: js.Array[HttpHeader] = null
  ): WebResponseHeadersDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestId = requestId, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebResponseHeadersDetails]
  }
}

