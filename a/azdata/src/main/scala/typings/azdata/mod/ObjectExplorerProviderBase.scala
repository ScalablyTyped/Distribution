package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerProviderBase
  extends StObject
     with DataProvider {
  
  def expandNode(nodeInfo: ExpandNodeInfo): Thenable[Boolean]
  
  def findNodes(findNodesInfo: FindNodesInfo): Thenable[ObjectExplorerFindNodesResponse]
  
  def refreshNode(nodeInfo: ExpandNodeInfo): Thenable[Boolean]
  
  /**
    * Registers a handler for ExpandCompleted events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnExpandCompleted(handler: js.Function1[/* response */ ObjectExplorerExpandInfo, Any]): Unit
}
object ObjectExplorerProviderBase {
  
  inline def apply(
    expandNode: ExpandNodeInfo => Thenable[Boolean],
    findNodes: FindNodesInfo => Thenable[ObjectExplorerFindNodesResponse],
    providerId: String,
    refreshNode: ExpandNodeInfo => Thenable[Boolean],
    registerOnExpandCompleted: js.Function1[/* response */ ObjectExplorerExpandInfo, Any] => Unit
  ): ObjectExplorerProviderBase = {
    val __obj = js.Dynamic.literal(expandNode = js.Any.fromFunction1(expandNode), findNodes = js.Any.fromFunction1(findNodes), providerId = providerId.asInstanceOf[js.Any], refreshNode = js.Any.fromFunction1(refreshNode), registerOnExpandCompleted = js.Any.fromFunction1(registerOnExpandCompleted))
    __obj.asInstanceOf[ObjectExplorerProviderBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectExplorerProviderBase] (val x: Self) extends AnyVal {
    
    inline def setExpandNode(value: ExpandNodeInfo => Thenable[Boolean]): Self = StObject.set(x, "expandNode", js.Any.fromFunction1(value))
    
    inline def setFindNodes(value: FindNodesInfo => Thenable[ObjectExplorerFindNodesResponse]): Self = StObject.set(x, "findNodes", js.Any.fromFunction1(value))
    
    inline def setRefreshNode(value: ExpandNodeInfo => Thenable[Boolean]): Self = StObject.set(x, "refreshNode", js.Any.fromFunction1(value))
    
    inline def setRegisterOnExpandCompleted(value: js.Function1[/* response */ ObjectExplorerExpandInfo, Any] => Unit): Self = StObject.set(x, "registerOnExpandCompleted", js.Any.fromFunction1(value))
  }
}
