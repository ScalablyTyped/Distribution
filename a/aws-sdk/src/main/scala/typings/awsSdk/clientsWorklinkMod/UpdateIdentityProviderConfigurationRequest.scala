package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIdentityProviderConfigurationRequest extends StObject {
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.clientsWorklinkMod.FleetArn
  
  /**
    * The SAML metadata document provided by the customer’s identity provider. The existing IdentityProviderSamlMetadata is unset if null is passed.
    */
  var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.undefined
  
  /**
    * The type of identity provider.
    */
  var IdentityProviderType: typings.awsSdk.clientsWorklinkMod.IdentityProviderType
}
object UpdateIdentityProviderConfigurationRequest {
  
  inline def apply(FleetArn: FleetArn, IdentityProviderType: IdentityProviderType): UpdateIdentityProviderConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], IdentityProviderType = IdentityProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIdentityProviderConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateIdentityProviderConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderSamlMetadata(value: SamlMetadata): Self = StObject.set(x, "IdentityProviderSamlMetadata", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderSamlMetadataUndefined: Self = StObject.set(x, "IdentityProviderSamlMetadata", js.undefined)
    
    inline def setIdentityProviderType(value: IdentityProviderType): Self = StObject.set(x, "IdentityProviderType", value.asInstanceOf[js.Any])
  }
}
