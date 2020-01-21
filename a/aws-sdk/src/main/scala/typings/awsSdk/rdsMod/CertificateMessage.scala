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
  def apply(Certificates: CertificateList = null, Marker: String = null): CertificateMessage = {
    val __obj = js.Dynamic.literal()
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateMessage]
  }
}

