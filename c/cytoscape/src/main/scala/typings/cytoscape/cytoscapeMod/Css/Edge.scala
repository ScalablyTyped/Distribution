package typings.cytoscape.cytoscapeMod.Css

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

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof cytoscape.cytoscape.Css.Gradient ]:? cytoscape.cytoscape.Css.Gradient[P]}
- Dropped {[ P in keyof cytoscape.cytoscape.Css.Overlay ]:? cytoscape.cytoscape.Css.Overlay[P]}
- Dropped {[ P in keyof cytoscape.cytoscape.Css.BezierEdges ]:? cytoscape.cytoscape.Css.BezierEdges[P]}
- Dropped {[ P in keyof cytoscape.cytoscape.Css.UnbundledBezierEdges ]:? cytoscape.cytoscape.Css.UnbundledBezierEdges[P]}
- Dropped {[ P in keyof cytoscape.cytoscape.Css.HaystackEdges ]:? cytoscape.cytoscape.Css.HaystackEdges[P]}
- Dropped {[ P in keyof cytoscape.cytoscape.Css.SegmentsEdges ]:? cytoscape.cytoscape.Css.SegmentsEdges[P]}
- Dropped {[ P in keyof cytoscape.cytoscape.Css.Visibility<cytoscape.cytoscape.EdgeSingular> ]:? cytoscape.cytoscape.Css.Visibility<cytoscape.cytoscape.EdgeSingular>[P]}
- Dropped {[ P in keyof cytoscape.cytoscape.Css.Labels<cytoscape.cytoscape.EdgeSingular> ]:? cytoscape.cytoscape.Css.Labels<cytoscape.cytoscape.EdgeSingular>[P]} */ trait Edge
  extends EdgeLine
     with EdgeArrow

object Edge {
  @scala.inline
  def apply(
    `curve-style`: PropertyValueEdge[haystack | straight | bezier | `unbundled-bezier` | segments | taxi] = null,
    `line-cap`: PropertyValueEdge[butt | round | square] = null,
    `line-color`: PropertyValueEdge[Colour] = null,
    `line-dash-offset`: PropertyValueEdge[Double] = null,
    `line-dash-pattern`: js.Array[PropertyValueEdge[Double]] = null,
    `line-fill`: PropertyValueEdge[solid | `linear-gradient` | `radial-gradient`] = null,
    `line-style`: PropertyValueEdge[LineStyle] = null,
    `mid-source-arrow-color`: PropertyValueEdge[Colour] = null,
    `mid-source-arrow-fill`: PropertyValueEdge[ArrowFill] = null,
    `mid-source-arrow-shape`: PropertyValueEdge[ArrowShape] = null,
    `mid-target-arrow-color`: PropertyValueEdge[Colour] = null,
    `mid-target-arrow-fill`: PropertyValueEdge[ArrowFill] = null,
    `mid-target-arrow-shape`: PropertyValueEdge[ArrowShape] = null,
    `source-arrow-color`: PropertyValueEdge[Colour] = null,
    `source-arrow-fill`: PropertyValueEdge[ArrowFill] = null,
    `source-arrow-shape`: PropertyValueEdge[ArrowShape] = null,
    `target-arrow-color`: PropertyValueEdge[Colour] = null,
    `target-arrow-fill`: PropertyValueEdge[ArrowFill] = null,
    `target-arrow-shape`: PropertyValueEdge[ArrowShape] = null,
    width: PropertyValueEdge[Double | String] = null
  ): Edge = {
    val __obj = js.Dynamic.literal()
    if (`curve-style` != null) __obj.updateDynamic("curve-style")(`curve-style`.asInstanceOf[js.Any])
    if (`line-cap` != null) __obj.updateDynamic("line-cap")(`line-cap`.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-dash-offset` != null) __obj.updateDynamic("line-dash-offset")(`line-dash-offset`.asInstanceOf[js.Any])
    if (`line-dash-pattern` != null) __obj.updateDynamic("line-dash-pattern")(`line-dash-pattern`.asInstanceOf[js.Any])
    if (`line-fill` != null) __obj.updateDynamic("line-fill")(`line-fill`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`mid-source-arrow-color` != null) __obj.updateDynamic("mid-source-arrow-color")(`mid-source-arrow-color`.asInstanceOf[js.Any])
    if (`mid-source-arrow-fill` != null) __obj.updateDynamic("mid-source-arrow-fill")(`mid-source-arrow-fill`.asInstanceOf[js.Any])
    if (`mid-source-arrow-shape` != null) __obj.updateDynamic("mid-source-arrow-shape")(`mid-source-arrow-shape`.asInstanceOf[js.Any])
    if (`mid-target-arrow-color` != null) __obj.updateDynamic("mid-target-arrow-color")(`mid-target-arrow-color`.asInstanceOf[js.Any])
    if (`mid-target-arrow-fill` != null) __obj.updateDynamic("mid-target-arrow-fill")(`mid-target-arrow-fill`.asInstanceOf[js.Any])
    if (`mid-target-arrow-shape` != null) __obj.updateDynamic("mid-target-arrow-shape")(`mid-target-arrow-shape`.asInstanceOf[js.Any])
    if (`source-arrow-color` != null) __obj.updateDynamic("source-arrow-color")(`source-arrow-color`.asInstanceOf[js.Any])
    if (`source-arrow-fill` != null) __obj.updateDynamic("source-arrow-fill")(`source-arrow-fill`.asInstanceOf[js.Any])
    if (`source-arrow-shape` != null) __obj.updateDynamic("source-arrow-shape")(`source-arrow-shape`.asInstanceOf[js.Any])
    if (`target-arrow-color` != null) __obj.updateDynamic("target-arrow-color")(`target-arrow-color`.asInstanceOf[js.Any])
    if (`target-arrow-fill` != null) __obj.updateDynamic("target-arrow-fill")(`target-arrow-fill`.asInstanceOf[js.Any])
    if (`target-arrow-shape` != null) __obj.updateDynamic("target-arrow-shape")(`target-arrow-shape`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

