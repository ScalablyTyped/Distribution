package typings.bezierJs.BezierJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shape extends StObject {
  
  var back: Bezier
  
  var bbox: BBox
  
  var endcap: BezierCap
  
  var forward: Bezier
  
  def intersections(shape: Shape): js.Array[js.Array[Double | String]]
  
  var startcap: BezierCap
}
object Shape {
  
  @scala.inline
  def apply(
    back: Bezier,
    bbox: BBox,
    endcap: BezierCap,
    forward: Bezier,
    intersections: Shape => js.Array[js.Array[Double | String]],
    startcap: BezierCap
  ): Shape = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], endcap = endcap.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any], intersections = js.Any.fromFunction1(intersections), startcap = startcap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit class ShapeMutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBack(value: Bezier): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndcap(value: BezierCap): Self = StObject.set(x, "endcap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward(value: Bezier): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersections(value: Shape => js.Array[js.Array[Double | String]]): Self = StObject.set(x, "intersections", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartcap(value: BezierCap): Self = StObject.set(x, "startcap", value.asInstanceOf[js.Any])
  }
}
