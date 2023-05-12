package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyRequest extends StObject {
  
  /**
    * <p>A list of grant tokens.</p>
    *          <p>Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved <i>eventual consistency</i>. For more information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant token</a> in the
    *     <i>Key Management Service Developer Guide</i>.</p>
    */
  var GrantTokens: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * <p>Identifies the asymmetric KMS key that will be used to verify the signature. This must be
    *       the same KMS key that was used to generate the signature. If you specify a different KMS key,
    *       the signature verification fails.</p>
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
    * <p>Specifies the message that was signed. You can submit a raw message of up to 4096 bytes,
    *       or a hash digest of the message. If you submit a digest, use the <code>MessageType</code> parameter
    *       with a value of <code>DIGEST</code>.</p>
    *          <p>If the message specified here is different from the message that was signed, the signature
    *       verification fails. A message and its hash digest are considered to be the same
    *       message.</p>
    */
  var Message: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>Tells KMS whether the value of the <code>Message</code> parameter should be hashed
    *       as part of the signing algorithm. Use <code>RAW</code> for unhashed messages; use <code>DIGEST</code>
    *       for message digests, which are already hashed.</p>
    *          <p>When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses the standard
    *       signing algorithm, which begins with a hash function. When the value is <code>DIGEST</code>, KMS
    *       skips the hashing step in the signing algorithm.</p>
    *          <important>
    *             <p>Use the <code>DIGEST</code> value only when the value of the <code>Message</code>
    *         parameter is a message digest. If you use the <code>DIGEST</code> value with an unhashed message,
    *         the security of the verification operation can be compromised.</p>
    *          </important>
    *          <p>When the value of <code>MessageType</code>is <code>DIGEST</code>, the length
    *     of the <code>Message</code> value must match the length of hashed messages for the specified signing algorithm.</p>
    *          <p>You can submit a message digest and omit the <code>MessageType</code> or specify
    *       <code>RAW</code> so the digest is hashed again while signing. However, if the signed message is hashed once
    *       while signing, but twice while verifying, verification fails, even when the message hasn't changed.</p>
    *          <p>The hashing algorithm in that <code>Verify</code> uses is based on the <code>SigningAlgorithm</code> value.</p>
    *          <ul>
    *             <li>
    *                <p>Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.</p>
    *             </li>
    *             <li>
    *                <p>Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.</p>
    *             </li>
    *             <li>
    *                <p>Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.</p>
    *             </li>
    *             <li>
    *                <p>SM2DSA uses the SM3 hashing algorithm. For details, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification">Offline verification with SM2 key pairs</a>.</p>
    *             </li>
    *          </ul>
    */
  var MessageType: js.UndefOr[typings.awsSdkClientKms.distTypesModelsModels0Mod.MessageType | String] = js.undefined
  
  /**
    * <p>The signature that the <code>Sign</code> operation generated.</p>
    */
  var Signature: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>The signing algorithm that was used to sign the message. If you submit a different
    *       algorithm, the signature verification fails.</p>
    */
  var SigningAlgorithm: js.UndefOr[SigningAlgorithmSpec | String] = js.undefined
}
object VerifyRequest {
  
  inline def apply(): VerifyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyRequest] (val x: Self) extends AnyVal {
    
    inline def setGrantTokens(value: js.Array[String]): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    inline def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    inline def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "GrantTokens", js.Array(value*))
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setMessage(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: MessageType | String): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
    
    inline def setSigningAlgorithm(value: SigningAlgorithmSpec | String): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithmUndefined: Self = StObject.set(x, "SigningAlgorithm", js.undefined)
  }
}
