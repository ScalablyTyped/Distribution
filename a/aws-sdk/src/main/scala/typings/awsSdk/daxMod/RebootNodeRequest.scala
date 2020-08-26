package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootNodeRequest extends js.Object {
  /**
    * The name of the DAX cluster containing the node to be rebooted.
    */
  var ClusterName: String = js.native
  /**
    * The system-assigned ID of the node to be rebooted.
    */
  var NodeId: String = js.native
}

object RebootNodeRequest {
  @scala.inline
  def apply(ClusterName: String, NodeId: String): RebootNodeRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootNodeRequest]
  }
  @scala.inline
  implicit class RebootNodeRequestOps[Self <: RebootNodeRequest] (val x: Self) extends AnyVal {
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
    def setClusterName(value: String): Self = this.set("ClusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeId(value: String): Self = this.set("NodeId", value.asInstanceOf[js.Any])
  }
  
}

