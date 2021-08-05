package typings.cytoscape.mod.Css

import typings.cytoscape.mod.EdgeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Edge arrow
  *  * <pos>-arrow-color : The colour of the edge’s source arrow.
  *  * <pos>-arrow-shape : The shape of the edge’s source arrow.
  *  * <pos>-arrow-fill : The fill state of the edge’s source arrow.
  *
  * For each edge arrow property above, replace <pos> with one of
  *  * source : Pointing towards the source node, at the end of the edge.
  *  * mid-source : Pointing towards the source node, at the middle of the edge.
  *  * target : Pointing towards the target node, at the end of the edge.
  *  * mid-target: Pointing towards the target node, at the middle of the edge.
  *
  * Only mid arrows are supported on haystack edges.
  * http://js.cytoscape.org/#style/edge-arrow
  */
trait EdgeArrow extends StObject {
  
  /** The size of the arrow. */
  var `arrow-scale`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  
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
  
  /** The colour of the edge’s source arrow. */
  var `source-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  
  /** The fill state of the edge’s source arrow. */
  var `source-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.undefined
  
  /** The shape of the edge’s source arrow. */
  var `source-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.undefined
  
  /** The colour of the edge’s target arrow. */
  var `target-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  
  /** The fill state of the edge’s target arrow. */
  var `target-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.undefined
  
  /** The shape of the edge’s target arrow. */
  var `target-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.undefined
}
object EdgeArrow {
  
  inline def apply(): EdgeArrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeArrow]
  }
  
  extension [Self <: EdgeArrow](x: Self) {
    
    inline def `setArrow-scale`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "arrow-scale", value.asInstanceOf[js.Any])
    
    inline def `setArrow-scaleFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "arrow-scale", js.Any.fromFunction1(value))
    
    inline def `setArrow-scaleUndefined`: Self = StObject.set(x, "arrow-scale", js.undefined)
    
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
    
    inline def `setSource-arrow-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "source-arrow-color", value.asInstanceOf[js.Any])
    
    inline def `setSource-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "source-arrow-color", js.Any.fromFunction1(value))
    
    inline def `setSource-arrow-colorUndefined`: Self = StObject.set(x, "source-arrow-color", js.undefined)
    
    inline def `setSource-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = StObject.set(x, "source-arrow-fill", value.asInstanceOf[js.Any])
    
    inline def `setSource-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = StObject.set(x, "source-arrow-fill", js.Any.fromFunction1(value))
    
    inline def `setSource-arrow-fillUndefined`: Self = StObject.set(x, "source-arrow-fill", js.undefined)
    
    inline def `setSource-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = StObject.set(x, "source-arrow-shape", value.asInstanceOf[js.Any])
    
    inline def `setSource-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = StObject.set(x, "source-arrow-shape", js.Any.fromFunction1(value))
    
    inline def `setSource-arrow-shapeUndefined`: Self = StObject.set(x, "source-arrow-shape", js.undefined)
    
    inline def `setTarget-arrow-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "target-arrow-color", value.asInstanceOf[js.Any])
    
    inline def `setTarget-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "target-arrow-color", js.Any.fromFunction1(value))
    
    inline def `setTarget-arrow-colorUndefined`: Self = StObject.set(x, "target-arrow-color", js.undefined)
    
    inline def `setTarget-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = StObject.set(x, "target-arrow-fill", value.asInstanceOf[js.Any])
    
    inline def `setTarget-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = StObject.set(x, "target-arrow-fill", js.Any.fromFunction1(value))
    
    inline def `setTarget-arrow-fillUndefined`: Self = StObject.set(x, "target-arrow-fill", js.undefined)
    
    inline def `setTarget-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = StObject.set(x, "target-arrow-shape", value.asInstanceOf[js.Any])
    
    inline def `setTarget-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = StObject.set(x, "target-arrow-shape", js.Any.fromFunction1(value))
    
    inline def `setTarget-arrow-shapeUndefined`: Self = StObject.set(x, "target-arrow-shape", js.undefined)
  }
}
