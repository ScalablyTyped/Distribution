package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterNode extends js.Object {
  /**
    * Whether the node is a leader node or a compute node.
    */
  var NodeRole: js.UndefOr[String] = js.native
  /**
    * The private IP address of a node within a cluster.
    */
  var PrivateIPAddress: js.UndefOr[String] = js.native
  /**
    * The public IP address of a node within a cluster.
    */
  var PublicIPAddress: js.UndefOr[String] = js.native
}

object ClusterNode {
  @scala.inline
  def apply(NodeRole: String = null, PrivateIPAddress: String = null, PublicIPAddress: String = null): ClusterNode = {
    val __obj = js.Dynamic.literal()
    if (NodeRole != null) __obj.updateDynamic("NodeRole")(NodeRole.asInstanceOf[js.Any])
    if (PrivateIPAddress != null) __obj.updateDynamic("PrivateIPAddress")(PrivateIPAddress.asInstanceOf[js.Any])
    if (PublicIPAddress != null) __obj.updateDynamic("PublicIPAddress")(PublicIPAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterNode]
  }
}

