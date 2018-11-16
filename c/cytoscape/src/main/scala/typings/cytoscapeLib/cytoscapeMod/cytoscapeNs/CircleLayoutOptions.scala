package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#layouts/circle
     */

trait CircleLayoutOptions extends ShapedLayoutOptions {
  // whether the layout should go clockwise (true) or counterclockwise/anticlockwise (false)
  var clockwise: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("name")
  var name_CircleLayoutOptions: cytoscapeLib.cytoscapeLibStrings.circle
  // the radius of the circle
  var radius: js.UndefOr[scala.Double] = js.undefined
  // where nodes start in radians, e.g. 3 / 2 * Math.PI,
  var startAngle: scala.Double
  // how many radians should be between the first and last node (defaults to full circle)
  var sweep: js.UndefOr[scala.Double] = js.undefined
}

