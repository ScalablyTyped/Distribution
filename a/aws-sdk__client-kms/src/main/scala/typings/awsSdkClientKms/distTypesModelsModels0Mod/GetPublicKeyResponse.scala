package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublicKeyResponse extends StObject {
  
  /**
    * @deprecated
    *
    * <p>Instead, use the <code>KeySpec</code> field in the <code>GetPublicKey</code>
    *       response.</p>
    *          <p>The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> fields have the same
    *       value. We recommend that you use the <code>KeySpec</code> field in your code. However, to
    *       avoid breaking changes, KMS supports both fields.</p>
    */
  var CustomerMasterKeySpec: js.UndefOr[typings.awsSdkClientKms.distTypesModelsModels0Mod.CustomerMasterKeySpec | String] = js.undefined
  
  /**
    * <p>The encryption algorithms that KMS supports for this key. </p>
    *          <p>This information is critical. If a public key encrypts data outside of KMS by using an
    *       unsupported encryption algorithm, the ciphertext cannot be decrypted. </p>
    *          <p>This field appears in the response only when the <code>KeyUsage</code> of the public key
    *       is <code>ENCRYPT_DECRYPT</code>.</p>
    */
  var EncryptionAlgorithms: js.UndefOr[js.Array[EncryptionAlgorithmSpec | String]] = js.undefined
  
  /**
    * <p>The Amazon Resource Name (<a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the asymmetric KMS key from which the public key was
    *       downloaded.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The type of the of the public key that was downloaded.</p>
    */
  var KeySpec: js.UndefOr[typings.awsSdkClientKms.distTypesModelsModels0Mod.KeySpec | String] = js.undefined
  
  /**
    * <p>The permitted use of the public key. Valid values are <code>ENCRYPT_DECRYPT</code> or
    *         <code>SIGN_VERIFY</code>. </p>
    *          <p>This information is critical. If a public key with <code>SIGN_VERIFY</code> key usage
    *       encrypts data outside of KMS, the ciphertext cannot be decrypted. </p>
    */
  var KeyUsage: js.UndefOr[KeyUsageType | String] = js.undefined
  
  /**
    * <p>The exported public key. </p>
    *          <p>The value is a DER-encoded X.509 public key, also known as
    *         <code>SubjectPublicKeyInfo</code> (SPKI), as defined in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.</p>
    *          <p></p>
    */
  var PublicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>The signing algorithms that KMS supports for this key.</p>
    *          <p>This field appears in the response only when the <code>KeyUsage</code> of the public key
    *       is <code>SIGN_VERIFY</code>.</p>
    */
  var SigningAlgorithms: js.UndefOr[js.Array[SigningAlgorithmSpec | String]] = js.undefined
}
object GetPublicKeyResponse {
  
  inline def apply(): GetPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPublicKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomerMasterKeySpec(value: CustomerMasterKeySpec | String): Self = StObject.set(x, "CustomerMasterKeySpec", value.asInstanceOf[js.Any])
    
    inline def setCustomerMasterKeySpecUndefined: Self = StObject.set(x, "CustomerMasterKeySpec", js.undefined)
    
    inline def setEncryptionAlgorithms(value: js.Array[EncryptionAlgorithmSpec | String]): Self = StObject.set(x, "EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithmsUndefined: Self = StObject.set(x, "EncryptionAlgorithms", js.undefined)
    
    inline def setEncryptionAlgorithmsVarargs(value: (EncryptionAlgorithmSpec | String)*): Self = StObject.set(x, "EncryptionAlgorithms", js.Array(value*))
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setKeySpec(value: KeySpec | String): Self = StObject.set(x, "KeySpec", value.asInstanceOf[js.Any])
    
    inline def setKeySpecUndefined: Self = StObject.set(x, "KeySpec", js.undefined)
    
    inline def setKeyUsage(value: KeyUsageType | String): Self = StObject.set(x, "KeyUsage", value.asInstanceOf[js.Any])
    
    inline def setKeyUsageUndefined: Self = StObject.set(x, "KeyUsage", js.undefined)
    
    inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
    
    inline def setSigningAlgorithms(value: js.Array[SigningAlgorithmSpec | String]): Self = StObject.set(x, "SigningAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithmsUndefined: Self = StObject.set(x, "SigningAlgorithms", js.undefined)
    
    inline def setSigningAlgorithmsVarargs(value: (SigningAlgorithmSpec | String)*): Self = StObject.set(x, "SigningAlgorithms", js.Array(value*))
  }
}
