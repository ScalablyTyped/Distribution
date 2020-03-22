package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncreaseNodeGroupsInGlobalReplicationGroupResult extends js.Object {
  var GlobalReplicationGroup: js.UndefOr[typings.awsSdk.elasticacheMod.GlobalReplicationGroup] = js.native
}

object IncreaseNodeGroupsInGlobalReplicationGroupResult {
  @scala.inline
  def apply(GlobalReplicationGroup: GlobalReplicationGroup = null): IncreaseNodeGroupsInGlobalReplicationGroupResult = {
    val __obj = js.Dynamic.literal()
    if (GlobalReplicationGroup != null) __obj.updateDynamic("GlobalReplicationGroup")(GlobalReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseNodeGroupsInGlobalReplicationGroupResult]
  }
}

