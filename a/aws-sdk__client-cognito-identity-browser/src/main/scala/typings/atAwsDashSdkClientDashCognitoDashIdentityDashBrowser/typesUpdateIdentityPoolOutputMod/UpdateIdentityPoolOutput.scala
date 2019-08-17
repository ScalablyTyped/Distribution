package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUpdateIdentityPoolOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreCognitoIdentityProviderMod._UnmarshalledCognitoIdentityProvider
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateIdentityPoolOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>TRUE if the identity pool supports unauthenticated logins.</p>
    */
  var AllowUnauthenticatedIdentities: Boolean
  /**
    * <p>A list representing an Amazon Cognito Identity User Pool and its client ID.</p>
    */
  var CognitoIdentityProviders: js.UndefOr[js.Array[_UnmarshalledCognitoIdentityProvider]] = js.undefined
  /**
    * <p>The "domain" by which Cognito will refer to your users.</p>
    */
  var DeveloperProviderName: js.UndefOr[String] = js.undefined
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: String
  /**
    * <p>A string that you provide.</p>
    */
  var IdentityPoolName: String
  /**
    * <p>A list of OpendID Connect provider ARNs.</p>
    */
  var OpenIdConnectProviderARNs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.</p>
    */
  var SamlProviderARNs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>Optional key:value pairs mapping provider names to provider app IDs.</p>
    */
  var SupportedLoginProviders: js.UndefOr[StringDictionary[String]] = js.undefined
}

object UpdateIdentityPoolOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    AllowUnauthenticatedIdentities: Boolean,
    IdentityPoolId: String,
    IdentityPoolName: String,
    CognitoIdentityProviders: js.Array[_UnmarshalledCognitoIdentityProvider] = null,
    DeveloperProviderName: String = null,
    OpenIdConnectProviderARNs: js.Array[String] = null,
    SamlProviderARNs: js.Array[String] = null,
    SupportedLoginProviders: StringDictionary[String] = null
  ): UpdateIdentityPoolOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities, IdentityPoolId = IdentityPoolId, IdentityPoolName = IdentityPoolName)
    if (CognitoIdentityProviders != null) __obj.updateDynamic("CognitoIdentityProviders")(CognitoIdentityProviders)
    if (DeveloperProviderName != null) __obj.updateDynamic("DeveloperProviderName")(DeveloperProviderName)
    if (OpenIdConnectProviderARNs != null) __obj.updateDynamic("OpenIdConnectProviderARNs")(OpenIdConnectProviderARNs)
    if (SamlProviderARNs != null) __obj.updateDynamic("SamlProviderARNs")(SamlProviderARNs)
    if (SupportedLoginProviders != null) __obj.updateDynamic("SupportedLoginProviders")(SupportedLoginProviders)
    __obj.asInstanceOf[UpdateIdentityPoolOutput]
  }
}

