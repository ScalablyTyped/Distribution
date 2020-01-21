package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateMessage extends js.Object {
  /**
    * A list of certificates for this AWS account.
    */
  var Certificates: js.UndefOr[CertificateList] = js.native
  /**
    * An optional pagination token provided if the number of records retrieved is greater than MaxRecords. If this parameter is specified, the marker specifies the next record in the list. Including the value of Marker in the next call to DescribeCertificates results in the next page of certificates.
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

