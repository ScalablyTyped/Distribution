package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFirstResult extends js.Object {
  /**
    * The node found by the search
    * - If no node was found, then found is empty.
    * - If your handler function returns false, then the only the path up to that point is returned.
    */
  var found: NodeCollection
  /**
    * The path of the search.
    * - The path returned includes edges such that if path[i] is a node, then path[i - 1] is the edge used to get to that node.
    */
  var path: CollectionArgument
}

object SearchFirstResult {
  @scala.inline
  def apply(found: NodeCollection, path: CollectionArgument): SearchFirstResult = {
    val __obj = js.Dynamic.literal(found = found, path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchFirstResult]
  }
}

