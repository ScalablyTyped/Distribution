package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCACertificatesResponse extends js.Object {
  
  /**
    * The CA certificates registered in your AWS account.
    */
  var certificates: js.UndefOr[CACertificates] = js.native
  
  /**
    * The current position within the list of CA certificates.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
}
object ListCACertificatesResponse {
  
  @scala.inline
  def apply(): ListCACertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCACertificatesResponse]
  }
  
  @scala.inline
  implicit class ListCACertificatesResponseOps[Self <: ListCACertificatesResponse] (val x: Self) extends AnyVal {
    
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
    def setCertificatesVarargs(value: CACertificate*): Self = this.set("certificates", js.Array(value :_*))
    
    @scala.inline
    def setCertificates(value: CACertificates): Self = this.set("certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificates: Self = this.set("certificates", js.undefined)
    
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("nextMarker", js.undefined)
  }
}
