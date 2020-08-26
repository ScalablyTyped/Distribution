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

@js.native
trait CreateIdentityPoolInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  /**
    * <p>TRUE if the identity pool supports unauthenticated logins.</p>
    */
  var AllowUnauthenticatedIdentities: Boolean = js.native
  /**
    * <p>An array of Amazon Cognito Identity user pools and their client IDs.</p>
    */
  var CognitoIdentityProviders: js.UndefOr[js.Array[CognitoIdentityProvider] | Iterable[CognitoIdentityProvider]] = js.native
  /**
    * <p>The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your backend and the Cognito service to communicate about the developer provider. For the <code>DeveloperProviderName</code>, you can use letters as well as period (<code>.</code>), underscore (<code>_</code>), and dash (<code>-</code>).</p> <p>Once you have set a developer provider name, you cannot change it. Please take care in setting this parameter.</p>
    */
  var DeveloperProviderName: js.UndefOr[String] = js.native
  /**
    * <p>A string that you provide.</p>
    */
  var IdentityPoolName: String = js.native
  /**
    * <p>A list of OpendID Connect provider ARNs.</p>
    */
  var OpenIdConnectProviderARNs: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
  /**
    * <p>An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.</p>
    */
  var SamlProviderARNs: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
  /**
    * <p>Optional key:value pairs mapping provider names to provider app IDs.</p>
    */
  var SupportedLoginProviders: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
}

object CreateIdentityPoolInput {
  @scala.inline
  def apply(AllowUnauthenticatedIdentities: Boolean, IdentityPoolName: String): CreateIdentityPoolInput = {
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
    def setAllowUnauthenticatedIdentities(value: Boolean): Self = this.set("AllowUnauthenticatedIdentities", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityPoolName(value: String): Self = this.set("IdentityPoolName", value.asInstanceOf[js.Any])
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    @scala.inline
    def set$httpOptions(value: BrowserHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    @scala.inline
    def setCognitoIdentityProvidersVarargs(value: CognitoIdentityProvider*): Self = this.set("CognitoIdentityProviders", js.Array(value :_*))
    @scala.inline
    def setCognitoIdentityProviders(value: js.Array[CognitoIdentityProvider] | Iterable[CognitoIdentityProvider]): Self = this.set("CognitoIdentityProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCognitoIdentityProviders: Self = this.set("CognitoIdentityProviders", js.undefined)
    @scala.inline
    def setDeveloperProviderName(value: String): Self = this.set("DeveloperProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperProviderName: Self = this.set("DeveloperProviderName", js.undefined)
    @scala.inline
    def setOpenIdConnectProviderARNsVarargs(value: String*): Self = this.set("OpenIdConnectProviderARNs", js.Array(value :_*))
    @scala.inline
    def setOpenIdConnectProviderARNs(value: js.Array[String] | Iterable[String]): Self = this.set("OpenIdConnectProviderARNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenIdConnectProviderARNs: Self = this.set("OpenIdConnectProviderARNs", js.undefined)
    @scala.inline
    def setSamlProviderARNsVarargs(value: String*): Self = this.set("SamlProviderARNs", js.Array(value :_*))
    @scala.inline
    def setSamlProviderARNs(value: js.Array[String] | Iterable[String]): Self = this.set("SamlProviderARNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamlProviderARNs: Self = this.set("SamlProviderARNs", js.undefined)
    @scala.inline
    def setSupportedLoginProviders(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("SupportedLoginProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedLoginProviders: Self = this.set("SupportedLoginProviders", js.undefined)
  }
  
}

