package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateWebsiteCertificateAuthorityRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
  /**
    * A unique identifier for the CA.
    */
  var WebsiteCaId: Id = js.native
}

object DisassociateWebsiteCertificateAuthorityRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, WebsiteCaId: Id): DisassociateWebsiteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], WebsiteCaId = WebsiteCaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateWebsiteCertificateAuthorityRequest]
  }
}

