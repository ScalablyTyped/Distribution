package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityPool extends StObject {
  
  /**
    * Enables or disables the Basic (Classic) authentication flow. For more information, see Identity Pools (Federated Identities) Authentication Flow in the Amazon Cognito Developer Guide.
    */
  var AllowClassicFlow: js.UndefOr[ClassicFlow] = js.native
  
  /**
    * TRUE if the identity pool supports unauthenticated logins.
    */
  var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated = js.native
  
  /**
    * A list representing an Amazon Cognito user pool and its client ID.
    */
  var CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList] = js.native
  
  /**
    * The "domain" by which Cognito will refer to your users.
    */
  var DeveloperProviderName: js.UndefOr[typings.awsSdk.cognitoidentityMod.DeveloperProviderName] = js.native
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsSdk.cognitoidentityMod.IdentityPoolId = js.native
  
  /**
    * A string that you provide.
    */
  var IdentityPoolName: typings.awsSdk.cognitoidentityMod.IdentityPoolName = js.native
  
  /**
    * The tags that are assigned to the identity pool. A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var IdentityPoolTags: js.UndefOr[IdentityPoolTagsType] = js.native
  
  /**
    * A list of OpendID Connect provider ARNs.
    */
  var OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.native
  
  /**
    * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.
    */
  var SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.native
  
  /**
    * Optional key:value pairs mapping provider names to provider app IDs.
    */
  var SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.native
}
object IdentityPool {
  
  @scala.inline
  def apply(
    AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated,
    IdentityPoolId: IdentityPoolId,
    IdentityPoolName: IdentityPoolName
  ): IdentityPool = {
    val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPool]
  }
  
  @scala.inline
  implicit class IdentityPoolMutableBuilder[Self <: IdentityPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowClassicFlow(value: ClassicFlow): Self = StObject.set(x, "AllowClassicFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowClassicFlowUndefined: Self = StObject.set(x, "AllowClassicFlow", js.undefined)
    
    @scala.inline
    def setAllowUnauthenticatedIdentities(value: IdentityPoolUnauthenticated): Self = StObject.set(x, "AllowUnauthenticatedIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoIdentityProviders(value: CognitoIdentityProviderList): Self = StObject.set(x, "CognitoIdentityProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoIdentityProvidersUndefined: Self = StObject.set(x, "CognitoIdentityProviders", js.undefined)
    
    @scala.inline
    def setCognitoIdentityProvidersVarargs(value: CognitoIdentityProvider*): Self = StObject.set(x, "CognitoIdentityProviders", js.Array(value :_*))
    
    @scala.inline
    def setDeveloperProviderName(value: DeveloperProviderName): Self = StObject.set(x, "DeveloperProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperProviderNameUndefined: Self = StObject.set(x, "DeveloperProviderName", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolName(value: IdentityPoolName): Self = StObject.set(x, "IdentityPoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolTags(value: IdentityPoolTagsType): Self = StObject.set(x, "IdentityPoolTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolTagsUndefined: Self = StObject.set(x, "IdentityPoolTags", js.undefined)
    
    @scala.inline
    def setOpenIdConnectProviderARNs(value: OIDCProviderList): Self = StObject.set(x, "OpenIdConnectProviderARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIdConnectProviderARNsUndefined: Self = StObject.set(x, "OpenIdConnectProviderARNs", js.undefined)
    
    @scala.inline
    def setOpenIdConnectProviderARNsVarargs(value: ARNString*): Self = StObject.set(x, "OpenIdConnectProviderARNs", js.Array(value :_*))
    
    @scala.inline
    def setSamlProviderARNs(value: SAMLProviderList): Self = StObject.set(x, "SamlProviderARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamlProviderARNsUndefined: Self = StObject.set(x, "SamlProviderARNs", js.undefined)
    
    @scala.inline
    def setSamlProviderARNsVarargs(value: ARNString*): Self = StObject.set(x, "SamlProviderARNs", js.Array(value :_*))
    
    @scala.inline
    def setSupportedLoginProviders(value: IdentityProviders): Self = StObject.set(x, "SupportedLoginProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedLoginProvidersUndefined: Self = StObject.set(x, "SupportedLoginProviders", js.undefined)
  }
}
