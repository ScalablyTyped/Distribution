package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subnet extends js.Object {
  /**
    * The Availability Zone associated with the subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.native
  /**
    * The unique identifier for the subnet.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.native
}

object Subnet {
  @scala.inline
  def apply(SubnetAvailabilityZone: AvailabilityZone = null, SubnetIdentifier: String = null): Subnet = {
    val __obj = js.Dynamic.literal()
    if (SubnetAvailabilityZone != null) __obj.updateDynamic("SubnetAvailabilityZone")(SubnetAvailabilityZone.asInstanceOf[js.Any])
    if (SubnetIdentifier != null) __obj.updateDynamic("SubnetIdentifier")(SubnetIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subnet]
  }
}

