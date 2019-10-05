package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Point")
@js.native
class Point protected () extends js.Object {
  /**
    * @constructor
    * @param x The x coordinate.
    * @param y The y coordinate.
    */
  def this(x: Double, y: Double) = this()
  /** The x coordinate */
  var x: Double = js.native
  /** The y coordinate */
  var y: Double = js.native
  /**
    * Adds the x and y values of two points and returns a new Point.
    * @param point The point to add.
    * @returns A new point created by the sum of two points.
    */
  def add(point: Point): Point = js.native
  /**
    * Compares the x and y values of two points to see if they are equal. If a tolerance value is specified, it checks to see if the linear distance between the points is less than or equal to the tolerance value.
    * @param point The point to compare to.
    * @param tolerance Optional, tolerance (>= 0) to avoid false result because of floating point errors.
    * @returns true if this point equals point, false otherwise
    */
  def equals(point: Point): Boolean = js.native
  def equals(point: Point, tolerance: Double): Boolean = js.native
  /**
    * Subtracts the x and y values of a points and returns a new Point.
    * @param point The point to subtract.
    * @returns A new point created by the subtraction of two points.
    */
  def subtract(point: Point): Point = js.native
}

