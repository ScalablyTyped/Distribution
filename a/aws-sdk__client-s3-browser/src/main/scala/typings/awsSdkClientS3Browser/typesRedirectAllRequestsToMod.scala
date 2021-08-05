package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.http
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.https
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRedirectAllRequestsToMod {
  
  trait RedirectAllRequestsTo extends StObject {
    
    /**
      * <p>Name of the host where requests will be redirected.</p>
      */
    var HostName: String
    
    /**
      * <p>Protocol to use (http, https) when redirecting requests. The default is the protocol that is used in the original request.</p>
      */
    var Protocol: js.UndefOr[http | https | String] = js.undefined
  }
  object RedirectAllRequestsTo {
    
    inline def apply(HostName: String): RedirectAllRequestsTo = {
      val __obj = js.Dynamic.literal(HostName = HostName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectAllRequestsTo]
    }
    
    extension [Self <: RedirectAllRequestsTo](x: Self) {
      
      inline def setHostName(value: String): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: http | https | String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    }
  }
  
  type UnmarshalledRedirectAllRequestsTo = RedirectAllRequestsTo
}
