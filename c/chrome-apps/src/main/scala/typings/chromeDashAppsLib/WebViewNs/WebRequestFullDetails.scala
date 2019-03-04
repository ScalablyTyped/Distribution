package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- chromeDashAppsLib.WebViewNs.WebRequestBodyDetails because var conflicts: frameId, initiator, method, parentFrameId, requestId, tabId, timeStamp, `type`, url. Inlined requestBody */ trait WebRequestFullDetails extends WebRequestHeadersDetails {
  /**
    * Contains the HTTP request body data. Only provided if extraInfoSpec contains 'requestBody'.
    * @since Chrome 23.
    */
  var requestBody: WebRequestBody
}

object WebRequestFullDetails {
  @scala.inline
  def apply(
    frameId: chromeDashAppsLib.chromeNs.integer,
    method: java.lang.String,
    parentFrameId: chromeDashAppsLib.chromeNs.integer,
    requestBody: WebRequestBody,
    requestId: java.lang.String,
    tabId: chromeDashAppsLib.chromeNs.integer,
    timeStamp: chromeDashAppsLib.chromeNs.double,
    `type`: chromeDashAppsLib.chromeNs.webRequestNs.ResourceType,
    url: java.lang.String,
    initiator: java.lang.String = null,
    requestHeaders: js.Array[HttpHeader] = null
  ): WebRequestFullDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestBody = requestBody, requestId = requestId, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders)
    __obj.asInstanceOf[WebRequestFullDetails]
  }
}

