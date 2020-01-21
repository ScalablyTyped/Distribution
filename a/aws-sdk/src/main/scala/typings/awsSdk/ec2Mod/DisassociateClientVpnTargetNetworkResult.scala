package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateClientVpnTargetNetworkResult extends js.Object {
  /**
    * The ID of the target network association.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The current state of the target network association.
    */
  var Status: js.UndefOr[AssociationStatus] = js.native
}

object DisassociateClientVpnTargetNetworkResult {
  @scala.inline
  def apply(AssociationId: String = null, Status: AssociationStatus = null): DisassociateClientVpnTargetNetworkResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateClientVpnTargetNetworkResult]
  }
}

