package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyMetadata extends StObject {
  
  /**
    * <p>The twelve-digit account ID of the Amazon Web Services account that owns the KMS key.</p>
    */
  var AWSAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Amazon Resource Name (ARN) of the KMS key. For examples, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">Key Management Service (KMS)</a> in the Example ARNs section of the <i>Amazon Web Services General
    *         Reference</i>.</p>
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The cluster ID of the CloudHSM cluster that contains the key material for the KMS key. When
    *       you create a KMS key in an CloudHSM <a href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>, KMS creates the key material for the KMS
    *       key in the associated CloudHSM cluster. This field is present only when the KMS key is created in
    *       an CloudHSM key store.</p>
    */
  var CloudHsmClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The date and time when the KMS key was created.</p>
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>A unique identifier for the <a href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a> that contains the KMS key. This field is
    *       present only when the KMS key is created in a custom key store.</p>
    */
  var CustomKeyStoreId: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated
    *
    * <p>Instead, use the <code>KeySpec</code> field.</p>
    *          <p>The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> fields have the same
    *       value. We recommend that you use the <code>KeySpec</code> field in your code. However, to
    *       avoid breaking changes, KMS supports both fields.</p>
    */
  var CustomerMasterKeySpec: js.UndefOr[typings.awsSdkClientKms.distTypesModelsModels0Mod.CustomerMasterKeySpec | String] = js.undefined
  
  /**
    * <p>The date and time after which KMS deletes this KMS key. This value is present only when
    *       the KMS key is scheduled for deletion, that is, when its <code>KeyState</code> is
    *         <code>PendingDeletion</code>.</p>
    *          <p>When the primary key in a multi-Region key is scheduled for deletion but still has replica
    *       keys, its key state is <code>PendingReplicaDeletion</code> and the length of its waiting
    *       period is displayed in the <code>PendingDeletionWindowInDays</code> field.</p>
    */
  var DeletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>The description of the KMS key.</p>
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Specifies whether the KMS key is enabled. When <code>KeyState</code> is
    *         <code>Enabled</code> this value is true, otherwise it is false.</p>
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * <p>The encryption algorithms that the KMS key supports. You cannot use the KMS key with other
    *       encryption algorithms within KMS.</p>
    *          <p>This value is present only when the <code>KeyUsage</code> of the KMS key is
    *         <code>ENCRYPT_DECRYPT</code>.</p>
    */
  var EncryptionAlgorithms: js.UndefOr[js.Array[EncryptionAlgorithmSpec | String]] = js.undefined
  
  /**
    * <p>Specifies whether the KMS key's key material expires. This value is present only when
    *         <code>Origin</code> is <code>EXTERNAL</code>, otherwise this value is omitted.</p>
    */
  var ExpirationModel: js.UndefOr[ExpirationModelType | String] = js.undefined
  
  /**
    * <p>The globally unique identifier for the KMS key.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The manager of the KMS key. KMS keys in your Amazon Web Services account are either customer managed or
    *       Amazon Web Services managed. For more information about the difference, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys">KMS keys</a> in the <i>Key Management Service Developer Guide</i>.</p>
    */
  var KeyManager: js.UndefOr[KeyManagerType | String] = js.undefined
  
  /**
    * <p>Describes the type of key material in the KMS key.</p>
    */
  var KeySpec: js.UndefOr[typings.awsSdkClientKms.distTypesModelsModels0Mod.KeySpec | String] = js.undefined
  
  /**
    * <p>The current status of the KMS key.</p>
    *          <p>For more information about how key state affects the use of a KMS key, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
    *       the <i>Key Management Service Developer Guide</i>.</p>
    */
  var KeyState: js.UndefOr[typings.awsSdkClientKms.distTypesModelsModels0Mod.KeyState | String] = js.undefined
  
  /**
    * <p>The <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic operations</a> for which you can use the KMS key.</p>
    */
  var KeyUsage: js.UndefOr[KeyUsageType | String] = js.undefined
  
  /**
    * <p>The message authentication code (MAC) algorithm that the HMAC KMS key supports.</p>
    *          <p>This value is present only when the <code>KeyUsage</code> of the KMS key is
    *         <code>GENERATE_VERIFY_MAC</code>.</p>
    */
  var MacAlgorithms: js.UndefOr[js.Array[MacAlgorithmSpec | String]] = js.undefined
  
  /**
    * <p>Indicates whether the KMS key is a multi-Region (<code>True</code>) or regional
    *         (<code>False</code>) key. This value is <code>True</code> for multi-Region primary and
    *       replica keys and <code>False</code> for regional KMS keys.</p>
    *          <p>For more information about multi-Region keys, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region keys in KMS</a> in the <i>Key Management Service Developer Guide</i>.</p>
    */
  var MultiRegion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * <p>Lists the primary and replica keys in same multi-Region key. This field is present only
    *       when the value of the <code>MultiRegion</code> field is <code>True</code>.</p>
    *          <p>For more information about any listed KMS key, use the <a>DescribeKey</a>
    *       operation.</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>MultiRegionKeyType</code> indicates whether the KMS key is a
    *             <code>PRIMARY</code> or <code>REPLICA</code> key.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>PrimaryKey</code> displays the key ARN and Region of the primary key. This field
    *           displays the current KMS key if it is the primary key.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ReplicaKeys</code> displays the key ARNs and Regions of all replica keys. This
    *           field includes the current KMS key if it is a replica key.</p>
    *             </li>
    *          </ul>
    */
  var MultiRegionConfiguration: js.UndefOr[typings.awsSdkClientKms.distTypesModelsModels0Mod.MultiRegionConfiguration] = js.undefined
  
  /**
    * <p>The source of the key material for the KMS key. When this value is <code>AWS_KMS</code>,
    *       KMS created the key material. When this value is <code>EXTERNAL</code>, the key material was
    *       imported or the KMS key doesn't have any key material. When this value is
    *         <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM cluster associated with
    *       a custom key store.</p>
    */
  var Origin: js.UndefOr[OriginType | String] = js.undefined
  
  /**
    * <p>The waiting period before the primary key in a multi-Region key is deleted. This waiting
    *       period begins when the last of its replica keys is deleted. This value is present only when
    *       the <code>KeyState</code> of the KMS key is <code>PendingReplicaDeletion</code>. That
    *       indicates that the KMS key is the primary key in a multi-Region key, it is scheduled for
    *       deletion, and it still has existing replica keys.</p>
    *          <p>When a single-Region KMS key or a multi-Region replica key is scheduled for deletion, its
    *       deletion date is displayed in the <code>DeletionDate</code> field. However, when the primary
    *       key in a multi-Region key is scheduled for deletion, its waiting period doesn't begin until
    *       all of its replica keys are deleted. This value displays that waiting period. When the last
    *       replica key in the multi-Region key is deleted, the <code>KeyState</code> of the scheduled
    *       primary key changes from <code>PendingReplicaDeletion</code> to <code>PendingDeletion</code>
    *       and the deletion date appears in the <code>DeletionDate</code> field.</p>
    */
  var PendingDeletionWindowInDays: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The signing algorithms that the KMS key supports. You cannot use the KMS key with other
    *       signing algorithms within KMS.</p>
    *          <p>This field appears only when the <code>KeyUsage</code> of the KMS key is
    *         <code>SIGN_VERIFY</code>.</p>
    */
  var SigningAlgorithms: js.UndefOr[js.Array[SigningAlgorithmSpec | String]] = js.undefined
  
  /**
    * <p>The time at which the imported key material expires. When the key material expires, KMS
    *       deletes the key material and the KMS key becomes unusable. This value is present only for KMS
    *       keys whose <code>Origin</code> is <code>EXTERNAL</code> and whose <code>ExpirationModel</code>
    *       is <code>KEY_MATERIAL_EXPIRES</code>, otherwise this value is omitted.</p>
    */
  var ValidTo: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>Information about the external key that is associated with a KMS key in an
    *       external key store.</p>
    *          <p>For more information, see
    *       <a href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-external-key">External key</a> in the <i>Key Management Service Developer Guide</i>.</p>
    */
  var XksKeyConfiguration: js.UndefOr[XksKeyConfigurationType] = js.undefined
}
object KeyMetadata {
  
  inline def apply(): KeyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyMetadata] (val x: Self) extends AnyVal {
    
    inline def setAWSAccountId(value: String): Self = StObject.set(x, "AWSAccountId", value.asInstanceOf[js.Any])
    
    inline def setAWSAccountIdUndefined: Self = StObject.set(x, "AWSAccountId", js.undefined)
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCloudHsmClusterId(value: String): Self = StObject.set(x, "CloudHsmClusterId", value.asInstanceOf[js.Any])
    
    inline def setCloudHsmClusterIdUndefined: Self = StObject.set(x, "CloudHsmClusterId", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCustomKeyStoreId(value: String): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
    
    inline def setCustomerMasterKeySpec(value: CustomerMasterKeySpec | String): Self = StObject.set(x, "CustomerMasterKeySpec", value.asInstanceOf[js.Any])
    
    inline def setCustomerMasterKeySpecUndefined: Self = StObject.set(x, "CustomerMasterKeySpec", js.undefined)
    
    inline def setDeletionDate(value: js.Date): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
    
    inline def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setEncryptionAlgorithms(value: js.Array[EncryptionAlgorithmSpec | String]): Self = StObject.set(x, "EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithmsUndefined: Self = StObject.set(x, "EncryptionAlgorithms", js.undefined)
    
    inline def setEncryptionAlgorithmsVarargs(value: (EncryptionAlgorithmSpec | String)*): Self = StObject.set(x, "EncryptionAlgorithms", js.Array(value*))
    
    inline def setExpirationModel(value: ExpirationModelType | String): Self = StObject.set(x, "ExpirationModel", value.asInstanceOf[js.Any])
    
    inline def setExpirationModelUndefined: Self = StObject.set(x, "ExpirationModel", js.undefined)
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setKeyManager(value: KeyManagerType | String): Self = StObject.set(x, "KeyManager", value.asInstanceOf[js.Any])
    
    inline def setKeyManagerUndefined: Self = StObject.set(x, "KeyManager", js.undefined)
    
    inline def setKeySpec(value: KeySpec | String): Self = StObject.set(x, "KeySpec", value.asInstanceOf[js.Any])
    
    inline def setKeySpecUndefined: Self = StObject.set(x, "KeySpec", js.undefined)
    
    inline def setKeyState(value: KeyState | String): Self = StObject.set(x, "KeyState", value.asInstanceOf[js.Any])
    
    inline def setKeyStateUndefined: Self = StObject.set(x, "KeyState", js.undefined)
    
    inline def setKeyUsage(value: KeyUsageType | String): Self = StObject.set(x, "KeyUsage", value.asInstanceOf[js.Any])
    
    inline def setKeyUsageUndefined: Self = StObject.set(x, "KeyUsage", js.undefined)
    
    inline def setMacAlgorithms(value: js.Array[MacAlgorithmSpec | String]): Self = StObject.set(x, "MacAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setMacAlgorithmsUndefined: Self = StObject.set(x, "MacAlgorithms", js.undefined)
    
    inline def setMacAlgorithmsVarargs(value: (MacAlgorithmSpec | String)*): Self = StObject.set(x, "MacAlgorithms", js.Array(value*))
    
    inline def setMultiRegion(value: Boolean): Self = StObject.set(x, "MultiRegion", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionConfiguration(value: MultiRegionConfiguration): Self = StObject.set(x, "MultiRegionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionConfigurationUndefined: Self = StObject.set(x, "MultiRegionConfiguration", js.undefined)
    
    inline def setMultiRegionUndefined: Self = StObject.set(x, "MultiRegion", js.undefined)
    
    inline def setOrigin(value: OriginType | String): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
    
    inline def setPendingDeletionWindowInDays(value: Double): Self = StObject.set(x, "PendingDeletionWindowInDays", value.asInstanceOf[js.Any])
    
    inline def setPendingDeletionWindowInDaysUndefined: Self = StObject.set(x, "PendingDeletionWindowInDays", js.undefined)
    
    inline def setSigningAlgorithms(value: js.Array[SigningAlgorithmSpec | String]): Self = StObject.set(x, "SigningAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithmsUndefined: Self = StObject.set(x, "SigningAlgorithms", js.undefined)
    
    inline def setSigningAlgorithmsVarargs(value: (SigningAlgorithmSpec | String)*): Self = StObject.set(x, "SigningAlgorithms", js.Array(value*))
    
    inline def setValidTo(value: js.Date): Self = StObject.set(x, "ValidTo", value.asInstanceOf[js.Any])
    
    inline def setValidToUndefined: Self = StObject.set(x, "ValidTo", js.undefined)
    
    inline def setXksKeyConfiguration(value: XksKeyConfigurationType): Self = StObject.set(x, "XksKeyConfiguration", value.asInstanceOf[js.Any])
    
    inline def setXksKeyConfigurationUndefined: Self = StObject.set(x, "XksKeyConfiguration", js.undefined)
  }
}
