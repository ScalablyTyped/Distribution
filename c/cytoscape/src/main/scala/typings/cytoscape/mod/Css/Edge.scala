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
import typings.cytoscape.cytoscapeStrings.anywhere
import typings.cytoscape.cytoscapeStrings.auto
import typings.cytoscape.cytoscapeStrings.autorotate
import typings.cytoscape.cytoscapeStrings.bezier
import typings.cytoscape.cytoscapeStrings.bottom
import typings.cytoscape.cytoscapeStrings.butt
import typings.cytoscape.cytoscapeStrings.center
import typings.cytoscape.cytoscapeStrings.downward
import typings.cytoscape.cytoscapeStrings.element
import typings.cytoscape.cytoscapeStrings.ellipsis
import typings.cytoscape.cytoscapeStrings.haystack
import typings.cytoscape.cytoscapeStrings.hidden
import typings.cytoscape.cytoscapeStrings.horizontal
import typings.cytoscape.cytoscapeStrings.intersection
import typings.cytoscape.cytoscapeStrings.left
import typings.cytoscape.cytoscapeStrings.leftward
import typings.cytoscape.cytoscapeStrings.manual
import typings.cytoscape.cytoscapeStrings.no
import typings.cytoscape.cytoscapeStrings.none
import typings.cytoscape.cytoscapeStrings.orphan
import typings.cytoscape.cytoscapeStrings.rectangle
import typings.cytoscape.cytoscapeStrings.right
import typings.cytoscape.cytoscapeStrings.rightward
import typings.cytoscape.cytoscapeStrings.round
import typings.cytoscape.cytoscapeStrings.roundrectangle
import typings.cytoscape.cytoscapeStrings.segments
import typings.cytoscape.cytoscapeStrings.solid
import typings.cytoscape.cytoscapeStrings.square
import typings.cytoscape.cytoscapeStrings.straight
import typings.cytoscape.cytoscapeStrings.taxi
import typings.cytoscape.cytoscapeStrings.top
import typings.cytoscape.cytoscapeStrings.upward
import typings.cytoscape.cytoscapeStrings.vertical
import typings.cytoscape.cytoscapeStrings.visible
import typings.cytoscape.cytoscapeStrings.whitespace
import typings.cytoscape.cytoscapeStrings.wrap
import typings.cytoscape.cytoscapeStrings.yes
import typings.cytoscape.mod.EdgeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cytoscape.cytoscape.Css.EdgeLine */
/* Inlined parent cytoscape.cytoscape.Css.EdgeArrow */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Gradient> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Overlay> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.BezierEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.LoopEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.UnbundledBezierEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.HaystackEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.SegmentsEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.TaxiEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Visibility<cytoscape.cytoscape.EdgeSingular>> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Labels<cytoscape.cytoscape.EdgeSingular>> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Events<cytoscape.cytoscape.EdgeSingular>> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.EdgeEndpoints<cytoscape.cytoscape.EdgeSingular>> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.TransitionAnimation> */
trait Edge extends StObject {
  
  /** The size of the arrow. */
  var `arrow-scale`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  
  var color: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.undefined
  
  var `control-point-distance`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  
  var `control-point-distances`: js.UndefOr[PropertyValueEdge[Double | js.Array[Double] | String]] = js.undefined
  
  var `control-point-step-size`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  
  var `control-point-weight`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  
  var `control-point-weights`: js.UndefOr[PropertyValueEdge[Double | js.Array[Double] | String]] = js.undefined
  
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
  
  var display: js.UndefOr[PropertyValue[EdgeSingular, none | element]] = js.undefined
  
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
  
  var `line-gradient-stop-colors`: js.UndefOr[js.Array[PropertyValueEdge[Colour]]] = js.undefined
  
  var `line-gradient-stop-positions`: js.UndefOr[js.Array[PropertyValueEdge[Double]]] = js.undefined
  
  var `line-height`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  
  /**
    * The opacity of the edge’s line and arrow. Useful if you wish to have a separate opacity for the edge
    * label versus the edge line. Note that the opacity value of the edge element affects the effective
    * opacity of its line and label subcomponents.
    *
    * Value between `0` and `1` inclusive.
    */
  var `line-opacity`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  
  /**
    * The style of the edge’s line.
    */
  var `line-style`: js.UndefOr[PropertyValueEdge[LineStyle]] = js.undefined
  
  var `loop-direction`: js.UndefOr[PropertyValueEdge[String]] = js.undefined
  
  var `loop-sweep`: js.UndefOr[PropertyValueEdge[String]] = js.undefined
  
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
  
  var `segment-distances`: js.UndefOr[PropertyValueEdge[Double | js.Array[Double] | String]] = js.undefined
  
  var `segment-weights`: js.UndefOr[PropertyValueEdge[Double | js.Array[Double] | String]] = js.undefined
  
  /** The colour of the edge’s source arrow. */
  var `source-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  
  /** The fill state of the edge’s source arrow. */
  var `source-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.undefined
  
  /** The shape of the edge’s source arrow. */
  var `source-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.undefined
  
  /**
    * The distance the edge ends from its source.
    */
  var `source-distance-from-node`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  
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
  
  var `source-text-rotation`: js.UndefOr[PropertyValue[EdgeSingular, Double | autorotate | none]] = js.undefined
  
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
  
  var `target-text-rotation`: js.UndefOr[PropertyValue[EdgeSingular, Double | autorotate | none]] = js.undefined
  
  var `taxi-direction`: js.UndefOr[
    PropertyValueEdge[auto | vertical | downward | upward | horizontal | rightward | leftward]
  ] = js.undefined
  
  var `taxi-turn`: js.UndefOr[PropertyValueEdge[Double | js.Array[Double] | String]] = js.undefined
  
  var `taxi-turn-min-distance`: js.UndefOr[PropertyValueEdge[Double | String]] = js.undefined
  
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
  
  var `text-justification`: js.UndefOr[PropertyValue[EdgeSingular, auto | left | center | right]] = js.undefined
  
  var `text-margin-x`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  
  var `text-margin-y`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  
  var `text-max-width`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.undefined
  
  var `text-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  
  var `text-outline-color`: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.undefined
  
  var `text-outline-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  
  var `text-outline-width`: js.UndefOr[PropertyValue[EdgeSingular, Double | String]] = js.undefined
  
  var `text-overflow-wrap`: js.UndefOr[PropertyValue[EdgeSingular, whitespace | anywhere]] = js.undefined
  
  var `text-rotation`: js.UndefOr[PropertyValue[EdgeSingular, Double | autorotate | none]] = js.undefined
  
  var `text-transform`: js.UndefOr[PropertyValue[EdgeSingular, TextTranformation]] = js.undefined
  
  var `text-valign`: js.UndefOr[PropertyValue[EdgeSingular, top | center | bottom]] = js.undefined
  
  var `text-wrap`: js.UndefOr[PropertyValue[EdgeSingular, none | wrap | ellipsis]] = js.undefined
  
  var `transition-delay`: js.UndefOr[Double] = js.undefined
  
  var `transition-duration`: js.UndefOr[Double] = js.undefined
  
  var `transition-property`: js.UndefOr[String] = js.undefined
  
  var `transition-timing-function`: js.UndefOr[TransitionTimingFunction] = js.undefined
  
  var visibility: js.UndefOr[PropertyValue[EdgeSingular, hidden | visible]] = js.undefined
  
  /**
    * The width of an edge’s line.
    */
  var width: js.UndefOr[PropertyValueEdge[Double | String]] = js.undefined
  
  var `z-compound-depth`: js.UndefOr[PropertyValue[EdgeSingular, auto | top | bottom | orphan]] = js.undefined
  
  var `z-index`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.undefined
  
  var `z-index-compare`: js.UndefOr[PropertyValue[EdgeSingular, auto | manual]] = js.undefined
}
object Edge {
  
  inline def apply(): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edge]
  }
  
  extension [Self <: Edge](x: Self) {
    
    inline def `setArrow-scale`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "arrow-scale", value.asInstanceOf[js.Any])
    
    inline def `setArrow-scaleFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "arrow-scale", js.Any.fromFunction1(value))
    
    inline def `setArrow-scaleUndefined`: Self = StObject.set(x, "arrow-scale", js.undefined)
    
    inline def setColor(value: PropertyValue[EdgeSingular, Colour]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction1(value: EdgeSingular => Colour): Self = StObject.set(x, "color", js.Any.fromFunction1(value))
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def `setControl-point-distance`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "control-point-distance", value.asInstanceOf[js.Any])
    
    inline def `setControl-point-distanceFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "control-point-distance", js.Any.fromFunction1(value))
    
    inline def `setControl-point-distanceUndefined`: Self = StObject.set(x, "control-point-distance", js.undefined)
    
    inline def `setControl-point-distances`(value: PropertyValueEdge[Double | js.Array[Double] | String]): Self = StObject.set(x, "control-point-distances", value.asInstanceOf[js.Any])
    
    inline def `setControl-point-distancesFunction1`(value: EdgeSingular => Double | js.Array[Double] | String): Self = StObject.set(x, "control-point-distances", js.Any.fromFunction1(value))
    
    inline def `setControl-point-distancesUndefined`: Self = StObject.set(x, "control-point-distances", js.undefined)
    
    inline def `setControl-point-distancesVarargs`(value: Double*): Self = StObject.set(x, "control-point-distances", js.Array(value*))
    
    inline def `setControl-point-step-size`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "control-point-step-size", value.asInstanceOf[js.Any])
    
    inline def `setControl-point-step-sizeFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "control-point-step-size", js.Any.fromFunction1(value))
    
    inline def `setControl-point-step-sizeUndefined`: Self = StObject.set(x, "control-point-step-size", js.undefined)
    
    inline def `setControl-point-weight`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "control-point-weight", value.asInstanceOf[js.Any])
    
    inline def `setControl-point-weightFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "control-point-weight", js.Any.fromFunction1(value))
    
    inline def `setControl-point-weightUndefined`: Self = StObject.set(x, "control-point-weight", js.undefined)
    
    inline def `setControl-point-weights`(value: PropertyValueEdge[Double | js.Array[Double] | String]): Self = StObject.set(x, "control-point-weights", value.asInstanceOf[js.Any])
    
    inline def `setControl-point-weightsFunction1`(value: EdgeSingular => Double | js.Array[Double] | String): Self = StObject.set(x, "control-point-weights", js.Any.fromFunction1(value))
    
    inline def `setControl-point-weightsUndefined`: Self = StObject.set(x, "control-point-weights", js.undefined)
    
    inline def `setControl-point-weightsVarargs`(value: Double*): Self = StObject.set(x, "control-point-weights", js.Array(value*))
    
    inline def `setCurve-style`(value: PropertyValueEdge[haystack | straight | bezier | `unbundled-bezier` | segments | taxi]): Self = StObject.set(x, "curve-style", value.asInstanceOf[js.Any])
    
    inline def `setCurve-styleFunction1`(value: EdgeSingular => haystack | straight | bezier | `unbundled-bezier` | segments | taxi): Self = StObject.set(x, "curve-style", js.Any.fromFunction1(value))
    
    inline def `setCurve-styleUndefined`: Self = StObject.set(x, "curve-style", js.undefined)
    
    inline def setDisplay(value: PropertyValue[EdgeSingular, none | element]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayFunction1(value: EdgeSingular => none | element): Self = StObject.set(x, "display", js.Any.fromFunction1(value))
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def `setEdge-distances`(value: PropertyValueEdge[intersection | `node-position`]): Self = StObject.set(x, "edge-distances", value.asInstanceOf[js.Any])
    
    inline def `setEdge-distancesFunction1`(value: EdgeSingular => intersection | `node-position`): Self = StObject.set(x, "edge-distances", js.Any.fromFunction1(value))
    
    inline def `setEdge-distancesUndefined`: Self = StObject.set(x, "edge-distances", js.undefined)
    
    inline def setEvents(value: PropertyValue[EdgeSingular, yes | no]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsFunction1(value: EdgeSingular => yes | no): Self = StObject.set(x, "events", js.Any.fromFunction1(value))
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def `setFont-family`(value: PropertyValue[EdgeSingular, String]): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    inline def `setFont-familyFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "font-family", js.Any.fromFunction1(value))
    
    inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    inline def `setFont-size`(value: PropertyValue[EdgeSingular, Double | String]): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    inline def `setFont-sizeFunction1`(value: EdgeSingular => Double | String): Self = StObject.set(x, "font-size", js.Any.fromFunction1(value))
    
    inline def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    inline def `setFont-style`(value: PropertyValue[EdgeSingular, FontStyle]): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    inline def `setFont-styleFunction1`(value: EdgeSingular => FontStyle): Self = StObject.set(x, "font-style", js.Any.fromFunction1(value))
    
    inline def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    inline def `setFont-weight`(value: PropertyValue[EdgeSingular, FontWeight]): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    inline def `setFont-weightFunction1`(value: EdgeSingular => FontWeight): Self = StObject.set(x, "font-weight", js.Any.fromFunction1(value))
    
    inline def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    inline def `setHaystack-radius`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "haystack-radius", value.asInstanceOf[js.Any])
    
    inline def `setHaystack-radiusFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "haystack-radius", js.Any.fromFunction1(value))
    
    inline def `setHaystack-radiusUndefined`: Self = StObject.set(x, "haystack-radius", js.undefined)
    
    inline def setLabel(value: PropertyValue[EdgeSingular, String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(value: EdgeSingular => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def `setLine-cap`(value: PropertyValueEdge[butt | round | square]): Self = StObject.set(x, "line-cap", value.asInstanceOf[js.Any])
    
    inline def `setLine-capFunction1`(value: EdgeSingular => butt | round | square): Self = StObject.set(x, "line-cap", js.Any.fromFunction1(value))
    
    inline def `setLine-capUndefined`: Self = StObject.set(x, "line-cap", js.undefined)
    
    inline def `setLine-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "line-color", value.asInstanceOf[js.Any])
    
    inline def `setLine-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "line-color", js.Any.fromFunction1(value))
    
    inline def `setLine-colorUndefined`: Self = StObject.set(x, "line-color", js.undefined)
    
    inline def `setLine-dash-offset`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "line-dash-offset", value.asInstanceOf[js.Any])
    
    inline def `setLine-dash-offsetFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "line-dash-offset", js.Any.fromFunction1(value))
    
    inline def `setLine-dash-offsetUndefined`: Self = StObject.set(x, "line-dash-offset", js.undefined)
    
    inline def `setLine-dash-pattern`(value: js.Array[PropertyValueEdge[Double]]): Self = StObject.set(x, "line-dash-pattern", value.asInstanceOf[js.Any])
    
    inline def `setLine-dash-patternUndefined`: Self = StObject.set(x, "line-dash-pattern", js.undefined)
    
    inline def `setLine-dash-patternVarargs`(value: PropertyValueEdge[Double]*): Self = StObject.set(x, "line-dash-pattern", js.Array(value*))
    
    inline def `setLine-fill`(value: PropertyValueEdge[solid | `linear-gradient` | `radial-gradient`]): Self = StObject.set(x, "line-fill", value.asInstanceOf[js.Any])
    
    inline def `setLine-fillFunction1`(value: EdgeSingular => solid | `linear-gradient` | `radial-gradient`): Self = StObject.set(x, "line-fill", js.Any.fromFunction1(value))
    
    inline def `setLine-fillUndefined`: Self = StObject.set(x, "line-fill", js.undefined)
    
    inline def `setLine-gradient-stop-colors`(value: js.Array[PropertyValueEdge[Colour]]): Self = StObject.set(x, "line-gradient-stop-colors", value.asInstanceOf[js.Any])
    
    inline def `setLine-gradient-stop-colorsUndefined`: Self = StObject.set(x, "line-gradient-stop-colors", js.undefined)
    
    inline def `setLine-gradient-stop-colorsVarargs`(value: PropertyValueEdge[Colour]*): Self = StObject.set(x, "line-gradient-stop-colors", js.Array(value*))
    
    inline def `setLine-gradient-stop-positions`(value: js.Array[PropertyValueEdge[Double]]): Self = StObject.set(x, "line-gradient-stop-positions", value.asInstanceOf[js.Any])
    
    inline def `setLine-gradient-stop-positionsUndefined`: Self = StObject.set(x, "line-gradient-stop-positions", js.undefined)
    
    inline def `setLine-gradient-stop-positionsVarargs`(value: PropertyValueEdge[Double]*): Self = StObject.set(x, "line-gradient-stop-positions", js.Array(value*))
    
    inline def `setLine-height`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "line-height", value.asInstanceOf[js.Any])
    
    inline def `setLine-heightFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "line-height", js.Any.fromFunction1(value))
    
    inline def `setLine-heightUndefined`: Self = StObject.set(x, "line-height", js.undefined)
    
    inline def `setLine-opacity`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "line-opacity", value.asInstanceOf[js.Any])
    
    inline def `setLine-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "line-opacity", js.Any.fromFunction1(value))
    
    inline def `setLine-opacityUndefined`: Self = StObject.set(x, "line-opacity", js.undefined)
    
    inline def `setLine-style`(value: PropertyValueEdge[LineStyle]): Self = StObject.set(x, "line-style", value.asInstanceOf[js.Any])
    
    inline def `setLine-styleFunction1`(value: EdgeSingular => LineStyle): Self = StObject.set(x, "line-style", js.Any.fromFunction1(value))
    
    inline def `setLine-styleUndefined`: Self = StObject.set(x, "line-style", js.undefined)
    
    inline def `setLoop-direction`(value: PropertyValueEdge[String]): Self = StObject.set(x, "loop-direction", value.asInstanceOf[js.Any])
    
    inline def `setLoop-directionFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "loop-direction", js.Any.fromFunction1(value))
    
    inline def `setLoop-directionUndefined`: Self = StObject.set(x, "loop-direction", js.undefined)
    
    inline def `setLoop-sweep`(value: PropertyValueEdge[String]): Self = StObject.set(x, "loop-sweep", value.asInstanceOf[js.Any])
    
    inline def `setLoop-sweepFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "loop-sweep", js.Any.fromFunction1(value))
    
    inline def `setLoop-sweepUndefined`: Self = StObject.set(x, "loop-sweep", js.undefined)
    
    inline def `setMid-source-arrow-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "mid-source-arrow-color", value.asInstanceOf[js.Any])
    
    inline def `setMid-source-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "mid-source-arrow-color", js.Any.fromFunction1(value))
    
    inline def `setMid-source-arrow-colorUndefined`: Self = StObject.set(x, "mid-source-arrow-color", js.undefined)
    
    inline def `setMid-source-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = StObject.set(x, "mid-source-arrow-fill", value.asInstanceOf[js.Any])
    
    inline def `setMid-source-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = StObject.set(x, "mid-source-arrow-fill", js.Any.fromFunction1(value))
    
    inline def `setMid-source-arrow-fillUndefined`: Self = StObject.set(x, "mid-source-arrow-fill", js.undefined)
    
    inline def `setMid-source-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = StObject.set(x, "mid-source-arrow-shape", value.asInstanceOf[js.Any])
    
    inline def `setMid-source-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = StObject.set(x, "mid-source-arrow-shape", js.Any.fromFunction1(value))
    
    inline def `setMid-source-arrow-shapeUndefined`: Self = StObject.set(x, "mid-source-arrow-shape", js.undefined)
    
    inline def `setMid-target-arrow-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "mid-target-arrow-color", value.asInstanceOf[js.Any])
    
    inline def `setMid-target-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "mid-target-arrow-color", js.Any.fromFunction1(value))
    
    inline def `setMid-target-arrow-colorUndefined`: Self = StObject.set(x, "mid-target-arrow-color", js.undefined)
    
    inline def `setMid-target-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = StObject.set(x, "mid-target-arrow-fill", value.asInstanceOf[js.Any])
    
    inline def `setMid-target-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = StObject.set(x, "mid-target-arrow-fill", js.Any.fromFunction1(value))
    
    inline def `setMid-target-arrow-fillUndefined`: Self = StObject.set(x, "mid-target-arrow-fill", js.undefined)
    
    inline def `setMid-target-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = StObject.set(x, "mid-target-arrow-shape", value.asInstanceOf[js.Any])
    
    inline def `setMid-target-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = StObject.set(x, "mid-target-arrow-shape", js.Any.fromFunction1(value))
    
    inline def `setMid-target-arrow-shapeUndefined`: Self = StObject.set(x, "mid-target-arrow-shape", js.undefined)
    
    inline def `setMin-zoomed-font-size`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "min-zoomed-font-size", value.asInstanceOf[js.Any])
    
    inline def `setMin-zoomed-font-sizeFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "min-zoomed-font-size", js.Any.fromFunction1(value))
    
    inline def `setMin-zoomed-font-sizeUndefined`: Self = StObject.set(x, "min-zoomed-font-size", js.undefined)
    
    inline def setOpacity(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityFunction1(value: EdgeSingular => Double): Self = StObject.set(x, "opacity", js.Any.fromFunction1(value))
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def `setOverlay-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "overlay-color", value.asInstanceOf[js.Any])
    
    inline def `setOverlay-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "overlay-color", js.Any.fromFunction1(value))
    
    inline def `setOverlay-colorUndefined`: Self = StObject.set(x, "overlay-color", js.undefined)
    
    inline def `setOverlay-opacity`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "overlay-opacity", value.asInstanceOf[js.Any])
    
    inline def `setOverlay-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "overlay-opacity", js.Any.fromFunction1(value))
    
    inline def `setOverlay-opacityUndefined`: Self = StObject.set(x, "overlay-opacity", js.undefined)
    
    inline def `setOverlay-padding`(value: PropertyValueEdge[Double | String]): Self = StObject.set(x, "overlay-padding", value.asInstanceOf[js.Any])
    
    inline def `setOverlay-paddingFunction1`(value: EdgeSingular => Double | String): Self = StObject.set(x, "overlay-padding", js.Any.fromFunction1(value))
    
    inline def `setOverlay-paddingUndefined`: Self = StObject.set(x, "overlay-padding", js.undefined)
    
    inline def `setSegment-distances`(value: PropertyValueEdge[Double | js.Array[Double] | String]): Self = StObject.set(x, "segment-distances", value.asInstanceOf[js.Any])
    
    inline def `setSegment-distancesFunction1`(value: EdgeSingular => Double | js.Array[Double] | String): Self = StObject.set(x, "segment-distances", js.Any.fromFunction1(value))
    
    inline def `setSegment-distancesUndefined`: Self = StObject.set(x, "segment-distances", js.undefined)
    
    inline def `setSegment-distancesVarargs`(value: Double*): Self = StObject.set(x, "segment-distances", js.Array(value*))
    
    inline def `setSegment-weights`(value: PropertyValueEdge[Double | js.Array[Double] | String]): Self = StObject.set(x, "segment-weights", value.asInstanceOf[js.Any])
    
    inline def `setSegment-weightsFunction1`(value: EdgeSingular => Double | js.Array[Double] | String): Self = StObject.set(x, "segment-weights", js.Any.fromFunction1(value))
    
    inline def `setSegment-weightsUndefined`: Self = StObject.set(x, "segment-weights", js.undefined)
    
    inline def `setSegment-weightsVarargs`(value: Double*): Self = StObject.set(x, "segment-weights", js.Array(value*))
    
    inline def `setSource-arrow-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "source-arrow-color", value.asInstanceOf[js.Any])
    
    inline def `setSource-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "source-arrow-color", js.Any.fromFunction1(value))
    
    inline def `setSource-arrow-colorUndefined`: Self = StObject.set(x, "source-arrow-color", js.undefined)
    
    inline def `setSource-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = StObject.set(x, "source-arrow-fill", value.asInstanceOf[js.Any])
    
    inline def `setSource-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = StObject.set(x, "source-arrow-fill", js.Any.fromFunction1(value))
    
    inline def `setSource-arrow-fillUndefined`: Self = StObject.set(x, "source-arrow-fill", js.undefined)
    
    inline def `setSource-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = StObject.set(x, "source-arrow-shape", value.asInstanceOf[js.Any])
    
    inline def `setSource-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = StObject.set(x, "source-arrow-shape", js.Any.fromFunction1(value))
    
    inline def `setSource-arrow-shapeUndefined`: Self = StObject.set(x, "source-arrow-shape", js.undefined)
    
    inline def `setSource-distance-from-node`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "source-distance-from-node", value.asInstanceOf[js.Any])
    
    inline def `setSource-distance-from-nodeFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "source-distance-from-node", js.Any.fromFunction1(value))
    
    inline def `setSource-distance-from-nodeUndefined`: Self = StObject.set(x, "source-distance-from-node", js.undefined)
    
    inline def `setSource-endpoint`(
      value: PropertyValue[
          EdgeSingular, 
          `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
        ]
    ): Self = StObject.set(x, "source-endpoint", value.asInstanceOf[js.Any])
    
    inline def `setSource-endpointFunction1`(
      value: EdgeSingular => `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ): Self = StObject.set(x, "source-endpoint", js.Any.fromFunction1(value))
    
    inline def `setSource-endpointUndefined`: Self = StObject.set(x, "source-endpoint", js.undefined)
    
    inline def `setSource-label`(value: PropertyValue[EdgeSingular, String]): Self = StObject.set(x, "source-label", value.asInstanceOf[js.Any])
    
    inline def `setSource-labelFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "source-label", js.Any.fromFunction1(value))
    
    inline def `setSource-labelUndefined`: Self = StObject.set(x, "source-label", js.undefined)
    
    inline def `setSource-text-margin-x`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "source-text-margin-x", value.asInstanceOf[js.Any])
    
    inline def `setSource-text-margin-xFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "source-text-margin-x", js.Any.fromFunction1(value))
    
    inline def `setSource-text-margin-xUndefined`: Self = StObject.set(x, "source-text-margin-x", js.undefined)
    
    inline def `setSource-text-margin-y`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "source-text-margin-y", value.asInstanceOf[js.Any])
    
    inline def `setSource-text-margin-yFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "source-text-margin-y", js.Any.fromFunction1(value))
    
    inline def `setSource-text-margin-yUndefined`: Self = StObject.set(x, "source-text-margin-y", js.undefined)
    
    inline def `setSource-text-offset`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "source-text-offset", value.asInstanceOf[js.Any])
    
    inline def `setSource-text-offsetFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "source-text-offset", js.Any.fromFunction1(value))
    
    inline def `setSource-text-offsetUndefined`: Self = StObject.set(x, "source-text-offset", js.undefined)
    
    inline def `setSource-text-rotation`(value: PropertyValue[EdgeSingular, Double | autorotate | none]): Self = StObject.set(x, "source-text-rotation", value.asInstanceOf[js.Any])
    
    inline def `setSource-text-rotationFunction1`(value: EdgeSingular => Double | autorotate | none): Self = StObject.set(x, "source-text-rotation", js.Any.fromFunction1(value))
    
    inline def `setSource-text-rotationUndefined`: Self = StObject.set(x, "source-text-rotation", js.undefined)
    
    inline def `setTarget-arrow-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "target-arrow-color", value.asInstanceOf[js.Any])
    
    inline def `setTarget-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "target-arrow-color", js.Any.fromFunction1(value))
    
    inline def `setTarget-arrow-colorUndefined`: Self = StObject.set(x, "target-arrow-color", js.undefined)
    
    inline def `setTarget-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = StObject.set(x, "target-arrow-fill", value.asInstanceOf[js.Any])
    
    inline def `setTarget-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = StObject.set(x, "target-arrow-fill", js.Any.fromFunction1(value))
    
    inline def `setTarget-arrow-fillUndefined`: Self = StObject.set(x, "target-arrow-fill", js.undefined)
    
    inline def `setTarget-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = StObject.set(x, "target-arrow-shape", value.asInstanceOf[js.Any])
    
    inline def `setTarget-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = StObject.set(x, "target-arrow-shape", js.Any.fromFunction1(value))
    
    inline def `setTarget-arrow-shapeUndefined`: Self = StObject.set(x, "target-arrow-shape", js.undefined)
    
    inline def `setTarget-distance-from-node`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "target-distance-from-node", value.asInstanceOf[js.Any])
    
    inline def `setTarget-distance-from-nodeFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "target-distance-from-node", js.Any.fromFunction1(value))
    
    inline def `setTarget-distance-from-nodeUndefined`: Self = StObject.set(x, "target-distance-from-node", js.undefined)
    
    inline def `setTarget-endpoint`(
      value: PropertyValue[
          EdgeSingular, 
          `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
        ]
    ): Self = StObject.set(x, "target-endpoint", value.asInstanceOf[js.Any])
    
    inline def `setTarget-endpointFunction1`(
      value: EdgeSingular => `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ): Self = StObject.set(x, "target-endpoint", js.Any.fromFunction1(value))
    
    inline def `setTarget-endpointUndefined`: Self = StObject.set(x, "target-endpoint", js.undefined)
    
    inline def `setTarget-label`(value: PropertyValue[EdgeSingular, String]): Self = StObject.set(x, "target-label", value.asInstanceOf[js.Any])
    
    inline def `setTarget-labelFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "target-label", js.Any.fromFunction1(value))
    
    inline def `setTarget-labelUndefined`: Self = StObject.set(x, "target-label", js.undefined)
    
    inline def `setTarget-text-margin-x`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "target-text-margin-x", value.asInstanceOf[js.Any])
    
    inline def `setTarget-text-margin-xFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "target-text-margin-x", js.Any.fromFunction1(value))
    
    inline def `setTarget-text-margin-xUndefined`: Self = StObject.set(x, "target-text-margin-x", js.undefined)
    
    inline def `setTarget-text-margin-y`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "target-text-margin-y", value.asInstanceOf[js.Any])
    
    inline def `setTarget-text-margin-yFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "target-text-margin-y", js.Any.fromFunction1(value))
    
    inline def `setTarget-text-margin-yUndefined`: Self = StObject.set(x, "target-text-margin-y", js.undefined)
    
    inline def `setTarget-text-offset`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "target-text-offset", value.asInstanceOf[js.Any])
    
    inline def `setTarget-text-offsetFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "target-text-offset", js.Any.fromFunction1(value))
    
    inline def `setTarget-text-offsetUndefined`: Self = StObject.set(x, "target-text-offset", js.undefined)
    
    inline def `setTarget-text-rotation`(value: PropertyValue[EdgeSingular, Double | autorotate | none]): Self = StObject.set(x, "target-text-rotation", value.asInstanceOf[js.Any])
    
    inline def `setTarget-text-rotationFunction1`(value: EdgeSingular => Double | autorotate | none): Self = StObject.set(x, "target-text-rotation", js.Any.fromFunction1(value))
    
    inline def `setTarget-text-rotationUndefined`: Self = StObject.set(x, "target-text-rotation", js.undefined)
    
    inline def `setTaxi-direction`(value: PropertyValueEdge[auto | vertical | downward | upward | horizontal | rightward | leftward]): Self = StObject.set(x, "taxi-direction", value.asInstanceOf[js.Any])
    
    inline def `setTaxi-directionFunction1`(value: EdgeSingular => auto | vertical | downward | upward | horizontal | rightward | leftward): Self = StObject.set(x, "taxi-direction", js.Any.fromFunction1(value))
    
    inline def `setTaxi-directionUndefined`: Self = StObject.set(x, "taxi-direction", js.undefined)
    
    inline def `setTaxi-turn`(value: PropertyValueEdge[Double | js.Array[Double] | String]): Self = StObject.set(x, "taxi-turn", value.asInstanceOf[js.Any])
    
    inline def `setTaxi-turn-min-distance`(value: PropertyValueEdge[Double | String]): Self = StObject.set(x, "taxi-turn-min-distance", value.asInstanceOf[js.Any])
    
    inline def `setTaxi-turn-min-distanceFunction1`(value: EdgeSingular => Double | String): Self = StObject.set(x, "taxi-turn-min-distance", js.Any.fromFunction1(value))
    
    inline def `setTaxi-turn-min-distanceUndefined`: Self = StObject.set(x, "taxi-turn-min-distance", js.undefined)
    
    inline def `setTaxi-turnFunction1`(value: EdgeSingular => Double | js.Array[Double] | String): Self = StObject.set(x, "taxi-turn", js.Any.fromFunction1(value))
    
    inline def `setTaxi-turnUndefined`: Self = StObject.set(x, "taxi-turn", js.undefined)
    
    inline def `setTaxi-turnVarargs`(value: Double*): Self = StObject.set(x, "taxi-turn", js.Array(value*))
    
    inline def `setText-background-color`(value: PropertyValue[EdgeSingular, Colour]): Self = StObject.set(x, "text-background-color", value.asInstanceOf[js.Any])
    
    inline def `setText-background-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "text-background-color", js.Any.fromFunction1(value))
    
    inline def `setText-background-colorUndefined`: Self = StObject.set(x, "text-background-color", js.undefined)
    
    inline def `setText-background-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-background-opacity", value.asInstanceOf[js.Any])
    
    inline def `setText-background-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-background-opacity", js.Any.fromFunction1(value))
    
    inline def `setText-background-opacityUndefined`: Self = StObject.set(x, "text-background-opacity", js.undefined)
    
    inline def `setText-background-padding`(value: PropertyValue[EdgeSingular, String]): Self = StObject.set(x, "text-background-padding", value.asInstanceOf[js.Any])
    
    inline def `setText-background-paddingFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "text-background-padding", js.Any.fromFunction1(value))
    
    inline def `setText-background-paddingUndefined`: Self = StObject.set(x, "text-background-padding", js.undefined)
    
    inline def `setText-background-shape`(value: PropertyValue[EdgeSingular, rectangle | roundrectangle]): Self = StObject.set(x, "text-background-shape", value.asInstanceOf[js.Any])
    
    inline def `setText-background-shapeFunction1`(value: EdgeSingular => rectangle | roundrectangle): Self = StObject.set(x, "text-background-shape", js.Any.fromFunction1(value))
    
    inline def `setText-background-shapeUndefined`: Self = StObject.set(x, "text-background-shape", js.undefined)
    
    inline def `setText-border-color`(value: PropertyValue[EdgeSingular, Colour]): Self = StObject.set(x, "text-border-color", value.asInstanceOf[js.Any])
    
    inline def `setText-border-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "text-border-color", js.Any.fromFunction1(value))
    
    inline def `setText-border-colorUndefined`: Self = StObject.set(x, "text-border-color", js.undefined)
    
    inline def `setText-border-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-border-opacity", value.asInstanceOf[js.Any])
    
    inline def `setText-border-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-border-opacity", js.Any.fromFunction1(value))
    
    inline def `setText-border-opacityUndefined`: Self = StObject.set(x, "text-border-opacity", js.undefined)
    
    inline def `setText-border-style`(value: PropertyValue[EdgeSingular, LineStyle]): Self = StObject.set(x, "text-border-style", value.asInstanceOf[js.Any])
    
    inline def `setText-border-styleFunction1`(value: EdgeSingular => LineStyle): Self = StObject.set(x, "text-border-style", js.Any.fromFunction1(value))
    
    inline def `setText-border-styleUndefined`: Self = StObject.set(x, "text-border-style", js.undefined)
    
    inline def `setText-border-width`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-border-width", value.asInstanceOf[js.Any])
    
    inline def `setText-border-widthFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-border-width", js.Any.fromFunction1(value))
    
    inline def `setText-border-widthUndefined`: Self = StObject.set(x, "text-border-width", js.undefined)
    
    inline def `setText-events`(value: PropertyValue[EdgeSingular, yes | no]): Self = StObject.set(x, "text-events", value.asInstanceOf[js.Any])
    
    inline def `setText-eventsFunction1`(value: EdgeSingular => yes | no): Self = StObject.set(x, "text-events", js.Any.fromFunction1(value))
    
    inline def `setText-eventsUndefined`: Self = StObject.set(x, "text-events", js.undefined)
    
    inline def `setText-halign`(value: PropertyValue[EdgeSingular, left | center | right]): Self = StObject.set(x, "text-halign", value.asInstanceOf[js.Any])
    
    inline def `setText-halignFunction1`(value: EdgeSingular => left | center | right): Self = StObject.set(x, "text-halign", js.Any.fromFunction1(value))
    
    inline def `setText-halignUndefined`: Self = StObject.set(x, "text-halign", js.undefined)
    
    inline def `setText-justification`(value: PropertyValue[EdgeSingular, auto | left | center | right]): Self = StObject.set(x, "text-justification", value.asInstanceOf[js.Any])
    
    inline def `setText-justificationFunction1`(value: EdgeSingular => auto | left | center | right): Self = StObject.set(x, "text-justification", js.Any.fromFunction1(value))
    
    inline def `setText-justificationUndefined`: Self = StObject.set(x, "text-justification", js.undefined)
    
    inline def `setText-margin-x`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-margin-x", value.asInstanceOf[js.Any])
    
    inline def `setText-margin-xFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-margin-x", js.Any.fromFunction1(value))
    
    inline def `setText-margin-xUndefined`: Self = StObject.set(x, "text-margin-x", js.undefined)
    
    inline def `setText-margin-y`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-margin-y", value.asInstanceOf[js.Any])
    
    inline def `setText-margin-yFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-margin-y", js.Any.fromFunction1(value))
    
    inline def `setText-margin-yUndefined`: Self = StObject.set(x, "text-margin-y", js.undefined)
    
    inline def `setText-max-width`(value: PropertyValue[EdgeSingular, String]): Self = StObject.set(x, "text-max-width", value.asInstanceOf[js.Any])
    
    inline def `setText-max-widthFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "text-max-width", js.Any.fromFunction1(value))
    
    inline def `setText-max-widthUndefined`: Self = StObject.set(x, "text-max-width", js.undefined)
    
    inline def `setText-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-opacity", value.asInstanceOf[js.Any])
    
    inline def `setText-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-opacity", js.Any.fromFunction1(value))
    
    inline def `setText-opacityUndefined`: Self = StObject.set(x, "text-opacity", js.undefined)
    
    inline def `setText-outline-color`(value: PropertyValue[EdgeSingular, Colour]): Self = StObject.set(x, "text-outline-color", value.asInstanceOf[js.Any])
    
    inline def `setText-outline-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "text-outline-color", js.Any.fromFunction1(value))
    
    inline def `setText-outline-colorUndefined`: Self = StObject.set(x, "text-outline-color", js.undefined)
    
    inline def `setText-outline-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "text-outline-opacity", value.asInstanceOf[js.Any])
    
    inline def `setText-outline-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "text-outline-opacity", js.Any.fromFunction1(value))
    
    inline def `setText-outline-opacityUndefined`: Self = StObject.set(x, "text-outline-opacity", js.undefined)
    
    inline def `setText-outline-width`(value: PropertyValue[EdgeSingular, Double | String]): Self = StObject.set(x, "text-outline-width", value.asInstanceOf[js.Any])
    
    inline def `setText-outline-widthFunction1`(value: EdgeSingular => Double | String): Self = StObject.set(x, "text-outline-width", js.Any.fromFunction1(value))
    
    inline def `setText-outline-widthUndefined`: Self = StObject.set(x, "text-outline-width", js.undefined)
    
    inline def `setText-overflow-wrap`(value: PropertyValue[EdgeSingular, whitespace | anywhere]): Self = StObject.set(x, "text-overflow-wrap", value.asInstanceOf[js.Any])
    
    inline def `setText-overflow-wrapFunction1`(value: EdgeSingular => whitespace | anywhere): Self = StObject.set(x, "text-overflow-wrap", js.Any.fromFunction1(value))
    
    inline def `setText-overflow-wrapUndefined`: Self = StObject.set(x, "text-overflow-wrap", js.undefined)
    
    inline def `setText-rotation`(value: PropertyValue[EdgeSingular, Double | autorotate | none]): Self = StObject.set(x, "text-rotation", value.asInstanceOf[js.Any])
    
    inline def `setText-rotationFunction1`(value: EdgeSingular => Double | autorotate | none): Self = StObject.set(x, "text-rotation", js.Any.fromFunction1(value))
    
    inline def `setText-rotationUndefined`: Self = StObject.set(x, "text-rotation", js.undefined)
    
    inline def `setText-transform`(value: PropertyValue[EdgeSingular, TextTranformation]): Self = StObject.set(x, "text-transform", value.asInstanceOf[js.Any])
    
    inline def `setText-transformFunction1`(value: EdgeSingular => TextTranformation): Self = StObject.set(x, "text-transform", js.Any.fromFunction1(value))
    
    inline def `setText-transformUndefined`: Self = StObject.set(x, "text-transform", js.undefined)
    
    inline def `setText-valign`(value: PropertyValue[EdgeSingular, top | center | bottom]): Self = StObject.set(x, "text-valign", value.asInstanceOf[js.Any])
    
    inline def `setText-valignFunction1`(value: EdgeSingular => top | center | bottom): Self = StObject.set(x, "text-valign", js.Any.fromFunction1(value))
    
    inline def `setText-valignUndefined`: Self = StObject.set(x, "text-valign", js.undefined)
    
    inline def `setText-wrap`(value: PropertyValue[EdgeSingular, none | wrap | ellipsis]): Self = StObject.set(x, "text-wrap", value.asInstanceOf[js.Any])
    
    inline def `setText-wrapFunction1`(value: EdgeSingular => none | wrap | ellipsis): Self = StObject.set(x, "text-wrap", js.Any.fromFunction1(value))
    
    inline def `setText-wrapUndefined`: Self = StObject.set(x, "text-wrap", js.undefined)
    
    inline def `setTransition-delay`(value: Double): Self = StObject.set(x, "transition-delay", value.asInstanceOf[js.Any])
    
    inline def `setTransition-delayUndefined`: Self = StObject.set(x, "transition-delay", js.undefined)
    
    inline def `setTransition-duration`(value: Double): Self = StObject.set(x, "transition-duration", value.asInstanceOf[js.Any])
    
    inline def `setTransition-durationUndefined`: Self = StObject.set(x, "transition-duration", js.undefined)
    
    inline def `setTransition-property`(value: String): Self = StObject.set(x, "transition-property", value.asInstanceOf[js.Any])
    
    inline def `setTransition-propertyUndefined`: Self = StObject.set(x, "transition-property", js.undefined)
    
    inline def `setTransition-timing-function`(value: TransitionTimingFunction): Self = StObject.set(x, "transition-timing-function", value.asInstanceOf[js.Any])
    
    inline def `setTransition-timing-functionUndefined`: Self = StObject.set(x, "transition-timing-function", js.undefined)
    
    inline def setVisibility(value: PropertyValue[EdgeSingular, hidden | visible]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityFunction1(value: EdgeSingular => hidden | visible): Self = StObject.set(x, "visibility", js.Any.fromFunction1(value))
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def setWidth(value: PropertyValueEdge[Double | String]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthFunction1(value: EdgeSingular => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def `setZ-compound-depth`(value: PropertyValue[EdgeSingular, auto | top | bottom | orphan]): Self = StObject.set(x, "z-compound-depth", value.asInstanceOf[js.Any])
    
    inline def `setZ-compound-depthFunction1`(value: EdgeSingular => auto | top | bottom | orphan): Self = StObject.set(x, "z-compound-depth", js.Any.fromFunction1(value))
    
    inline def `setZ-compound-depthUndefined`: Self = StObject.set(x, "z-compound-depth", js.undefined)
    
    inline def `setZ-index`(value: PropertyValue[EdgeSingular, Double]): Self = StObject.set(x, "z-index", value.asInstanceOf[js.Any])
    
    inline def `setZ-index-compare`(value: PropertyValue[EdgeSingular, auto | manual]): Self = StObject.set(x, "z-index-compare", value.asInstanceOf[js.Any])
    
    inline def `setZ-index-compareFunction1`(value: EdgeSingular => auto | manual): Self = StObject.set(x, "z-index-compare", js.Any.fromFunction1(value))
    
    inline def `setZ-index-compareUndefined`: Self = StObject.set(x, "z-index-compare", js.undefined)
    
    inline def `setZ-indexFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "z-index", js.Any.fromFunction1(value))
    
    inline def `setZ-indexUndefined`: Self = StObject.set(x, "z-index", js.undefined)
  }
}
