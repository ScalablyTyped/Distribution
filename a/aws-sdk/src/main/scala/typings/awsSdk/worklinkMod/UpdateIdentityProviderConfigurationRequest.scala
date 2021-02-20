package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateIdentityProviderConfigurationRequest extends StObject {
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
  
  /**
    * The SAML metadata document provided by the customer’s identity provider. The existing IdentityProviderSamlMetadata is unset if null is passed.
    */
  var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.native
  
  /**
    * The type of identity provider.
    */
  var IdentityProviderType: typings.awsSdk.worklinkMod.IdentityProviderType = js.native
}
object UpdateIdentityProviderConfigurationRequest {
  
  @scala.inline
  def apply(FleetArn: FleetArn, IdentityProviderType: IdentityProviderType): UpdateIdentityProviderConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], IdentityProviderType = IdentityProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIdentityProviderConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateIdentityProviderConfigurationRequestMutableBuilder[Self <: UpdateIdentityProviderConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityProviderSamlMetadata(value: SamlMetadata): Self = StObject.set(x, "IdentityProviderSamlMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityProviderSamlMetadataUndefined: Self = StObject.set(x, "IdentityProviderSamlMetadata", js.undefined)
    
    @scala.inline
    def setIdentityProviderType(value: IdentityProviderType): Self = StObject.set(x, "IdentityProviderType", value.asInstanceOf[js.Any])
  }
}
