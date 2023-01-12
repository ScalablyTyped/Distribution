package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalSummary extends StObject {
  
  /**
    * The ARN of the browser settings that is associated with the web portal.
    */
  var browserSettingsArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The browser type of the web portal.
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
    * The ARN of the trust that is associated with this web portal.
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
object PortalSummary {
  
  inline def apply(): PortalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortalSummary] (val x: Self) extends AnyVal {
    
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
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
    
    inline def setTrustStoreArnUndefined: Self = StObject.set(x, "trustStoreArn", js.undefined)
    
    inline def setUserAccessLoggingSettingsArn(value: ARN): Self = StObject.set(x, "userAccessLoggingSettingsArn", value.asInstanceOf[js.Any])
    
    inline def setUserAccessLoggingSettingsArnUndefined: Self = StObject.set(x, "userAccessLoggingSettingsArn", js.undefined)
    
    inline def setUserSettingsArn(value: ARN): Self = StObject.set(x, "userSettingsArn", value.asInstanceOf[js.Any])
    
    inline def setUserSettingsArnUndefined: Self = StObject.set(x, "userSettingsArn", js.undefined)
  }
}
