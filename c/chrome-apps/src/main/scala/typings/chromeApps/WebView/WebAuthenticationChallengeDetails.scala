package typings.chromeApps.WebView

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.webRequest.ResourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAuthenticationChallengeDetails
  extends StObject
     with WebResponseHeadersDetails {
  
  /** The server requesting authentication. */
  var challenger: WebAuthChallenger
  
  /** True for Proxy-Authenticate, false for WWW-Authenticate. */
  var isProxy: Boolean
  
  /** The authentication realm provided by the server, if there is one. */
  var realm: js.UndefOr[String] = js.undefined
  
  /** The authentication scheme, e.g. Basic or Digest. */
  var scheme: String
}
object WebAuthenticationChallengeDetails {
  
  inline def apply(
    challenger: WebAuthChallenger,
    frameId: integer,
    isProxy: Boolean,
    method: String,
    parentFrameId: integer,
    requestId: String,
    scheme: String,
    statusCode: integer,
    statusLine: String,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String
  ): WebAuthenticationChallengeDetails = {
    val __obj = js.Dynamic.literal(challenger = challenger.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], isProxy = isProxy.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthenticationChallengeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebAuthenticationChallengeDetails] (val x: Self) extends AnyVal {
    
    inline def setChallenger(value: WebAuthChallenger): Self = StObject.set(x, "challenger", value.asInstanceOf[js.Any])
    
    inline def setIsProxy(value: Boolean): Self = StObject.set(x, "isProxy", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
