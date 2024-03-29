package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/edge-points
  */
trait EdgeSingularPoints extends StObject {
  
  /**
    * Get an array of control point model positions for a {@code curve-style: bezier) or {@code curve-style: unbundled-bezier} edge.
    *
    * While the control points may be specified relatively in the CSS,
    * this function returns the absolute model positions of the control points.
    * The points are specified in the order of source-to-target direction.
    * This function works for bundled beziers, but it is not applicable to the middle, straight-line edge in the bundle.
    */
  def controlPoints(): js.Array[Position]
  
  /**
    * Get the model position of the midpoint of the edge.
    *
    * The midpoint is, by default, where the edge’s label is centred. It is also the position towards which mid arrows point.
    * For curve-style: unbundled-bezier edges, the midpoint is the middle extremum if the number of control points is odd.
    * For an even number of control points, the midpoint is where the two middle-most control points meet.
    * This is the middle inflection point for bilaterally symmetric or skew symmetric edges, for example.
    * For curve-style: segments edges, the midpoint is the middle segment point if the number of segment points is odd.
    * For an even number of segment points, the overall midpoint is the midpoint of the middle-most line segment (i.e. the mean of the middle two segment points).
    */
  def midpoint(): Position
  
  /**
    * Get an array of segment point model positions (i.e. bend points) for a {@code curve-style: segments} edge.
    *
    * While the segment points may be specified relatively in the stylesheet,
    * this function returns the absolute model positions of the segment points.
    * The points are specified in the order of source-to-target direction.
    */
  def segmentPoints(): js.Array[Position]
  
  /**
    * Get the model position of where the edge ends, towards the source node.
    */
  def sourceEndpoint(): Position
  
  /**
    * Get the model position of where the edge ends, towards the target node.
    */
  def targetEndpoint(): Position
}
object EdgeSingularPoints {
  
  inline def apply(
    controlPoints: () => js.Array[Position],
    midpoint: () => Position,
    segmentPoints: () => js.Array[Position],
    sourceEndpoint: () => Position,
    targetEndpoint: () => Position
  ): EdgeSingularPoints = {
    val __obj = js.Dynamic.literal(controlPoints = js.Any.fromFunction0(controlPoints), midpoint = js.Any.fromFunction0(midpoint), segmentPoints = js.Any.fromFunction0(segmentPoints), sourceEndpoint = js.Any.fromFunction0(sourceEndpoint), targetEndpoint = js.Any.fromFunction0(targetEndpoint))
    __obj.asInstanceOf[EdgeSingularPoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdgeSingularPoints] (val x: Self) extends AnyVal {
    
    inline def setControlPoints(value: () => js.Array[Position]): Self = StObject.set(x, "controlPoints", js.Any.fromFunction0(value))
    
    inline def setMidpoint(value: () => Position): Self = StObject.set(x, "midpoint", js.Any.fromFunction0(value))
    
    inline def setSegmentPoints(value: () => js.Array[Position]): Self = StObject.set(x, "segmentPoints", js.Any.fromFunction0(value))
    
    inline def setSourceEndpoint(value: () => Position): Self = StObject.set(x, "sourceEndpoint", js.Any.fromFunction0(value))
    
    inline def setTargetEndpoint(value: () => Position): Self = StObject.set(x, "targetEndpoint", js.Any.fromFunction0(value))
  }
}
