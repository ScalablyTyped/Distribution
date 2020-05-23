package typings.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesCognitoIdentityProviderMod.CognitoIdentityProvider
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIdentityPoolInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>TRUE if the identity pool supports unauthenticated logins.</p>
    */
  var AllowUnauthenticatedIdentities: Boolean
  /**
    * <p>An array of Amazon Cognito Identity user pools and their client IDs.</p>
    */
  var CognitoIdentityProviders: js.UndefOr[js.Array[CognitoIdentityProvider] | Iterable[CognitoIdentityProvider]] = js.undefined
  /**
    * <p>The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your backend and the Cognito service to communicate about the developer provider. For the <code>DeveloperProviderName</code>, you can use letters as well as period (<code>.</code>), underscore (<code>_</code>), and dash (<code>-</code>).</p> <p>Once you have set a developer provider name, you cannot change it. Please take care in setting this parameter.</p>
    */
  var DeveloperProviderName: js.UndefOr[String] = js.undefined
  /**
    * <p>A string that you provide.</p>
    */
  var IdentityPoolName: String
  /**
    * <p>A list of OpendID Connect provider ARNs.</p>
    */
  var OpenIdConnectProviderARNs: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.</p>
    */
  var SamlProviderARNs: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>Optional key:value pairs mapping provider names to provider app IDs.</p>
    */
  var SupportedLoginProviders: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
}

object CreateIdentityPoolInput {
  @scala.inline
  def apply(
    AllowUnauthenticatedIdentities: Boolean,
    IdentityPoolName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: js.UndefOr[Double] = js.undefined,
    CognitoIdentityProviders: js.Array[CognitoIdentityProvider] | Iterable[CognitoIdentityProvider] = null,
    DeveloperProviderName: String = null,
    OpenIdConnectProviderARNs: js.Array[String] | Iterable[String] = null,
    SamlProviderARNs: js.Array[String] | Iterable[String] = null,
    SupportedLoginProviders: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null
  ): CreateIdentityPoolInput = {
    val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if (!js.isUndefined($maxRetries)) __obj.updateDynamic("$maxRetries")($maxRetries.get.asInstanceOf[js.Any])
    if (CognitoIdentityProviders != null) __obj.updateDynamic("CognitoIdentityProviders")(CognitoIdentityProviders.asInstanceOf[js.Any])
    if (DeveloperProviderName != null) __obj.updateDynamic("DeveloperProviderName")(DeveloperProviderName.asInstanceOf[js.Any])
    if (OpenIdConnectProviderARNs != null) __obj.updateDynamic("OpenIdConnectProviderARNs")(OpenIdConnectProviderARNs.asInstanceOf[js.Any])
    if (SamlProviderARNs != null) __obj.updateDynamic("SamlProviderARNs")(SamlProviderARNs.asInstanceOf[js.Any])
    if (SupportedLoginProviders != null) __obj.updateDynamic("SupportedLoginProviders")(SupportedLoginProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityPoolInput]
  }
}

