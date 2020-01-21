package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(certificates: CACertificates = null, nextMarker: Marker = null): ListCACertificatesResponse = {
    val __obj = js.Dynamic.literal()
    if (certificates != null) __obj.updateDynamic("certificates")(certificates.asInstanceOf[js.Any])
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCACertificatesResponse]
  }
}

