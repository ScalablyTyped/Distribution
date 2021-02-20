package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIdentityProviderRequest extends StObject {
  
  /**
    * A mapping of identity provider attributes to standard and custom user pool attributes.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.native
  
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.native
  
  /**
    * The identity provider details. The following list describes the provider detail keys for each identity provider type.   For Google and Login with Amazon:   client_id   client_secret   authorize_scopes     For Facebook:   client_id   client_secret   authorize_scopes   api_version     For Sign in with Apple:   client_id   team_id   key_id   private_key   authorize_scopes     For OIDC providers:   client_id   client_secret   attributes_request_method   oidc_issuer   authorize_scopes   authorize_url if not available from discovery URL specified by oidc_issuer key    token_url if not available from discovery URL specified by oidc_issuer key    attributes_url if not available from discovery URL specified by oidc_issuer key    jwks_uri if not available from discovery URL specified by oidc_issuer key      For SAML providers:   MetadataFile OR MetadataURL   IDPSignout optional     
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
    UserPoolId: UserPoolIdType
  ): CreateIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderDetails = ProviderDetails.asInstanceOf[js.Any], ProviderName = ProviderName.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityProviderRequest]
  }
  
  @scala.inline
  implicit class CreateIdentityProviderRequestMutableBuilder[Self <: CreateIdentityProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeMapping(value: AttributeMappingType): Self = StObject.set(x, "AttributeMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeMappingUndefined: Self = StObject.set(x, "AttributeMapping", js.undefined)
    
    @scala.inline
    def setIdpIdentifiers(value: IdpIdentifiersListType): Self = StObject.set(x, "IdpIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdpIdentifiersUndefined: Self = StObject.set(x, "IdpIdentifiers", js.undefined)
    
    @scala.inline
    def setIdpIdentifiersVarargs(value: IdpIdentifierType*): Self = StObject.set(x, "IdpIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setProviderDetails(value: ProviderDetailsType): Self = StObject.set(x, "ProviderDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: ProviderNameTypeV1): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderType(value: IdentityProviderTypeType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
