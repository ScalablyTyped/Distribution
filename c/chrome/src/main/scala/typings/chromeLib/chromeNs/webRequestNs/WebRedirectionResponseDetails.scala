package typings
package chromeLib.chromeNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRedirectionResponseDetails extends WebResponseCacheDetails {
  /** The new URL. */
  var redirectUrl: java.lang.String
}

object WebRedirectionResponseDetails {
  @scala.inline
  def apply(
    frameId: scala.Double,
    fromCache: scala.Boolean,
    method: java.lang.String,
    parentFrameId: scala.Double,
    redirectUrl: java.lang.String,
    requestId: java.lang.String,
    statusCode: scala.Double,
    statusLine: java.lang.String,
    tabId: scala.Double,
    timeStamp: scala.Double,
    `type`: ResourceType,
    url: java.lang.String,
    initiator: java.lang.String = null,
    ip: java.lang.String = null,
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

