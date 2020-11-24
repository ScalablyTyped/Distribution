package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arc2 extends js.Object {
  
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
  implicit class Arc2Ops[Self <: Arc2] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Angle): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterPoint(value: Vector2): Self = this.set("centerPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPoint(value: Vector2): Self = this.set("endPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidPoint(value: Vector2): Self = this.set("midPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngle(value: Angle): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPoint(value: Vector2): Self = this.set("startPoint", value.asInstanceOf[js.Any])
  }
}
