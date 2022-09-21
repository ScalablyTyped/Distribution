package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPortalServiceProviderMetadataResponse extends StObject {
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
  
  /**
    * The service provider SAML metadata.
    */
  var serviceProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.undefined
}
object GetPortalServiceProviderMetadataResponse {
  
  inline def apply(portalArn: ARN): GetPortalServiceProviderMetadataResponse = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPortalServiceProviderMetadataResponse]
  }
  
  extension [Self <: GetPortalServiceProviderMetadataResponse](x: Self) {
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
    
    inline def setServiceProviderSamlMetadata(value: SamlMetadata): Self = StObject.set(x, "serviceProviderSamlMetadata", value.asInstanceOf[js.Any])
    
    inline def setServiceProviderSamlMetadataUndefined: Self = StObject.set(x, "serviceProviderSamlMetadata", js.undefined)
  }
}
