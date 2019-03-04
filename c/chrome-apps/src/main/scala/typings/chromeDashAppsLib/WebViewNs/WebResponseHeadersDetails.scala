package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponseHeadersDetails extends WebResponseDetails {
  /** standard HTTP method i.e. GET, POST, PUT, etc. */
  var method: java.lang.String
  /** Optional. The HTTP response headers that have been received with this response. */
  var responseHeaders: js.UndefOr[js.Array[HttpHeader]] = js.undefined
}

object WebResponseHeadersDetails {
  @scala.inline
  def apply(
    frameId: chromeDashAppsLib.chromeNs.integer,
    method: java.lang.String,
    parentFrameId: chromeDashAppsLib.chromeNs.integer,
    requestId: java.lang.String,
    statusCode: chromeDashAppsLib.chromeNs.integer,
    statusLine: java.lang.String,
    tabId: chromeDashAppsLib.chromeNs.integer,
    timeStamp: chromeDashAppsLib.chromeNs.double,
    `type`: chromeDashAppsLib.chromeNs.webRequestNs.ResourceType,
    url: java.lang.String,
    initiator: java.lang.String = null,
    responseHeaders: js.Array[HttpHeader] = null
  ): WebResponseHeadersDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestId = requestId, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebResponseHeadersDetails]
  }
}

