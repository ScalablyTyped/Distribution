package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redirect extends StObject {
  
  /**
    * The host name to use in the redirect request.
    */
  var HostName: js.UndefOr[typings.awsSdk.s3Mod.HostName] = js.native
  
  /**
    * The HTTP redirect code to use on the response. Not required if one of the siblings is present.
    */
  var HttpRedirectCode: js.UndefOr[typings.awsSdk.s3Mod.HttpRedirectCode] = js.native
  
  /**
    * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var Protocol: js.UndefOr[typings.awsSdk.s3Mod.Protocol] = js.native
  
  /**
    * The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix docs/ (objects in the docs/ folder) to documents/, you can set a condition block with KeyPrefixEquals set to docs/ and in the Redirect set ReplaceKeyPrefixWith to /documents. Not required if one of the siblings is present. Can be present only if ReplaceKeyWith is not provided.
    */
  var ReplaceKeyPrefixWith: js.UndefOr[typings.awsSdk.s3Mod.ReplaceKeyPrefixWith] = js.native
  
  /**
    * The specific object key to use in the redirect request. For example, redirect request to error.html. Not required if one of the siblings is present. Can be present only if ReplaceKeyPrefixWith is not provided.
    */
  var ReplaceKeyWith: js.UndefOr[typings.awsSdk.s3Mod.ReplaceKeyWith] = js.native
}
object Redirect {
  
  @scala.inline
  def apply(): Redirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Redirect]
  }
  
  @scala.inline
  implicit class RedirectMutableBuilder[Self <: Redirect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostName(value: HostName): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNameUndefined: Self = StObject.set(x, "HostName", js.undefined)
    
    @scala.inline
    def setHttpRedirectCode(value: HttpRedirectCode): Self = StObject.set(x, "HttpRedirectCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRedirectCodeUndefined: Self = StObject.set(x, "HttpRedirectCode", js.undefined)
    
    @scala.inline
    def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setReplaceKeyPrefixWith(value: ReplaceKeyPrefixWith): Self = StObject.set(x, "ReplaceKeyPrefixWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceKeyPrefixWithUndefined: Self = StObject.set(x, "ReplaceKeyPrefixWith", js.undefined)
    
    @scala.inline
    def setReplaceKeyWith(value: ReplaceKeyWith): Self = StObject.set(x, "ReplaceKeyWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceKeyWithUndefined: Self = StObject.set(x, "ReplaceKeyWith", js.undefined)
  }
}
