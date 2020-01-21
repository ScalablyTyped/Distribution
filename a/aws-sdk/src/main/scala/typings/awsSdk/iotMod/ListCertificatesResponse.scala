package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(certificates: Certificates = null, nextMarker: Marker = null): ListCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    if (certificates != null) __obj.updateDynamic("certificates")(certificates.asInstanceOf[js.Any])
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCertificatesResponse]
  }
}

