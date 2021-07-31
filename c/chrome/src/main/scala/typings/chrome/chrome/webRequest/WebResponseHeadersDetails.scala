package typings.chrome.chrome.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebResponseHeadersDetails
  extends StObject
     with WebResponseDetails {
  
  var method: String
  
  /** Optional. The HTTP response headers that have been received with this response. */
  var responseHeaders: js.UndefOr[js.Array[HttpHeader]] = js.undefined
}
object WebResponseHeadersDetails {
  
  @scala.inline
  def apply(
    frameId: Double,
    method: String,
    parentFrameId: Double,
    requestId: String,
    statusCode: Double,
    statusLine: String,
    tabId: Double,
    timeStamp: Double,
    `type`: ResourceType,
    url: String
  ): WebResponseHeadersDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebResponseHeadersDetails]
  }
  
  @scala.inline
  implicit class WebResponseHeadersDetailsMutableBuilder[Self <: WebResponseHeadersDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeaders(value: js.Array[HttpHeader]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    @scala.inline
    def setResponseHeadersVarargs(value: HttpHeader*): Self = StObject.set(x, "responseHeaders", js.Array(value :_*))
  }
}
