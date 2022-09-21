package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicateKeyRequest extends StObject {
  
  /**
    * A flag to indicate whether to bypass the key policy lockout safety check.  Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately. For more information, refer to the scenario in the Default Key Policy section in the Key Management Service Developer Guide.  Use this parameter only when you intend to prevent the principal that is making the request from making a subsequent PutKeyPolicy request on the KMS key. The default value is false.
    */
  var BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * A description of the KMS key. The default value is an empty string (no description). The description is not a shared property of multi-Region keys. You can specify the same description or a different description for each key in a set of related multi-Region keys. KMS does not synchronize this property.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  
  /**
    * Identifies the multi-Region primary key that is being replicated. To determine whether a KMS key is a multi-Region primary key, use the DescribeKey operation to check the value of the MultiRegionKeyType property. Specify the key ID or key ARN of a multi-Region primary key. For example:   Key ID: mrk-1234abcd12ab34cd56ef1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  
  /**
    * The key policy to attach to the KMS key. This parameter is optional. If you do not provide a key policy, KMS attaches the default key policy to the KMS key. The key policy is not a shared property of multi-Region keys. You can specify the same key policy or a different key policy for each key in a set of related multi-Region keys. KMS does not synchronize this property. If you provide a key policy, it must meet the following criteria:   If you don't set BypassPolicyLockoutSafetyCheck to true, the key policy must give the caller kms:PutKeyPolicy permission on the replica key. This reduces the risk that the KMS key becomes unmanageable. For more information, refer to the scenario in the Default Key Policy section of the  Key Management Service Developer Guide .   Each statement in the key policy must contain one or more principals. The principals in the key policy must exist and be visible to KMS. When you create a new Amazon Web Services principal (for example, an IAM user or role), you might need to enforce a delay before including the new principal in a key policy because the new principal might not be immediately visible to KMS. For more information, see Changes that I make are not always immediately visible in the  Identity and Access Management User Guide .   A key policy document can include only the following characters:   Printable ASCII characters from the space character (\\u0020) through the end of the ASCII character range.   Printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF).   The tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D) special characters   For information about key policies, see Key policies in KMS in the Key Management Service Developer Guide. For help writing and formatting a JSON policy document, see the IAM JSON Policy Reference in the  Identity and Access Management User Guide .
    */
  var Policy: js.UndefOr[PolicyType] = js.undefined
  
  /**
    * The Region ID of the Amazon Web Services Region for this replica key.  Enter the Region ID, such as us-east-1 or ap-southeast-2. For a list of Amazon Web Services Regions in which KMS is supported, see KMS service endpoints in the Amazon Web Services General Reference.  HMAC KMS keys are not supported in all Amazon Web Services Regions. If you try to replicate an HMAC KMS key in an Amazon Web Services Region in which HMAC keys are not supported, the ReplicateKey operation returns an UnsupportedOperationException. For a list of Regions in which HMAC KMS keys are supported, see HMAC keys in KMS in the Key Management Service Developer Guide.  The replica must be in a different Amazon Web Services Region than its primary key and other replicas of that primary key, but in the same Amazon Web Services partition. KMS must be available in the replica Region. If the Region is not enabled by default, the Amazon Web Services account must be enabled in the Region. For information about Amazon Web Services partitions, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference. For information about enabling and disabling Regions, see Enabling a Region and Disabling a Region in the Amazon Web Services General Reference.
    */
  var ReplicaRegion: RegionType
  
  /**
    * Assigns one or more tags to the replica key. Use this parameter to tag the KMS key when it is created. To tag an existing KMS key, use the TagResource operation.  Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see ABAC in KMS in the Key Management Service Developer Guide.  To use this parameter, you must have kms:TagResource permission in an IAM policy. Tags are not a shared property of multi-Region keys. You can specify the same tags or different tags for each key in a set of related multi-Region keys. KMS does not synchronize this property. Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag value can be an empty (null) string. You cannot have more than one tag on a KMS key with the same tag key. If you specify an existing tag key with a different tag value, KMS replaces the current tag value with the specified one. When you add tags to an Amazon Web Services resource, Amazon Web Services generates a cost allocation report with usage and costs aggregated by tags. Tags can also be used to control access to a KMS key. For details, see Tagging Keys.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ReplicateKeyRequest {
  
  inline def apply(KeyId: KeyIdType, ReplicaRegion: RegionType): ReplicateKeyRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], ReplicaRegion = ReplicaRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicateKeyRequest]
  }
  
  extension [Self <: ReplicateKeyRequest](x: Self) {
    
    inline def setBypassPolicyLockoutSafetyCheck(value: BooleanType): Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", value.asInstanceOf[js.Any])
    
    inline def setBypassPolicyLockoutSafetyCheckUndefined: Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", js.undefined)
    
    inline def setDescription(value: DescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: PolicyType): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    inline def setReplicaRegion(value: RegionType): Self = StObject.set(x, "ReplicaRegion", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
