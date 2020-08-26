package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchDegreeCentralityNormalizedResultDirected extends js.Object {
  /** the normalised indegree centrality of the specified node */
  def indegree(node: NodeSingular): js.Any = js.native
  /** the normalised outdegree centrality of the specified node */
  def outdegree(node: NodeSingular): js.Any = js.native
}

object SearchDegreeCentralityNormalizedResultDirected {
  @scala.inline
  def apply(indegree: NodeSingular => js.Any, outdegree: NodeSingular => js.Any): SearchDegreeCentralityNormalizedResultDirected = {
    val __obj = js.Dynamic.literal(indegree = js.Any.fromFunction1(indegree), outdegree = js.Any.fromFunction1(outdegree))
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedResultDirected]
  }
  @scala.inline
  implicit class SearchDegreeCentralityNormalizedResultDirectedOps[Self <: SearchDegreeCentralityNormalizedResultDirected] (val x: Self) extends AnyVal {
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
    def setIndegree(value: NodeSingular => js.Any): Self = this.set("indegree", js.Any.fromFunction1(value))
    @scala.inline
    def setOutdegree(value: NodeSingular => js.Any): Self = this.set("outdegree", js.Any.fromFunction1(value))
  }
  
}

