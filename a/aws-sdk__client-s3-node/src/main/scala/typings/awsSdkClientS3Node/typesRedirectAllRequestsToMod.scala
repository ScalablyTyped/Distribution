package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.http
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.https
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRedirectAllRequestsToMod {
  
  @js.native
  trait RedirectAllRequestsTo extends StObject {
    
    /**
      * <p>Name of the host where requests will be redirected.</p>
      */
    var HostName: String = js.native
    
    /**
      * <p>Protocol to use (http, https) when redirecting requests. The default is the protocol that is used in the original request.</p>
      */
    var Protocol: js.UndefOr[http | https | String] = js.native
  }
  object RedirectAllRequestsTo {
    
    @scala.inline
    def apply(HostName: String): RedirectAllRequestsTo = {
      val __obj = js.Dynamic.literal(HostName = HostName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectAllRequestsTo]
    }
    
    @scala.inline
    implicit class RedirectAllRequestsToMutableBuilder[Self <: RedirectAllRequestsTo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostName(value: String): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: http | https | String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    }
  }
  
  type UnmarshalledRedirectAllRequestsTo = RedirectAllRequestsTo
}
