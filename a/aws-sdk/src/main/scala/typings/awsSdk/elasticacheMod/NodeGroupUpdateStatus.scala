package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupUpdateStatus extends js.Object {
  /**
    * The ID of the node group
    */
  var NodeGroupId: js.UndefOr[String] = js.native
  /**
    * The status of the service update on the node group member
    */
  var NodeGroupMemberUpdateStatus: js.UndefOr[NodeGroupMemberUpdateStatusList] = js.native
}

object NodeGroupUpdateStatus {
  @scala.inline
  def apply(): NodeGroupUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupUpdateStatus]
  }
  @scala.inline
  implicit class NodeGroupUpdateStatusOps[Self <: NodeGroupUpdateStatus] (val x: Self) extends AnyVal {
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
    def setNodeGroupId(value: String): Self = this.set("NodeGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeGroupId: Self = this.set("NodeGroupId", js.undefined)
    @scala.inline
    def setNodeGroupMemberUpdateStatusVarargs(value: NodeGroupMemberUpdateStatus*): Self = this.set("NodeGroupMemberUpdateStatus", js.Array(value :_*))
    @scala.inline
    def setNodeGroupMemberUpdateStatus(value: NodeGroupMemberUpdateStatusList): Self = this.set("NodeGroupMemberUpdateStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeGroupMemberUpdateStatus: Self = this.set("NodeGroupMemberUpdateStatus", js.undefined)
  }
  
}

