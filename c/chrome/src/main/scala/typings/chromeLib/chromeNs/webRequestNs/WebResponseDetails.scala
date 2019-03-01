package typings
package chromeLib.chromeNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponseDetails extends ResourceRequest {
  /**
    * Standard HTTP status code returned by the server.
    * @since Chrome 43.
    */
  var statusCode: scala.Double
  /** HTTP status line of the response or the 'HTTP/0.9 200 OK' string for HTTP/0.9 responses (i.e., responses that lack a status line). */
  var statusLine: java.lang.String
}

object WebResponseDetails {
  @scala.inline
  def apply(
    frameId: scala.Double,
    parentFrameId: scala.Double,
    requestId: java.lang.String,
    statusCode: scala.Double,
    statusLine: java.lang.String,
    tabId: scala.Double,
    timeStamp: scala.Double,
    `type`: ResourceType,
    url: java.lang.String,
    initiator: java.lang.String = null
  ): WebResponseDetails = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("frameId")(frameId)
    __obj.updateDynamic("parentFrameId")(parentFrameId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("statusLine")(statusLine)
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("url")(url)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    __obj.asInstanceOf[WebResponseDetails]
  }
}

