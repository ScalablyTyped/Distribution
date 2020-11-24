package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCertificateRequest extends js.Object {
  
  /**
    * The name of the certificate to delete. Use the GetCertificates action to get a list of certificate names that you can specify.
    */
  var certificateName: CertificateName = js.native
}
object DeleteCertificateRequest {
  
  @scala.inline
  def apply(certificateName: CertificateName): DeleteCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCertificateRequest]
  }
  
  @scala.inline
  implicit class DeleteCertificateRequestOps[Self <: DeleteCertificateRequest] (val x: Self) extends AnyVal {
    
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
    def setCertificateName(value: CertificateName): Self = this.set("certificateName", value.asInstanceOf[js.Any])
  }
}
