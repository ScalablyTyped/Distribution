package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    FleetArn: FleetArn,
    IdentityProviderType: IdentityProviderType,
    IdentityProviderSamlMetadata: SamlMetadata = null
  ): UpdateIdentityProviderConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], IdentityProviderType = IdentityProviderType.asInstanceOf[js.Any])
    if (IdentityProviderSamlMetadata != null) __obj.updateDynamic("IdentityProviderSamlMetadata")(IdentityProviderSamlMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIdentityProviderConfigurationRequest]
  }
}

