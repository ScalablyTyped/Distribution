package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateWebsiteCertificateAuthorityRequest extends js.Object {
  /**
    * The root certificate of the CA.
    */
  var Certificate: typings.awsSdk.worklinkMod.Certificate = js.native
  /**
    * The certificate name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
}

object AssociateWebsiteCertificateAuthorityRequest {
  @scala.inline
  def apply(Certificate: Certificate, FleetArn: FleetArn, DisplayName: DisplayName = null): AssociateWebsiteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebsiteCertificateAuthorityRequest]
  }
}

