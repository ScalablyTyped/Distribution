package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementGroup extends js.Object {
  /**
    * The ID of the placement group.
    */
  var GroupId: js.UndefOr[String] = js.native
  /**
    * The name of the placement group.
    */
  var GroupName: js.UndefOr[String] = js.native
  /**
    * The number of partitions. Valid only if strategy is set to partition.
    */
  var PartitionCount: js.UndefOr[Integer] = js.native
  /**
    * The state of the placement group.
    */
  var State: js.UndefOr[PlacementGroupState] = js.native
  /**
    * The placement strategy.
    */
  var Strategy: js.UndefOr[PlacementStrategy] = js.native
  /**
    * Any tags applied to the placement group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object PlacementGroup {
  @scala.inline
  def apply(
    GroupId: String = null,
    GroupName: String = null,
    PartitionCount: js.UndefOr[Integer] = js.undefined,
    State: PlacementGroupState = null,
    Strategy: PlacementStrategy = null,
    Tags: TagList = null
  ): PlacementGroup = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(PartitionCount)) __obj.updateDynamic("PartitionCount")(PartitionCount.get.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Strategy != null) __obj.updateDynamic("Strategy")(Strategy.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementGroup]
  }
}

