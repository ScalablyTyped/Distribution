package typings.cytoscape.cytoscapeMod.Css

import typings.cytoscape.cytoscapeStrings.`unbundled-bezier`
import typings.cytoscape.cytoscapeStrings.bezier
import typings.cytoscape.cytoscapeStrings.haystack
import typings.cytoscape.cytoscapeStrings.segments
import typings.cytoscape.cytoscapeStrings.straight
import typings.cytoscape.cytoscapeStrings.taxi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties affect the styling of an edge’s line:
  *
  * http://js.cytoscape.org/#style/edge-line
  */
trait EdgeLine extends js.Object {
  /**
    * The curving method used to separate two or more edges between two nodes;
    * may be
    *  - haystack (default, very fast, bundled straight edges for which loops and compounds are unsupported),
    *  - bezier(bundled curved edges),
    *  - unbundled - bezier(curved edges for use with manual control points), or
    *  - segments (a series of straight lines).
    * Note that haystack edges work best with ellipse, rectangle, or similar nodes.
    * Smaller node shapes, like triangle, will not be as aesthetically pleasing.
    * Also note that edge arrows are unsupported for haystack edges.
    */
  var `curve-style`: js.UndefOr[haystack | straight | bezier | `unbundled-bezier` | segments | taxi] = js.undefined
  /**
    * The colour of the edge’s line.
    */
  var `line-color`: js.UndefOr[Colour] = js.undefined
  /**
    * The style of the edge’s line.
    */
  var `line-style`: js.UndefOr[LineStyle] = js.undefined
  /**
    * The width of an edge’s line.
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object EdgeLine {
  @scala.inline
  def apply(
    `curve-style`: haystack | straight | bezier | `unbundled-bezier` | segments | taxi = null,
    `line-color`: Colour = null,
    `line-style`: LineStyle = null,
    width: Double | String = null
  ): EdgeLine = {
    val __obj = js.Dynamic.literal()
    if (`curve-style` != null) __obj.updateDynamic("curve-style")(`curve-style`.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`)
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeLine]
  }
}

