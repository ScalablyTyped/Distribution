package typings.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutKeyPolicyInput extends InputTypesUnion {
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
    * <p>A flag to indicate whether to bypass the key policy lockout safety check.</p> <important> <p>Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to true indiscriminately.</p> <p>For more information, refer to the scenario in the <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam">Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.</p> </important> <p>Use this parameter only when you intend to prevent the principal that is making the request from making a subsequent <code>PutKeyPolicy</code> request on the CMK.</p> <p>The default value is false.</p>
    */
  var BypassPolicyLockoutSafetyCheck: js.UndefOr[Boolean] = js.native
  /**
    * <p>A unique identifier for the customer master key (CMK).</p> <p>Specify the key ID or the Amazon Resource Name (ARN) of the CMK.</p> <p>For example:</p> <ul> <li> <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> <li> <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> </ul> <p>To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.</p>
    */
  var KeyId: String = js.native
  /**
    * <p>The key policy to attach to the CMK.</p> <p>The key policy must meet the following criteria:</p> <ul> <li> <p>If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the principal that is making the <code>PutKeyPolicy</code> request to make a subsequent <code>PutKeyPolicy</code> request on the CMK. This reduces the risk that the CMK becomes unmanageable. For more information, refer to the scenario in the <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam">Default Key Policy</a> section of the <i>AWS Key Management Service Developer Guide</i>.</p> </li> <li> <p>Each statement in the key policy must contain one or more principals. The principals in the key policy must exist and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need to enforce a delay before including the new principal in a key policy. The reason for this is that the new principal might not be immediately visible to AWS KMS. For more information, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency">Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management User Guide</i>.</p> </li> </ul> <p>The key policy size limit is 32 kilobytes (32768 bytes).</p>
    */
  var Policy: String = js.native
  /**
    * <p>The name of the key policy. The only valid value is <code>default</code>.</p>
    */
  var PolicyName: String = js.native
}

object PutKeyPolicyInput {
  @scala.inline
  def apply(KeyId: String, Policy: String, PolicyName: String): PutKeyPolicyInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutKeyPolicyInput]
  }
  @scala.inline
  implicit class PutKeyPolicyInputOps[Self <: PutKeyPolicyInput] (val x: Self) extends AnyVal {
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
    def setKeyId(value: String): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicy(value: String): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyName(value: String): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
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
    def setBypassPolicyLockoutSafetyCheck(value: Boolean): Self = this.set("BypassPolicyLockoutSafetyCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBypassPolicyLockoutSafetyCheck: Self = this.set("BypassPolicyLockoutSafetyCheck", js.undefined)
  }
  
}

