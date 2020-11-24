package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HsmClientCertificateMessage extends js.Object {
  
  /**
    * A list of the identifiers for one or more HSM client certificates used by Amazon Redshift clusters to store and retrieve database encryption keys in an HSM.
    */
  var HsmClientCertificates: js.UndefOr[HsmClientCertificateList] = js.native
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object HsmClientCertificateMessage {
  
  @scala.inline
  def apply(): HsmClientCertificateMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HsmClientCertificateMessage]
  }
  
  @scala.inline
  implicit class HsmClientCertificateMessageOps[Self <: HsmClientCertificateMessage] (val x: Self) extends AnyVal {
    
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
    def setHsmClientCertificatesVarargs(value: HsmClientCertificate*): Self = this.set("HsmClientCertificates", js.Array(value :_*))
    
    @scala.inline
    def setHsmClientCertificates(value: HsmClientCertificateList): Self = this.set("HsmClientCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmClientCertificates: Self = this.set("HsmClientCertificates", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
