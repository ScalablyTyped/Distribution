package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectExplorerContext extends ConnectedContext {
  /**
    * Defines whether this is a Connection-level object.
    * If not, the object is expected to be a child object underneath
    * one of the connections.
    */
  var isConnectionNode: Boolean = js.native
  /**
    * Node info for objects below a specific connection. This
    * may be null for a Connection-level object
    */
  var nodeInfo: NodeInfo = js.native
}

object ObjectExplorerContext {
  @scala.inline
  def apply(connectionProfile: IConnectionProfile, isConnectionNode: Boolean, nodeInfo: NodeInfo): ObjectExplorerContext = {
    val __obj = js.Dynamic.literal(connectionProfile = connectionProfile.asInstanceOf[js.Any], isConnectionNode = isConnectionNode.asInstanceOf[js.Any], nodeInfo = nodeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerContext]
  }
  @scala.inline
  implicit class ObjectExplorerContextOps[Self <: ObjectExplorerContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsConnectionNode(value: Boolean): Self = this.set("isConnectionNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeInfo(value: NodeInfo): Self = this.set("nodeInfo", value.asInstanceOf[js.Any])
  }
  
}

