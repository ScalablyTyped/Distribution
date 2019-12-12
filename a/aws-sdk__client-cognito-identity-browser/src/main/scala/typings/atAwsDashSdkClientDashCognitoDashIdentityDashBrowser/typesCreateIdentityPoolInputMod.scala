package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreCognitoIdentityProviderMod._CognitoIdentityProvider
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/types/CreateIdentityPoolInput", JSImport.Namespace)
@js.native
object typesCreateIdentityPoolInputMod extends js.Object {
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
    var CognitoIdentityProviders: js.UndefOr[js.Array[_CognitoIdentityProvider] | Iterable[_CognitoIdentityProvider]] = js.native
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
  
}

