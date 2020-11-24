package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferCertificateRequest extends js.Object {
  
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
  implicit class TransferCertificateRequestOps[Self <: TransferCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = this.set("certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAwsAccount(value: AwsAccountId): Self = this.set("targetAwsAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferMessage(value: Message): Self = this.set("transferMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferMessage: Self = this.set("transferMessage", js.undefined)
  }
}
