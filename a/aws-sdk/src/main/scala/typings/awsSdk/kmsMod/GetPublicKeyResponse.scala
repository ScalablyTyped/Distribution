package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): GetPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicKeyResponse]
  }
  
  @scala.inline
  implicit class GetPublicKeyResponseOps[Self <: GetPublicKeyResponse] (val x: Self) extends AnyVal {
    
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
    def setCustomerMasterKeySpec(value: CustomerMasterKeySpec): Self = this.set("CustomerMasterKeySpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerMasterKeySpec: Self = this.set("CustomerMasterKeySpec", js.undefined)
    
    @scala.inline
    def setEncryptionAlgorithmsVarargs(value: EncryptionAlgorithmSpec*): Self = this.set("EncryptionAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setEncryptionAlgorithms(value: EncryptionAlgorithmSpecList): Self = this.set("EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionAlgorithms: Self = this.set("EncryptionAlgorithms", js.undefined)
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    
    @scala.inline
    def setKeyUsage(value: KeyUsageType): Self = this.set("KeyUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyUsage: Self = this.set("KeyUsage", js.undefined)
    
    @scala.inline
    def setPublicKey(value: PublicKeyType): Self = this.set("PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKey: Self = this.set("PublicKey", js.undefined)
    
    @scala.inline
    def setSigningAlgorithmsVarargs(value: SigningAlgorithmSpec*): Self = this.set("SigningAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setSigningAlgorithms(value: SigningAlgorithmSpecList): Self = this.set("SigningAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningAlgorithms: Self = this.set("SigningAlgorithms", js.undefined)
  }
}
