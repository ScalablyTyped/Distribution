package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRequestDetails extends ResourceRequest {
  /** Standard HTTP method. */
  var method: java.lang.String
}

object WebRequestDetails {
  @scala.inline
  def apply(
    frameId: chromeDashAppsLib.chromeNs.integer,
    method: java.lang.String,
    parentFrameId: chromeDashAppsLib.chromeNs.integer,
    requestId: java.lang.String,
    tabId: chromeDashAppsLib.chromeNs.integer,
    timeStamp: chromeDashAppsLib.chromeNs.double,
    `type`: chromeDashAppsLib.chromeNs.webRequestNs.ResourceType,
    url: java.lang.String,
    initiator: java.lang.String = null
  ): WebRequestDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestId = requestId, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    __obj.asInstanceOf[WebRequestDetails]
  }
}

