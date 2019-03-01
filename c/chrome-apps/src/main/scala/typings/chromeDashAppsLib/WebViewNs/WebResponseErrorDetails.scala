package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponseErrorDetails extends WebResponseCacheDetails {
  /** The error description. This string is not guaranteed to remain backwards compatible between releases. You must not parse and act based upon its content. */
  var error: java.lang.String
}

object WebResponseErrorDetails {
  @scala.inline
  def apply(
    error: java.lang.String,
    frameId: chromeDashAppsLib.chromeNs.integer,
    fromCache: scala.Boolean,
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
    ip: java.lang.String = null,
    responseHeaders: js.Array[HttpHeader] = null
  ): WebResponseErrorDetails = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("frameId")(frameId)
    __obj.updateDynamic("fromCache")(fromCache)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("parentFrameId")(parentFrameId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("statusLine")(statusLine)
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("url")(url)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebResponseErrorDetails]
  }
}

