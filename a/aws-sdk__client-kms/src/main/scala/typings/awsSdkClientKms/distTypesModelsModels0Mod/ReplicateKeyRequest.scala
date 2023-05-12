package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicateKeyRequest extends StObject {
  
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
    * <p>A description of the KMS key. The default value is an empty string (no
    *       description).</p>
    *          <important>
    *             <p>Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output.</p>
    *          </important>
    *          <p>The description is not a shared property of multi-Region keys. You can specify the same
    *       description or a different description for each key in a set of related multi-Region keys.
    *       KMS does not synchronize this property.</p>
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Identifies the multi-Region primary key that is being replicated. To determine whether a
    *       KMS key is a multi-Region primary key, use the <a>DescribeKey</a> operation to
    *       check the value of the <code>MultiRegionKeyType</code> property.</p>
    *          <p>Specify the key ID or key ARN of a multi-Region primary key.</p>
    *          <p>For example:</p>
    *          <ul>
    *             <li>
    *                <p>Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <p>To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The key policy to attach to the KMS key. This parameter is optional. If you do not provide
    *       a key policy, KMS attaches the <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">default key policy</a> to the
    *       KMS key.</p>
    *          <p>The key policy is not a shared property of multi-Region keys. You can specify the same key
    *       policy or a different key policy for each key in a set of related multi-Region keys. KMS
    *       does not synchronize this property.</p>
    *          <p>If you provide a key policy, it must meet the following criteria:</p>
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
    *          <p>For information about key policies, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key policies in KMS</a> in the <i>Key Management Service Developer Guide</i>.
    *       For help writing and formatting a JSON policy document, see the <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy Reference</a> in the <i>
    *                <i>Identity and Access Management User Guide</i>
    *             </i>.</p>
    */
  var Policy: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Region ID of the Amazon Web Services Region for this replica key. </p>
    *          <p>Enter the Region ID, such as <code>us-east-1</code> or <code>ap-southeast-2</code>. For a
    *       list of Amazon Web Services Regions in which KMS is supported, see <a href="https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region">KMS service endpoints</a> in the
    *       <i>Amazon Web Services General Reference</i>.</p>
    *          <note>
    *             <p>HMAC KMS keys are not supported in all Amazon Web Services Regions. If you try to replicate an HMAC
    *         KMS key in an Amazon Web Services Region in which HMAC keys are not supported, the
    *           <code>ReplicateKey</code> operation returns an <code>UnsupportedOperationException</code>.
    *         For a list of Regions in which HMAC KMS keys are supported, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC keys in KMS</a> in the <i>Key Management Service Developer Guide</i>.</p>
    *          </note>
    *          <p>The replica must be in a different Amazon Web Services Region than its primary key and other replicas of
    *       that primary key, but in the same Amazon Web Services partition. KMS must be available in the replica
    *       Region. If the Region is not enabled by default, the Amazon Web Services account must be enabled in the
    *       Region. For information about Amazon Web Services partitions, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)</a> in the
    *       <i>Amazon Web Services General Reference</i>. For information about enabling and disabling Regions, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Enabling a
    *         Region</a> and <a href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable">Disabling a Region</a> in the
    *       <i>Amazon Web Services General Reference</i>.</p>
    */
  var ReplicaRegion: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Assigns one or more tags to the replica key. Use this parameter to tag the KMS key when it
    *       is created. To tag an existing KMS key, use the <a>TagResource</a>
    *       operation.</p>
    *          <important>
    *             <p>Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output.</p>
    *          </important>
    *          <note>
    *             <p>Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key Management Service Developer Guide</i>.</p>
    *          </note>
    *          <p>To use this parameter, you must have <a href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:TagResource</a> permission in an IAM policy.</p>
    *          <p>Tags are not a shared property of multi-Region keys. You can specify the same tags or
    *       different tags for each key in a set of related multi-Region keys. KMS does not synchronize
    *       this property.</p>
    *          <p>Each tag consists of a tag key and a tag value. Both the tag key and the tag value are
    *       required, but the tag value can be an empty (null) string. You cannot have more than one tag
    *       on a KMS key with the same tag key. If you specify an existing tag key with a different tag
    *       value, KMS replaces the current tag value with the specified one.</p>
    *          <p>When you add tags to an Amazon Web Services resource, Amazon Web Services generates a cost allocation
    *               report with usage and costs aggregated by tags. Tags can also be used to control access to a KMS key. For details,
    *               see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.</p>
    */
  var Tags: js.UndefOr[js.Array[Tag]] = js.undefined
}
object ReplicateKeyRequest {
  
  inline def apply(): ReplicateKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicateKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicateKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setBypassPolicyLockoutSafetyCheck(value: Boolean): Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", value.asInstanceOf[js.Any])
    
    inline def setBypassPolicyLockoutSafetyCheckUndefined: Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    inline def setReplicaRegion(value: String): Self = StObject.set(x, "ReplicaRegion", value.asInstanceOf[js.Any])
    
    inline def setReplicaRegionUndefined: Self = StObject.set(x, "ReplicaRegion", js.undefined)
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
