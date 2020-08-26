package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecreaseNodeGroupsInGlobalReplicationGroupResult extends js.Object {
  var GlobalReplicationGroup: js.UndefOr[typings.awsSdk.elasticacheMod.GlobalReplicationGroup] = js.native
}

object DecreaseNodeGroupsInGlobalReplicationGroupResult {
  @scala.inline
  def apply(): DecreaseNodeGroupsInGlobalReplicationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecreaseNodeGroupsInGlobalReplicationGroupResult]
  }
  @scala.inline
  implicit class DecreaseNodeGroupsInGlobalReplicationGroupResultOps[Self <: DecreaseNodeGroupsInGlobalReplicationGroupResult] (val x: Self) extends AnyVal {
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
    def setGlobalReplicationGroup(value: GlobalReplicationGroup): Self = this.set("GlobalReplicationGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalReplicationGroup: Self = this.set("GlobalReplicationGroup", js.undefined)
  }
  
}

