package typings.chromeApps.WebView

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.webRequest.ResourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRequestBodyDetails
  extends StObject
     with WebRequestDetails {
  
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
    url: String
  ): WebRequestBodyDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestBodyDetails]
  }
  
  @scala.inline
  implicit class WebRequestBodyDetailsMutableBuilder[Self <: WebRequestBodyDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestBody(value: WebRequestBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
