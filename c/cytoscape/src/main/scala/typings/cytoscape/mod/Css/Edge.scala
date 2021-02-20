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
import typings.cytoscape.cytoscapeStrings.hidden
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait Edge extends StObject {
  
  /** The size of the arrow. */
  var `arrow-scale`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  
  var color: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.native
  
  var `control-point-distance`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  
  var `control-point-distances`: js.UndefOr[PropertyValueEdge[String]] = js.native
  
  var `control-point-step-size`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  
  var `control-point-weight`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  
  var `control-point-weights`: js.UndefOr[PropertyValueEdge[String]] = js.native
  
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
  
  var display: js.UndefOr[PropertyValue[EdgeSingular, none | displayed]] = js.native
  
  var `edge-distances`: js.UndefOr[PropertyValueEdge[intersection | `node-position`]] = js.native
  
  var events: js.UndefOr[PropertyValue[EdgeSingular, yes | no]] = js.native
  
  var `font-family`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.native
  
  var `font-size`: js.UndefOr[PropertyValue[EdgeSingular, Double | String]] = js.native
  
  var `font-style`: js.UndefOr[PropertyValue[EdgeSingular, FontStyle]] = js.native
  
  var `font-weight`: js.UndefOr[PropertyValue[EdgeSingular, FontWeight]] = js.native
  
  var `haystack-radius`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  
  var label: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.native
  
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
  
  var `line-gradient-stop-colors`: js.UndefOr[js.Array[PropertyValueEdge[Colour]]] = js.native
  
  var `line-gradient-stop-positions`: js.UndefOr[js.Array[PropertyValueEdge[Double]]] = js.native
  
  /**
    * The style of the edge’s line.
    */
  var `line-style`: js.UndefOr[PropertyValueEdge[LineStyle]] = js.native
  
  /** The colour of the edge’s "mid-source" arrow. */
  var `mid-source-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  
  /** The fill state of the edge’s mid-source arrow. */
  var `mid-source-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.native
  
  /** The shape of the edge’s mid-source arrow. */
  var `mid-source-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.native
  
  /** The colour of the edge’s "mid-target" arrow. */
  var `mid-target-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  
  /** The fill state of the edge’s mid-target arrow. */
  var `mid-target-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.native
  
  /** The shape of the edge’s mid-target arrow. */
  var `mid-target-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.native
  
  var `min-zoomed-font-size`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var opacity: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `overlay-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  
  var `overlay-opacity`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  
  var `overlay-padding`: js.UndefOr[PropertyValueEdge[Double | String]] = js.native
  
  var `segment-distances`: js.UndefOr[PropertyValueEdge[String]] = js.native
  
  var `segment-weights`: js.UndefOr[PropertyValueEdge[String]] = js.native
  
  /** The colour of the edge’s source arrow. */
  var `source-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  
  /** The fill state of the edge’s source arrow. */
  var `source-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.native
  
  /** The shape of the edge’s source arrow. */
  var `source-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.native
  
  /**
    * The distance the edge ends from its source.
    */
  var `source-distance-from-node`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  
  var `source-endpoint`: js.UndefOr[
    PropertyValue[
      EdgeSingular, 
      `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ]
  ] = js.native
  
  var `source-label`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.native
  
  var `source-text-margin-x`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `source-text-margin-y`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `source-text-offset`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `source-text-rotation`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  /** The colour of the edge’s target arrow. */
  var `target-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  
  /** The fill state of the edge’s target arrow. */
  var `target-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.native
  
  /** The shape of the edge’s target arrow. */
  var `target-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.native
  
  /**
    * The distance the edge ends from its target.
    */
  var `target-distance-from-node`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  
  var `target-endpoint`: js.UndefOr[
    PropertyValue[
      EdgeSingular, 
      `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ]
  ] = js.native
  
  var `target-label`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.native
  
  var `target-text-margin-x`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `target-text-margin-y`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `target-text-offset`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `target-text-rotation`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `text-background-color`: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.native
  
  var `text-background-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `text-background-padding`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.native
  
  var `text-background-shape`: js.UndefOr[PropertyValue[EdgeSingular, rectangle | roundrectangle]] = js.native
  
  var `text-border-color`: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.native
  
  var `text-border-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `text-border-style`: js.UndefOr[PropertyValue[EdgeSingular, LineStyle]] = js.native
  
  var `text-border-width`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `text-events`: js.UndefOr[PropertyValue[EdgeSingular, yes | no]] = js.native
  
  var `text-halign`: js.UndefOr[PropertyValue[EdgeSingular, left | center | right]] = js.native
  
  var `text-margin-x`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `text-margin-y`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `text-max-width`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.native
  
  var `text-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `text-outline-color`: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.native
  
  var `text-outline-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `text-outline-width`: js.UndefOr[PropertyValue[EdgeSingular, Double | String]] = js.native
  
  var `text-rotation`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `text-shadow-blur`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `text-shadow-color`: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.native
  
  var `text-shadow-offset-x`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `text-shadow-offset-y`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `text-shadow-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  
  var `text-transform`: js.UndefOr[PropertyValue[EdgeSingular, TextTranformation]] = js.native
  
  var `text-valign`: js.UndefOr[PropertyValue[EdgeSingular, top | center | bottom]] = js.native
  
  var `text-wrap`: js.UndefOr[PropertyValue[EdgeSingular, none | wrap | ellipsis]] = js.native
  
  var `transition-delay`: js.UndefOr[Double] = js.native
  
  var `transition-duration`: js.UndefOr[Double] = js.native
  
  var `transition-property`: js.UndefOr[String] = js.native
  
  var `transition-timing-function`: js.UndefOr[TransitionTimingFunction] = js.native
  
  var visibility: js.UndefOr[PropertyValue[EdgeSingular, hidden | visible]] = js.native
  
  /**
    * The width of an edge’s line.
    */
  var width: js.UndefOr[PropertyValueEdge[Double | String]] = js.native
  
  var `z-index`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
}
object Edge {
  
  @scala.inline
  def apply(): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit class EdgeMutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setArrow-scale`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "arrow-scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setArrow-scaleFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "arrow-scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setArrow-scaleUndefined`: Self = StObject.set(x, "arrow-scale", js.undefined)
    
    @scala.inline
    def setColor(value: PropertyValue[EdgeSingular, Colour]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorFunction1(value: EdgeSingular => Colour): Self = StObject.set(x, "color", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def `setControl-point-distance`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "control-point-distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setControl-point-distanceFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "control-point-distance", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setControl-point-distanceUndefined`: Self = StObject.set(x, "control-point-distance", js.undefined)
    
    @scala.inline
    def `setControl-point-distances`(value: PropertyValueEdge[String]): Self = StObject.set(x, "control-point-distances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setControl-point-distancesFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "control-point-distances", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setControl-point-distancesUndefined`: Self = StObject.set(x, "control-point-distances", js.undefined)
    
    @scala.inline
    def `setControl-point-step-size`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "control-point-step-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setControl-point-step-sizeFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "control-point-step-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setControl-point-step-sizeUndefined`: Self = StObject.set(x, "control-point-step-size", js.undefined)
    
    @scala.inline
    def `setControl-point-weight`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "control-point-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setControl-point-weightFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "control-point-weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setControl-point-weightUndefined`: Self = StObject.set(x, "control-point-weight", js.undefined)
    
    @scala.inline
    def `setControl-point-weights`(value: PropertyValueEdge[String]): Self = StObject.set(x, "control-point-weights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setControl-point-weightsFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "control-point-weights", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setControl-point-weightsUndefined`: Self = StObject.set(x, "control-point-weights", js.undefined)
    
    @scala.inline
    def `setCurve-style`(value: PropertyValueEdge[haystack | straight | bezier | `unbundled-bezier` | segments | taxi]): Self = StObject.set(x, "curve-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurve-styleFunction1`(value: EdgeSingular => haystack | straight | bezier | `unbundled-bezier` | segments | taxi): Self = StObject.set(x, "curve-style", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setCurve-styleUndefined`: Self = StObject.set(x, "curve-style", js.undefined)
    
    @scala.inline
    def setDisplay(value: PropertyValue[EdgeSingular, none | displayed]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFunction1(value: EdgeSingular => none | displayed): Self = StObject.set(x, "display", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def `setEdge-distances`(value: PropertyValueEdge[intersection | `node-position`]): Self = StObject.set(x, "edge-distances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEdge-distancesFunction1`(value: EdgeSingular => intersection | `node-position`): Self = StObject.set(x, "edge-distances", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setEdge-distancesUndefined`: Self = StObject.set(x, "edge-distances", js.undefined)
    
    @scala.inline
    def setEvents(value: PropertyValue[EdgeSingular, yes | no]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsFunction1(value: EdgeSingular => yes | no): Self = StObject.set(x, "events", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def `setFont-family`(value: PropertyValue[EdgeSingular, String]): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-familyFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "font-family", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    @scala.inline
    def `setFont-size`(value: PropertyValue[EdgeSingular, Double | String]): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-sizeFunction1`(value: EdgeSingular => Double | String): Self = StObject.set(x, "font-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    @scala.inline
    def `setFont-style`(value: PropertyValue[EdgeSingular, FontStyle]): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-styleFunction1`(value: EdgeSingular => FontStyle): Self = StObject.set(x, "font-style", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    @scala.inline
    def `setFont-weight`(value: PropertyValue[EdgeSingular, FontWeight]): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-weightFunction1`(value: EdgeSingular => FontWeight): Self = StObject.set(x, "font-weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    @scala.inline
    def `setHaystack-radius`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "haystack-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHaystack-radiusFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "haystack-radius", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setHaystack-radiusUndefined`: Self = StObject.set(x, "haystack-radius", js.undefined)
    
    @scala.inline
    def setLabel(value: PropertyValue[EdgeSingular, String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFunction1(value: EdgeSingular => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def `setLine-cap`(value: PropertyValueEdge[butt | round | square]): Self = StObject.set(x, "line-cap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-capFunction1`(value: EdgeSingular => butt | round | square): Self = StObject.set(x, "line-cap", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setLine-capUndefined`: Self = StObject.set(x, "line-cap", js.undefined)
    
    @scala.inline
    def `setLine-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "line-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "line-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setLine-colorUndefined`: Self = StObject.set(x, "line-color", js.undefined)
    
    @scala.inline
    def `setLine-dash-offset`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "line-dash-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-dash-offsetFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "line-dash-offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setLine-dash-offsetUndefined`: Self = StObject.set(x, "line-dash-offset", js.undefined)
    
    @scala.inline
    def `setLine-dash-pattern`(value: js.Array[PropertyValueEdge[Double]]): Self = StObject.set(x, "line-dash-pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-dash-patternUndefined`: Self = StObject.set(x, "line-dash-pattern", js.undefined)
    
    @scala.inline
    def `setLine-dash-patternVarargs`(value: PropertyValueEdge[Double]*): Self = StObject.set(x, "line-dash-pattern", js.Array(value :_*))
    
    @scala.inline
    def `setLine-fill`(value: PropertyValueEdge[solid | `linear-gradient` | `radial-gradient`]): Self = StObject.set(x, "line-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-fillFunction1`(value: EdgeSingular => solid | `linear-gradient` | `radial-gradient`): Self = StObject.set(x, "line-fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setLine-fillUndefined`: Self = StObject.set(x, "line-fill", js.undefined)
    
    @scala.inline
    def `setLine-gradient-stop-colors`(value: js.Array[PropertyValueEdge[Colour]]): Self = StObject.set(x, "line-gradient-stop-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-gradient-stop-colorsUndefined`: Self = StObject.set(x, "line-gradient-stop-colors", js.undefined)
    
    @scala.inline
    def `setLine-gradient-stop-colorsVarargs`(value: PropertyValueEdge[Colour]*): Self = StObject.set(x, "line-gradient-stop-colors", js.Array(value :_*))
    
    @scala.inline
    def `setLine-gradient-stop-positions`(value: js.Array[PropertyValueEdge[Double]]): Self = StObject.set(x, "line-gradient-stop-positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-gradient-stop-positionsUndefined`: Self = StObject.set(x, "line-gradient-stop-positions", js.undefined)
    
    @scala.inline
    def `setLine-gradient-stop-positionsVarargs`(value: PropertyValueEdge[Double]*): Self = StObject.set(x, "line-gradient-stop-positions", js.Array(value :_*))
    
    @scala.inline
    def `setLine-style`(value: PropertyValueEdge[LineStyle]): Self = StObject.set(x, "line-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-styleFunction1`(value: EdgeSingular => LineStyle): Self = StObject.set(x, "line-style", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setLine-styleUndefined`: Self = StObject.set(x, "line-style", js.undefined)
    
    @scala.inline
    def `setMid-source-arrow-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "mid-source-arrow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMid-source-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "mid-source-arrow-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMid-source-arrow-colorUndefined`: Self = StObject.set(x, "mid-source-arrow-color", js.undefined)
    
    @scala.inline
    def `setMid-source-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = StObject.set(x, "mid-source-arrow-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMid-source-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = StObject.set(x, "mid-source-arrow-fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMid-source-arrow-fillUndefined`: Self = StObject.set(x, "mid-source-arrow-fill", js.undefined)
    
    @scala.inline
    def `setMid-source-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = StObject.set(x, "mid-source-arrow-shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMid-source-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = StObject.set(x, "mid-source-arrow-shape", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMid-source-arrow-shapeUndefined`: Self = StObject.set(x, "mid-source-arrow-shape", js.undefined)
    
    @scala.inline
    def `setMid-target-arrow-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "mid-target-arrow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMid-target-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "mid-target-arrow-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMid-target-arrow-colorUndefined`: Self = StObject.set(x, "mid-target-arrow-color", js.undefined)
    
    @scala.inline
    def `setMid-target-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = StObject.set(x, "mid-target-arrow-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMid-target-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = StObject.set(x, "mid-target-arrow-fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMid-target-arrow-fillUndefined`: Self = StObject.set(x, "mid-target-arrow-fill", js.undefined)
    
    @scala.inline
    def `setMid-target-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = StObject.set(x, "mid-target-arrow-shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMid-target-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = StObject.set(x, "mid-target-arrow-shape", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMid-target-arrow-shapeUndefined`: Self = StObject.set(x, "mid-target-arrow-shape", js.undefined)
    
    @scala.inline
    def `setMin-zoomed-font-size`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "min-zoomed-font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMin-zoomed-font-sizeFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "min-zoomed-font-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMin-zoomed-font-sizeUndefined`: Self = StObject.set(x, "min-zoomed-font-size", js.undefined)
    
    @scala.inline
    def setOpacity(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityFunction1(value: EdgeSingular => Double): Self = StObject.set(x, "opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def `setOverlay-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "overlay-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverlay-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "overlay-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-colorUndefined`: Self = StObject.set(x, "overlay-color", js.undefined)
    
    @scala.inline
    def `setOverlay-opacity`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "overlay-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverlay-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "overlay-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-opacityUndefined`: Self = StObject.set(x, "overlay-opacity", js.undefined)
    
    @scala.inline
    def `setOverlay-padding`(value: PropertyValueEdge[Double | String]): Self = StObject.set(x, "overlay-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverlay-paddingFunction1`(value: EdgeSingular => Double | String): Self = StObject.set(x, "overlay-padding", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-paddingUndefined`: Self = StObject.set(x, "overlay-padding", js.undefined)
    
    @scala.inline
    def `setSegment-distances`(value: PropertyValueEdge[String]): Self = StObject.set(x, "segment-distances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSegment-distancesFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "segment-distances", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSegment-distancesUndefined`: Self = StObject.set(x, "segment-distances", js.undefined)
    
    @scala.inline
    def `setSegment-weights`(value: PropertyValueEdge[String]): Self = StObject.set(x, "segment-weights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSegment-weightsFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "segment-weights", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSegment-weightsUndefined`: Self = StObject.set(x, "segment-weights", js.undefined)
    
    @scala.inline
    def `setSource-arrow-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "source-arrow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "source-arrow-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-arrow-colorUndefined`: Self = StObject.set(x, "source-arrow-color", js.undefined)
    
    @scala.inline
    def `setSource-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = StObject.set(x, "source-arrow-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = StObject.set(x, "source-arrow-fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-arrow-fillUndefined`: Self = StObject.set(x, "source-arrow-fill", js.undefined)
    
    @scala.inline
    def `setSource-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = StObject.set(x, "source-arrow-shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = StObject.set(x, "source-arrow-shape", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-arrow-shapeUndefined`: Self = StObject.set(x, "source-arrow-shape", js.undefined)
    
    @scala.inline
    def `setSource-distance-from-node`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "source-distance-from-node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-distance-from-nodeFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "source-distance-from-node", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-distance-from-nodeUndefined`: Self = StObject.set(x, "source-distance-from-node", js.undefined)
    
    @scala.inline
    def `setSource-endpoint`(
      value: PropertyValue[
          EdgeSingular, 
          `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
        ]
    ): Self = StObject.set(x, "source-endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-endpointFunction1`(
      value: EdgeSingular => `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ): Self = StObject.set(x, "source-endpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-endpointUndefined`: Self = StObject.set(x, "source-endpoint", js.undefined)
    
    @scala.inline
    def `setSource-label`(value: PropertyValue[EdgeSingular, String]): Self = StObject.set(x, "source-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-labelFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "source-label", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-labelUndefined`: Self = StObject.set(x, "source-label", js.undefined)
    
    @scala.inline
    def `setSource-text-margin-x`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "source-text-margin-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-text-margin-xFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "source-text-margin-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-text-margin-xUndefined`: Self = StObject.set(x, "source-text-margin-x", js.undefined)
    
    @scala.inline
    def `setSource-text-margin-y`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "source-text-margin-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-text-margin-yFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "source-text-margin-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-text-margin-yUndefined`: Self = StObject.set(x, "source-text-margin-y", js.undefined)
    
    @scala.inline
    def `setSource-text-offset`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "source-text-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-text-offsetFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "source-text-offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-text-offsetUndefined`: Self = StObject.set(x, "source-text-offset", js.undefined)
    
    @scala.inline
    def `setSource-text-rotation`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "source-text-rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-text-rotationFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "source-text-rotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-text-rotationUndefined`: Self = StObject.set(x, "source-text-rotation", js.undefined)
    
    @scala.inline
    def `setTarget-arrow-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "target-arrow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "target-arrow-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-arrow-colorUndefined`: Self = StObject.set(x, "target-arrow-color", js.undefined)
    
    @scala.inline
    def `setTarget-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = StObject.set(x, "target-arrow-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = StObject.set(x, "target-arrow-fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-arrow-fillUndefined`: Self = StObject.set(x, "target-arrow-fill", js.undefined)
    
    @scala.inline
    def `setTarget-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = StObject.set(x, "target-arrow-shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = StObject.set(x, "target-arrow-shape", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-arrow-shapeUndefined`: Self = StObject.set(x, "target-arrow-shape", js.undefined)
    
    @scala.inline
    def `setTarget-distance-from-node`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "target-distance-from-node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-distance-from-nodeFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "target-distance-from-node", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-distance-from-nodeUndefined`: Self = StObject.set(x, "target-distance-from-node", js.undefined)
    
    @scala.inline
    def `setTarget-endpoint`(
      value: PropertyValue[
          EdgeSingular, 
          `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
        ]
    ): Self = StObject.set(x, "target-endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-endpointFunction1`(
      value: EdgeSingular => `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ): Self = StObject.set(x, "target-endpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-endpointUndefined`: Self = StObject.set(x, "target-endpoint", js.undefined)
    
    @scala.inline
    def `setTarget-label`(value: PropertyValue[EdgeSingular, String]): Self = StObject.set(x, "target-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-labelFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "target-label", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-labelUndefined`: Self = StObject.set(x, "target-label", js.undefined)
    
    @scala.inline
    def `setTarget-text-margin-x`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "target-text-margin-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-text-margin-xFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "target-text-margin-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-text-margin-xUndefined`: Self = StObject.set(x, "target-text-margin-x", js.undefined)
    
    @scala.inline
    def `setTarget-text-margin-y`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "target-text-margin-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-text-margin-yFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "target-text-margin-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-text-margin-yUndefined`: Self = StObject.set(x, "target-text-margin-y", js.undefined)
    
    @scala.inline
    def `setTarget-text-offset`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "target-text-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-text-offsetFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "target-text-offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-text-offsetUndefined`: Self = StObject.set(x, "target-text-offset", js.undefined)
    
    @scala.inline
    def `setTarget-text-rotation`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "target-text-rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-text-rotationFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "target-text-rotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-text-rotationUndefined`: Self = StObject.set(x, "target-text-rotation", js.undefined)
    
    @scala.inline
    def `setText-background-color`(value: PropertyValue[EdgeSingular, Colour]): Self = StObject.set(x, "text-background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-background-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "text-background-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-background-colorUndefined`: Self = StObject.set(x, "text-background-color", js.undefined)
    
    @scala.inline
    def `setText-background-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-background-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-background-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-background-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-background-opacityUndefined`: Self = StObject.set(x, "text-background-opacity", js.undefined)
    
    @scala.inline
    def `setText-background-padding`(value: PropertyValue[EdgeSingular, String]): Self = StObject.set(x, "text-background-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-background-paddingFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "text-background-padding", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-background-paddingUndefined`: Self = StObject.set(x, "text-background-padding", js.undefined)
    
    @scala.inline
    def `setText-background-shape`(value: PropertyValue[EdgeSingular, rectangle | roundrectangle]): Self = StObject.set(x, "text-background-shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-background-shapeFunction1`(value: EdgeSingular => rectangle | roundrectangle): Self = StObject.set(x, "text-background-shape", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-background-shapeUndefined`: Self = StObject.set(x, "text-background-shape", js.undefined)
    
    @scala.inline
    def `setText-border-color`(value: PropertyValue[EdgeSingular, Colour]): Self = StObject.set(x, "text-border-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-border-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "text-border-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-border-colorUndefined`: Self = StObject.set(x, "text-border-color", js.undefined)
    
    @scala.inline
    def `setText-border-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-border-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-border-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-border-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-border-opacityUndefined`: Self = StObject.set(x, "text-border-opacity", js.undefined)
    
    @scala.inline
    def `setText-border-style`(value: PropertyValue[EdgeSingular, LineStyle]): Self = StObject.set(x, "text-border-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-border-styleFunction1`(value: EdgeSingular => LineStyle): Self = StObject.set(x, "text-border-style", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-border-styleUndefined`: Self = StObject.set(x, "text-border-style", js.undefined)
    
    @scala.inline
    def `setText-border-width`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-border-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-border-widthFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-border-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-border-widthUndefined`: Self = StObject.set(x, "text-border-width", js.undefined)
    
    @scala.inline
    def `setText-events`(value: PropertyValue[EdgeSingular, yes | no]): Self = StObject.set(x, "text-events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-eventsFunction1`(value: EdgeSingular => yes | no): Self = StObject.set(x, "text-events", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-eventsUndefined`: Self = StObject.set(x, "text-events", js.undefined)
    
    @scala.inline
    def `setText-halign`(value: PropertyValue[EdgeSingular, left | center | right]): Self = StObject.set(x, "text-halign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-halignFunction1`(value: EdgeSingular => left | center | right): Self = StObject.set(x, "text-halign", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-halignUndefined`: Self = StObject.set(x, "text-halign", js.undefined)
    
    @scala.inline
    def `setText-margin-x`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-margin-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-margin-xFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-margin-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-margin-xUndefined`: Self = StObject.set(x, "text-margin-x", js.undefined)
    
    @scala.inline
    def `setText-margin-y`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-margin-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-margin-yFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-margin-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-margin-yUndefined`: Self = StObject.set(x, "text-margin-y", js.undefined)
    
    @scala.inline
    def `setText-max-width`(value: PropertyValue[EdgeSingular, String]): Self = StObject.set(x, "text-max-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-max-widthFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "text-max-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-max-widthUndefined`: Self = StObject.set(x, "text-max-width", js.undefined)
    
    @scala.inline
    def `setText-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-opacityUndefined`: Self = StObject.set(x, "text-opacity", js.undefined)
    
    @scala.inline
    def `setText-outline-color`(value: PropertyValue[EdgeSingular, Colour]): Self = StObject.set(x, "text-outline-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-outline-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "text-outline-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-outline-colorUndefined`: Self = StObject.set(x, "text-outline-color", js.undefined)
    
    @scala.inline
    def `setText-outline-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-outline-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-outline-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-outline-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-outline-opacityUndefined`: Self = StObject.set(x, "text-outline-opacity", js.undefined)
    
    @scala.inline
    def `setText-outline-width`(value: PropertyValue[EdgeSingular, Double | String]): Self = StObject.set(x, "text-outline-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-outline-widthFunction1`(value: EdgeSingular => Double | String): Self = StObject.set(x, "text-outline-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-outline-widthUndefined`: Self = StObject.set(x, "text-outline-width", js.undefined)
    
    @scala.inline
    def `setText-rotation`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-rotationFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-rotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-rotationUndefined`: Self = StObject.set(x, "text-rotation", js.undefined)
    
    @scala.inline
    def `setText-shadow-blur`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-shadow-blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-shadow-blurFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-shadow-blur", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-blurUndefined`: Self = StObject.set(x, "text-shadow-blur", js.undefined)
    
    @scala.inline
    def `setText-shadow-color`(value: PropertyValue[EdgeSingular, Colour]): Self = StObject.set(x, "text-shadow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-shadow-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "text-shadow-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-colorUndefined`: Self = StObject.set(x, "text-shadow-color", js.undefined)
    
    @scala.inline
    def `setText-shadow-offset-x`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-shadow-offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-shadow-offset-xFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-shadow-offset-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-offset-xUndefined`: Self = StObject.set(x, "text-shadow-offset-x", js.undefined)
    
    @scala.inline
    def `setText-shadow-offset-y`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-shadow-offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-shadow-offset-yFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-shadow-offset-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-offset-yUndefined`: Self = StObject.set(x, "text-shadow-offset-y", js.undefined)
    
    @scala.inline
    def `setText-shadow-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-shadow-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-shadow-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-shadow-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-opacityUndefined`: Self = StObject.set(x, "text-shadow-opacity", js.undefined)
    
    @scala.inline
    def `setText-transform`(value: PropertyValue[EdgeSingular, TextTranformation]): Self = StObject.set(x, "text-transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-transformFunction1`(value: EdgeSingular => TextTranformation): Self = StObject.set(x, "text-transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-transformUndefined`: Self = StObject.set(x, "text-transform", js.undefined)
    
    @scala.inline
    def `setText-valign`(value: PropertyValue[EdgeSingular, top | center | bottom]): Self = StObject.set(x, "text-valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-valignFunction1`(value: EdgeSingular => top | center | bottom): Self = StObject.set(x, "text-valign", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-valignUndefined`: Self = StObject.set(x, "text-valign", js.undefined)
    
    @scala.inline
    def `setText-wrap`(value: PropertyValue[EdgeSingular, none | wrap | ellipsis]): Self = StObject.set(x, "text-wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-wrapFunction1`(value: EdgeSingular => none | wrap | ellipsis): Self = StObject.set(x, "text-wrap", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-wrapUndefined`: Self = StObject.set(x, "text-wrap", js.undefined)
    
    @scala.inline
    def `setTransition-delay`(value: Double): Self = StObject.set(x, "transition-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransition-delayUndefined`: Self = StObject.set(x, "transition-delay", js.undefined)
    
    @scala.inline
    def `setTransition-duration`(value: Double): Self = StObject.set(x, "transition-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransition-durationUndefined`: Self = StObject.set(x, "transition-duration", js.undefined)
    
    @scala.inline
    def `setTransition-property`(value: String): Self = StObject.set(x, "transition-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransition-propertyUndefined`: Self = StObject.set(x, "transition-property", js.undefined)
    
    @scala.inline
    def `setTransition-timing-function`(value: TransitionTimingFunction): Self = StObject.set(x, "transition-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransition-timing-functionUndefined`: Self = StObject.set(x, "transition-timing-function", js.undefined)
    
    @scala.inline
    def setVisibility(value: PropertyValue[EdgeSingular, hidden | visible]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityFunction1(value: EdgeSingular => hidden | visible): Self = StObject.set(x, "visibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    @scala.inline
    def setWidth(value: PropertyValueEdge[Double | String]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthFunction1(value: EdgeSingular => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def `setZ-index`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "z-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZ-indexFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "z-index", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setZ-indexUndefined`: Self = StObject.set(x, "z-index", js.undefined)
  }
}
