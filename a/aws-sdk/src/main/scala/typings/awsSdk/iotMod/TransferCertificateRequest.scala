package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferCertificateRequest extends StObject {
  
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
  
  /**
    * The AWS account.
    */
  var targetAwsAccount: AwsAccountId = js.native
  
  /**
    * The transfer message.
    */
  var transferMessage: js.UndefOr[Message] = js.native
}
object TransferCertificateRequest {
  
  @scala.inline
  def apply(certificateId: CertificateId, targetAwsAccount: AwsAccountId): TransferCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any], targetAwsAccount = targetAwsAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferCertificateRequest]
  }
  
  @scala.inline
  implicit class TransferCertificateRequestMutableBuilder[Self <: TransferCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAwsAccount(value: AwsAccountId): Self = StObject.set(x, "targetAwsAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferMessage(value: Message): Self = StObject.set(x, "transferMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferMessageUndefined: Self = StObject.set(x, "transferMessage", js.undefined)
  }
}
