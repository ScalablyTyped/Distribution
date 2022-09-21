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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These properties affect the styling of an edge’s line:
  *
  * http://js.cytoscape.org/#style/edge-line
  */
trait EdgeLine extends StObject {
  
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
  
  /**
    * The distance the edge ends from its source.
    */
  var `source-distance-from-node`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  
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
  
  inline def apply(): EdgeLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeLine]
  }
  
  extension [Self <: EdgeLine](x: Self) {
    
    inline def `setCurve-style`(value: PropertyValueEdge[haystack | straight | bezier | `unbundled-bezier` | segments | taxi]): Self = StObject.set(x, "curve-style", value.asInstanceOf[js.Any])
    
    inline def `setCurve-styleFunction1`(value: EdgeSingular => haystack | straight | bezier | `unbundled-bezier` | segments | taxi): Self = StObject.set(x, "curve-style", js.Any.fromFunction1(value))
    
    inline def `setCurve-styleUndefined`: Self = StObject.set(x, "curve-style", js.undefined)
    
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
    
    inline def `setLine-opacity`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "line-opacity", value.asInstanceOf[js.Any])
    
    inline def `setLine-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "line-opacity", js.Any.fromFunction1(value))
    
    inline def `setLine-opacityUndefined`: Self = StObject.set(x, "line-opacity", js.undefined)
    
    inline def `setLine-style`(value: PropertyValueEdge[LineStyle]): Self = StObject.set(x, "line-style", value.asInstanceOf[js.Any])
    
    inline def `setLine-styleFunction1`(value: EdgeSingular => LineStyle): Self = StObject.set(x, "line-style", js.Any.fromFunction1(value))
    
    inline def `setLine-styleUndefined`: Self = StObject.set(x, "line-style", js.undefined)
    
    inline def `setSource-distance-from-node`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "source-distance-from-node", value.asInstanceOf[js.Any])
    
    inline def `setSource-distance-from-nodeFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "source-distance-from-node", js.Any.fromFunction1(value))
    
    inline def `setSource-distance-from-nodeUndefined`: Self = StObject.set(x, "source-distance-from-node", js.undefined)
    
    inline def `setTarget-distance-from-node`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "target-distance-from-node", value.asInstanceOf[js.Any])
    
    inline def `setTarget-distance-from-nodeFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "target-distance-from-node", js.Any.fromFunction1(value))
    
    inline def `setTarget-distance-from-nodeUndefined`: Self = StObject.set(x, "target-distance-from-node", js.undefined)
    
    inline def setWidth(value: PropertyValueEdge[Double | String]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthFunction1(value: EdgeSingular => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
