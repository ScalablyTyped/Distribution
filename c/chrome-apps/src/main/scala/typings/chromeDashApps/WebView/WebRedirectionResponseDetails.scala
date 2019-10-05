package typings.chromeDashApps.WebView

import typings.chromeDashApps.chrome.double
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chrome.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRedirectionResponseDetails extends WebResponseCacheDetails {
  /** The new URL. */
  var redirectUrl: String
}

object WebRedirectionResponseDetails {
  @scala.inline
  def apply(
    frameId: integer,
    fromCache: Boolean,
    method: String,
    parentFrameId: integer,
    redirectUrl: String,
    requestId: String,
    statusCode: integer,
    statusLine: String,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String,
    initiator: String = null,
    ip: String = null,
    responseHeaders: js.Array[HttpHeader] = null
  ): WebRedirectionResponseDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, fromCache = fromCache, method = method, parentFrameId = parentFrameId, redirectUrl = redirectUrl, requestId = requestId, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebRedirectionResponseDetails]
  }
}

