package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.`linear-gradient`
import typings.cytoscape.cytoscapeStrings.`radial-gradient`
import typings.cytoscape.cytoscapeStrings.`unbundled-bezier`
import typings.cytoscape.cytoscapeStrings.bezier
import typings.cytoscape.cytoscapeStrings.butt
import typings.cytoscape.cytoscapeStrings.haystack
import typings.cytoscape.cytoscapeStrings.round
import typings.cytoscape.cytoscapeStrings.segments
import typings.cytoscape.cytoscapeStrings.solid
import typings.cytoscape.cytoscapeStrings.square
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
  var `curve-style`: js.UndefOr[
    PropertyValueEdge[haystack | straight | bezier | `unbundled-bezier` | segments | taxi]
  ] = js.undefined
  /**
    * The cap of the edge's line.
    */
  var `line-cap`: js.UndefOr[PropertyValueEdge[butt | round | square]] = js.undefined
  /**
    * The colour of the edge’s line.
    */
  var `line-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  /**
    * The dashed line offset.
    */
  var `line-dash-offset`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  /**
    * The dashed line pattern which specifies alternating lengths of lines and gaps.
    */
  var `line-dash-pattern`: js.UndefOr[js.Array[PropertyValueEdge[Double]]] = js.undefined
  /**
    * The filling style of the edge's line.
    */
  var `line-fill`: js.UndefOr[PropertyValueEdge[solid | `linear-gradient` | `radial-gradient`]] = js.undefined
  /**
    * The style of the edge’s line.
    */
  var `line-style`: js.UndefOr[PropertyValueEdge[LineStyle]] = js.undefined
  /**
    * The distance the edge ends from its target.
    */
  var `target-distance-from-node`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  /**
    * The width of an edge’s line.
    */
  var width: js.UndefOr[PropertyValueEdge[Double | String]] = js.undefined
}

object EdgeLine {
  @scala.inline
  def apply(
    `curve-style`: PropertyValueEdge[haystack | straight | bezier | `unbundled-bezier` | segments | taxi] = null,
    `line-cap`: PropertyValueEdge[butt | round | square] = null,
    `line-color`: PropertyValueEdge[Colour] = null,
    `line-dash-offset`: PropertyValueEdge[Double] = null,
    `line-dash-pattern`: js.Array[PropertyValueEdge[Double]] = null,
    `line-fill`: PropertyValueEdge[solid | `linear-gradient` | `radial-gradient`] = null,
    `line-style`: PropertyValueEdge[LineStyle] = null,
    `target-distance-from-node`: PropertyValueEdge[Double] = null,
    width: PropertyValueEdge[Double | String] = null
  ): EdgeLine = {
    val __obj = js.Dynamic.literal()
    if (`curve-style` != null) __obj.updateDynamic("curve-style")(`curve-style`.asInstanceOf[js.Any])
    if (`line-cap` != null) __obj.updateDynamic("line-cap")(`line-cap`.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-dash-offset` != null) __obj.updateDynamic("line-dash-offset")(`line-dash-offset`.asInstanceOf[js.Any])
    if (`line-dash-pattern` != null) __obj.updateDynamic("line-dash-pattern")(`line-dash-pattern`.asInstanceOf[js.Any])
    if (`line-fill` != null) __obj.updateDynamic("line-fill")(`line-fill`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`target-distance-from-node` != null) __obj.updateDynamic("target-distance-from-node")(`target-distance-from-node`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeLine]
  }
}

