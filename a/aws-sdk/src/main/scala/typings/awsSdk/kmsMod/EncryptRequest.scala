package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptRequest extends StObject {
  
  /**
    * Specifies the encryption algorithm that AWS KMS will use to encrypt the plaintext message. The algorithm must be compatible with the CMK that you specify. This parameter is required only for asymmetric CMKs. The default value, SYMMETRIC_DEFAULT, is the algorithm used for symmetric CMKs. If you are using an asymmetric CMK, we recommend RSAES_OAEP_SHA_256.
    */
  var EncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.native
  
  /**
    * Specifies the encryption context that will be used to encrypt the data. An encryption context is valid only for cryptographic operations with a symmetric CMK. The standard asymmetric encryption algorithms that AWS KMS uses do not support an encryption context.  An encryption context is a collection of non-secret key-value pairs that represents additional authenticated data. When you use an encryption context to encrypt data, you must specify the same (an exact case-sensitive match) encryption context to decrypt the data. An encryption context is optional when encrypting with a symmetric CMK, but it is highly recommended. For more information, see Encryption Context in the AWS Key Management Service Developer Guide.
    */
  var EncryptionContext: js.UndefOr[EncryptionContextType] = js.native
  
  /**
    * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.native
  
  /**
    * A unique identifier for the customer master key (CMK). To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var KeyId: KeyIdType = js.native
  
  /**
    * Data to be encrypted.
    */
  var Plaintext: PlaintextType = js.native
}
object EncryptRequest {
  
  @scala.inline
  def apply(KeyId: KeyIdType, Plaintext: PlaintextType): EncryptRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Plaintext = Plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptRequest]
  }
  
  @scala.inline
  implicit class EncryptRequestMutableBuilder[Self <: EncryptRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionAlgorithm(value: EncryptionAlgorithmSpec): Self = StObject.set(x, "EncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "EncryptionAlgorithm", js.undefined)
    
    @scala.inline
    def setEncryptionContext(value: EncryptionContextType): Self = StObject.set(x, "EncryptionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionContextUndefined: Self = StObject.set(x, "EncryptionContext", js.undefined)
    
    @scala.inline
    def setGrantTokens(value: GrantTokenList): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    @scala.inline
    def setGrantTokensVarargs(value: GrantTokenType*): Self = StObject.set(x, "GrantTokens", js.Array(value :_*))
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaintext(value: PlaintextType): Self = StObject.set(x, "Plaintext", value.asInstanceOf[js.Any])
  }
}
