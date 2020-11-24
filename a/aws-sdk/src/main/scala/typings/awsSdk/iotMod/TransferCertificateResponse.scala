package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferCertificateResponse extends js.Object {
  
  /**
    * The ARN of the certificate.
    */
  var transferredCertificateArn: js.UndefOr[CertificateArn] = js.native
}
object TransferCertificateResponse {
  
  @scala.inline
  def apply(): TransferCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferCertificateResponse]
  }
  
  @scala.inline
  implicit class TransferCertificateResponseOps[Self <: TransferCertificateResponse] (val x: Self) extends AnyVal {
    
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
    def setTransferredCertificateArn(value: CertificateArn): Self = this.set("transferredCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferredCertificateArn: Self = this.set("transferredCertificateArn", js.undefined)
  }
}
