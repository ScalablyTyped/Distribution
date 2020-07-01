package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.`inside-to-node`
import typings.cytoscape.cytoscapeStrings.`linear-gradient`
import typings.cytoscape.cytoscapeStrings.`node-position`
import typings.cytoscape.cytoscapeStrings.`outside-to-line-or-label`
import typings.cytoscape.cytoscapeStrings.`outside-to-line`
import typings.cytoscape.cytoscapeStrings.`outside-to-node-or-label`
import typings.cytoscape.cytoscapeStrings.`outside-to-node`
import typings.cytoscape.cytoscapeStrings.`radial-gradient`
import typings.cytoscape.cytoscapeStrings.`unbundled-bezier`
import typings.cytoscape.cytoscapeStrings.bezier
import typings.cytoscape.cytoscapeStrings.bottom
import typings.cytoscape.cytoscapeStrings.butt
import typings.cytoscape.cytoscapeStrings.center
import typings.cytoscape.cytoscapeStrings.displayed
import typings.cytoscape.cytoscapeStrings.ellipsis
import typings.cytoscape.cytoscapeStrings.haystack
import typings.cytoscape.cytoscapeStrings.intersection
import typings.cytoscape.cytoscapeStrings.left
import typings.cytoscape.cytoscapeStrings.no
import typings.cytoscape.cytoscapeStrings.none
import typings.cytoscape.cytoscapeStrings.rectangle
import typings.cytoscape.cytoscapeStrings.right
import typings.cytoscape.cytoscapeStrings.round
import typings.cytoscape.cytoscapeStrings.roundrectangle
import typings.cytoscape.cytoscapeStrings.segments
import typings.cytoscape.cytoscapeStrings.solid
import typings.cytoscape.cytoscapeStrings.square
import typings.cytoscape.cytoscapeStrings.straight
import typings.cytoscape.cytoscapeStrings.taxi
import typings.cytoscape.cytoscapeStrings.top
import typings.cytoscape.cytoscapeStrings.visible
import typings.cytoscape.cytoscapeStrings.wrap
import typings.cytoscape.cytoscapeStrings.yes
import typings.cytoscape.mod.EdgeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent cytoscape.cytoscape.Css.EdgeLine */
/* Inlined parent cytoscape.cytoscape.Css.EdgeArrow */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Gradient> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Overlay> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.BezierEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.UnbundledBezierEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.HaystackEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.SegmentsEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Visibility<cytoscape.cytoscape.EdgeSingular>> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Labels<cytoscape.cytoscape.EdgeSingular>> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Events<cytoscape.cytoscape.EdgeSingular>> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.EdgeEndpoints<cytoscape.cytoscape.EdgeSingular>> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.TransitionAnimation> */
trait Edge extends js.Object {
  /** The size of the arrow. */
  var `arrow-scale`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  var color: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.undefined
  var `control-point-distance`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  var `control-point-distances`: js.UndefOr[PropertyValueEdge[String]] = js.undefined
  var `control-point-step-size`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  var `control-point-weight`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  var `control-point-weights`: js.UndefOr[PropertyValueEdge[String]] = js.undefined
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
  var display: js.UndefOr[PropertyValue[EdgeSingular, none | displayed]] = js.undefined
  var `edge-distances`: js.UndefOr[PropertyValueEdge[intersection | `node-position`]] = js.undefined
  var events: js.UndefOr[PropertyValue[EdgeSingular, yes | no]] = js.undefined
  var `font-family`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.undefined
  var `font-size`: js.UndefOr[PropertyValue[EdgeSingular, Double | String]] = js.undefined
  var `font-style`: js.UndefOr[PropertyValue[EdgeSingular, FontStyle]] = js.undefined
  var `font-weight`: js.UndefOr[PropertyValue[EdgeSingular, FontWeight]] = js.undefined
  var `haystack-radius`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  var label: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.undefined
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
  var `line-gradient-stop-colours`: js.UndefOr[js.Array[PropertyValueEdge[Colour]]] = js.undefined
  var `line-gradient-stop-positions`: js.UndefOr[js.Array[PropertyValueEdge[Double]]] = js.undefined
  /**
    * The style of the edge’s line.
    */
  var `line-style`: js.UndefOr[PropertyValueEdge[LineStyle]] = js.undefined
  /** The colour of the edge’s "mid-source" arrow. */
  var `mid-source-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  /** The fill state of the edge’s mid-source arrow. */
  var `mid-source-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.undefined
  /** The shape of the edge’s mid-source arrow. */
  var `mid-source-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.undefined
  /** The colour of the edge’s "mid-target" arrow. */
  var `mid-target-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  /** The fill state of the edge’s mid-target arrow. */
  var `mid-target-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.undefined
  /** The shape of the edge’s mid-target arrow. */
  var `mid-target-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.undefined
  var `min-zoomed-font-size`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var opacity: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `overlay-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  var `overlay-opacity`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  var `overlay-padding`: js.UndefOr[PropertyValueEdge[Double | String]] = js.undefined
  var `segment-distances`: js.UndefOr[PropertyValueEdge[String]] = js.undefined
  var `segment-weights`: js.UndefOr[PropertyValueEdge[String]] = js.undefined
  /** The colour of the edge’s source arrow. */
  var `source-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  /** The fill state of the edge’s source arrow. */
  var `source-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.undefined
  /** The shape of the edge’s source arrow. */
  var `source-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.undefined
  var `source-endpoint`: js.UndefOr[
    PropertyValue[
      EdgeSingular, 
      `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ]
  ] = js.undefined
  var `source-label`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.undefined
  var `source-text-margin-x`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `source-text-margin-y`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `source-text-offset`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `source-text-rotation`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  /** The colour of the edge’s target arrow. */
  var `target-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  /** The fill state of the edge’s target arrow. */
  var `target-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.undefined
  /** The shape of the edge’s target arrow. */
  var `target-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.undefined
  /**
    * The distance the edge ends from its target.
    */
  var `target-distance-from-node`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  var `target-endpoint`: js.UndefOr[
    PropertyValue[
      EdgeSingular, 
      `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ]
  ] = js.undefined
  var `target-label`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.undefined
  var `target-text-margin-x`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `target-text-margin-y`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `target-text-offset`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `target-text-rotation`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `text-background-color`: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.undefined
  var `text-background-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `text-background-padding`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.undefined
  var `text-background-shape`: js.UndefOr[PropertyValue[EdgeSingular, rectangle | roundrectangle]] = js.undefined
  var `text-border-color`: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.undefined
  var `text-border-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `text-border-style`: js.UndefOr[PropertyValue[EdgeSingular, LineStyle]] = js.undefined
  var `text-border-width`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `text-events`: js.UndefOr[PropertyValue[EdgeSingular, yes | no]] = js.undefined
  var `text-halign`: js.UndefOr[PropertyValue[EdgeSingular, left | center | right]] = js.undefined
  var `text-margin-x`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `text-margin-y`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `text-max-width`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.undefined
  var `text-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `text-outline-color`: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.undefined
  var `text-outline-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `text-outline-width`: js.UndefOr[PropertyValue[EdgeSingular, Double | String]] = js.undefined
  var `text-rotation`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `text-shadow-blur`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `text-shadow-color`: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.undefined
  var `text-shadow-offset-x`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `text-shadow-offset-y`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `text-shadow-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  var `text-transform`: js.UndefOr[PropertyValue[EdgeSingular, TextTranformation]] = js.undefined
  var `text-valign`: js.UndefOr[PropertyValue[EdgeSingular, top | center | bottom]] = js.undefined
  var `text-wrap`: js.UndefOr[PropertyValue[EdgeSingular, none | wrap | ellipsis]] = js.undefined
  var `transition-delay`: js.UndefOr[Double] = js.undefined
  var `transition-duration`: js.UndefOr[Double] = js.undefined
  var `transition-property`: js.UndefOr[String] = js.undefined
  var `transition-timing-function`: js.UndefOr[TransitionTimingFunction] = js.undefined
  var visibility: js.UndefOr[PropertyValue[EdgeSingular, none | visible]] = js.undefined
  /**
    * The width of an edge’s line.
    */
  var width: js.UndefOr[PropertyValueEdge[Double | String]] = js.undefined
  var `z-index`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
}

object Edge {
  @scala.inline
  def apply(
    `arrow-scale`: PropertyValueEdge[Double] = null,
    color: PropertyValue[EdgeSingular, Colour] = null,
    `control-point-distance`: PropertyValueEdge[Double] = null,
    `control-point-distances`: PropertyValueEdge[String] = null,
    `control-point-step-size`: PropertyValueEdge[Double] = null,
    `control-point-weight`: PropertyValueEdge[Double] = null,
    `control-point-weights`: PropertyValueEdge[String] = null,
    `curve-style`: PropertyValueEdge[haystack | straight | bezier | `unbundled-bezier` | segments | taxi] = null,
    display: PropertyValue[EdgeSingular, none | displayed] = null,
    `edge-distances`: PropertyValueEdge[intersection | `node-position`] = null,
    events: PropertyValue[EdgeSingular, yes | no] = null,
    `font-family`: PropertyValue[EdgeSingular, String] = null,
    `font-size`: PropertyValue[EdgeSingular, Double | String] = null,
    `font-style`: PropertyValue[EdgeSingular, FontStyle] = null,
    `font-weight`: PropertyValue[EdgeSingular, FontWeight] = null,
    `haystack-radius`: PropertyValueEdge[Double] = null,
    label: PropertyValue[EdgeSingular, String] = null,
    `line-cap`: PropertyValueEdge[butt | round | square] = null,
    `line-color`: PropertyValueEdge[Colour] = null,
    `line-dash-offset`: PropertyValueEdge[Double] = null,
    `line-dash-pattern`: js.Array[PropertyValueEdge[Double]] = null,
    `line-fill`: PropertyValueEdge[solid | `linear-gradient` | `radial-gradient`] = null,
    `line-gradient-stop-colours`: js.Array[PropertyValueEdge[Colour]] = null,
    `line-gradient-stop-positions`: js.Array[PropertyValueEdge[Double]] = null,
    `line-style`: PropertyValueEdge[LineStyle] = null,
    `mid-source-arrow-color`: PropertyValueEdge[Colour] = null,
    `mid-source-arrow-fill`: PropertyValueEdge[ArrowFill] = null,
    `mid-source-arrow-shape`: PropertyValueEdge[ArrowShape] = null,
    `mid-target-arrow-color`: PropertyValueEdge[Colour] = null,
    `mid-target-arrow-fill`: PropertyValueEdge[ArrowFill] = null,
    `mid-target-arrow-shape`: PropertyValueEdge[ArrowShape] = null,
    `min-zoomed-font-size`: PropertyValue[EdgeSingular, Double] = null,
    opacity: PropertyValue[EdgeSingular, Double] = null,
    `overlay-color`: PropertyValueEdge[Colour] = null,
    `overlay-opacity`: PropertyValueEdge[Double] = null,
    `overlay-padding`: PropertyValueEdge[Double | String] = null,
    `segment-distances`: PropertyValueEdge[String] = null,
    `segment-weights`: PropertyValueEdge[String] = null,
    `source-arrow-color`: PropertyValueEdge[Colour] = null,
    `source-arrow-fill`: PropertyValueEdge[ArrowFill] = null,
    `source-arrow-shape`: PropertyValueEdge[ArrowShape] = null,
    `source-endpoint`: PropertyValue[
      EdgeSingular, 
      `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ] = null,
    `source-label`: PropertyValue[EdgeSingular, String] = null,
    `source-text-margin-x`: PropertyValue[EdgeSingular, Double] = null,
    `source-text-margin-y`: PropertyValue[EdgeSingular, Double] = null,
    `source-text-offset`: PropertyValue[EdgeSingular, Double] = null,
    `source-text-rotation`: PropertyValue[EdgeSingular, Double] = null,
    `target-arrow-color`: PropertyValueEdge[Colour] = null,
    `target-arrow-fill`: PropertyValueEdge[ArrowFill] = null,
    `target-arrow-shape`: PropertyValueEdge[ArrowShape] = null,
    `target-distance-from-node`: PropertyValueEdge[Double] = null,
    `target-endpoint`: PropertyValue[
      EdgeSingular, 
      `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ] = null,
    `target-label`: PropertyValue[EdgeSingular, String] = null,
    `target-text-margin-x`: PropertyValue[EdgeSingular, Double] = null,
    `target-text-margin-y`: PropertyValue[EdgeSingular, Double] = null,
    `target-text-offset`: PropertyValue[EdgeSingular, Double] = null,
    `target-text-rotation`: PropertyValue[EdgeSingular, Double] = null,
    `text-background-color`: PropertyValue[EdgeSingular, Colour] = null,
    `text-background-opacity`: PropertyValue[EdgeSingular, Double] = null,
    `text-background-padding`: PropertyValue[EdgeSingular, String] = null,
    `text-background-shape`: PropertyValue[EdgeSingular, rectangle | roundrectangle] = null,
    `text-border-color`: PropertyValue[EdgeSingular, Colour] = null,
    `text-border-opacity`: PropertyValue[EdgeSingular, Double] = null,
    `text-border-style`: PropertyValue[EdgeSingular, LineStyle] = null,
    `text-border-width`: PropertyValue[EdgeSingular, Double] = null,
    `text-events`: PropertyValue[EdgeSingular, yes | no] = null,
    `text-halign`: PropertyValue[EdgeSingular, left | center | right] = null,
    `text-margin-x`: PropertyValue[EdgeSingular, Double] = null,
    `text-margin-y`: PropertyValue[EdgeSingular, Double] = null,
    `text-max-width`: PropertyValue[EdgeSingular, String] = null,
    `text-opacity`: PropertyValue[EdgeSingular, Double] = null,
    `text-outline-color`: PropertyValue[EdgeSingular, Colour] = null,
    `text-outline-opacity`: PropertyValue[EdgeSingular, Double] = null,
    `text-outline-width`: PropertyValue[EdgeSingular, Double | String] = null,
    `text-rotation`: PropertyValue[EdgeSingular, Double] = null,
    `text-shadow-blur`: PropertyValue[EdgeSingular, Double] = null,
    `text-shadow-color`: PropertyValue[EdgeSingular, Colour] = null,
    `text-shadow-offset-x`: PropertyValue[EdgeSingular, Double] = null,
    `text-shadow-offset-y`: PropertyValue[EdgeSingular, Double] = null,
    `text-shadow-opacity`: PropertyValue[EdgeSingular, Double] = null,
    `text-transform`: PropertyValue[EdgeSingular, TextTranformation] = null,
    `text-valign`: PropertyValue[EdgeSingular, top | center | bottom] = null,
    `text-wrap`: PropertyValue[EdgeSingular, none | wrap | ellipsis] = null,
    `transition-delay`: js.UndefOr[Double] = js.undefined,
    `transition-duration`: js.UndefOr[Double] = js.undefined,
    `transition-property`: String = null,
    `transition-timing-function`: TransitionTimingFunction = null,
    visibility: PropertyValue[EdgeSingular, none | visible] = null,
    width: PropertyValueEdge[Double | String] = null,
    `z-index`: PropertyValue[EdgeSingular, Double] = null
  ): Edge = {
    val __obj = js.Dynamic.literal()
    if (`arrow-scale` != null) __obj.updateDynamic("arrow-scale")(`arrow-scale`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`control-point-distance` != null) __obj.updateDynamic("control-point-distance")(`control-point-distance`.asInstanceOf[js.Any])
    if (`control-point-distances` != null) __obj.updateDynamic("control-point-distances")(`control-point-distances`.asInstanceOf[js.Any])
    if (`control-point-step-size` != null) __obj.updateDynamic("control-point-step-size")(`control-point-step-size`.asInstanceOf[js.Any])
    if (`control-point-weight` != null) __obj.updateDynamic("control-point-weight")(`control-point-weight`.asInstanceOf[js.Any])
    if (`control-point-weights` != null) __obj.updateDynamic("control-point-weights")(`control-point-weights`.asInstanceOf[js.Any])
    if (`curve-style` != null) __obj.updateDynamic("curve-style")(`curve-style`.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (`edge-distances` != null) __obj.updateDynamic("edge-distances")(`edge-distances`.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (`font-size` != null) __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    if (`font-style` != null) __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (`haystack-radius` != null) __obj.updateDynamic("haystack-radius")(`haystack-radius`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (`line-cap` != null) __obj.updateDynamic("line-cap")(`line-cap`.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-dash-offset` != null) __obj.updateDynamic("line-dash-offset")(`line-dash-offset`.asInstanceOf[js.Any])
    if (`line-dash-pattern` != null) __obj.updateDynamic("line-dash-pattern")(`line-dash-pattern`.asInstanceOf[js.Any])
    if (`line-fill` != null) __obj.updateDynamic("line-fill")(`line-fill`.asInstanceOf[js.Any])
    if (`line-gradient-stop-colours` != null) __obj.updateDynamic("line-gradient-stop-colours")(`line-gradient-stop-colours`.asInstanceOf[js.Any])
    if (`line-gradient-stop-positions` != null) __obj.updateDynamic("line-gradient-stop-positions")(`line-gradient-stop-positions`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`mid-source-arrow-color` != null) __obj.updateDynamic("mid-source-arrow-color")(`mid-source-arrow-color`.asInstanceOf[js.Any])
    if (`mid-source-arrow-fill` != null) __obj.updateDynamic("mid-source-arrow-fill")(`mid-source-arrow-fill`.asInstanceOf[js.Any])
    if (`mid-source-arrow-shape` != null) __obj.updateDynamic("mid-source-arrow-shape")(`mid-source-arrow-shape`.asInstanceOf[js.Any])
    if (`mid-target-arrow-color` != null) __obj.updateDynamic("mid-target-arrow-color")(`mid-target-arrow-color`.asInstanceOf[js.Any])
    if (`mid-target-arrow-fill` != null) __obj.updateDynamic("mid-target-arrow-fill")(`mid-target-arrow-fill`.asInstanceOf[js.Any])
    if (`mid-target-arrow-shape` != null) __obj.updateDynamic("mid-target-arrow-shape")(`mid-target-arrow-shape`.asInstanceOf[js.Any])
    if (`min-zoomed-font-size` != null) __obj.updateDynamic("min-zoomed-font-size")(`min-zoomed-font-size`.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (`overlay-color` != null) __obj.updateDynamic("overlay-color")(`overlay-color`.asInstanceOf[js.Any])
    if (`overlay-opacity` != null) __obj.updateDynamic("overlay-opacity")(`overlay-opacity`.asInstanceOf[js.Any])
    if (`overlay-padding` != null) __obj.updateDynamic("overlay-padding")(`overlay-padding`.asInstanceOf[js.Any])
    if (`segment-distances` != null) __obj.updateDynamic("segment-distances")(`segment-distances`.asInstanceOf[js.Any])
    if (`segment-weights` != null) __obj.updateDynamic("segment-weights")(`segment-weights`.asInstanceOf[js.Any])
    if (`source-arrow-color` != null) __obj.updateDynamic("source-arrow-color")(`source-arrow-color`.asInstanceOf[js.Any])
    if (`source-arrow-fill` != null) __obj.updateDynamic("source-arrow-fill")(`source-arrow-fill`.asInstanceOf[js.Any])
    if (`source-arrow-shape` != null) __obj.updateDynamic("source-arrow-shape")(`source-arrow-shape`.asInstanceOf[js.Any])
    if (`source-endpoint` != null) __obj.updateDynamic("source-endpoint")(`source-endpoint`.asInstanceOf[js.Any])
    if (`source-label` != null) __obj.updateDynamic("source-label")(`source-label`.asInstanceOf[js.Any])
    if (`source-text-margin-x` != null) __obj.updateDynamic("source-text-margin-x")(`source-text-margin-x`.asInstanceOf[js.Any])
    if (`source-text-margin-y` != null) __obj.updateDynamic("source-text-margin-y")(`source-text-margin-y`.asInstanceOf[js.Any])
    if (`source-text-offset` != null) __obj.updateDynamic("source-text-offset")(`source-text-offset`.asInstanceOf[js.Any])
    if (`source-text-rotation` != null) __obj.updateDynamic("source-text-rotation")(`source-text-rotation`.asInstanceOf[js.Any])
    if (`target-arrow-color` != null) __obj.updateDynamic("target-arrow-color")(`target-arrow-color`.asInstanceOf[js.Any])
    if (`target-arrow-fill` != null) __obj.updateDynamic("target-arrow-fill")(`target-arrow-fill`.asInstanceOf[js.Any])
    if (`target-arrow-shape` != null) __obj.updateDynamic("target-arrow-shape")(`target-arrow-shape`.asInstanceOf[js.Any])
    if (`target-distance-from-node` != null) __obj.updateDynamic("target-distance-from-node")(`target-distance-from-node`.asInstanceOf[js.Any])
    if (`target-endpoint` != null) __obj.updateDynamic("target-endpoint")(`target-endpoint`.asInstanceOf[js.Any])
    if (`target-label` != null) __obj.updateDynamic("target-label")(`target-label`.asInstanceOf[js.Any])
    if (`target-text-margin-x` != null) __obj.updateDynamic("target-text-margin-x")(`target-text-margin-x`.asInstanceOf[js.Any])
    if (`target-text-margin-y` != null) __obj.updateDynamic("target-text-margin-y")(`target-text-margin-y`.asInstanceOf[js.Any])
    if (`target-text-offset` != null) __obj.updateDynamic("target-text-offset")(`target-text-offset`.asInstanceOf[js.Any])
    if (`target-text-rotation` != null) __obj.updateDynamic("target-text-rotation")(`target-text-rotation`.asInstanceOf[js.Any])
    if (`text-background-color` != null) __obj.updateDynamic("text-background-color")(`text-background-color`.asInstanceOf[js.Any])
    if (`text-background-opacity` != null) __obj.updateDynamic("text-background-opacity")(`text-background-opacity`.asInstanceOf[js.Any])
    if (`text-background-padding` != null) __obj.updateDynamic("text-background-padding")(`text-background-padding`.asInstanceOf[js.Any])
    if (`text-background-shape` != null) __obj.updateDynamic("text-background-shape")(`text-background-shape`.asInstanceOf[js.Any])
    if (`text-border-color` != null) __obj.updateDynamic("text-border-color")(`text-border-color`.asInstanceOf[js.Any])
    if (`text-border-opacity` != null) __obj.updateDynamic("text-border-opacity")(`text-border-opacity`.asInstanceOf[js.Any])
    if (`text-border-style` != null) __obj.updateDynamic("text-border-style")(`text-border-style`.asInstanceOf[js.Any])
    if (`text-border-width` != null) __obj.updateDynamic("text-border-width")(`text-border-width`.asInstanceOf[js.Any])
    if (`text-events` != null) __obj.updateDynamic("text-events")(`text-events`.asInstanceOf[js.Any])
    if (`text-halign` != null) __obj.updateDynamic("text-halign")(`text-halign`.asInstanceOf[js.Any])
    if (`text-margin-x` != null) __obj.updateDynamic("text-margin-x")(`text-margin-x`.asInstanceOf[js.Any])
    if (`text-margin-y` != null) __obj.updateDynamic("text-margin-y")(`text-margin-y`.asInstanceOf[js.Any])
    if (`text-max-width` != null) __obj.updateDynamic("text-max-width")(`text-max-width`.asInstanceOf[js.Any])
    if (`text-opacity` != null) __obj.updateDynamic("text-opacity")(`text-opacity`.asInstanceOf[js.Any])
    if (`text-outline-color` != null) __obj.updateDynamic("text-outline-color")(`text-outline-color`.asInstanceOf[js.Any])
    if (`text-outline-opacity` != null) __obj.updateDynamic("text-outline-opacity")(`text-outline-opacity`.asInstanceOf[js.Any])
    if (`text-outline-width` != null) __obj.updateDynamic("text-outline-width")(`text-outline-width`.asInstanceOf[js.Any])
    if (`text-rotation` != null) __obj.updateDynamic("text-rotation")(`text-rotation`.asInstanceOf[js.Any])
    if (`text-shadow-blur` != null) __obj.updateDynamic("text-shadow-blur")(`text-shadow-blur`.asInstanceOf[js.Any])
    if (`text-shadow-color` != null) __obj.updateDynamic("text-shadow-color")(`text-shadow-color`.asInstanceOf[js.Any])
    if (`text-shadow-offset-x` != null) __obj.updateDynamic("text-shadow-offset-x")(`text-shadow-offset-x`.asInstanceOf[js.Any])
    if (`text-shadow-offset-y` != null) __obj.updateDynamic("text-shadow-offset-y")(`text-shadow-offset-y`.asInstanceOf[js.Any])
    if (`text-shadow-opacity` != null) __obj.updateDynamic("text-shadow-opacity")(`text-shadow-opacity`.asInstanceOf[js.Any])
    if (`text-transform` != null) __obj.updateDynamic("text-transform")(`text-transform`.asInstanceOf[js.Any])
    if (`text-valign` != null) __obj.updateDynamic("text-valign")(`text-valign`.asInstanceOf[js.Any])
    if (`text-wrap` != null) __obj.updateDynamic("text-wrap")(`text-wrap`.asInstanceOf[js.Any])
    if (!js.isUndefined(`transition-delay`)) __obj.updateDynamic("transition-delay")(`transition-delay`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`transition-duration`)) __obj.updateDynamic("transition-duration")(`transition-duration`.get.asInstanceOf[js.Any])
    if (`transition-property` != null) __obj.updateDynamic("transition-property")(`transition-property`.asInstanceOf[js.Any])
    if (`transition-timing-function` != null) __obj.updateDynamic("transition-timing-function")(`transition-timing-function`.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (`z-index` != null) __obj.updateDynamic("z-index")(`z-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

