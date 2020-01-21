package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(HsmClientCertificates: HsmClientCertificateList = null, Marker: String = null): HsmClientCertificateMessage = {
    val __obj = js.Dynamic.literal()
    if (HsmClientCertificates != null) __obj.updateDynamic("HsmClientCertificates")(HsmClientCertificates.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[HsmClientCertificateMessage]
  }
}

