package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerCertificateSummary extends js.Object {
  
  /**
    * The ARN of the server certificate.
    */
  var serverCertificateArn: js.UndefOr[AcmCertificateArn] = js.native
  
  /**
    * The status of the server certificate.
    */
  var serverCertificateStatus: js.UndefOr[ServerCertificateStatus] = js.native
  
  /**
    * Details that explain the status of the server certificate.
    */
  var serverCertificateStatusDetail: js.UndefOr[ServerCertificateStatusDetail] = js.native
}
object ServerCertificateSummary {
  
  @scala.inline
  def apply(): ServerCertificateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerCertificateSummary]
  }
  
  @scala.inline
  implicit class ServerCertificateSummaryOps[Self <: ServerCertificateSummary] (val x: Self) extends AnyVal {
    
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
    def setServerCertificateArn(value: AcmCertificateArn): Self = this.set("serverCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerCertificateArn: Self = this.set("serverCertificateArn", js.undefined)
    
    @scala.inline
    def setServerCertificateStatus(value: ServerCertificateStatus): Self = this.set("serverCertificateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerCertificateStatus: Self = this.set("serverCertificateStatus", js.undefined)
    
    @scala.inline
    def setServerCertificateStatusDetail(value: ServerCertificateStatusDetail): Self = this.set("serverCertificateStatusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerCertificateStatusDetail: Self = this.set("serverCertificateStatusDetail", js.undefined)
  }
}
