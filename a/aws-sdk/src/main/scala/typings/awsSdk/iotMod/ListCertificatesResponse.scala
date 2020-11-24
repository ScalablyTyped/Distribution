package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCertificatesResponse extends js.Object {
  
  /**
    * The descriptions of the certificates.
    */
  var certificates: js.UndefOr[Certificates] = js.native
  
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
}
object ListCertificatesResponse {
  
  @scala.inline
  def apply(): ListCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesResponse]
  }
  
  @scala.inline
  implicit class ListCertificatesResponseOps[Self <: ListCertificatesResponse] (val x: Self) extends AnyVal {
    
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
    def setCertificatesVarargs(value: Certificate*): Self = this.set("certificates", js.Array(value :_*))
    
    @scala.inline
    def setCertificates(value: Certificates): Self = this.set("certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificates: Self = this.set("certificates", js.undefined)
    
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("nextMarker", js.undefined)
  }
}
