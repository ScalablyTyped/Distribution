package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateMessage extends js.Object {
  /**
    * The list of Certificate objects for the AWS account.
    */
  var Certificates: js.UndefOr[CertificateList] = js.native
  /**
    *  An optional pagination token provided by a previous DescribeCertificates request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
    */
  var Marker: js.UndefOr[String] = js.native
}

object CertificateMessage {
  @scala.inline
  def apply(): CertificateMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateMessage]
  }
  @scala.inline
  implicit class CertificateMessageOps[Self <: CertificateMessage] (val x: Self) extends AnyVal {
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

