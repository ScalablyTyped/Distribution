package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutKeyPolicyRequest extends StObject {
  
  /**
    * <p>Skips ("bypasses") the key policy lockout safety check. The default value is false.</p>
    *          <important>
    *             <p>Setting this value to true increases the risk that the KMS key becomes unmanageable. Do
    *         not set this value to true indiscriminately.</p>
    *             <p>For more information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key">Default key policy</a> in the <i>Key Management Service Developer Guide</i>.</p>
    *          </important>
    *          <p>Use this parameter only when you intend to prevent the principal that is making the
    *       request from making a subsequent <a>PutKeyPolicy</a> request on the KMS key.</p>
    */
  var BypassPolicyLockoutSafetyCheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * <p>Sets the key policy on the specified KMS key.</p>
    *          <p>Specify the key ID or key ARN of the KMS key.</p>
    *          <p>For example:</p>
    *          <ul>
    *             <li>
    *                <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <p>To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The key policy to attach to the KMS key.</p>
    *          <p>The key policy must meet the following criteria:</p>
    *          <ul>
    *             <li>
    *                <p>The key policy must allow the calling principal to make a
    *           subsequent <code>PutKeyPolicy</code> request on the KMS key.  This reduces the risk that
    *           the KMS key becomes unmanageable. For more information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key">Default key policy</a> in the <i>Key Management Service Developer Guide</i>. (To omit
    *           this condition, set <code>BypassPolicyLockoutSafetyCheck</code> to true.)</p>
    *             </li>
    *             <li>
    *                <p>Each statement in the key policy must contain one or more principals. The principals
    *           in the key policy must exist and be visible to KMS. When you create a new Amazon Web Services
    *           principal, you might need to enforce a delay before including the new principal in a key
    *           policy because the new principal might not be immediately visible to KMS. For more
    *           information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency">Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services
    *             Identity and Access Management User Guide</i>.</p>
    *             </li>
    *          </ul>
    *          <p>A key policy document can include only the following characters:</p>
    *          <ul>
    *             <li>
    *                <p>Printable ASCII characters from the space character (<code>\\u0020</code>) through the end of the ASCII character range.</p>
    *             </li>
    *             <li>
    *                <p>Printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>).</p>
    *             </li>
    *             <li>
    *                <p>The tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>) special characters</p>
    *             </li>
    *          </ul>
    *          <p>For information about key policies, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key policies in KMS</a> in the
    *       <i>Key Management Service Developer Guide</i>.For help writing and formatting a JSON policy document, see the <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy Reference</a> in the <i>
    *                <i>Identity and Access Management User Guide</i>
    *             </i>.</p>
    */
  var Policy: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The name of the key policy. The only valid value is <code>default</code>.</p>
    */
  var PolicyName: js.UndefOr[String] = js.undefined
}
object PutKeyPolicyRequest {
  
  inline def apply(): PutKeyPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutKeyPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutKeyPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setBypassPolicyLockoutSafetyCheck(value: Boolean): Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", value.asInstanceOf[js.Any])
    
    inline def setBypassPolicyLockoutSafetyCheckUndefined: Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", js.undefined)
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyName(value: String): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
