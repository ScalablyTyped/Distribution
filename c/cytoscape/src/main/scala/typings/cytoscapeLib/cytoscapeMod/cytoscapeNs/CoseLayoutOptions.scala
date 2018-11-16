package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#layouts/cose
     */

trait CoseLayoutOptions extends ShapedLayoutOptions {
  // Extra spacing between components in non-compound graphs
  var componentSpacing: scala.Double
  // Cooling factor (how the temperature is reduced between consecutive iterations
  var coolingFactor: scala.Double
  // Gravity force (constant)
  var gravity: scala.Double
  // Initial temperature (maximum node displacement)
  var initialTemp: scala.Double
  // Lower temperature threshold (below this point the layout will end)
  var minTemp: scala.Double
  @JSName("name")
  var name_CoseLayoutOptions: cytoscapeLib.cytoscapeLibStrings.cose
  // Nesting factor (multiplier) to compute ideal edge length for nested edges
  var nestingFactor: scala.Double
  // Node repulsion (overlapping) multiplier
  var nodeOverlap: scala.Double
  // Maximum number of iterations to perform
  var numIter: scala.Double
  // Randomize the initial positions of the nodes (true) or use existing positions (false)
  var randomize: scala.Boolean
  // Number of iterations between consecutive screen positions update
  // (0 -> only updated on the end)
  var refresh: scala.Double
  // Pass a reference to weaver to use threads for calculations
  var weaver: scala.Boolean
  // Divisor to compute edge forces
  def edgeElasticity(edge: js.Any): scala.Double
  // Ideal edge (non nested) length
  def idealEdgeLength(edge: js.Any): scala.Double
  // Node repulsion (non overlapping) multiplier
  def nodeRepulsion(node: js.Any): scala.Double
}

