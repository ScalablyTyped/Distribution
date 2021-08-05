package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyMetadata extends StObject {
  
  /**
    * The twelve-digit account ID of the AWS account that owns the CMK.
    */
  var AWSAccountId: js.UndefOr[AWSAccountIdType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the CMK. For examples, see AWS Key Management Service (AWS KMS) in the Example ARNs section of the AWS General Reference.
    */
  var Arn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * The cluster ID of the AWS CloudHSM cluster that contains the key material for the CMK. When you create a CMK in a custom key store, AWS KMS creates the key material for the CMK in the associated AWS CloudHSM cluster. This value is present only when the CMK is created in a custom key store.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined
  
  /**
    * The date and time when the CMK was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * A unique identifier for the custom key store that contains the CMK. This value is present only when the CMK is created in a custom key store.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
  
  /**
    * Describes the type of key material in the CMK.
    */
  var CustomerMasterKeySpec: js.UndefOr[typings.awsSdk.kmsMod.CustomerMasterKeySpec] = js.undefined
  
  /**
    * The date and time after which AWS KMS deletes the CMK. This value is present only when KeyState is PendingDeletion.
    */
  var DeletionDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The description of the CMK.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  
  /**
    * Specifies whether the CMK is enabled. When KeyState is Enabled this value is true, otherwise it is false.
    */
  var Enabled: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The encryption algorithms that the CMK supports. You cannot use the CMK with other encryption algorithms within AWS KMS. This field appears only when the KeyUsage of the CMK is ENCRYPT_DECRYPT.
    */
  var EncryptionAlgorithms: js.UndefOr[EncryptionAlgorithmSpecList] = js.undefined
  
  /**
    * Specifies whether the CMK's key material expires. This value is present only when Origin is EXTERNAL, otherwise this value is omitted.
    */
  var ExpirationModel: js.UndefOr[ExpirationModelType] = js.undefined
  
  /**
    * The globally unique identifier for the CMK.
    */
  var KeyId: KeyIdType
  
  /**
    * The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed. For more information about the difference, see Customer Master Keys in the AWS Key Management Service Developer Guide.
    */
  var KeyManager: js.UndefOr[KeyManagerType] = js.undefined
  
  /**
    * The current status of the CMK. For more information about how key state affects the use of a CMK, see Key state: Effect on your CMK in the AWS Key Management Service Developer Guide.
    */
  var KeyState: js.UndefOr[typings.awsSdk.kmsMod.KeyState] = js.undefined
  
  /**
    * The cryptographic operations for which you can use the CMK.
    */
  var KeyUsage: js.UndefOr[KeyUsageType] = js.undefined
  
  /**
    * The source of the CMK's key material. When this value is AWS_KMS, AWS KMS created the key material. When this value is EXTERNAL, the key material was imported from your existing key management infrastructure or the CMK lacks key material. When this value is AWS_CLOUDHSM, the key material was created in the AWS CloudHSM cluster associated with a custom key store.
    */
  var Origin: js.UndefOr[OriginType] = js.undefined
  
  /**
    * The signing algorithms that the CMK supports. You cannot use the CMK with other signing algorithms within AWS KMS. This field appears only when the KeyUsage of the CMK is SIGN_VERIFY.
    */
  var SigningAlgorithms: js.UndefOr[SigningAlgorithmSpecList] = js.undefined
  
  /**
    * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. This value is present only for CMKs whose Origin is EXTERNAL and whose ExpirationModel is KEY_MATERIAL_EXPIRES, otherwise this value is omitted.
    */
  var ValidTo: js.UndefOr[DateType] = js.undefined
}
object KeyMetadata {
  
  inline def apply(KeyId: KeyIdType): KeyMetadata = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMetadata]
  }
  
  extension [Self <: KeyMetadata](x: Self) {
    
    inline def setAWSAccountId(value: AWSAccountIdType): Self = StObject.set(x, "AWSAccountId", value.asInstanceOf[js.Any])
    
    inline def setAWSAccountIdUndefined: Self = StObject.set(x, "AWSAccountId", js.undefined)
    
    inline def setArn(value: ArnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCloudHsmClusterId(value: CloudHsmClusterIdType): Self = StObject.set(x, "CloudHsmClusterId", value.asInstanceOf[js.Any])
    
    inline def setCloudHsmClusterIdUndefined: Self = StObject.set(x, "CloudHsmClusterId", js.undefined)
    
    inline def setCreationDate(value: DateType): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
    
    inline def setCustomerMasterKeySpec(value: CustomerMasterKeySpec): Self = StObject.set(x, "CustomerMasterKeySpec", value.asInstanceOf[js.Any])
    
    inline def setCustomerMasterKeySpecUndefined: Self = StObject.set(x, "CustomerMasterKeySpec", js.undefined)
    
    inline def setDeletionDate(value: DateType): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
    
    inline def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
    
    inline def setDescription(value: DescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnabled(value: BooleanType): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setEncryptionAlgorithms(value: EncryptionAlgorithmSpecList): Self = StObject.set(x, "EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithmsUndefined: Self = StObject.set(x, "EncryptionAlgorithms", js.undefined)
    
    inline def setEncryptionAlgorithmsVarargs(value: EncryptionAlgorithmSpec*): Self = StObject.set(x, "EncryptionAlgorithms", js.Array(value :_*))
    
    inline def setExpirationModel(value: ExpirationModelType): Self = StObject.set(x, "ExpirationModel", value.asInstanceOf[js.Any])
    
    inline def setExpirationModelUndefined: Self = StObject.set(x, "ExpirationModel", js.undefined)
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyManager(value: KeyManagerType): Self = StObject.set(x, "KeyManager", value.asInstanceOf[js.Any])
    
    inline def setKeyManagerUndefined: Self = StObject.set(x, "KeyManager", js.undefined)
    
    inline def setKeyState(value: KeyState): Self = StObject.set(x, "KeyState", value.asInstanceOf[js.Any])
    
    inline def setKeyStateUndefined: Self = StObject.set(x, "KeyState", js.undefined)
    
    inline def setKeyUsage(value: KeyUsageType): Self = StObject.set(x, "KeyUsage", value.asInstanceOf[js.Any])
    
    inline def setKeyUsageUndefined: Self = StObject.set(x, "KeyUsage", js.undefined)
    
    inline def setOrigin(value: OriginType): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
    
    inline def setSigningAlgorithms(value: SigningAlgorithmSpecList): Self = StObject.set(x, "SigningAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithmsUndefined: Self = StObject.set(x, "SigningAlgorithms", js.undefined)
    
    inline def setSigningAlgorithmsVarargs(value: SigningAlgorithmSpec*): Self = StObject.set(x, "SigningAlgorithms", js.Array(value :_*))
    
    inline def setValidTo(value: DateType): Self = StObject.set(x, "ValidTo", value.asInstanceOf[js.Any])
    
    inline def setValidToUndefined: Self = StObject.set(x, "ValidTo", js.undefined)
  }
}
