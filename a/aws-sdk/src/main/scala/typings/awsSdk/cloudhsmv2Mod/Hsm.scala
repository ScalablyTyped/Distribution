package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hsm extends js.Object {
  /**
    * The Availability Zone that contains the HSM.
    */
  var AvailabilityZone: js.UndefOr[ExternalAz] = js.native
  /**
    * The identifier (ID) of the cluster that contains the HSM.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.ClusterId] = js.native
  /**
    * The identifier (ID) of the HSM's elastic network interface (ENI).
    */
  var EniId: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.EniId] = js.native
  /**
    * The IP address of the HSM's elastic network interface (ENI).
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  /**
    * The HSM's identifier (ID).
    */
  var HsmId: typings.awsSdk.cloudhsmv2Mod.HsmId = js.native
  /**
    * The HSM's state.
    */
  var State: js.UndefOr[HsmState] = js.native
  /**
    * A description of the HSM's state.
    */
  var StateMessage: js.UndefOr[String] = js.native
  /**
    * The subnet that contains the HSM's elastic network interface (ENI).
    */
  var SubnetId: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.SubnetId] = js.native
}

object Hsm {
  @scala.inline
  def apply(
    HsmId: HsmId,
    AvailabilityZone: ExternalAz = null,
    ClusterId: ClusterId = null,
    EniId: EniId = null,
    EniIp: IpAddress = null,
    State: HsmState = null,
    StateMessage: String = null,
    SubnetId: SubnetId = null
  ): Hsm = {
    val __obj = js.Dynamic.literal(HsmId = HsmId.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId.asInstanceOf[js.Any])
    if (EniId != null) __obj.updateDynamic("EniId")(EniId.asInstanceOf[js.Any])
    if (EniIp != null) __obj.updateDynamic("EniIp")(EniIp.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateMessage != null) __obj.updateDynamic("StateMessage")(StateMessage.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hsm]
  }
}

