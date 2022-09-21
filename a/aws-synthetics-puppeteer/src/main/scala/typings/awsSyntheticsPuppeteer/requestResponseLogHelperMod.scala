package typings.awsSyntheticsPuppeteer

import typings.awsSyntheticsPuppeteer.anon.Headers
import typings.awsSyntheticsPuppeteer.anon.RemoteAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestResponseLogHelperMod {
  
  /**
    * Handles the fine grained configuration and creation of string representations of request and response payloads
    */
  @JSImport("RequestResponseLogHelper", "RequestResponseLogHelper")
  @js.native
  open class RequestResponseLogHelper () extends StObject {
    
    def getLogRequestString(request: Any): String = js.native
    
    def getLogResponseString(response: Any): String = js.native
    
    var request: Headers = js.native
    
    var response: RemoteAddress = js.native
    
    def withLogRequestHeaders(logRequestHeaders: Any): RequestResponseLogHelper = js.native
    
    def withLogRequestMethod(logRequestMethod: Any): RequestResponseLogHelper = js.native
    
    def withLogRequestPostData(logRequestPostData: Any): RequestResponseLogHelper = js.native
    
    def withLogRequestResourceType(logRequestResourceType: Any): RequestResponseLogHelper = js.native
    
    def withLogRequestUrl(logRequestUrl: Any): RequestResponseLogHelper = js.native
    
    def withLogResponseHeaders(logResponseHeaders: Any): RequestResponseLogHelper = js.native
    
    def withLogResponseRemoteAddress(logResponseRemoteAddress: Any): RequestResponseLogHelper = js.native
    
    def withLogResponseStatus(logResponseStatus: Any): RequestResponseLogHelper = js.native
    
    def withLogResponseStatusText(logResponseStatusText: Any): RequestResponseLogHelper = js.native
    
    def withLogResponseUrl(logResponseUrl: Any): RequestResponseLogHelper = js.native
  }
}
