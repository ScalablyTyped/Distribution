package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyResponse extends StObject {
  
  /**
    * The Amazon Resource Name (key ARN) of the asymmetric CMK that was used to verify the signature.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  
  /**
    * A Boolean value that indicates whether the signature was verified. A value of True indicates that the Signature was produced by signing the Message with the specified KeyID and SigningAlgorithm. If the signature is not verified, the Verify operation fails with a KMSInvalidSignatureException exception. 
    */
  var SignatureValid: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The signing algorithm that was used to verify the signature.
    */
  var SigningAlgorithm: js.UndefOr[SigningAlgorithmSpec] = js.undefined
}
object VerifyResponse {
  
  @scala.inline
  def apply(): VerifyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyResponse]
  }
  
  @scala.inline
  implicit class VerifyResponseMutableBuilder[Self <: VerifyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    @scala.inline
    def setSignatureValid(value: BooleanType): Self = StObject.set(x, "SignatureValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureValidUndefined: Self = StObject.set(x, "SignatureValid", js.undefined)
    
    @scala.inline
    def setSigningAlgorithm(value: SigningAlgorithmSpec): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningAlgorithmUndefined: Self = StObject.set(x, "SigningAlgorithm", js.undefined)
  }
}
