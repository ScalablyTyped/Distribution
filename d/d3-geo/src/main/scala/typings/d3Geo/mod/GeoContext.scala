package typings.d3Geo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoContext extends js.Object {
  /**
    * Adds an arc to the path with center point (x, y) and radius r starting at startAngle and ending at endAngle.
    * The arc is drawn in clockwise direction by default.
    *
    * @param x x-coordinate of arc center point.
    * @param y y-coordinate of arc center point.
    * @param radius Radius of arc.
    * @param startAngle The starting angle of the arc, measured clockwise from the positive x axis and expressed in radians.
    * @param endAngle The end angle of the arc, measured clockwise from the positive x axis and expressed in radians.
    * @param anticlockwise Optional boolean flag, if true the arc is drawn counter-clockwise between the two angles.
    */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
  /**
    * Start a new path by emptying the list of sub-paths.
    */
  def beginPath(): Unit = js.native
  /**
    * Causes the point of the pen to move back to the start of the current sub-path.
    * It tries to draw a straight line from the current point to the start.
    * If the shape has already been closed or has only one point, this function does nothing.
    */
  def closePath(): Unit = js.native
  /**
    * Connects the last point in the sub-path to the x, y coordinates with a straight line (but does not actually draw it).
    *
    * @param x The x-coordinate for the end of the line.
    * @param y The y-coordinate for the end of the line.
    */
  def lineTo(x: Double, y: Double): Unit = js.native
  /**
    * Move the starting point of a new sub-path to the (x, y) coordinates.
    *
    * @param x The x-coordinate for the new starting point.
    * @param y The y-coordinate for the new starting point.
    */
  def moveTo(x: Double, y: Double): Unit = js.native
}

