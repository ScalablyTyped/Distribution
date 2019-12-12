package typings.atAwsDashSdkClientDashKmsDashBrowser

import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.AWS_KMS
import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.ENCRYPT_DECRYPT
import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.EXTERNAL
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesUnderscoreTagMod._Tag
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/types/CreateKeyInput", JSImport.Namespace)
@js.native
object typesCreateKeyInputMod extends js.Object {
  @js.native
  trait CreateKeyInput extends InputTypesUnion {
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
      * <p>A flag to indicate whether to bypass the key policy lockout safety check.</p> <important> <p>Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to true indiscriminately.</p> <p>For more information, refer to the scenario in the <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam">Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.</p> </important> <p>Use this parameter only when you include a policy in the request and you intend to prevent the principal that is making the request from making a subsequent <a>PutKeyPolicy</a> request on the CMK.</p> <p>The default value is false.</p>
      */
    var BypassPolicyLockoutSafetyCheck: js.UndefOr[Boolean] = js.native
    /**
      * <p>A description of the CMK.</p> <p>Use a description that helps you decide whether the CMK is appropriate for a task.</p>
      */
    var Description: js.UndefOr[String] = js.native
    /**
      * <p>The intended use of the CMK.</p> <p>You can use CMKs only for symmetric encryption and decryption.</p>
      */
    var KeyUsage: js.UndefOr[ENCRYPT_DECRYPT | String] = js.native
    /**
      * <p>The source of the CMK's key material.</p> <p>The default is <code>AWS_KMS</code>, which means AWS KMS creates the key material. When this parameter is set to <code>EXTERNAL</code>, the request creates a CMK without key material so that you can import key material from your existing key management infrastructure. For more information about importing key material into AWS KMS, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.</p> <p>The CMK's <code>Origin</code> is immutable and is set when the CMK is created.</p>
      */
    var Origin: js.UndefOr[AWS_KMS | EXTERNAL | String] = js.native
    /**
      * <p>The key policy to attach to the CMK.</p> <p>If you provide a key policy, it must meet the following criteria:</p> <ul> <li> <p>If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the principal that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a> request on the CMK. This reduces the risk that the CMK becomes unmanageable. For more information, refer to the scenario in the <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam">Default Key Policy</a> section of the <i>AWS Key Management Service Developer Guide</i>.</p> </li> <li> <p>Each statement in the key policy must contain one or more principals. The principals in the key policy must exist and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need to enforce a delay before including the new principal in a key policy. The reason for this is that the new principal might not be immediately visible to AWS KMS. For more information, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency">Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management User Guide</i>.</p> </li> </ul> <p>If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK. For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default Key Policy</a> in the <i>AWS Key Management Service Developer Guide</i>.</p> <p>The key policy size limit is 32 kilobytes (32768 bytes).</p>
      */
    var Policy: js.UndefOr[String] = js.native
    /**
      * <p>One or more tags. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty (null) strings.</p> <p>Use this parameter to tag the CMK when it is created. Alternately, you can omit this parameter and instead tag the CMK after it is created using <a>TagResource</a>.</p>
      */
    var Tags: js.UndefOr[js.Array[_Tag] | Iterable[_Tag]] = js.native
  }
  
}

