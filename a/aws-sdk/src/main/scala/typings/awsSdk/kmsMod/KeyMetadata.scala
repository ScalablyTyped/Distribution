package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyMetadata extends js.Object {
  
  /**
    * The twelve-digit account ID of the AWS account that owns the CMK.
    */
  var AWSAccountId: js.UndefOr[AWSAccountIdType] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the CMK. For examples, see AWS Key Management Service (AWS KMS) in the Example ARNs section of the AWS General Reference.
    */
  var Arn: js.UndefOr[ArnType] = js.native
  
  /**
    * The cluster ID of the AWS CloudHSM cluster that contains the key material for the CMK. When you create a CMK in a custom key store, AWS KMS creates the key material for the CMK in the associated AWS CloudHSM cluster. This value is present only when the CMK is created in a custom key store.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.native
  
  /**
    * The date and time when the CMK was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  
  /**
    * A unique identifier for the custom key store that contains the CMK. This value is present only when the CMK is created in a custom key store.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.native
  
  /**
    * Describes the type of key material in the CMK.
    */
  var CustomerMasterKeySpec: js.UndefOr[typings.awsSdk.kmsMod.CustomerMasterKeySpec] = js.native
  
  /**
    * The date and time after which AWS KMS deletes the CMK. This value is present only when KeyState is PendingDeletion.
    */
  var DeletionDate: js.UndefOr[DateType] = js.native
  
  /**
    * The description of the CMK.
    */
  var Description: js.UndefOr[DescriptionType] = js.native
  
  /**
    * Specifies whether the CMK is enabled. When KeyState is Enabled this value is true, otherwise it is false.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
  
  /**
    * The encryption algorithms that the CMK supports. You cannot use the CMK with other encryption algorithms within AWS KMS. This field appears only when the KeyUsage of the CMK is ENCRYPT_DECRYPT.
    */
  var EncryptionAlgorithms: js.UndefOr[EncryptionAlgorithmSpecList] = js.native
  
  /**
    * Specifies whether the CMK's key material expires. This value is present only when Origin is EXTERNAL, otherwise this value is omitted.
    */
  var ExpirationModel: js.UndefOr[ExpirationModelType] = js.native
  
  /**
    * The globally unique identifier for the CMK.
    */
  var KeyId: KeyIdType = js.native
  
  /**
    * The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed. For more information about the difference, see Customer Master Keys in the AWS Key Management Service Developer Guide.
    */
  var KeyManager: js.UndefOr[KeyManagerType] = js.native
  
  /**
    * The current status of the CMK. For more information about how key state affects the use of a CMK, see Key state: Effect on your CMK in the AWS Key Management Service Developer Guide.
    */
  var KeyState: js.UndefOr[typings.awsSdk.kmsMod.KeyState] = js.native
  
  /**
    * The cryptographic operations for which you can use the CMK.
    */
  var KeyUsage: js.UndefOr[KeyUsageType] = js.native
  
  /**
    * The source of the CMK's key material. When this value is AWS_KMS, AWS KMS created the key material. When this value is EXTERNAL, the key material was imported from your existing key management infrastructure or the CMK lacks key material. When this value is AWS_CLOUDHSM, the key material was created in the AWS CloudHSM cluster associated with a custom key store.
    */
  var Origin: js.UndefOr[OriginType] = js.native
  
  /**
    * The signing algorithms that the CMK supports. You cannot use the CMK with other signing algorithms within AWS KMS. This field appears only when the KeyUsage of the CMK is SIGN_VERIFY.
    */
  var SigningAlgorithms: js.UndefOr[SigningAlgorithmSpecList] = js.native
  
  /**
    * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. This value is present only for CMKs whose Origin is EXTERNAL and whose ExpirationModel is KEY_MATERIAL_EXPIRES, otherwise this value is omitted.
    */
  var ValidTo: js.UndefOr[DateType] = js.native
}
object KeyMetadata {
  
  @scala.inline
  def apply(KeyId: KeyIdType): KeyMetadata = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMetadata]
  }
  
  @scala.inline
  implicit class KeyMetadataOps[Self <: KeyMetadata] (val x: Self) extends AnyVal {
    
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
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAWSAccountId(value: AWSAccountIdType): Self = this.set("AWSAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAWSAccountId: Self = this.set("AWSAccountId", js.undefined)
    
    @scala.inline
    def setArn(value: ArnType): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCloudHsmClusterId(value: CloudHsmClusterIdType): Self = this.set("CloudHsmClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudHsmClusterId: Self = this.set("CloudHsmClusterId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: DateType): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = this.set("CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomKeyStoreId: Self = this.set("CustomKeyStoreId", js.undefined)
    
    @scala.inline
    def setCustomerMasterKeySpec(value: CustomerMasterKeySpec): Self = this.set("CustomerMasterKeySpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerMasterKeySpec: Self = this.set("CustomerMasterKeySpec", js.undefined)
    
    @scala.inline
    def setDeletionDate(value: DateType): Self = this.set("DeletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionDate: Self = this.set("DeletionDate", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionType): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEnabled(value: BooleanType): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setEncryptionAlgorithmsVarargs(value: EncryptionAlgorithmSpec*): Self = this.set("EncryptionAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setEncryptionAlgorithms(value: EncryptionAlgorithmSpecList): Self = this.set("EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionAlgorithms: Self = this.set("EncryptionAlgorithms", js.undefined)
    
    @scala.inline
    def setExpirationModel(value: ExpirationModelType): Self = this.set("ExpirationModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationModel: Self = this.set("ExpirationModel", js.undefined)
    
    @scala.inline
    def setKeyManager(value: KeyManagerType): Self = this.set("KeyManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyManager: Self = this.set("KeyManager", js.undefined)
    
    @scala.inline
    def setKeyState(value: KeyState): Self = this.set("KeyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyState: Self = this.set("KeyState", js.undefined)
    
    @scala.inline
    def setKeyUsage(value: KeyUsageType): Self = this.set("KeyUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyUsage: Self = this.set("KeyUsage", js.undefined)
    
    @scala.inline
    def setOrigin(value: OriginType): Self = this.set("Origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("Origin", js.undefined)
    
    @scala.inline
    def setSigningAlgorithmsVarargs(value: SigningAlgorithmSpec*): Self = this.set("SigningAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setSigningAlgorithms(value: SigningAlgorithmSpecList): Self = this.set("SigningAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningAlgorithms: Self = this.set("SigningAlgorithms", js.undefined)
    
    @scala.inline
    def setValidTo(value: DateType): Self = this.set("ValidTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidTo: Self = this.set("ValidTo", js.undefined)
  }
}
