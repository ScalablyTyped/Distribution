package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Portal extends StObject {
  
  /**
    * The type of authentication integration points used when signing into the web portal. Defaults to Standard.  Standard web portals are authenticated directly through your identity provider. You need to call CreateIdentityProvider to integrate your identity provider with your web portal. User and group access to your web portal is controlled through your identity provider.  IAM_Identity_Center web portals are authenticated through AWS IAM Identity Center (successor to AWS Single Sign-On). They provide additional features, such as IdP-initiated authentication. Identity sources (including external identity provider integration), plus user and group access to your web portal, can be configured in the IAM Identity Center.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.undefined
  
  /**
    * The ARN of the browser settings that is associated with this web portal.
    */
  var browserSettingsArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The browser that users see when using a streaming session.
    */
  var browserType: js.UndefOr[BrowserType] = js.undefined
  
  /**
    * The creation date of the web portal.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the web portal.
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The ARN of the network settings that is associated with the web portal.
    */
  var networkSettingsArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The endpoint URL of the web portal that users access in order to start streaming sessions.
    */
  var portalEndpoint: js.UndefOr[PortalEndpoint] = js.undefined
  
  /**
    * The status of the web portal.
    */
  var portalStatus: js.UndefOr[PortalStatus] = js.undefined
  
  /**
    * The renderer that is used in streaming sessions.
    */
  var rendererType: js.UndefOr[RendererType] = js.undefined
  
  /**
    * A message that explains why the web portal is in its current status.
    */
  var statusReason: js.UndefOr[StatusReason] = js.undefined
  
  /**
    * The ARN of the trust store that is associated with the web portal.
    */
  var trustStoreArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The ARN of the user access logging settings that is associated with the web portal.
    */
  var userAccessLoggingSettingsArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The ARN of the user settings that is associated with the web portal.
    */
  var userSettingsArn: js.UndefOr[ARN] = js.undefined
}
object Portal {
  
  inline def apply(): Portal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Portal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Portal] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    inline def setBrowserSettingsArn(value: ARN): Self = StObject.set(x, "browserSettingsArn", value.asInstanceOf[js.Any])
    
    inline def setBrowserSettingsArnUndefined: Self = StObject.set(x, "browserSettingsArn", js.undefined)
    
    inline def setBrowserType(value: BrowserType): Self = StObject.set(x, "browserType", value.asInstanceOf[js.Any])
    
    inline def setBrowserTypeUndefined: Self = StObject.set(x, "browserType", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setNetworkSettingsArn(value: ARN): Self = StObject.set(x, "networkSettingsArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkSettingsArnUndefined: Self = StObject.set(x, "networkSettingsArn", js.undefined)
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
    
    inline def setPortalArnUndefined: Self = StObject.set(x, "portalArn", js.undefined)
    
    inline def setPortalEndpoint(value: PortalEndpoint): Self = StObject.set(x, "portalEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPortalEndpointUndefined: Self = StObject.set(x, "portalEndpoint", js.undefined)
    
    inline def setPortalStatus(value: PortalStatus): Self = StObject.set(x, "portalStatus", value.asInstanceOf[js.Any])
    
    inline def setPortalStatusUndefined: Self = StObject.set(x, "portalStatus", js.undefined)
    
    inline def setRendererType(value: RendererType): Self = StObject.set(x, "rendererType", value.asInstanceOf[js.Any])
    
    inline def setRendererTypeUndefined: Self = StObject.set(x, "rendererType", js.undefined)
    
    inline def setStatusReason(value: StatusReason): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
    
    inline def setTrustStoreArnUndefined: Self = StObject.set(x, "trustStoreArn", js.undefined)
    
    inline def setUserAccessLoggingSettingsArn(value: ARN): Self = StObject.set(x, "userAccessLoggingSettingsArn", value.asInstanceOf[js.Any])
    
    inline def setUserAccessLoggingSettingsArnUndefined: Self = StObject.set(x, "userAccessLoggingSettingsArn", js.undefined)
    
    inline def setUserSettingsArn(value: ARN): Self = StObject.set(x, "userSettingsArn", value.asInstanceOf[js.Any])
    
    inline def setUserSettingsArnUndefined: Self = StObject.set(x, "userSettingsArn", js.undefined)
  }
}
