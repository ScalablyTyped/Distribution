package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmRequest extends js.Object {
  /**
    * The Availability Zone where you are creating the HSM. To find the cluster's Availability Zones, use DescribeClusters.
    */
  var AvailabilityZone: ExternalAz = js.native
  /**
    * The identifier (ID) of the HSM's cluster. To find the cluster ID, use DescribeClusters.
    */
  var ClusterId: typings.awsSdk.cloudhsmv2Mod.ClusterId = js.native
  /**
    * The HSM's IP address. If you specify an IP address, use an available address from the subnet that maps to the Availability Zone where you are creating the HSM. If you don't specify an IP address, one is chosen for you from that subnet.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.IpAddress] = js.native
}

object CreateHsmRequest {
  @scala.inline
  def apply(AvailabilityZone: ExternalAz, ClusterId: ClusterId, IpAddress: IpAddress = null): CreateHsmRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], ClusterId = ClusterId.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmRequest]
  }
}

