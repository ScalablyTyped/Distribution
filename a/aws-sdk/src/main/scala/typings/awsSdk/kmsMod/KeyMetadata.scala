package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyMetadata extends StObject {
  
  /**
    * The twelve-digit account ID of the Amazon Web Services account that owns the KMS key.
    */
  var AWSAccountId: js.UndefOr[AWSAccountIdType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the KMS key. For examples, see Key Management Service (KMS) in the Example ARNs section of the Amazon Web Services General Reference.
    */
  var Arn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * The cluster ID of the CloudHSM cluster that contains the key material for the KMS key. When you create a KMS key in a custom key store, KMS creates the key material for the KMS key in the associated CloudHSM cluster. This value is present only when the KMS key is created in a custom key store.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined
  
  /**
    * The date and time when the KMS key was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique identifier for the custom key store that contains the KMS key. This value is present only when the KMS key is created in a custom key store.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
  
  /**
    * Instead, use the KeySpec field. The KeySpec and CustomerMasterKeySpec fields have the same value. We recommend that you use the KeySpec field in your code. However, to avoid breaking changes, KMS will support both fields.
    */
  var CustomerMasterKeySpec: js.UndefOr[typings.awsSdk.kmsMod.CustomerMasterKeySpec] = js.undefined
  
  /**
    * The date and time after which KMS deletes this KMS key. This value is present only when the KMS key is scheduled for deletion, that is, when its KeyState is PendingDeletion. When the primary key in a multi-Region key is scheduled for deletion but still has replica keys, its key state is PendingReplicaDeletion and the length of its waiting period is displayed in the PendingDeletionWindowInDays field.
    */
  var DeletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the KMS key.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  
  /**
    * Specifies whether the KMS key is enabled. When KeyState is Enabled this value is true, otherwise it is false.
    */
  var Enabled: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The encryption algorithms that the KMS key supports. You cannot use the KMS key with other encryption algorithms within KMS. This value is present only when the KeyUsage of the KMS key is ENCRYPT_DECRYPT.
    */
  var EncryptionAlgorithms: js.UndefOr[EncryptionAlgorithmSpecList] = js.undefined
  
  /**
    * Specifies whether the KMS key's key material expires. This value is present only when Origin is EXTERNAL, otherwise this value is omitted.
    */
  var ExpirationModel: js.UndefOr[ExpirationModelType] = js.undefined
  
  /**
    * The globally unique identifier for the KMS key.
    */
  var KeyId: KeyIdType
  
  /**
    * The manager of the KMS key. KMS keys in your Amazon Web Services account are either customer managed or Amazon Web Services managed. For more information about the difference, see KMS keys in the Key Management Service Developer Guide.
    */
  var KeyManager: js.UndefOr[KeyManagerType] = js.undefined
  
  /**
    * Describes the type of key material in the KMS key.
    */
  var KeySpec: js.UndefOr[typings.awsSdk.kmsMod.KeySpec] = js.undefined
  
  /**
    * The current status of the KMS key. For more information about how key state affects the use of a KMS key, see Key states of KMS keys in the Key Management Service Developer Guide.
    */
  var KeyState: js.UndefOr[typings.awsSdk.kmsMod.KeyState] = js.undefined
  
  /**
    * The cryptographic operations for which you can use the KMS key.
    */
  var KeyUsage: js.UndefOr[KeyUsageType] = js.undefined
  
  /**
    * The message authentication code (MAC) algorithm that the HMAC KMS key supports. This value is present only when the KeyUsage of the KMS key is GENERATE_VERIFY_MAC.
    */
  var MacAlgorithms: js.UndefOr[MacAlgorithmSpecList] = js.undefined
  
  /**
    * Indicates whether the KMS key is a multi-Region (True) or regional (False) key. This value is True for multi-Region primary and replica keys and False for regional KMS keys. For more information about multi-Region keys, see Multi-Region keys in KMS in the Key Management Service Developer Guide.
    */
  var MultiRegion: js.UndefOr[NullableBooleanType] = js.undefined
  
  /**
    * Lists the primary and replica keys in same multi-Region key. This field is present only when the value of the MultiRegion field is True. For more information about any listed KMS key, use the DescribeKey operation.    MultiRegionKeyType indicates whether the KMS key is a PRIMARY or REPLICA key.    PrimaryKey displays the key ARN and Region of the primary key. This field displays the current KMS key if it is the primary key.    ReplicaKeys displays the key ARNs and Regions of all replica keys. This field includes the current KMS key if it is a replica key.  
    */
  var MultiRegionConfiguration: js.UndefOr[typings.awsSdk.kmsMod.MultiRegionConfiguration] = js.undefined
  
  /**
    * The source of the key material for the KMS key. When this value is AWS_KMS, KMS created the key material. When this value is EXTERNAL, the key material was imported or the KMS key doesn't have any key material. When this value is AWS_CLOUDHSM, the key material was created in the CloudHSM cluster associated with a custom key store.
    */
  var Origin: js.UndefOr[OriginType] = js.undefined
  
  /**
    * The waiting period before the primary key in a multi-Region key is deleted. This waiting period begins when the last of its replica keys is deleted. This value is present only when the KeyState of the KMS key is PendingReplicaDeletion. That indicates that the KMS key is the primary key in a multi-Region key, it is scheduled for deletion, and it still has existing replica keys. When a single-Region KMS key or a multi-Region replica key is scheduled for deletion, its deletion date is displayed in the DeletionDate field. However, when the primary key in a multi-Region key is scheduled for deletion, its waiting period doesn't begin until all of its replica keys are deleted. This value displays that waiting period. When the last replica key in the multi-Region key is deleted, the KeyState of the scheduled primary key changes from PendingReplicaDeletion to PendingDeletion and the deletion date appears in the DeletionDate field.
    */
  var PendingDeletionWindowInDays: js.UndefOr[PendingWindowInDaysType] = js.undefined
  
  /**
    * The signing algorithms that the KMS key supports. You cannot use the KMS key with other signing algorithms within KMS. This field appears only when the KeyUsage of the KMS key is SIGN_VERIFY.
    */
  var SigningAlgorithms: js.UndefOr[SigningAlgorithmSpecList] = js.undefined
  
  /**
    * The time at which the imported key material expires. When the key material expires, KMS deletes the key material and the KMS key becomes unusable. This value is present only for KMS keys whose Origin is EXTERNAL and whose ExpirationModel is KEY_MATERIAL_EXPIRES, otherwise this value is omitted.
    */
  var ValidTo: js.UndefOr[js.Date] = js.undefined
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
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
    
    inline def setCustomerMasterKeySpec(value: CustomerMasterKeySpec): Self = StObject.set(x, "CustomerMasterKeySpec", value.asInstanceOf[js.Any])
    
    inline def setCustomerMasterKeySpecUndefined: Self = StObject.set(x, "CustomerMasterKeySpec", js.undefined)
    
    inline def setDeletionDate(value: js.Date): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
    
    inline def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
    
    inline def setDescription(value: DescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnabled(value: BooleanType): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setEncryptionAlgorithms(value: EncryptionAlgorithmSpecList): Self = StObject.set(x, "EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithmsUndefined: Self = StObject.set(x, "EncryptionAlgorithms", js.undefined)
    
    inline def setEncryptionAlgorithmsVarargs(value: EncryptionAlgorithmSpec*): Self = StObject.set(x, "EncryptionAlgorithms", js.Array(value*))
    
    inline def setExpirationModel(value: ExpirationModelType): Self = StObject.set(x, "ExpirationModel", value.asInstanceOf[js.Any])
    
    inline def setExpirationModelUndefined: Self = StObject.set(x, "ExpirationModel", js.undefined)
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyManager(value: KeyManagerType): Self = StObject.set(x, "KeyManager", value.asInstanceOf[js.Any])
    
    inline def setKeyManagerUndefined: Self = StObject.set(x, "KeyManager", js.undefined)
    
    inline def setKeySpec(value: KeySpec): Self = StObject.set(x, "KeySpec", value.asInstanceOf[js.Any])
    
    inline def setKeySpecUndefined: Self = StObject.set(x, "KeySpec", js.undefined)
    
    inline def setKeyState(value: KeyState): Self = StObject.set(x, "KeyState", value.asInstanceOf[js.Any])
    
    inline def setKeyStateUndefined: Self = StObject.set(x, "KeyState", js.undefined)
    
    inline def setKeyUsage(value: KeyUsageType): Self = StObject.set(x, "KeyUsage", value.asInstanceOf[js.Any])
    
    inline def setKeyUsageUndefined: Self = StObject.set(x, "KeyUsage", js.undefined)
    
    inline def setMacAlgorithms(value: MacAlgorithmSpecList): Self = StObject.set(x, "MacAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setMacAlgorithmsUndefined: Self = StObject.set(x, "MacAlgorithms", js.undefined)
    
    inline def setMacAlgorithmsVarargs(value: MacAlgorithmSpec*): Self = StObject.set(x, "MacAlgorithms", js.Array(value*))
    
    inline def setMultiRegion(value: NullableBooleanType): Self = StObject.set(x, "MultiRegion", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionConfiguration(value: MultiRegionConfiguration): Self = StObject.set(x, "MultiRegionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionConfigurationUndefined: Self = StObject.set(x, "MultiRegionConfiguration", js.undefined)
    
    inline def setMultiRegionUndefined: Self = StObject.set(x, "MultiRegion", js.undefined)
    
    inline def setOrigin(value: OriginType): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
    
    inline def setPendingDeletionWindowInDays(value: PendingWindowInDaysType): Self = StObject.set(x, "PendingDeletionWindowInDays", value.asInstanceOf[js.Any])
    
    inline def setPendingDeletionWindowInDaysUndefined: Self = StObject.set(x, "PendingDeletionWindowInDays", js.undefined)
    
    inline def setSigningAlgorithms(value: SigningAlgorithmSpecList): Self = StObject.set(x, "SigningAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithmsUndefined: Self = StObject.set(x, "SigningAlgorithms", js.undefined)
    
    inline def setSigningAlgorithmsVarargs(value: SigningAlgorithmSpec*): Self = StObject.set(x, "SigningAlgorithms", js.Array(value*))
    
    inline def setValidTo(value: js.Date): Self = StObject.set(x, "ValidTo", value.asInstanceOf[js.Any])
    
    inline def setValidToUndefined: Self = StObject.set(x, "ValidTo", js.undefined)
  }
}
