package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateClientVpnTargetNetworkResult extends js.Object {
  /**
    * The unique ID of the target network association.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The current state of the target network association.
    */
  var Status: js.UndefOr[AssociationStatus] = js.native
}

object AssociateClientVpnTargetNetworkResult {
  @scala.inline
  def apply(): AssociateClientVpnTargetNetworkResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateClientVpnTargetNetworkResult]
  }
  @scala.inline
  implicit class AssociateClientVpnTargetNetworkResultOps[Self <: AssociateClientVpnTargetNetworkResult] (val x: Self) extends AnyVal {
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
    def setAssociationId(value: String): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    @scala.inline
    def setStatus(value: AssociationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

