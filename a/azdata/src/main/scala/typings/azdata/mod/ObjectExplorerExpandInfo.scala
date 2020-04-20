package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExplorerExpandInfo extends js.Object {
  var errorMessage: String
  var nodePath: String
  var nodes: js.Array[NodeInfo]
  var sessionId: String
}

object ObjectExplorerExpandInfo {
  @scala.inline
  def apply(errorMessage: String, nodePath: String, nodes: js.Array[NodeInfo], sessionId: String): ObjectExplorerExpandInfo = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], nodePath = nodePath.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerExpandInfo]
  }
}

