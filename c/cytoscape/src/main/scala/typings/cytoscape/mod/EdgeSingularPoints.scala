package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/edge-points
  */
@js.native
trait EdgeSingularPoints extends js.Object {
  
  /**
    * Get an array of control point model positions for a {@code curve-style: bezier) or {@code curve-style: unbundled-bezier} edge.
    *
    * While the control points may be specified relatively in the CSS,
    * this function returns the absolute model positions of the control points.
    * The points are specified in the order of source-to-target direction.
    * This function works for bundled beziers, but it is not applicable to the middle, straight-line edge in the bundle.
    */
  def controlPoints(): js.Array[Position] = js.native
  
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
  def midpoint(): Position = js.native
  
  /**
    * Get an array of segment point model positions (i.e. bend points) for a {@code curve-style: segments} edge.
    *
    * While the segment points may be specified relatively in the stylesheet,
    * this function returns the absolute model positions of the segment points.
    * The points are specified in the order of source-to-target direction.
    */
  def segmentPoints(): js.Array[Position] = js.native
  
  /**
    * Get the model position of where the edge ends, towards the source node.
    */
  def sourceEndpoint(): Position = js.native
  
  /**
    * Get the model position of where the edge ends, towards the target node.
    */
  def targetEndpoint(): Position = js.native
}
object EdgeSingularPoints {
  
  @scala.inline
  def apply(
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
  implicit class EdgeSingularPointsOps[Self <: EdgeSingularPoints] (val x: Self) extends AnyVal {
    
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
    def setControlPoints(value: () => js.Array[Position]): Self = this.set("controlPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMidpoint(value: () => Position): Self = this.set("midpoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSegmentPoints(value: () => js.Array[Position]): Self = this.set("segmentPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSourceEndpoint(value: () => Position): Self = this.set("sourceEndpoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetEndpoint(value: () => Position): Self = this.set("targetEndpoint", js.Any.fromFunction0(value))
  }
}
