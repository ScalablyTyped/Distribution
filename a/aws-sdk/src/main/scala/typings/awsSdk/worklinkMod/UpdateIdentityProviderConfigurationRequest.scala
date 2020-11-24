package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateIdentityProviderConfigurationRequest extends js.Object {
  
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
  implicit class UpdateIdentityProviderConfigurationRequestOps[Self <: UpdateIdentityProviderConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = this.set("FleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityProviderType(value: IdentityProviderType): Self = this.set("IdentityProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityProviderSamlMetadata(value: SamlMetadata): Self = this.set("IdentityProviderSamlMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityProviderSamlMetadata: Self = this.set("IdentityProviderSamlMetadata", js.undefined)
  }
}
