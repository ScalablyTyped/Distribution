package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arc2 extends js.Object {
  /**
    * Defines the angle of the arc (from mid point to end point).
    */
  var angle: Angle
  /**
    * Defines the center point of the arc.
    */
  var centerPoint: Vector2
  /** Defines the end point of the arc */
  var endPoint: Vector2
  /** Defines the mid point of the arc */
  var midPoint: Vector2
  /**
    * Defines the orientation of the arc (clock wise/counter clock wise).
    */
  var orientation: Orientation
  /**
    * Defines the radius of the arc.
    */
  var radius: Double
  /**
    * Defines the start angle of the arc (from start point to middle point).
    */
  var startAngle: Angle
  /** Defines the start point of the arc */
  var startPoint: Vector2
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
}

