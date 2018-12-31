package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Haystack edges
  * Loop edges and compound parent nodes are not supported by haystack edges.
  * Haystack edges are a more performant replacement for plain, straight line edges.
  *
  * For fast, straight line edges (curve - style: haystack):
  * http://js.cytoscape.org/#style/haystack-edges
  */
trait HaystackEdges extends js.Object {
  /**
    * A value between 0 and 1 inclusive that indicates the relative radius used to position haystack edges on their connected nodes.
    * The outside of the node is at 1, and the centre of the node is at 0.
    */
  var `haystack-radius`: scala.Double
}

