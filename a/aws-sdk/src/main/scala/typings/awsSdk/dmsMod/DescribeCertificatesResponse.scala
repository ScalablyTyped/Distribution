package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(Certificates: CertificateList = null, Marker: String = null): DescribeCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCertificatesResponse]
  }
}

