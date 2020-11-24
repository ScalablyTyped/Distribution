package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCertificateResponse extends js.Object {
  
  /**
    * The Secure Sockets Layer (SSL) certificate.
    */
  var Certificate: js.UndefOr[typings.awsSdk.dmsMod.Certificate] = js.native
}
object DeleteCertificateResponse {
  
  @scala.inline
  def apply(): DeleteCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCertificateResponse]
  }
  
  @scala.inline
  implicit class DeleteCertificateResponseOps[Self <: DeleteCertificateResponse] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: Certificate): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("Certificate", js.undefined)
  }
}
