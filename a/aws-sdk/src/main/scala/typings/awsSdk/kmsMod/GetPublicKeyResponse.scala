package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicKeyResponse extends js.Object {
  /**
    * The type of the of the public key that was downloaded.
    */
  var CustomerMasterKeySpec: js.UndefOr[typings.awsSdk.kmsMod.CustomerMasterKeySpec] = js.native
  /**
    * The encryption algorithms that AWS KMS supports for this key.  This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported encryption algorithm, the ciphertext cannot be decrypted.  This field appears in the response only when the KeyUsage of the public key is ENCRYPT_DECRYPT.
    */
  var EncryptionAlgorithms: js.UndefOr[EncryptionAlgorithmSpecList] = js.native
  /**
    * The Amazon Resource Name (key ARN) of the asymmetric CMK from which the public key was downloaded.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The permitted use of the public key. Valid values are ENCRYPT_DECRYPT or SIGN_VERIFY.  This information is critical. If a public key with SIGN_VERIFY key usage encrypts data outside of AWS KMS, the ciphertext cannot be decrypted. 
    */
  var KeyUsage: js.UndefOr[KeyUsageType] = js.native
  /**
    * The exported public key.  The value is a DER-encoded X.509 public key, also known as SubjectPublicKeyInfo (SPKI), as defined in RFC 5280. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded. 
    */
  var PublicKey: js.UndefOr[PublicKeyType] = js.native
  /**
    * The signing algorithms that AWS KMS supports for this key. This field appears in the response only when the KeyUsage of the public key is SIGN_VERIFY.
    */
  var SigningAlgorithms: js.UndefOr[SigningAlgorithmSpecList] = js.native
}

object GetPublicKeyResponse {
  @scala.inline
  def apply(
    CustomerMasterKeySpec: CustomerMasterKeySpec = null,
    EncryptionAlgorithms: EncryptionAlgorithmSpecList = null,
    KeyId: KeyIdType = null,
    KeyUsage: KeyUsageType = null,
    PublicKey: PublicKeyType = null,
    SigningAlgorithms: SigningAlgorithmSpecList = null
  ): GetPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomerMasterKeySpec != null) __obj.updateDynamic("CustomerMasterKeySpec")(CustomerMasterKeySpec.asInstanceOf[js.Any])
    if (EncryptionAlgorithms != null) __obj.updateDynamic("EncryptionAlgorithms")(EncryptionAlgorithms.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (KeyUsage != null) __obj.updateDynamic("KeyUsage")(KeyUsage.asInstanceOf[js.Any])
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey.asInstanceOf[js.Any])
    if (SigningAlgorithms != null) __obj.updateDynamic("SigningAlgorithms")(SigningAlgorithms.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicKeyResponse]
  }
}

