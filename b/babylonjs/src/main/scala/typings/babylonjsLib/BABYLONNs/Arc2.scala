package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents an arc in a 2d space.
  */
@JSGlobal("BABYLON.Arc2")
@js.native
class Arc2 protected () extends js.Object {
  /**
    * Creates an Arc object from the three given points : start, middle and end.
    * @param startPoint Defines the start point of the arc
    * @param midPoint Defines the midlle point of the arc
    * @param endPoint Defines the end point of the arc
    */
  def this(/** Defines the start point of the arc */
  startPoint: Vector2, /** Defines the mid point of the arc */
  midPoint: Vector2, /** Defines the end point of the arc */
  endPoint: Vector2) = this()
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
  var radius: scala.Double = js.native
  /**
    * Defines the start angle of the arc (from start point to middle point).
    */
  var startAngle: Angle = js.native
  /** Defines the start point of the arc */
  var startPoint: Vector2 = js.native
}

