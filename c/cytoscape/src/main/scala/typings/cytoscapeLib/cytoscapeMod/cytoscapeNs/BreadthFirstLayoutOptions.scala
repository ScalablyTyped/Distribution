package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/breadthfirst
  */
trait BreadthFirstLayoutOptions extends ShapedLayoutOptions {
  // put depths in concentric circles if true, put depths top down if false
  var circle: scala.Boolean
  // whether the tree is directed downwards (or edges can point in any direction if false)
  var directed: scala.Boolean
  // how many times to try to position the nodes in a maximal way (i.e. no backtracking)
  var maximalAdjustments: scala.Double
  @JSName("name")
  var name_BreadthFirstLayoutOptions: cytoscapeLib.cytoscapeLibStrings.breadthfirst
  // the roots of the trees
  var roots: js.UndefOr[java.lang.String] = js.undefined
}

