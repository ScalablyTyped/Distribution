package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateDataKeyPairWithoutPlaintextRequest extends StObject {
  
  /**
    * <p>Specifies the encryption context that will be used when encrypting the private key in the
    *       data key pair.</p>
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
    * <p>Specifies the symmetric encryption KMS key that encrypts the private key in the data key
    *       pair. You cannot specify an asymmetric KMS key or a KMS key in a custom key store. To get the
    *       type and origin of your KMS key, use the <a>DescribeKey</a> operation. </p>
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
    * <p>Determines the type of data key pair that is generated.</p>
    *          <p>The KMS rule that restricts the use of asymmetric RSA and SM2 KMS keys to encrypt and decrypt or to sign and verify (but not both), and the rule that permits you to use ECC KMS keys only to sign and verify, are not effective on data key pairs, which are used outside of KMS. The SM2 key spec is only available in China Regions.</p>
    */
  var KeyPairSpec: js.UndefOr[DataKeyPairSpec | String] = js.undefined
}
object GenerateDataKeyPairWithoutPlaintextRequest {
  
  inline def apply(): GenerateDataKeyPairWithoutPlaintextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDataKeyPairWithoutPlaintextRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateDataKeyPairWithoutPlaintextRequest] (val x: Self) extends AnyVal {
    
    inline def setEncryptionContext(value: Record[String, String]): Self = StObject.set(x, "EncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setEncryptionContextUndefined: Self = StObject.set(x, "EncryptionContext", js.undefined)
    
    inline def setGrantTokens(value: js.Array[String]): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    inline def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    inline def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "GrantTokens", js.Array(value*))
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setKeyPairSpec(value: DataKeyPairSpec | String): Self = StObject.set(x, "KeyPairSpec", value.asInstanceOf[js.Any])
    
    inline def setKeyPairSpecUndefined: Self = StObject.set(x, "KeyPairSpec", js.undefined)
  }
}
