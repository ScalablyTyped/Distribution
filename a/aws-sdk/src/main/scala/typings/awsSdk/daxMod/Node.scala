package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  /**
    * The Availability Zone (AZ) in which the node has been deployed.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The endpoint for the node, consisting of a DNS name and a port number. Client applications can connect directly to a node endpoint, if desired (as an alternative to allowing DAX client software to intelligently route requests and responses to nodes in the DAX cluster.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.daxMod.Endpoint] = js.native
  /**
    * The date and time (in UNIX epoch format) when the node was launched.
    */
  var NodeCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * A system-generated identifier for the node.
    */
  var NodeId: js.UndefOr[String] = js.native
  /**
    * The current status of the node. For example: available.
    */
  var NodeStatus: js.UndefOr[String] = js.native
  /**
    * The status of the parameter group associated with this node. For example, in-sync.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.native
}

object Node {
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setEndpoint(value: Endpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    @scala.inline
    def setNodeCreateTime(value: TStamp): Self = this.set("NodeCreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeCreateTime: Self = this.set("NodeCreateTime", js.undefined)
    @scala.inline
    def setNodeId(value: String): Self = this.set("NodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeId: Self = this.set("NodeId", js.undefined)
    @scala.inline
    def setNodeStatus(value: String): Self = this.set("NodeStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeStatus: Self = this.set("NodeStatus", js.undefined)
    @scala.inline
    def setParameterGroupStatus(value: String): Self = this.set("ParameterGroupStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterGroupStatus: Self = this.set("ParameterGroupStatus", js.undefined)
  }
  
}

