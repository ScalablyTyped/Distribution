package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CACertificate extends js.Object {
  
  /**
    * The ARN of the CA certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  
  /**
    * The ID of the CA certificate.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  
  /**
    * The date the CA certificate was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  
  /**
    * The status of the CA certificate. The status value REGISTER_INACTIVE is deprecated and should not be used.
    */
  var status: js.UndefOr[CACertificateStatus] = js.native
}
object CACertificate {
  
  @scala.inline
  def apply(): CACertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CACertificate]
  }
  
  @scala.inline
  implicit class CACertificateOps[Self <: CACertificate] (val x: Self) extends AnyVal {
    
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
    def setCertificateArn(value: CertificateArn): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = this.set("certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateId: Self = this.set("certificateId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: DateType): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setStatus(value: CACertificateStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
