package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFirstResult extends js.Object {
  /**
    * The node found by the search
    * - If no node was found, then found is empty.
    * - If your handler function returns false, then the only the path up to that point is returned.
    */
  var found: NodeCollection = js.native
  /**
    * The path of the search.
    * - The path returned includes edges such that if path[i] is a node, then path[i - 1] is the edge used to get to that node.
    */
  var path: CollectionArgument = js.native
}

object SearchFirstResult {
  @scala.inline
  def apply(found: NodeCollection, path: CollectionArgument): SearchFirstResult = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFirstResult]
  }
  @scala.inline
  implicit class SearchFirstResultOps[Self <: SearchFirstResult] (val x: Self) extends AnyVal {
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
    def setFound(value: NodeCollection): Self = this.set("found", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: CollectionArgument): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

