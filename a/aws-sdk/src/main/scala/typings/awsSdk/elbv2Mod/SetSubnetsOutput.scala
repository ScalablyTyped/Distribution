package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSubnetsOutput extends js.Object {
  /**
    * Information about the subnet and Availability Zone.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.elbv2Mod.AvailabilityZones] = js.native
}

object SetSubnetsOutput {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZones = null): SetSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSubnetsOutput]
  }
}

