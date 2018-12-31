package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a 2D path made up of multiple 2D points
  */
@JSGlobal("BABYLON.Path2")
@js.native
class Path2 protected () extends js.Object {
  /**
    * Creates a Path2 object from the starting 2D coordinates x and y.
    * @param x the starting points x value
    * @param y the starting points y value
    */
  def this(x: scala.Double, y: scala.Double) = this()
  var _length: js.Any = js.native
  var _points: js.Any = js.native
  /**
    * If the path start and end point are the same
    */
  var closed: scala.Boolean = js.native
  /**
    * Adds _numberOfSegments_ segments according to the arc definition (middle point coordinates, end point coordinates, the arc start point being the current Path2 last point) to the current Path2.
    * @param midX middle point x value
    * @param midY middle point y value
    * @param endX end point x value
    * @param endY end point y value
    * @param numberOfSegments (default: 36)
    * @returns the updated Path2.
    */
  def addArcTo(midX: scala.Double, midY: scala.Double, endX: scala.Double, endY: scala.Double): Path2 = js.native
  def addArcTo(
    midX: scala.Double,
    midY: scala.Double,
    endX: scala.Double,
    endY: scala.Double,
    numberOfSegments: scala.Double
  ): Path2 = js.native
  /**
    * Adds a new segment until the given coordinates (x, y) to the current Path2.
    * @param x the added points x value
    * @param y the added points y value
    * @returns the updated Path2.
    */
  def addLineTo(x: scala.Double, y: scala.Double): Path2 = js.native
  /**
    * Closes the Path2.
    * @returns the Path2.
    */
  def close(): Path2 = js.native
  /**
    * Retreives the point at the distance aways from the starting point
    * @param normalizedLengthPosition the length along the path to retreive the point from
    * @returns a new Vector2 located at a percentage of the Path2 total length on this path.
    */
  def getPointAtLengthPosition(normalizedLengthPosition: scala.Double): Vector2 = js.native
  /**
    * Gets the points which construct the path
    * @returns the Path2 internal array of points.
    */
  def getPoints(): js.Array[Vector2] = js.native
  /**
    * Gets the sum of the distance between each sequential point in the path
    * @returns the Path2 total length (float).
    */
  def length(): scala.Double = js.native
}

/**
  * Represents a 2D path made up of multiple 2D points
  */
@JSGlobal("BABYLON.Path2")
@js.native
object Path2 extends js.Object {
  /**
    * Creates a new path starting from an x and y position
    * @param x starting x value
    * @param y starting y value
    * @returns a new Path2 starting at the coordinates (x, y).
    */
  def StartingAt(x: scala.Double, y: scala.Double): babylonjsLib.BABYLONNs.Path2 = js.native
}

