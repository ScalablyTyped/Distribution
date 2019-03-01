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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("frameId")(frameId)
    __obj.updateDynamic("fromCache")(fromCache)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("parentFrameId")(parentFrameId)
    __obj.updateDynamic("redirectUrl")(redirectUrl)
    __obj.updateDynamic("requestId")(requestId)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("statusLine")(statusLine)
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("url")(url)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebRedirectionResponseDetails]
  }
}

