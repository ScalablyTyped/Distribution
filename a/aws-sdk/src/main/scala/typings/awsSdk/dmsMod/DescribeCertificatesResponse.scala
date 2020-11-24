package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCertificatesResponse extends js.Object {
  
  /**
    * The Secure Sockets Layer (SSL) certificates associated with the replication instance.
    */
  var Certificates: js.UndefOr[CertificateList] = js.native
  
  /**
    * The pagination token.
    */
  var Marker: js.UndefOr[String] = js.native
}
object DescribeCertificatesResponse {
  
  @scala.inline
  def apply(): DescribeCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificatesResponse]
  }
  
  @scala.inline
  implicit class DescribeCertificatesResponseOps[Self <: DescribeCertificatesResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
