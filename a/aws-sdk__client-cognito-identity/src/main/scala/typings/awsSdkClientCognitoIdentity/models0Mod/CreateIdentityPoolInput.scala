package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIdentityPoolInput extends StObject {
  
  /**
    * <p>Enables or disables the Basic (Classic) authentication flow. For more information, see
    *       <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html">Identity Pools (Federated Identities) Authentication Flow</a> in the <i>Amazon Cognito Developer Guide</i>.</p>
    */
  var AllowClassicFlow: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>TRUE if the identity pool supports unauthenticated logins.</p>
    */
  var AllowUnauthenticatedIdentities: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>An array of Amazon Cognito user pools and their client IDs.</p>
    */
  var CognitoIdentityProviders: js.UndefOr[js.Array[CognitoIdentityProvider]] = js.native
  
  /**
    * <p>The "domain" by which Cognito will refer to your users. This name acts as a
    *          placeholder that allows your backend and the Cognito service to communicate about the
    *          developer provider. For the <code>DeveloperProviderName</code>, you can use letters as well
    *          as period (<code>.</code>), underscore (<code>_</code>), and dash
    *          (<code>-</code>).</p>
    *          <p>Once you have set a developer provider name, you cannot change it. Please take care
    *          in setting this parameter.</p>
    */
  var DeveloperProviderName: js.UndefOr[String] = js.native
  
  /**
    * <p>A string that you provide.</p>
    */
  var IdentityPoolName: js.UndefOr[String] = js.native
  
  /**
    * <p>Tags to assign to the identity pool. A tag is a label that you can apply to identity
    *          pools to categorize and manage them in different ways, such as by purpose, owner,
    *          environment, or other criteria.</p>
    */
  var IdentityPoolTags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * <p>A list of OpendID Connect provider ARNs.</p>
    */
  var OpenIdConnectProviderARNs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * <p>An array of Amazon Resource Names (ARNs) of the SAML provider for your identity
    *          pool.</p>
    */
  var SamlProviderARNs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * <p>Optional key:value pairs mapping provider names to provider app IDs.</p>
    */
  var SupportedLoginProviders: js.UndefOr[StringDictionary[String]] = js.native
}
object CreateIdentityPoolInput {
  
  @scala.inline
  def apply(): CreateIdentityPoolInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIdentityPoolInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "CreateIdentityPoolInput.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: CreateIdentityPoolInput): js.Any = js.native
  
  @scala.inline
  implicit class CreateIdentityPoolInputMutableBuilder[Self <: CreateIdentityPoolInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowClassicFlow(value: Boolean): Self = StObject.set(x, "AllowClassicFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowClassicFlowUndefined: Self = StObject.set(x, "AllowClassicFlow", js.undefined)
    
    @scala.inline
    def setAllowUnauthenticatedIdentities(value: Boolean): Self = StObject.set(x, "AllowUnauthenticatedIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnauthenticatedIdentitiesUndefined: Self = StObject.set(x, "AllowUnauthenticatedIdentities", js.undefined)
    
    @scala.inline
    def setCognitoIdentityProviders(value: js.Array[CognitoIdentityProvider]): Self = StObject.set(x, "CognitoIdentityProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoIdentityProvidersUndefined: Self = StObject.set(x, "CognitoIdentityProviders", js.undefined)
    
    @scala.inline
    def setCognitoIdentityProvidersVarargs(value: CognitoIdentityProvider*): Self = StObject.set(x, "CognitoIdentityProviders", js.Array(value :_*))
    
    @scala.inline
    def setDeveloperProviderName(value: String): Self = StObject.set(x, "DeveloperProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperProviderNameUndefined: Self = StObject.set(x, "DeveloperProviderName", js.undefined)
    
    @scala.inline
    def setIdentityPoolName(value: String): Self = StObject.set(x, "IdentityPoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolNameUndefined: Self = StObject.set(x, "IdentityPoolName", js.undefined)
    
    @scala.inline
    def setIdentityPoolTags(value: StringDictionary[String]): Self = StObject.set(x, "IdentityPoolTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolTagsUndefined: Self = StObject.set(x, "IdentityPoolTags", js.undefined)
    
    @scala.inline
    def setOpenIdConnectProviderARNs(value: js.Array[String]): Self = StObject.set(x, "OpenIdConnectProviderARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIdConnectProviderARNsUndefined: Self = StObject.set(x, "OpenIdConnectProviderARNs", js.undefined)
    
    @scala.inline
    def setOpenIdConnectProviderARNsVarargs(value: String*): Self = StObject.set(x, "OpenIdConnectProviderARNs", js.Array(value :_*))
    
    @scala.inline
    def setSamlProviderARNs(value: js.Array[String]): Self = StObject.set(x, "SamlProviderARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamlProviderARNsUndefined: Self = StObject.set(x, "SamlProviderARNs", js.undefined)
    
    @scala.inline
    def setSamlProviderARNsVarargs(value: String*): Self = StObject.set(x, "SamlProviderARNs", js.Array(value :_*))
    
    @scala.inline
    def setSupportedLoginProviders(value: StringDictionary[String]): Self = StObject.set(x, "SupportedLoginProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedLoginProvidersUndefined: Self = StObject.set(x, "SupportedLoginProviders", js.undefined)
  }
}
