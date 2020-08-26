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
import typings.cytoscape.mod.EdgeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties affect the styling of an edge’s line:
  *
  * http://js.cytoscape.org/#style/edge-line
  */
@js.native
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
  ] = js.native
  /**
    * The cap of the edge's line.
    */
  var `line-cap`: js.UndefOr[PropertyValueEdge[butt | round | square]] = js.native
  /**
    * The colour of the edge’s line.
    */
  var `line-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  /**
    * The dashed line offset.
    */
  var `line-dash-offset`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  /**
    * The dashed line pattern which specifies alternating lengths of lines and gaps.
    */
  var `line-dash-pattern`: js.UndefOr[js.Array[PropertyValueEdge[Double]]] = js.native
  /**
    * The filling style of the edge's line.
    */
  var `line-fill`: js.UndefOr[PropertyValueEdge[solid | `linear-gradient` | `radial-gradient`]] = js.native
  /**
    * The style of the edge’s line.
    */
  var `line-style`: js.UndefOr[PropertyValueEdge[LineStyle]] = js.native
  /**
    * The distance the edge ends from its target.
    */
  var `target-distance-from-node`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  /**
    * The width of an edge’s line.
    */
  var width: js.UndefOr[PropertyValueEdge[Double | String]] = js.native
}

object EdgeLine {
  @scala.inline
  def apply(): EdgeLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeLine]
  }
  @scala.inline
  implicit class EdgeLineOps[Self <: EdgeLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setCurve-styleFunction1`(value: EdgeSingular => haystack | straight | bezier | `unbundled-bezier` | segments | taxi): Self = this.set("curve-style", js.Any.fromFunction1(value))
    @scala.inline
    def `setCurve-style`(value: PropertyValueEdge[haystack | straight | bezier | `unbundled-bezier` | segments | taxi]): Self = this.set("curve-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCurve-style`: Self = this.set("curve-style", js.undefined)
    @scala.inline
    def `setLine-capFunction1`(value: EdgeSingular => butt | round | square): Self = this.set("line-cap", js.Any.fromFunction1(value))
    @scala.inline
    def `setLine-cap`(value: PropertyValueEdge[butt | round | square]): Self = this.set("line-cap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-cap`: Self = this.set("line-cap", js.undefined)
    @scala.inline
    def `setLine-colorFunction1`(value: EdgeSingular => Colour): Self = this.set("line-color", js.Any.fromFunction1(value))
    @scala.inline
    def `setLine-color`(value: PropertyValueEdge[Colour]): Self = this.set("line-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-color`: Self = this.set("line-color", js.undefined)
    @scala.inline
    def `setLine-dash-offsetFunction1`(value: EdgeSingular => Double): Self = this.set("line-dash-offset", js.Any.fromFunction1(value))
    @scala.inline
    def `setLine-dash-offset`(value: PropertyValueEdge[Double]): Self = this.set("line-dash-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-dash-offset`: Self = this.set("line-dash-offset", js.undefined)
    @scala.inline
    def `setLine-dash-patternVarargs`(value: PropertyValueEdge[Double]*): Self = this.set("line-dash-pattern", js.Array(value :_*))
    @scala.inline
    def `setLine-dash-pattern`(value: js.Array[PropertyValueEdge[Double]]): Self = this.set("line-dash-pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-dash-pattern`: Self = this.set("line-dash-pattern", js.undefined)
    @scala.inline
    def `setLine-fillFunction1`(value: EdgeSingular => solid | `linear-gradient` | `radial-gradient`): Self = this.set("line-fill", js.Any.fromFunction1(value))
    @scala.inline
    def `setLine-fill`(value: PropertyValueEdge[solid | `linear-gradient` | `radial-gradient`]): Self = this.set("line-fill", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-fill`: Self = this.set("line-fill", js.undefined)
    @scala.inline
    def `setLine-styleFunction1`(value: EdgeSingular => LineStyle): Self = this.set("line-style", js.Any.fromFunction1(value))
    @scala.inline
    def `setLine-style`(value: PropertyValueEdge[LineStyle]): Self = this.set("line-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-style`: Self = this.set("line-style", js.undefined)
    @scala.inline
    def `setTarget-distance-from-nodeFunction1`(value: EdgeSingular => Double): Self = this.set("target-distance-from-node", js.Any.fromFunction1(value))
    @scala.inline
    def `setTarget-distance-from-node`(value: PropertyValueEdge[Double]): Self = this.set("target-distance-from-node", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTarget-distance-from-node`: Self = this.set("target-distance-from-node", js.undefined)
    @scala.inline
    def setWidthFunction1(value: EdgeSingular => Double | String): Self = this.set("width", js.Any.fromFunction1(value))
    @scala.inline
    def setWidth(value: PropertyValueEdge[Double | String]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

