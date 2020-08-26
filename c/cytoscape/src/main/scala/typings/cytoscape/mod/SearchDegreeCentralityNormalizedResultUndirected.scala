package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.degreeCentralityNormalized
  */
@js.native
trait SearchDegreeCentralityNormalizedResultUndirected extends js.Object {
  /** the normalised degree centrality of the specified node */
  def degree(node: NodeSingular): js.Any = js.native
}

object SearchDegreeCentralityNormalizedResultUndirected {
  @scala.inline
  def apply(degree: NodeSingular => js.Any): SearchDegreeCentralityNormalizedResultUndirected = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction1(degree))
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedResultUndirected]
  }
  @scala.inline
  implicit class SearchDegreeCentralityNormalizedResultUndirectedOps[Self <: SearchDegreeCentralityNormalizedResultUndirected] (val x: Self) extends AnyVal {
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
    def setDegree(value: NodeSingular => js.Any): Self = this.set("degree", js.Any.fromFunction1(value))
  }
  
}

