package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (key ARN) of the asymmetric CMK that was used to verify the signature.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  
  /**
    * A Boolean value that indicates whether the signature was verified. A value of True indicates that the Signature was produced by signing the Message with the specified KeyID and SigningAlgorithm. If the signature is not verified, the Verify operation fails with a KMSInvalidSignatureException exception. 
    */
  var SignatureValid: js.UndefOr[BooleanType] = js.native
  
  /**
    * The signing algorithm that was used to verify the signature.
    */
  var SigningAlgorithm: js.UndefOr[SigningAlgorithmSpec] = js.native
}
object VerifyResponse {
  
  @scala.inline
  def apply(): VerifyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyResponse]
  }
  
  @scala.inline
  implicit class VerifyResponseOps[Self <: VerifyResponse] (val x: Self) extends AnyVal {
    
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
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    
    @scala.inline
    def setSignatureValid(value: BooleanType): Self = this.set("SignatureValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureValid: Self = this.set("SignatureValid", js.undefined)
    
    @scala.inline
    def setSigningAlgorithm(value: SigningAlgorithmSpec): Self = this.set("SigningAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningAlgorithm: Self = this.set("SigningAlgorithm", js.undefined)
  }
}
