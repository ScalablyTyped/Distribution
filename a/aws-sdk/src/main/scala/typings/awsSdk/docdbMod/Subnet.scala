package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subnet extends js.Object {
  /**
    * Specifies the Availability Zone for the subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.native
  /**
    * Specifies the identifier of the subnet.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies the status of the subnet.
    */
  var SubnetStatus: js.UndefOr[String] = js.native
}

object Subnet {
  @scala.inline
  def apply(
    SubnetAvailabilityZone: AvailabilityZone = null,
    SubnetIdentifier: String = null,
    SubnetStatus: String = null
  ): Subnet = {
    val __obj = js.Dynamic.literal()
    if (SubnetAvailabilityZone != null) __obj.updateDynamic("SubnetAvailabilityZone")(SubnetAvailabilityZone.asInstanceOf[js.Any])
    if (SubnetIdentifier != null) __obj.updateDynamic("SubnetIdentifier")(SubnetIdentifier.asInstanceOf[js.Any])
    if (SubnetStatus != null) __obj.updateDynamic("SubnetStatus")(SubnetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subnet]
  }
}

