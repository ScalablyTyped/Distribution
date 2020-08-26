package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIdentityPoolInput extends js.Object {
  /**
    * Enables or disables the Basic (Classic) authentication flow. For more information, see Identity Pools (Federated Identities) Authentication Flow in the Amazon Cognito Developer Guide.
    */
  var AllowClassicFlow: js.UndefOr[ClassicFlow] = js.native
  /**
    * TRUE if the identity pool supports unauthenticated logins.
    */
  var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated = js.native
  /**
    * An array of Amazon Cognito user pools and their client IDs.
    */
  var CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList] = js.native
  /**
    * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your backend and the Cognito service to communicate about the developer provider. For the DeveloperProviderName, you can use letters as well as period (.), underscore (_), and dash (-). Once you have set a developer provider name, you cannot change it. Please take care in setting this parameter.
    */
  var DeveloperProviderName: js.UndefOr[typings.awsSdk.cognitoidentityMod.DeveloperProviderName] = js.native
  /**
    * A string that you provide.
    */
  var IdentityPoolName: typings.awsSdk.cognitoidentityMod.IdentityPoolName = js.native
  /**
    * Tags to assign to the identity pool. A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
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

object CreateIdentityPoolInput {
  @scala.inline
  def apply(AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated, IdentityPoolName: IdentityPoolName): CreateIdentityPoolInput = {
    val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityPoolInput]
  }
  @scala.inline
  implicit class CreateIdentityPoolInputOps[Self <: CreateIdentityPoolInput] (val x: Self) extends AnyVal {
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
    def setAllowUnauthenticatedIdentities(value: IdentityPoolUnauthenticated): Self = this.set("AllowUnauthenticatedIdentities", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityPoolName(value: IdentityPoolName): Self = this.set("IdentityPoolName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowClassicFlow(value: ClassicFlow): Self = this.set("AllowClassicFlow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClassicFlow: Self = this.set("AllowClassicFlow", js.undefined)
    @scala.inline
    def setCognitoIdentityProvidersVarargs(value: CognitoIdentityProvider*): Self = this.set("CognitoIdentityProviders", js.Array(value :_*))
    @scala.inline
    def setCognitoIdentityProviders(value: CognitoIdentityProviderList): Self = this.set("CognitoIdentityProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCognitoIdentityProviders: Self = this.set("CognitoIdentityProviders", js.undefined)
    @scala.inline
    def setDeveloperProviderName(value: DeveloperProviderName): Self = this.set("DeveloperProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperProviderName: Self = this.set("DeveloperProviderName", js.undefined)
    @scala.inline
    def setIdentityPoolTags(value: IdentityPoolTagsType): Self = this.set("IdentityPoolTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityPoolTags: Self = this.set("IdentityPoolTags", js.undefined)
    @scala.inline
    def setOpenIdConnectProviderARNsVarargs(value: ARNString*): Self = this.set("OpenIdConnectProviderARNs", js.Array(value :_*))
    @scala.inline
    def setOpenIdConnectProviderARNs(value: OIDCProviderList): Self = this.set("OpenIdConnectProviderARNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenIdConnectProviderARNs: Self = this.set("OpenIdConnectProviderARNs", js.undefined)
    @scala.inline
    def setSamlProviderARNsVarargs(value: ARNString*): Self = this.set("SamlProviderARNs", js.Array(value :_*))
    @scala.inline
    def setSamlProviderARNs(value: SAMLProviderList): Self = this.set("SamlProviderARNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamlProviderARNs: Self = this.set("SamlProviderARNs", js.undefined)
    @scala.inline
    def setSupportedLoginProviders(value: IdentityProviders): Self = this.set("SupportedLoginProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedLoginProviders: Self = this.set("SupportedLoginProviders", js.undefined)
  }
  
}

