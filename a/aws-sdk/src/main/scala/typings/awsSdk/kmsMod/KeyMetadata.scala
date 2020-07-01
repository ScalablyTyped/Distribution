package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    KeyId: KeyIdType,
    AWSAccountId: AWSAccountIdType = null,
    Arn: ArnType = null,
    CloudHsmClusterId: CloudHsmClusterIdType = null,
    CreationDate: DateType = null,
    CustomKeyStoreId: CustomKeyStoreIdType = null,
    CustomerMasterKeySpec: CustomerMasterKeySpec = null,
    DeletionDate: DateType = null,
    Description: DescriptionType = null,
    Enabled: js.UndefOr[BooleanType] = js.undefined,
    EncryptionAlgorithms: EncryptionAlgorithmSpecList = null,
    ExpirationModel: ExpirationModelType = null,
    KeyManager: KeyManagerType = null,
    KeyState: KeyState = null,
    KeyUsage: KeyUsageType = null,
    Origin: OriginType = null,
    SigningAlgorithms: SigningAlgorithmSpecList = null,
    ValidTo: DateType = null
  ): KeyMetadata = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    if (AWSAccountId != null) __obj.updateDynamic("AWSAccountId")(AWSAccountId.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CloudHsmClusterId != null) __obj.updateDynamic("CloudHsmClusterId")(CloudHsmClusterId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (CustomKeyStoreId != null) __obj.updateDynamic("CustomKeyStoreId")(CustomKeyStoreId.asInstanceOf[js.Any])
    if (CustomerMasterKeySpec != null) __obj.updateDynamic("CustomerMasterKeySpec")(CustomerMasterKeySpec.asInstanceOf[js.Any])
    if (DeletionDate != null) __obj.updateDynamic("DeletionDate")(DeletionDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (EncryptionAlgorithms != null) __obj.updateDynamic("EncryptionAlgorithms")(EncryptionAlgorithms.asInstanceOf[js.Any])
    if (ExpirationModel != null) __obj.updateDynamic("ExpirationModel")(ExpirationModel.asInstanceOf[js.Any])
    if (KeyManager != null) __obj.updateDynamic("KeyManager")(KeyManager.asInstanceOf[js.Any])
    if (KeyState != null) __obj.updateDynamic("KeyState")(KeyState.asInstanceOf[js.Any])
    if (KeyUsage != null) __obj.updateDynamic("KeyUsage")(KeyUsage.asInstanceOf[js.Any])
    if (Origin != null) __obj.updateDynamic("Origin")(Origin.asInstanceOf[js.Any])
    if (SigningAlgorithms != null) __obj.updateDynamic("SigningAlgorithms")(SigningAlgorithms.asInstanceOf[js.Any])
    if (ValidTo != null) __obj.updateDynamic("ValidTo")(ValidTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMetadata]
  }
}

