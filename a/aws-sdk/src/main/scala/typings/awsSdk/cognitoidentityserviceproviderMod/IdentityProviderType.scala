package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProviderType extends StObject {
  
  /**
    * A mapping of identity provider attributes to standard and custom user pool attributes.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined
  
  /**
    * The date the identity provider was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined
  
  /**
    * The date the identity provider was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The identity provider details. The following list describes the provider detail keys for each identity provider type.   For Google and Login with Amazon:   client_id   client_secret   authorize_scopes     For Facebook:   client_id   client_secret   authorize_scopes   api_version     For Sign in with Apple:   client_id   team_id   key_id   private_key   authorize_scopes     For OIDC providers:   client_id   client_secret   attributes_request_method   oidc_issuer   authorize_scopes   authorize_url if not available from discovery URL specified by oidc_issuer key    token_url if not available from discovery URL specified by oidc_issuer key    attributes_url if not available from discovery URL specified by oidc_issuer key    jwks_uri if not available from discovery URL specified by oidc_issuer key    authorize_scopes     For SAML providers:   MetadataFile OR MetadataURL   IDPSignOut optional     
    */
  var ProviderDetails: js.UndefOr[ProviderDetailsType] = js.undefined
  
  /**
    * The identity provider name.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.undefined
  
  /**
    * The identity provider type.
    */
  var ProviderType: js.UndefOr[IdentityProviderTypeType] = js.undefined
  
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}
object IdentityProviderType {
  
  @scala.inline
  def apply(): IdentityProviderType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderType]
  }
  
  @scala.inline
  implicit class IdentityProviderTypeMutableBuilder[Self <: IdentityProviderType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeMapping(value: AttributeMappingType): Self = StObject.set(x, "AttributeMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeMappingUndefined: Self = StObject.set(x, "AttributeMapping", js.undefined)
    
    @scala.inline
    def setCreationDate(value: DateType): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setIdpIdentifiers(value: IdpIdentifiersListType): Self = StObject.set(x, "IdpIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdpIdentifiersUndefined: Self = StObject.set(x, "IdpIdentifiers", js.undefined)
    
    @scala.inline
    def setIdpIdentifiersVarargs(value: IdpIdentifierType*): Self = StObject.set(x, "IdpIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setProviderDetails(value: ProviderDetailsType): Self = StObject.set(x, "ProviderDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderDetailsUndefined: Self = StObject.set(x, "ProviderDetails", js.undefined)
    
    @scala.inline
    def setProviderName(value: ProviderNameType): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
    
    @scala.inline
    def setProviderType(value: IdentityProviderTypeType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
