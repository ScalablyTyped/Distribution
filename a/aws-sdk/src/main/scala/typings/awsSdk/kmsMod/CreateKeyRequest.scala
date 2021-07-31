package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyRequest extends StObject {
  
  /**
    * A flag to indicate whether to bypass the key policy lockout safety check.  Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to true indiscriminately. For more information, refer to the scenario in the Default Key Policy section in the  AWS Key Management Service Developer Guide .  Use this parameter only when you include a policy in the request and you intend to prevent the principal that is making the request from making a subsequent PutKeyPolicy request on the CMK. The default value is false.
    */
  var BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * Creates the CMK in the specified custom key store and the key material in its associated AWS CloudHSM cluster. To create a CMK in a custom key store, you must also specify the Origin parameter with a value of AWS_CLOUDHSM. The AWS CloudHSM cluster that is associated with the custom key store must have at least two active HSMs, each in a different Availability Zone in the Region. This parameter is valid only for symmetric CMKs. You cannot create an asymmetric CMK in a custom key store. To find the ID of a custom key store, use the DescribeCustomKeyStores operation. The response includes the custom key store ID and the ID of the AWS CloudHSM cluster. This operation is part of the Custom Key Store feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the isolation and control of a single-tenant key store.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
  
  /**
    * Specifies the type of CMK to create. The default value, SYMMETRIC_DEFAULT, creates a CMK with a 256-bit symmetric key for encryption and decryption. For help choosing a key spec for your CMK, see How to Choose Your CMK Configuration in the AWS Key Management Service Developer Guide. The CustomerMasterKeySpec determines whether the CMK contains a symmetric key or an asymmetric key pair. It also determines the encryption algorithms or signing algorithms that the CMK supports. You can't change the CustomerMasterKeySpec after the CMK is created. To further restrict the algorithms that can be used with the CMK, use a condition key in its key policy or IAM policy. For more information, see kms:EncryptionAlgorithm or kms:Signing Algorithm in the AWS Key Management Service Developer Guide.   AWS services that are integrated with AWS KMS use symmetric CMKs to protect your data. These services do not support asymmetric CMKs. For help determining whether a CMK is symmetric or asymmetric, see Identifying Symmetric and Asymmetric CMKs in the AWS Key Management Service Developer Guide.  AWS KMS supports the following key specs for CMKs:   Symmetric key (default)    SYMMETRIC_DEFAULT (AES-256-GCM)     Asymmetric RSA key pairs    RSA_2048     RSA_3072     RSA_4096      Asymmetric NIST-recommended elliptic curve key pairs    ECC_NIST_P256 (secp256r1)    ECC_NIST_P384 (secp384r1)    ECC_NIST_P521 (secp521r1)     Other asymmetric elliptic curve key pairs    ECC_SECG_P256K1 (secp256k1), commonly used for cryptocurrencies.    
    */
  var CustomerMasterKeySpec: js.UndefOr[typings.awsSdk.kmsMod.CustomerMasterKeySpec] = js.undefined
  
  /**
    * A description of the CMK. Use a description that helps you decide whether the CMK is appropriate for a task.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  
  /**
    * Determines the cryptographic operations for which you can use the CMK. The default value is ENCRYPT_DECRYPT. This parameter is required only for asymmetric CMKs. You can't change the KeyUsage value after the CMK is created. Select only one valid value.   For symmetric CMKs, omit the parameter or specify ENCRYPT_DECRYPT.   For asymmetric CMKs with RSA key material, specify ENCRYPT_DECRYPT or SIGN_VERIFY.   For asymmetric CMKs with ECC key material, specify SIGN_VERIFY.  
    */
  var KeyUsage: js.UndefOr[KeyUsageType] = js.undefined
  
  /**
    * The source of the key material for the CMK. You cannot change the origin after you create the CMK. The default is AWS_KMS, which means AWS KMS creates the key material. When the parameter value is EXTERNAL, AWS KMS creates a CMK without key material so that you can import key material from your existing key management infrastructure. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. This value is valid only for symmetric CMKs. When the parameter value is AWS_CLOUDHSM, AWS KMS creates the CMK in an AWS KMS custom key store and creates its key material in the associated AWS CloudHSM cluster. You must also use the CustomKeyStoreId parameter to identify the custom key store. This value is valid only for symmetric CMKs.
    */
  var Origin: js.UndefOr[OriginType] = js.undefined
  
  /**
    * The key policy to attach to the CMK. If you provide a key policy, it must meet the following criteria:   If you don't set BypassPolicyLockoutSafetyCheck to true, the key policy must allow the principal that is making the CreateKey request to make a subsequent PutKeyPolicy request on the CMK. This reduces the risk that the CMK becomes unmanageable. For more information, refer to the scenario in the Default Key Policy section of the  AWS Key Management Service Developer Guide .   Each statement in the key policy must contain one or more principals. The principals in the key policy must exist and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need to enforce a delay before including the new principal in a key policy because the new principal might not be immediately visible to AWS KMS. For more information, see Changes that I make are not always immediately visible in the AWS Identity and Access Management User Guide.   If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK. For more information, see Default Key Policy in the AWS Key Management Service Developer Guide. The key policy size quota is 32 kilobytes (32768 bytes).
    */
  var Policy: js.UndefOr[PolicyType] = js.undefined
  
  /**
    * One or more tags. Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag value can be an empty (null) string. When you add tags to an AWS resource, AWS generates a cost allocation report with usage and costs aggregated by tags. For information about adding, changing, deleting and listing tags for CMKs, see Tagging Keys. Use this parameter to tag the CMK when it is created. To add tags to an existing CMK, use the TagResource operation.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateKeyRequest {
  
  @scala.inline
  def apply(): CreateKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeyRequest]
  }
  
  @scala.inline
  implicit class CreateKeyRequestMutableBuilder[Self <: CreateKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassPolicyLockoutSafetyCheck(value: BooleanType): Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassPolicyLockoutSafetyCheckUndefined: Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", js.undefined)
    
    @scala.inline
    def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
    
    @scala.inline
    def setCustomerMasterKeySpec(value: CustomerMasterKeySpec): Self = StObject.set(x, "CustomerMasterKeySpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerMasterKeySpecUndefined: Self = StObject.set(x, "CustomerMasterKeySpec", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setKeyUsage(value: KeyUsageType): Self = StObject.set(x, "KeyUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUsageUndefined: Self = StObject.set(x, "KeyUsage", js.undefined)
    
    @scala.inline
    def setOrigin(value: OriginType): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
    
    @scala.inline
    def setPolicy(value: PolicyType): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
