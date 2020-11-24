package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCertificateResult extends js.Object {
  
  /**
    * Information about the certificate, including registered date time, certificate state, the reason for the state, expiration date time, and certificate common name.
    */
  var Certificate: js.UndefOr[typings.awsSdk.directoryserviceMod.Certificate] = js.native
}
object DescribeCertificateResult {
  
  @scala.inline
  def apply(): DescribeCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateResult]
  }
  
  @scala.inline
  implicit class DescribeCertificateResultOps[Self <: DescribeCertificateResult] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: Certificate): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("Certificate", js.undefined)
  }
}
