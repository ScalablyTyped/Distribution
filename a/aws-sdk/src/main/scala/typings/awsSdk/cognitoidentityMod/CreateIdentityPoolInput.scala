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
  def apply(
    AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated,
    IdentityPoolName: IdentityPoolName,
    AllowClassicFlow: js.UndefOr[ClassicFlow] = js.undefined,
    CognitoIdentityProviders: CognitoIdentityProviderList = null,
    DeveloperProviderName: DeveloperProviderName = null,
    IdentityPoolTags: IdentityPoolTagsType = null,
    OpenIdConnectProviderARNs: OIDCProviderList = null,
    SamlProviderARNs: SAMLProviderList = null,
    SupportedLoginProviders: IdentityProviders = null
  ): CreateIdentityPoolInput = {
    val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowClassicFlow)) __obj.updateDynamic("AllowClassicFlow")(AllowClassicFlow.get.asInstanceOf[js.Any])
    if (CognitoIdentityProviders != null) __obj.updateDynamic("CognitoIdentityProviders")(CognitoIdentityProviders.asInstanceOf[js.Any])
    if (DeveloperProviderName != null) __obj.updateDynamic("DeveloperProviderName")(DeveloperProviderName.asInstanceOf[js.Any])
    if (IdentityPoolTags != null) __obj.updateDynamic("IdentityPoolTags")(IdentityPoolTags.asInstanceOf[js.Any])
    if (OpenIdConnectProviderARNs != null) __obj.updateDynamic("OpenIdConnectProviderARNs")(OpenIdConnectProviderARNs.asInstanceOf[js.Any])
    if (SamlProviderARNs != null) __obj.updateDynamic("SamlProviderARNs")(SamlProviderARNs.asInstanceOf[js.Any])
    if (SupportedLoginProviders != null) __obj.updateDynamic("SupportedLoginProviders")(SupportedLoginProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityPoolInput]
  }
}

