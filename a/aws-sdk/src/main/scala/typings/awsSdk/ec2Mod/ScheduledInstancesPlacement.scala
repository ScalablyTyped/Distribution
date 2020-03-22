package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesPlacement extends js.Object {
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The name of the placement group.
    */
  var GroupName: js.UndefOr[PlacementGroupName] = js.native
}

object ScheduledInstancesPlacement {
  @scala.inline
  def apply(AvailabilityZone: String = null, GroupName: PlacementGroupName = null): ScheduledInstancesPlacement = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledInstancesPlacement]
  }
}

