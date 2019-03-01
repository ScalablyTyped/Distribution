package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.degreeCentrality
  */
trait SearchDegreeCentralityResultUndirected extends js.Object {
  /** the degree centrality of the root node */
  var degree: scala.Double
}

object SearchDegreeCentralityResultUndirected {
  @scala.inline
  def apply(degree: scala.Double): SearchDegreeCentralityResultUndirected = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("degree")(degree)
    __obj.asInstanceOf[SearchDegreeCentralityResultUndirected]
  }
}

