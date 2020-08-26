package typings.chromeApps.WebView

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebRequestBodyDetails extends WebRequestDetails {
  /**
    * Contains the HTTP request body data. Only provided if extraInfoSpec contains 'requestBody'.
    * @since Chrome 23.
    */
  var requestBody: WebRequestBody = js.native
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
    url: String
  ): WebRequestBodyDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestBodyDetails]
  }
  @scala.inline
  implicit class WebRequestBodyDetailsOps[Self <: WebRequestBodyDetails] (val x: Self) extends AnyVal {
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
    def setRequestBody(value: WebRequestBody): Self = this.set("requestBody", value.asInstanceOf[js.Any])
  }
  
}

