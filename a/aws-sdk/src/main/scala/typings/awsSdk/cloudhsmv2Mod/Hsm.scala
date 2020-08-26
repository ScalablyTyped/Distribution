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
  def apply(HsmId: HsmId): Hsm = {
    val __obj = js.Dynamic.literal(HsmId = HsmId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hsm]
  }
  @scala.inline
  implicit class HsmOps[Self <: Hsm] (val x: Self) extends AnyVal {
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
    def setHsmId(value: HsmId): Self = this.set("HsmId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZone(value: ExternalAz): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterId: Self = this.set("ClusterId", js.undefined)
    @scala.inline
    def setEniId(value: EniId): Self = this.set("EniId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEniId: Self = this.set("EniId", js.undefined)
    @scala.inline
    def setEniIp(value: IpAddress): Self = this.set("EniIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEniIp: Self = this.set("EniIp", js.undefined)
    @scala.inline
    def setState(value: HsmState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStateMessage(value: String): Self = this.set("StateMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateMessage: Self = this.set("StateMessage", js.undefined)
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
  }
  
}

