package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/types/GetCredentialsForIdentityInput", JSImport.Namespace)
@js.native
object typesGetCredentialsForIdentityInputMod extends js.Object {
  @js.native
  trait GetCredentialsForIdentityInput extends InputTypesUnion {
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
      * <p>The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token from the identity provider. For example, a SAML-based identity provider. This parameter is optional for identity providers that do not support role customization.</p>
      */
    var CustomRoleArn: js.UndefOr[String] = js.native
    /**
      * <p>A unique identifier in the format REGION:GUID.</p>
      */
    var IdentityId: String = js.native
    /**
      * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
      */
    var Logins: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
  }
  
}

