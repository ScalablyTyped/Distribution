package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ObjectExplorerContextMutableBuilder[Self <: ObjectExplorerContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsConnectionNode(value: Boolean): Self = StObject.set(x, "isConnectionNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeInfo(value: NodeInfo): Self = StObject.set(x, "nodeInfo", value.asInstanceOf[js.Any])
  }
}
