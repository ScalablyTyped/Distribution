package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddListenerCertificatesOutput extends js.Object {
  
  /**
    * Information about the certificates in the certificate list.
    */
  var Certificates: js.UndefOr[CertificateList] = js.native
}
object AddListenerCertificatesOutput {
  
  @scala.inline
  def apply(): AddListenerCertificatesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddListenerCertificatesOutput]
  }
  
  @scala.inline
  implicit class AddListenerCertificatesOutputOps[Self <: AddListenerCertificatesOutput] (val x: Self) extends AnyVal {
    
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
    def setCertificatesVarargs(value: Certificate*): Self = this.set("Certificates", js.Array(value :_*))
    
    @scala.inline
    def setCertificates(value: CertificateList): Self = this.set("Certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificates: Self = this.set("Certificates", js.undefined)
  }
}
