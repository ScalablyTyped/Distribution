package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExplorerContext extends ConnectedContext {
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
  var nodeInfo: NodeInfo
}

object ObjectExplorerContext {
  @scala.inline
  def apply(connectionProfile: IConnectionProfile, isConnectionNode: Boolean, nodeInfo: NodeInfo): ObjectExplorerContext = {
    val __obj = js.Dynamic.literal(connectionProfile = connectionProfile.asInstanceOf[js.Any], isConnectionNode = isConnectionNode.asInstanceOf[js.Any], nodeInfo = nodeInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectExplorerContext]
  }
}

