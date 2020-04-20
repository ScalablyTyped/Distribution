package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExplorerFindNodesResponse extends js.Object {
  var nodes: js.Array[NodeInfo]
}

object ObjectExplorerFindNodesResponse {
  @scala.inline
  def apply(nodes: js.Array[NodeInfo]): ObjectExplorerFindNodesResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerFindNodesResponse]
  }
}

