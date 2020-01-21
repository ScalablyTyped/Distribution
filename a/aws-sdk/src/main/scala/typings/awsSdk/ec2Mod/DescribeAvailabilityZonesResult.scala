package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAvailabilityZonesResult extends js.Object {
  /**
    * Information about the Availability Zones and Local Zones.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
}

object DescribeAvailabilityZonesResult {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZoneList = null): DescribeAvailabilityZonesResult = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAvailabilityZonesResult]
  }
}

