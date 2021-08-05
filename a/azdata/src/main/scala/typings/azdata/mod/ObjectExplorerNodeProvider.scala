package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerNodeProvider
  extends StObject
     with ObjectExplorerProviderBase {
  
  /**
    * Optional group name used to sort nodes in the tree. If not defined, the node order will be added in order based on provider ID, with
    * nodes from the main ObjectExplorerProvider for this provider type added first
    */
  val group: js.UndefOr[String] = js.undefined
  
  def handleSessionClose(closeSessionInfo: ObjectExplorerCloseSessionInfo): Unit
  
  def handleSessionOpen(session: ObjectExplorerSession): Thenable[Boolean]
  
  /**
    * The providerId for whichever type of ObjectExplorer connection this can add folders and objects to
    */
  val supportedProviderId: String
}
object ObjectExplorerNodeProvider {
  
  inline def apply(
    expandNode: ExpandNodeInfo => Thenable[Boolean],
    findNodes: FindNodesInfo => Thenable[ObjectExplorerFindNodesResponse],
    handleSessionClose: ObjectExplorerCloseSessionInfo => Unit,
    handleSessionOpen: ObjectExplorerSession => Thenable[Boolean],
    providerId: String,
    refreshNode: ExpandNodeInfo => Thenable[Boolean],
    registerOnExpandCompleted: js.Function1[/* response */ ObjectExplorerExpandInfo, js.Any] => Unit,
    supportedProviderId: String
  ): ObjectExplorerNodeProvider = {
    val __obj = js.Dynamic.literal(expandNode = js.Any.fromFunction1(expandNode), findNodes = js.Any.fromFunction1(findNodes), handleSessionClose = js.Any.fromFunction1(handleSessionClose), handleSessionOpen = js.Any.fromFunction1(handleSessionOpen), providerId = providerId.asInstanceOf[js.Any], refreshNode = js.Any.fromFunction1(refreshNode), registerOnExpandCompleted = js.Any.fromFunction1(registerOnExpandCompleted), supportedProviderId = supportedProviderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerNodeProvider]
  }
  
  extension [Self <: ObjectExplorerNodeProvider](x: Self) {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHandleSessionClose(value: ObjectExplorerCloseSessionInfo => Unit): Self = StObject.set(x, "handleSessionClose", js.Any.fromFunction1(value))
    
    inline def setHandleSessionOpen(value: ObjectExplorerSession => Thenable[Boolean]): Self = StObject.set(x, "handleSessionOpen", js.Any.fromFunction1(value))
    
    inline def setSupportedProviderId(value: String): Self = StObject.set(x, "supportedProviderId", value.asInstanceOf[js.Any])
  }
}
