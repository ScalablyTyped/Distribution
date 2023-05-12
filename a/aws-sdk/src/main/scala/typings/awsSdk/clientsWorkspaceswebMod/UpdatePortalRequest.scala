package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePortalRequest extends StObject {
  
  /**
    * The type of authentication integration points used when signing into the web portal. Defaults to Standard.  Standard web portals are authenticated directly through your identity provider. You need to call CreateIdentityProvider to integrate your identity provider with your web portal. User and group access to your web portal is controlled through your identity provider.  IAM_Identity_Center web portals are authenticated through AWS IAM Identity Center (successor to AWS Single Sign-On). They provide additional features, such as IdP-initiated authentication. Identity sources (including external identity provider integration), plus user and group access to your web portal, can be configured in the IAM Identity Center.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.undefined
  
  /**
    * The name of the web portal. This is not visible to users who log into the web portal.
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
}
object UpdatePortalRequest {
  
  inline def apply(portalArn: ARN): UpdatePortalRequest = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortalRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePortalRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
  }
}
