package typings.chromeDashApps.WebViewNs

import typings.chromeDashApps.chromeNs.double
import typings.chromeDashApps.chromeNs.integer
import typings.chromeDashApps.chromeNs.webRequestNs.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponseErrorDetails extends WebResponseCacheDetails {
  /** The error description. This string is not guaranteed to remain backwards compatible between releases. You must not parse and act based upon its content. */
  var error: String
}

object WebResponseErrorDetails {
  @scala.inline
  def apply(
    error: String,
    frameId: integer,
    fromCache: Boolean,
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
    ip: String = null,
    responseHeaders: js.Array[HttpHeader] = null
  ): WebResponseErrorDetails = {
    val __obj = js.Dynamic.literal(error = error, frameId = frameId, fromCache = fromCache, method = method, parentFrameId = parentFrameId, requestId = requestId, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebResponseErrorDetails]
  }
}

