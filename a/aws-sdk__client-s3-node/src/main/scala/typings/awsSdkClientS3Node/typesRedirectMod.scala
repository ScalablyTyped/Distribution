package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.http
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.https
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRedirectMod {
  
  trait Redirect extends StObject {
    
    /**
      * <p>The host name to use in the redirect request.</p>
      */
    var HostName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The HTTP redirect code to use on the response. Not required if one of the siblings is present.</p>
      */
    var HttpRedirectCode: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Protocol to use (http, https) when redirecting requests. The default is the protocol that is used in the original request.</p>
      */
    var Protocol: js.UndefOr[http | https | String] = js.undefined
    
    /**
      * <p>The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix docs/ (objects in the docs/ folder) to documents/, you can set a condition block with KeyPrefixEquals set to docs/ and in the Redirect set ReplaceKeyPrefixWith to /documents. Not required if one of the siblings is present. Can be present only if ReplaceKeyWith is not provided.</p>
      */
    var ReplaceKeyPrefixWith: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The specific object key to use in the redirect request. For example, redirect request to error.html. Not required if one of the sibling is present. Can be present only if ReplaceKeyPrefixWith is not provided.</p>
      */
    var ReplaceKeyWith: js.UndefOr[String] = js.undefined
  }
  object Redirect {
    
    inline def apply(): Redirect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Redirect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Redirect] (val x: Self) extends AnyVal {
      
      inline def setHostName(value: String): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
      
      inline def setHostNameUndefined: Self = StObject.set(x, "HostName", js.undefined)
      
      inline def setHttpRedirectCode(value: String): Self = StObject.set(x, "HttpRedirectCode", value.asInstanceOf[js.Any])
      
      inline def setHttpRedirectCodeUndefined: Self = StObject.set(x, "HttpRedirectCode", js.undefined)
      
      inline def setProtocol(value: http | https | String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
      
      inline def setReplaceKeyPrefixWith(value: String): Self = StObject.set(x, "ReplaceKeyPrefixWith", value.asInstanceOf[js.Any])
      
      inline def setReplaceKeyPrefixWithUndefined: Self = StObject.set(x, "ReplaceKeyPrefixWith", js.undefined)
      
      inline def setReplaceKeyWith(value: String): Self = StObject.set(x, "ReplaceKeyWith", value.asInstanceOf[js.Any])
      
      inline def setReplaceKeyWithUndefined: Self = StObject.set(x, "ReplaceKeyWith", js.undefined)
    }
  }
  
  type UnmarshalledRedirect = Redirect
}
