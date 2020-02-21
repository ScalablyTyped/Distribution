package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIdentityProviderRequest extends js.Object {
  /**
    * A mapping of identity provider attributes to standard and custom user pool attributes.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.native
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.native
  /**
    * The identity provider details. The following list describes the provider detail keys for each identity provider type.   For Google, Facebook and Login with Amazon:   client_id   client_secret   authorize_scopes     For Sign in with Apple:   client_id   team_id   key_id   private_key   authorize_scopes     For OIDC providers:   client_id   client_secret   attributes_request_method   oidc_issuer   authorize_scopes   authorize_url if not available from discovery URL specified by oidc_issuer key    token_url if not available from discovery URL specified by oidc_issuer key    attributes_url if not available from discovery URL specified by oidc_issuer key    jwks_uri if not available from discovery URL specified by oidc_issuer key    authorize_scopes     For SAML providers:   MetadataFile OR MetadataURL   IDPSignOut optional     
    */
  var ProviderDetails: ProviderDetailsType = js.native
  /**
    * The identity provider name.
    */
  var ProviderName: ProviderNameTypeV1 = js.native
  /**
    * The identity provider type.
    */
  var ProviderType: IdentityProviderTypeType = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object CreateIdentityProviderRequest {
  @scala.inline
  def apply(
    ProviderDetails: ProviderDetailsType,
    ProviderName: ProviderNameTypeV1,
    ProviderType: IdentityProviderTypeType,
    UserPoolId: UserPoolIdType,
    AttributeMapping: AttributeMappingType = null,
    IdpIdentifiers: IdpIdentifiersListType = null
  ): CreateIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderDetails = ProviderDetails.asInstanceOf[js.Any], ProviderName = ProviderName.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    if (AttributeMapping != null) __obj.updateDynamic("AttributeMapping")(AttributeMapping.asInstanceOf[js.Any])
    if (IdpIdentifiers != null) __obj.updateDynamic("IdpIdentifiers")(IdpIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityProviderRequest]
  }
}

