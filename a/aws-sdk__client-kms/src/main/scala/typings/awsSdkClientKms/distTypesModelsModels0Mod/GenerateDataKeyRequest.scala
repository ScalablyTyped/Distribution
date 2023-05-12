package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateDataKeyRequest extends StObject {
  
  /**
    * <p>Specifies the encryption context that will be used when encrypting the data key.</p>
    *          <important>
    *             <p>Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output.</p>
    *          </important>
    *          <p>An <i>encryption context</i> is a collection of non-secret key-value pairs that represent additional authenticated data.
    * When you use an encryption context to encrypt data, you must specify the same (an exact case-sensitive match) encryption context to decrypt the data. An encryption context is supported
    * only on operations with symmetric encryption KMS keys. On operations with symmetric encryption KMS keys, an encryption context is optional, but it is strongly recommended.</p>
    *          <p>For more information, see
    * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption context</a> in the <i>Key Management Service Developer Guide</i>.</p>
    */
  var EncryptionContext: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * <p>A list of grant tokens.</p>
    *          <p>Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved <i>eventual consistency</i>. For more information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant token</a> in the
    *     <i>Key Management Service Developer Guide</i>.</p>
    */
  var GrantTokens: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * <p>Specifies the symmetric encryption KMS key that encrypts the data key. You cannot specify
    *       an asymmetric KMS key or a KMS key in a custom key store. To get the type and origin of your
    *       KMS key, use the <a>DescribeKey</a> operation.</p>
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
    * <p>Specifies the length of the data key. Use <code>AES_128</code> to generate a 128-bit
    *       symmetric key, or <code>AES_256</code> to generate a 256-bit symmetric key.</p>
    *          <p>You must specify either the <code>KeySpec</code> or the <code>NumberOfBytes</code>
    *       parameter (but not both) in every <code>GenerateDataKey</code> request.</p>
    */
  var KeySpec: js.UndefOr[DataKeySpec | String] = js.undefined
  
  /**
    * <p>Specifies the length of the data key in bytes. For example, use the value 64 to generate a
    *       512-bit data key (64 bytes is 512 bits). For 128-bit (16-byte) and 256-bit (32-byte) data
    *       keys, use the <code>KeySpec</code> parameter.</p>
    *          <p>You must specify either the <code>KeySpec</code> or the <code>NumberOfBytes</code>
    *       parameter (but not both) in every <code>GenerateDataKey</code> request.</p>
    */
  var NumberOfBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>A signed <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc">attestation document</a> from
    *       an Amazon Web Services Nitro enclave and the encryption algorithm to use with the enclave's public key.
    *       The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>. </p>
    *          <p>This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To include this
    *       parameter, use the <a href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web Services SDK.</p>
    *          <p>When you use this parameter, instead of returning the plaintext data key, KMS encrypts
    *       the plaintext data key under the public key in the attestation document, and returns the
    *       resulting ciphertext in the <code>CiphertextForRecipient</code> field in the response. This
    *       ciphertext can be decrypted only with the private key in the enclave. The
    *       <code>CiphertextBlob</code> field in the response contains a copy of the data key encrypted
    *       under the KMS key specified by the <code>KeyId</code> parameter. The <code>Plaintext</code>
    *       field in the response is null or empty.</p>
    *          <p>For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.</p>
    */
  var Recipient: js.UndefOr[RecipientInfo] = js.undefined
}
object GenerateDataKeyRequest {
  
  inline def apply(): GenerateDataKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDataKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateDataKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setEncryptionContext(value: Record[String, String]): Self = StObject.set(x, "EncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setEncryptionContextUndefined: Self = StObject.set(x, "EncryptionContext", js.undefined)
    
    inline def setGrantTokens(value: js.Array[String]): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    inline def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    inline def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "GrantTokens", js.Array(value*))
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setKeySpec(value: DataKeySpec | String): Self = StObject.set(x, "KeySpec", value.asInstanceOf[js.Any])
    
    inline def setKeySpecUndefined: Self = StObject.set(x, "KeySpec", js.undefined)
    
    inline def setNumberOfBytes(value: Double): Self = StObject.set(x, "NumberOfBytes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfBytesUndefined: Self = StObject.set(x, "NumberOfBytes", js.undefined)
    
    inline def setRecipient(value: RecipientInfo): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "Recipient", js.undefined)
  }
}
