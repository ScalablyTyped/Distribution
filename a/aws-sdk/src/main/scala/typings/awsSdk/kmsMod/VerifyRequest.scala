package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyRequest extends js.Object {
  
  /**
    * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.native
  
  /**
    * Identifies the asymmetric CMK that will be used to verify the signature. This must be the same CMK that was used to generate the signature. If you specify a different CMK, the signature verification fails. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var KeyId: KeyIdType = js.native
  
  /**
    * Specifies the message that was signed. You can submit a raw message of up to 4096 bytes, or a hash digest of the message. If you submit a digest, use the MessageType parameter with a value of DIGEST. If the message specified here is different from the message that was signed, the signature verification fails. A message and its hash digest are considered to be the same message.
    */
  var Message: PlaintextType = js.native
  
  /**
    * Tells AWS KMS whether the value of the Message parameter is a message or message digest. The default value, RAW, indicates a message. To indicate a message digest, enter DIGEST.  Use the DIGEST value only when the value of the Message parameter is a message digest. If you use the DIGEST value with a raw message, the security of the verification operation can be compromised. 
    */
  var MessageType: js.UndefOr[typings.awsSdk.kmsMod.MessageType] = js.native
  
  /**
    * The signature that the Sign operation generated.
    */
  var Signature: CiphertextType = js.native
  
  /**
    * The signing algorithm that was used to sign the message. If you submit a different algorithm, the signature verification fails.
    */
  var SigningAlgorithm: SigningAlgorithmSpec = js.native
}
object VerifyRequest {
  
  @scala.inline
  def apply(
    KeyId: KeyIdType,
    Message: PlaintextType,
    Signature: CiphertextType,
    SigningAlgorithm: SigningAlgorithmSpec
  ): VerifyRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], SigningAlgorithm = SigningAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyRequest]
  }
  
  @scala.inline
  implicit class VerifyRequestOps[Self <: VerifyRequest] (val x: Self) extends AnyVal {
    
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
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: PlaintextType): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: CiphertextType): Self = this.set("Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningAlgorithm(value: SigningAlgorithmSpec): Self = this.set("SigningAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantTokensVarargs(value: GrantTokenType*): Self = this.set("GrantTokens", js.Array(value :_*))
    
    @scala.inline
    def setGrantTokens(value: GrantTokenList): Self = this.set("GrantTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantTokens: Self = this.set("GrantTokens", js.undefined)
    
    @scala.inline
    def setMessageType(value: MessageType): Self = this.set("MessageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageType: Self = this.set("MessageType", js.undefined)
  }
}
