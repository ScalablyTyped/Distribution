package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityProviderType extends js.Object {
  /**
    * A mapping of identity provider attributes to standard and custom user pool attributes.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.native
  /**
    * The date the identity provider was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.native
  /**
    * The date the identity provider was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The identity provider details. The following list describes the provider detail keys for each identity provider type.   For Google, Facebook and Login with Amazon:   client_id   client_secret   authorize_scopes     For Sign in with Apple:   client_id   team_id   key_id   private_key   authorize_scopes     For OIDC providers:   client_id   client_secret   attributes_request_method   oidc_issuer   authorize_scopes   authorize_url if not available from discovery URL specified by oidc_issuer key    token_url if not available from discovery URL specified by oidc_issuer key    attributes_url if not available from discovery URL specified by oidc_issuer key    jwks_uri if not available from discovery URL specified by oidc_issuer key    authorize_scopes     For SAML providers:   MetadataFile OR MetadataURL   IDPSignOut optional     
    */
  var ProviderDetails: js.UndefOr[ProviderDetailsType] = js.native
  /**
    * The identity provider name.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.native
  /**
    * The identity provider type.
    */
  var ProviderType: js.UndefOr[IdentityProviderTypeType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object IdentityProviderType {
  @scala.inline
  def apply(): IdentityProviderType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderType]
  }
  @scala.inline
  implicit class IdentityProviderTypeOps[Self <: IdentityProviderType] (val x: Self) extends AnyVal {
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
    def setAttributeMapping(value: AttributeMappingType): Self = this.set("AttributeMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeMapping: Self = this.set("AttributeMapping", js.undefined)
    @scala.inline
    def setCreationDate(value: DateType): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setIdpIdentifiersVarargs(value: IdpIdentifierType*): Self = this.set("IdpIdentifiers", js.Array(value :_*))
    @scala.inline
    def setIdpIdentifiers(value: IdpIdentifiersListType): Self = this.set("IdpIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdpIdentifiers: Self = this.set("IdpIdentifiers", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setProviderDetails(value: ProviderDetailsType): Self = this.set("ProviderDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderDetails: Self = this.set("ProviderDetails", js.undefined)
    @scala.inline
    def setProviderName(value: ProviderNameType): Self = this.set("ProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderName: Self = this.set("ProviderName", js.undefined)
    @scala.inline
    def setProviderType(value: IdentityProviderTypeType): Self = this.set("ProviderType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderType: Self = this.set("ProviderType", js.undefined)
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPoolId: Self = this.set("UserPoolId", js.undefined)
  }
  
}

