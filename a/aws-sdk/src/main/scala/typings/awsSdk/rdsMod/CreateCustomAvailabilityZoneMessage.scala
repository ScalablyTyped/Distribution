package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomAvailabilityZoneMessage extends js.Object {
  /**
    * The name of the custom Availability Zone (AZ).
    */
  var CustomAvailabilityZoneName: String = js.native
  /**
    * The ID of an existing virtual private network (VPN) between the Amazon RDS website and the VMware vSphere cluster.
    */
  var ExistingVpnId: js.UndefOr[String] = js.native
  /**
    * The name of a new VPN tunnel between the Amazon RDS website and the VMware vSphere cluster. Specify this parameter only if ExistingVpnId isn't specified.
    */
  var NewVpnTunnelName: js.UndefOr[String] = js.native
  /**
    * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic. Specify this parameter only if ExistingVpnId isn't specified.
    */
  var VpnTunnelOriginatorIP: js.UndefOr[String] = js.native
}

object CreateCustomAvailabilityZoneMessage {
  @scala.inline
  def apply(CustomAvailabilityZoneName: String): CreateCustomAvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal(CustomAvailabilityZoneName = CustomAvailabilityZoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomAvailabilityZoneMessage]
  }
  @scala.inline
  implicit class CreateCustomAvailabilityZoneMessageOps[Self <: CreateCustomAvailabilityZoneMessage] (val x: Self) extends AnyVal {
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
    def setCustomAvailabilityZoneName(value: String): Self = this.set("CustomAvailabilityZoneName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExistingVpnId(value: String): Self = this.set("ExistingVpnId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExistingVpnId: Self = this.set("ExistingVpnId", js.undefined)
    @scala.inline
    def setNewVpnTunnelName(value: String): Self = this.set("NewVpnTunnelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewVpnTunnelName: Self = this.set("NewVpnTunnelName", js.undefined)
    @scala.inline
    def setVpnTunnelOriginatorIP(value: String): Self = this.set("VpnTunnelOriginatorIP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnTunnelOriginatorIP: Self = this.set("VpnTunnelOriginatorIP", js.undefined)
  }
  
}

