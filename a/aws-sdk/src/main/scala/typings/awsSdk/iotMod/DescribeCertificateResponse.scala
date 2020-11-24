package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCertificateResponse extends js.Object {
  
  /**
    * The description of the certificate.
    */
  var certificateDescription: js.UndefOr[CertificateDescription] = js.native
}
object DescribeCertificateResponse {
  
  @scala.inline
  def apply(): DescribeCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateResponse]
  }
  
  @scala.inline
  implicit class DescribeCertificateResponseOps[Self <: DescribeCertificateResponse] (val x: Self) extends AnyVal {
    
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
    def setCertificateDescription(value: CertificateDescription): Self = this.set("certificateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateDescription: Self = this.set("certificateDescription", js.undefined)
  }
}
