package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#layouts/concentric
     */

trait ConcentricLayoutOptions extends ShapedLayoutOptions {
  // whether the layout should go clockwise (true) or counterclockwise/anticlockwise (false)
  var clockwise: js.UndefOr[scala.Boolean] = js.undefined
  // whether levels have an equal radial distance betwen them, may cause bounding box overflow
  var equidistant: cytoscapeLib.cytoscapeLibNumbers.`false`
   // min spacing between outside of nodes (used for radius adjustment)
  // height of layout area (overrides container height)
  var height: js.UndefOr[scala.Nothing]
  var minNodeSpacing: cytoscapeLib.cytoscapeLibNumbers.`10`
  @JSName("name")
  var name_ConcentricLayoutOptions: cytoscapeLib.cytoscapeLibStrings.concentric
  // Applies a multiplicative factor (>0) to expand or compress the overall area that the nodes take up
  @JSName("spacingFactor")
  var spacingFactor_ConcentricLayoutOptions: js.UndefOr[scala.Nothing]
  // where nodes start in radians, e.g. 3 / 2 * Math.PI,
  var startAngle: scala.Double
  // how many radians should be between the first and last node (defaults to full circle)
  var sweep: js.UndefOr[scala.Double] = js.undefined
  // width of layout area (overrides container width)
  var width: js.UndefOr[scala.Nothing]
  // returns numeric value for each node, placing higher nodes in levels towards the centre
  def concentric(node: cytoscapeLib.Anon_Degree): scala.Double
  // the variation of concentric values in each level
  def levelWidth(node: cytoscapeLib.Anon_MaxDegree): scala.Double
}

