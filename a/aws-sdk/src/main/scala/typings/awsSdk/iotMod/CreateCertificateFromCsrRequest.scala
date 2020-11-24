package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCertificateFromCsrRequest extends js.Object {
  
  /**
    * The certificate signing request (CSR).
    */
  var certificateSigningRequest: CertificateSigningRequest = js.native
  
  /**
    * Specifies whether the certificate is active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.native
}
object CreateCertificateFromCsrRequest {
  
  @scala.inline
  def apply(certificateSigningRequest: CertificateSigningRequest): CreateCertificateFromCsrRequest = {
    val __obj = js.Dynamic.literal(certificateSigningRequest = certificateSigningRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateFromCsrRequest]
  }
  
  @scala.inline
  implicit class CreateCertificateFromCsrRequestOps[Self <: CreateCertificateFromCsrRequest] (val x: Self) extends AnyVal {
    
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
    def setCertificateSigningRequest(value: CertificateSigningRequest): Self = this.set("certificateSigningRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsActive(value: SetAsActive): Self = this.set("setAsActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetAsActive: Self = this.set("setAsActive", js.undefined)
  }
}
