package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReEncryptRequest extends StObject {
  
  /**
    * <p>Ciphertext of the data to reencrypt.</p>
    */
  var CiphertextBlob: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>Specifies the encryption algorithm that KMS will use to reecrypt the data after it has
    *       decrypted it. The default value, <code>SYMMETRIC_DEFAULT</code>, represents the encryption
    *       algorithm used for symmetric encryption KMS keys.</p>
    *          <p>This parameter is required only when the destination KMS key is an asymmetric KMS
    *       key.</p>
    */
  var DestinationEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec | String] = js.undefined
  
  /**
    * <p>Specifies that encryption context to use when the reencrypting the data.</p>
    *          <important>
    *             <p>Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output.</p>
    *          </important>
    *          <p>A destination encryption context is valid only when the destination KMS key is a symmetric
    *       encryption KMS key. The standard ciphertext format for asymmetric KMS keys does not include
    *       fields for metadata.</p>
    *          <p>An <i>encryption context</i> is a collection of non-secret key-value pairs that represent additional authenticated data.
    * When you use an encryption context to encrypt data, you must specify the same (an exact case-sensitive match) encryption context to decrypt the data. An encryption context is supported
    * only on operations with symmetric encryption KMS keys. On operations with symmetric encryption KMS keys, an encryption context is optional, but it is strongly recommended.</p>
    *          <p>For more information, see
    * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption context</a> in the <i>Key Management Service Developer Guide</i>.</p>
    */
  var DestinationEncryptionContext: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * <p>A unique identifier for the KMS key that is used to reencrypt the data. Specify a
    *       symmetric encryption KMS key or an asymmetric KMS key with a <code>KeyUsage</code> value of
    *         <code>ENCRYPT_DECRYPT</code>. To find the <code>KeyUsage</code> value of a KMS key, use the
    *         <a>DescribeKey</a> operation.</p>
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
  var DestinationKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A list of grant tokens.</p>
    *          <p>Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved <i>eventual consistency</i>. For more information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant token</a> in the
    *     <i>Key Management Service Developer Guide</i>.</p>
    */
  var GrantTokens: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * <p>Specifies the encryption algorithm that KMS will use to decrypt the ciphertext before it
    *       is reencrypted. The default value, <code>SYMMETRIC_DEFAULT</code>, represents the algorithm
    *       used for symmetric encryption KMS keys.</p>
    *          <p>Specify the same algorithm that was used to encrypt the ciphertext. If you specify a
    *       different algorithm, the decrypt attempt fails.</p>
    *          <p>This parameter is required only when the ciphertext was encrypted under an asymmetric KMS
    *       key.</p>
    */
  var SourceEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec | String] = js.undefined
  
  /**
    * <p>Specifies the encryption context to use to decrypt the ciphertext. Enter the same
    *       encryption context that was used to encrypt the ciphertext.</p>
    *          <p>An <i>encryption context</i> is a collection of non-secret key-value pairs that represent additional authenticated data.
    * When you use an encryption context to encrypt data, you must specify the same (an exact case-sensitive match) encryption context to decrypt the data. An encryption context is supported
    * only on operations with symmetric encryption KMS keys. On operations with symmetric encryption KMS keys, an encryption context is optional, but it is strongly recommended.</p>
    *          <p>For more information, see
    * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption context</a> in the <i>Key Management Service Developer Guide</i>.</p>
    */
  var SourceEncryptionContext: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * <p>Specifies the KMS key that KMS will use to decrypt the ciphertext before it is
    *       re-encrypted.</p>
    *          <p>Enter a key ID of the KMS key that was used to encrypt the ciphertext. If you identify a
    *       different KMS key, the <code>ReEncrypt</code> operation throws an
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
  var SourceKeyId: js.UndefOr[String] = js.undefined
}
object ReEncryptRequest {
  
  inline def apply(): ReEncryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReEncryptRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReEncryptRequest] (val x: Self) extends AnyVal {
    
    inline def setCiphertextBlob(value: js.typedarray.Uint8Array): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
    
    inline def setCiphertextBlobUndefined: Self = StObject.set(x, "CiphertextBlob", js.undefined)
    
    inline def setDestinationEncryptionAlgorithm(value: EncryptionAlgorithmSpec | String): Self = StObject.set(x, "DestinationEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDestinationEncryptionAlgorithmUndefined: Self = StObject.set(x, "DestinationEncryptionAlgorithm", js.undefined)
    
    inline def setDestinationEncryptionContext(value: Record[String, String]): Self = StObject.set(x, "DestinationEncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setDestinationEncryptionContextUndefined: Self = StObject.set(x, "DestinationEncryptionContext", js.undefined)
    
    inline def setDestinationKeyId(value: String): Self = StObject.set(x, "DestinationKeyId", value.asInstanceOf[js.Any])
    
    inline def setDestinationKeyIdUndefined: Self = StObject.set(x, "DestinationKeyId", js.undefined)
    
    inline def setGrantTokens(value: js.Array[String]): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    inline def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    inline def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "GrantTokens", js.Array(value*))
    
    inline def setSourceEncryptionAlgorithm(value: EncryptionAlgorithmSpec | String): Self = StObject.set(x, "SourceEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSourceEncryptionAlgorithmUndefined: Self = StObject.set(x, "SourceEncryptionAlgorithm", js.undefined)
    
    inline def setSourceEncryptionContext(value: Record[String, String]): Self = StObject.set(x, "SourceEncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setSourceEncryptionContextUndefined: Self = StObject.set(x, "SourceEncryptionContext", js.undefined)
    
    inline def setSourceKeyId(value: String): Self = StObject.set(x, "SourceKeyId", value.asInstanceOf[js.Any])
    
    inline def setSourceKeyIdUndefined: Self = StObject.set(x, "SourceKeyId", js.undefined)
  }
}
