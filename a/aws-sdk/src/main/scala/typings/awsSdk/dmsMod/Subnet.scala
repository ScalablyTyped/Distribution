package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subnet extends js.Object {
  /**
    * The Availability Zone of the subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.native
  /**
    * The subnet identifier.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.native
  /**
    * The status of the subnet.
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

