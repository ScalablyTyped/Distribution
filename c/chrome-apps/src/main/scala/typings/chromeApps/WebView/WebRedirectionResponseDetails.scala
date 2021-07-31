package typings.chromeApps.WebView

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.webRequest.ResourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRedirectionResponseDetails
  extends StObject
     with WebResponseCacheDetails {
  
  /** The new URL. */
  var redirectUrl: String
}
object WebRedirectionResponseDetails {
  
  @scala.inline
  def apply(
    frameId: integer,
    fromCache: Boolean,
    method: String,
    parentFrameId: integer,
    redirectUrl: String,
    requestId: String,
    statusCode: integer,
    statusLine: String,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String
  ): WebRedirectionResponseDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRedirectionResponseDetails]
  }
  
  @scala.inline
  implicit class WebRedirectionResponseDetailsMutableBuilder[Self <: WebRedirectionResponseDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
  }
}
