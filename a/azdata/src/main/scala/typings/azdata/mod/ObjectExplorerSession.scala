package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExplorerSession extends js.Object {
  var errorMessage: String
  var rootNode: NodeInfo
  var sessionId: String
  var success: Boolean
}

object ObjectExplorerSession {
  @scala.inline
  def apply(errorMessage: String, rootNode: NodeInfo, sessionId: String, success: Boolean): ObjectExplorerSession = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], rootNode = rootNode.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectExplorerSession]
  }
}

