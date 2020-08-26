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
  def apply(Certificate: Certificate, FleetArn: FleetArn): AssociateWebsiteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebsiteCertificateAuthorityRequest]
  }
  @scala.inline
  implicit class AssociateWebsiteCertificateAuthorityRequestOps[Self <: AssociateWebsiteCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificate(value: Certificate): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFleetArn(value: FleetArn): Self = this.set("FleetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
  }
  
}

