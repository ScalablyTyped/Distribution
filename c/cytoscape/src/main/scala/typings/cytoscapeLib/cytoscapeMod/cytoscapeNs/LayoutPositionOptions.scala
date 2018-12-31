package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/layout
  */
trait LayoutPositionOptions extends js.Object {
  // whether to animate changes to the layout
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  // duration of animation in ms, if enabled
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  // easing of animation, if enabled
  var animationEasing: js.UndefOr[scala.Double] = js.undefined
  // collection of elements involved in the layout; set by cy.layout() or eles.layout(s)
  var eles: CollectionArgument
  // whether to fit the viewport to the graph
  var fit: js.UndefOr[scala.Boolean] = js.undefined
  // padding to leave between graph and viewport
  var padding: js.UndefOr[scala.Double] = js.undefined
  // pan the graph to the provided position, given as { x, y }
  var pan: js.UndefOr[Position] = js.undefined
  // callback for the layoutready event
  var ready: js.UndefOr[scala.Nothing] = js.undefined
  // a positive value which adjusts spacing between nodes (>1 means greater than usual spacing)
  var spacingFactor: js.UndefOr[scala.Double] = js.undefined
  // callback for the layoutstop event
  var stop: js.UndefOr[scala.Nothing] = js.undefined
  // zoom level as a positive number to set after animation
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

