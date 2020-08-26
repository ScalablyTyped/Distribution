package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectExplorerExpandInfo extends js.Object {
  var errorMessage: String = js.native
  var nodePath: String = js.native
  var nodes: js.Array[NodeInfo] = js.native
  var sessionId: String = js.native
}

object ObjectExplorerExpandInfo {
  @scala.inline
  def apply(errorMessage: String, nodePath: String, nodes: js.Array[NodeInfo], sessionId: String): ObjectExplorerExpandInfo = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], nodePath = nodePath.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerExpandInfo]
  }
  @scala.inline
  implicit class ObjectExplorerExpandInfoOps[Self <: ObjectExplorerExpandInfo] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodePath(value: String): Self = this.set("nodePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: NodeInfo*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[NodeInfo]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
  }
  
}

