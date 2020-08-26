package typings.chromeApps.WebView

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebResponseDetails extends ResourceRequest {
  /**
    * Standard HTTP status code returned by the server.
    * @since Chrome 43.
    */
  var statusCode: integer = js.native
  /** HTTP status line of the response or the 'HTTP/0.9 200 OK' string for HTTP/0.9 responses (i.e., responses that lack a status line). */
  var statusLine: String = js.native
}

object WebResponseDetails {
  @scala.inline
  def apply(
    frameId: integer,
    parentFrameId: integer,
    requestId: String,
    statusCode: integer,
    statusLine: String,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String
  ): WebResponseDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebResponseDetails]
  }
  @scala.inline
  implicit class WebResponseDetailsOps[Self <: WebResponseDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatusCode(value: integer): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusLine(value: String): Self = this.set("statusLine", value.asInstanceOf[js.Any])
  }
  
}

