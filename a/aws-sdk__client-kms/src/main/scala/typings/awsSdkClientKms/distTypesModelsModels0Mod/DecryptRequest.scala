package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecryptRequest extends StObject {
  
  /**
    * <p>Ciphertext to be decrypted. The blob includes metadata.</p>
    */
  var CiphertextBlob: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>Specifies the encryption algorithm that will be used to decrypt the ciphertext. Specify
    *       the same algorithm that was used to encrypt the data. If you specify a different algorithm,
    *       the <code>Decrypt</code> operation fails.</p>
    *          <p>This parameter is required only when the ciphertext was encrypted under an asymmetric KMS
    *       key. The default value, <code>SYMMETRIC_DEFAULT</code>, represents the only supported
    *       algorithm that is valid for symmetric encryption KMS keys.</p>
    */
  var EncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec | String] = js.undefined
  
  /**
    * <p>Specifies the encryption context to use when decrypting the data.
    *       An encryption context is valid only for <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic operations</a> with a symmetric encryption KMS key. The standard asymmetric encryption algorithms and HMAC algorithms that KMS uses do not support an encryption context.</p>
    *          <p>An <i>encryption context</i> is a collection of non-secret key-value pairs that represent additional authenticated data.
    * When you use an encryption context to encrypt data, you must specify the same (an exact case-sensitive match) encryption context to decrypt the data. An encryption context is supported
    * only on operations with symmetric encryption KMS keys. On operations with symmetric encryption KMS keys, an encryption context is optional, but it is strongly recommended.</p>
    *          <p>For more information, see
    * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption context</a> in the <i>Key Management Service Developer Guide</i>.</p>
    */
  var EncryptionContext: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * <p>A list of grant tokens. </p>
    *          <p>Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved <i>eventual consistency</i>. For more information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant token</a> in the
    *     <i>Key Management Service Developer Guide</i>.</p>
    */
  var GrantTokens: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * <p>Specifies the KMS key that KMS uses to decrypt the ciphertext.</p>
    *          <p>Enter a key ID of the KMS key that was used to encrypt the ciphertext. If you identify a
    *       different KMS key, the <code>Decrypt</code> operation throws an
    *         <code>IncorrectKeyException</code>.</p>
    *          <p>This parameter is required only when the ciphertext was encrypted under an asymmetric KMS
    *       key. If you used a symmetric encryption KMS key, KMS can get the KMS key from metadata that
    *       it adds to the symmetric ciphertext blob. However, it is always recommended as a best
    *       practice. This practice ensures that you use the KMS key that you intend.</p>
    *          <p>To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN or alias ARN.</p>
    *          <p>For example:</p>
    *          <ul>
    *             <li>
    *                <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Alias name: <code>alias/ExampleAlias</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <p>To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and alias ARN, use <a>ListAliases</a>.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A signed <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc">attestation document</a> from
    *       an Amazon Web Services Nitro enclave and the encryption algorithm to use with the enclave's public key.
    *       The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>. </p>
    *          <p>This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To include this
    *       parameter, use the <a href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web Services SDK.</p>
    *          <p>When you use this parameter, instead of returning the plaintext data, KMS encrypts the
    *       plaintext data with the public key in the attestation document, and returns the resulting
    *       ciphertext in the <code>CiphertextForRecipient</code> field in the response. This ciphertext
    *       can be decrypted only with the private key in the enclave. The <code>Plaintext</code> field in
    *       the response is null or empty.</p>
    *          <p>For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.</p>
    */
  var Recipient: js.UndefOr[RecipientInfo] = js.undefined
}
object DecryptRequest {
  
  inline def apply(): DecryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecryptRequest] (val x: Self) extends AnyVal {
    
    inline def setCiphertextBlob(value: js.typedarray.Uint8Array): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
    
    inline def setCiphertextBlobUndefined: Self = StObject.set(x, "CiphertextBlob", js.undefined)
    
    inline def setEncryptionAlgorithm(value: EncryptionAlgorithmSpec | String): Self = StObject.set(x, "EncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "EncryptionAlgorithm", js.undefined)
    
    inline def setEncryptionContext(value: Record[String, String]): Self = StObject.set(x, "EncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setEncryptionContextUndefined: Self = StObject.set(x, "EncryptionContext", js.undefined)
    
    inline def setGrantTokens(value: js.Array[String]): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    inline def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    inline def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "GrantTokens", js.Array(value*))
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setRecipient(value: RecipientInfo): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "Recipient", js.undefined)
  }
}
