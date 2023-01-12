package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerContext
  extends StObject
     with ConnectedContext {
  
  /**
    * Defines whether this is a Connection-level object.
    * If not, the object is expected to be a child object underneath
    * one of the connections.
    */
  var isConnectionNode: Boolean
  
  /**
    * Node info for objects below a specific connection. This
    * may be null for a Connection-level object
    */
  var nodeInfo: js.UndefOr[NodeInfo] = js.undefined
}
object ObjectExplorerContext {
  
  inline def apply(isConnectionNode: Boolean): ObjectExplorerContext = {
    val __obj = js.Dynamic.literal(isConnectionNode = isConnectionNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectExplorerContext] (val x: Self) extends AnyVal {
    
    inline def setIsConnectionNode(value: Boolean): Self = StObject.set(x, "isConnectionNode", value.asInstanceOf[js.Any])
    
    inline def setNodeInfo(value: NodeInfo): Self = StObject.set(x, "nodeInfo", value.asInstanceOf[js.Any])
    
    inline def setNodeInfoUndefined: Self = StObject.set(x, "nodeInfo", js.undefined)
  }
}
