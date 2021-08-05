package typings.chrome.chrome.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.chrome.chrome.webRequest.ResourceRequest because Already inherited
- typings.chrome.chrome.webRequest.WebRequestDetails because Already inherited
- typings.chrome.chrome.webRequest.WebRequestBodyDetails because var conflicts: frameId, initiator, method, parentFrameId, requestId, tabId, timeStamp, `type`, url. Inlined requestBody */ trait WebRequestFullDetails
  extends StObject
     with WebRequestHeadersDetails {
  
  /**
    * Contains the HTTP request body data. Only provided if extraInfoSpec contains 'requestBody'.
    * @since Chrome 23.
    */
  var requestBody: WebRequestBody
}
object WebRequestFullDetails {
  
  inline def apply(
    frameId: Double,
    method: String,
    parentFrameId: Double,
    requestBody: WebRequestBody,
    requestId: String,
    tabId: Double,
    timeStamp: Double,
    `type`: ResourceType,
    url: String
  ): WebRequestFullDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestFullDetails]
  }
  
  extension [Self <: WebRequestFullDetails](x: Self) {
    
    inline def setRequestBody(value: WebRequestBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
