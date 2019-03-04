package typings
package chromeLib.chromeNs.webRequestNs

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
    frameId: scala.Double,
    method: java.lang.String,
    parentFrameId: scala.Double,
    requestBody: WebRequestBody,
    requestId: java.lang.String,
    tabId: scala.Double,
    timeStamp: scala.Double,
    `type`: ResourceType,
    url: java.lang.String,
    initiator: java.lang.String = null
  ): WebRequestBodyDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestBody = requestBody, requestId = requestId, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    __obj.asInstanceOf[WebRequestBodyDetails]
  }
}

