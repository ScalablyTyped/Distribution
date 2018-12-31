package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/grid
  */
trait GridLayoutOptions extends ShapedLayoutOptions {
  // extra spacing around nodes when avoidOverlap: true
  var avoidOverlapPadding: js.UndefOr[scala.Double] = js.undefined
  // force num of columns in the grid
  var cols: js.UndefOr[scala.Double] = js.undefined
  // uses all available space on false, uses minimal space on true
  var condense: scala.Boolean
  @JSName("name")
  var name_GridLayoutOptions: cytoscapeLib.cytoscapeLibStrings.grid
  // force num of rows in the grid
  var rows: js.UndefOr[scala.Double] = js.undefined
  // returns { row, col } for element
  def position(nodeid: java.lang.String): cytoscapeLib.Anon_Col
}

