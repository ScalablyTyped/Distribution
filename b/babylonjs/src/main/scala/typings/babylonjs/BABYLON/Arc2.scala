package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arc2 extends StObject {
  
  /**
    * Defines the angle of the arc (from mid point to end point).
    */
  var angle: Angle = js.native
  
  /**
    * Defines the center point of the arc.
    */
  var centerPoint: Vector2 = js.native
  
  /** Defines the end point of the arc */
  var endPoint: Vector2 = js.native
  
  /** Defines the mid point of the arc */
  var midPoint: Vector2 = js.native
  
  /**
    * Defines the orientation of the arc (clock wise/counter clock wise).
    */
  var orientation: Orientation = js.native
  
  /**
    * Defines the radius of the arc.
    */
  var radius: Double = js.native
  
  /**
    * Defines the start angle of the arc (from start point to middle point).
    */
  var startAngle: Angle = js.native
  
  /** Defines the start point of the arc */
  var startPoint: Vector2 = js.native
}
object Arc2 {
  
  @scala.inline
  def apply(
    angle: Angle,
    centerPoint: Vector2,
    endPoint: Vector2,
    midPoint: Vector2,
    orientation: Orientation,
    radius: Double,
    startAngle: Angle,
    startPoint: Vector2
  ): Arc2 = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], centerPoint = centerPoint.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], midPoint = midPoint.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], startPoint = startPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc2]
  }
  
  @scala.inline
  implicit class Arc2MutableBuilder[Self <: Arc2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Angle): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterPoint(value: Vector2): Self = StObject.set(x, "centerPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPoint(value: Vector2): Self = StObject.set(x, "endPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidPoint(value: Vector2): Self = StObject.set(x, "midPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngle(value: Angle): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPoint(value: Vector2): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
  }
}
