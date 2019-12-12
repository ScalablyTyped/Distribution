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

@JSImport("@aws-sdk/client-cognito-identity-browser/types/UpdateIdentityPoolInput", JSImport.Namespace)
@js.native
object typesUpdateIdentityPoolInputMod extends js.Object {
  @js.native
  trait UpdateIdentityPoolInput extends InputTypesUnion {
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
      * <p>A list representing an Amazon Cognito Identity User Pool and its client ID.</p>
      */
    var CognitoIdentityProviders: js.UndefOr[js.Array[_CognitoIdentityProvider] | Iterable[_CognitoIdentityProvider]] = js.native
    /**
      * <p>The "domain" by which Cognito will refer to your users.</p>
      */
    var DeveloperProviderName: js.UndefOr[String] = js.native
    /**
      * <p>An identity pool ID in the format REGION:GUID.</p>
      */
    var IdentityPoolId: String = js.native
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

