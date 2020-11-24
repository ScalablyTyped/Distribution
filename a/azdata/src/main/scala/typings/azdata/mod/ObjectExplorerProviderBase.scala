package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectExplorerProviderBase extends DataProvider {
  
  def expandNode(nodeInfo: ExpandNodeInfo): Thenable[Boolean] = js.native
  
  def findNodes(findNodesInfo: FindNodesInfo): Thenable[ObjectExplorerFindNodesResponse] = js.native
  
  def refreshNode(nodeInfo: ExpandNodeInfo): Thenable[Boolean] = js.native
  
  def registerOnExpandCompleted(handler: js.Function1[/* response */ ObjectExplorerExpandInfo, _]): Unit = js.native
}
object ObjectExplorerProviderBase {
  
  @scala.inline
  def apply(
    expandNode: ExpandNodeInfo => Thenable[Boolean],
    findNodes: FindNodesInfo => Thenable[ObjectExplorerFindNodesResponse],
    providerId: String,
    refreshNode: ExpandNodeInfo => Thenable[Boolean],
    registerOnExpandCompleted: js.Function1[/* response */ ObjectExplorerExpandInfo, _] => Unit
  ): ObjectExplorerProviderBase = {
    val __obj = js.Dynamic.literal(expandNode = js.Any.fromFunction1(expandNode), findNodes = js.Any.fromFunction1(findNodes), providerId = providerId.asInstanceOf[js.Any], refreshNode = js.Any.fromFunction1(refreshNode), registerOnExpandCompleted = js.Any.fromFunction1(registerOnExpandCompleted))
    __obj.asInstanceOf[ObjectExplorerProviderBase]
  }
  
  @scala.inline
  implicit class ObjectExplorerProviderBaseOps[Self <: ObjectExplorerProviderBase] (val x: Self) extends AnyVal {
    
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
    def setExpandNode(value: ExpandNodeInfo => Thenable[Boolean]): Self = this.set("expandNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindNodes(value: FindNodesInfo => Thenable[ObjectExplorerFindNodesResponse]): Self = this.set("findNodes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefreshNode(value: ExpandNodeInfo => Thenable[Boolean]): Self = this.set("refreshNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterOnExpandCompleted(value: js.Function1[/* response */ ObjectExplorerExpandInfo, _] => Unit): Self = this.set("registerOnExpandCompleted", js.Any.fromFunction1(value))
  }
}
