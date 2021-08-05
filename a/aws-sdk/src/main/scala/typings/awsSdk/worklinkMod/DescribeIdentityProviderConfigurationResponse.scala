package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdentityProviderConfigurationResponse extends StObject {
  
  /**
    * The SAML metadata document provided by the user’s identity provider.
    */
  var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.undefined
  
  /**
    * The type of identity provider.
    */
  var IdentityProviderType: js.UndefOr[typings.awsSdk.worklinkMod.IdentityProviderType] = js.undefined
  
  /**
    * The SAML metadata document uploaded to the user’s identity provider.
    */
  var ServiceProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.undefined
}
object DescribeIdentityProviderConfigurationResponse {
  
  inline def apply(): DescribeIdentityProviderConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityProviderConfigurationResponse]
  }
  
  extension [Self <: DescribeIdentityProviderConfigurationResponse](x: Self) {
    
    inline def setIdentityProviderSamlMetadata(value: SamlMetadata): Self = StObject.set(x, "IdentityProviderSamlMetadata", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderSamlMetadataUndefined: Self = StObject.set(x, "IdentityProviderSamlMetadata", js.undefined)
    
    inline def setIdentityProviderType(value: IdentityProviderType): Self = StObject.set(x, "IdentityProviderType", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderTypeUndefined: Self = StObject.set(x, "IdentityProviderType", js.undefined)
    
    inline def setServiceProviderSamlMetadata(value: SamlMetadata): Self = StObject.set(x, "ServiceProviderSamlMetadata", value.asInstanceOf[js.Any])
    
    inline def setServiceProviderSamlMetadataUndefined: Self = StObject.set(x, "ServiceProviderSamlMetadata", js.undefined)
  }
}
