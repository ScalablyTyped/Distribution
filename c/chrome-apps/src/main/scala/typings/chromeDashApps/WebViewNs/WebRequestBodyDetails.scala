package typings.chromeDashApps.WebViewNs

import typings.chromeDashApps.chromeNs.double
import typings.chromeDashApps.chromeNs.integer
import typings.chromeDashApps.chromeNs.webRequestNs.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRequestBodyDetails extends WebRequestDetails {
  /**
    * Contains the HTTP request body data. Only provided if extraInfoSpec contains 'requestBody'.
    * @since Chrome 23.
    */
  var requestBody: WebRequestBody
}

object WebRequestBodyDetails {
  @scala.inline
  def apply(
    frameId: integer,
    method: String,
    parentFrameId: integer,
    requestBody: WebRequestBody,
    requestId: String,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String,
    initiator: String = null
  ): WebRequestBodyDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestBody = requestBody, requestId = requestId, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    __obj.asInstanceOf[WebRequestBodyDetails]
  }
}

