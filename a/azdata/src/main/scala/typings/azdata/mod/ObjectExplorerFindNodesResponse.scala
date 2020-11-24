package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectExplorerFindNodesResponse extends js.Object {
  
  var nodes: js.Array[NodeInfo] = js.native
}
object ObjectExplorerFindNodesResponse {
  
  @scala.inline
  def apply(nodes: js.Array[NodeInfo]): ObjectExplorerFindNodesResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerFindNodesResponse]
  }
  
  @scala.inline
  implicit class ObjectExplorerFindNodesResponseOps[Self <: ObjectExplorerFindNodesResponse] (val x: Self) extends AnyVal {
    
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
    def setNodesVarargs(value: NodeInfo*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[NodeInfo]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
}
