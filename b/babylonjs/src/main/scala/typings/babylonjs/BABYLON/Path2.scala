package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path2 extends js.Object {
  
  var _length: js.Any = js.native
  
  var _points: js.Any = js.native
  
  /**
    * Adds _numberOfSegments_ segments according to the arc definition (middle point coordinates, end point coordinates, the arc start point being the current Path2 last point) to the current Path2.
    * @param midX middle point x value
    * @param midY middle point y value
    * @param endX end point x value
    * @param endY end point y value
    * @param numberOfSegments (default: 36)
    * @returns the updated Path2.
    */
  def addArcTo(midX: Double, midY: Double, endX: Double, endY: Double): Path2 = js.native
  def addArcTo(midX: Double, midY: Double, endX: Double, endY: Double, numberOfSegments: Double): Path2 = js.native
  
  /**
    * Adds a new segment until the given coordinates (x, y) to the current Path2.
    * @param x the added points x value
    * @param y the added points y value
    * @returns the updated Path2.
    */
  def addLineTo(x: Double, y: Double): Path2 = js.native
  
  /**
    * Closes the Path2.
    * @returns the Path2.
    */
  def close(): Path2 = js.native
  
  /**
    * If the path start and end point are the same
    */
  var closed: Boolean = js.native
  
  /**
    * Retreives the point at the distance aways from the starting point
    * @param normalizedLengthPosition the length along the path to retreive the point from
    * @returns a new Vector2 located at a percentage of the Path2 total length on this path.
    */
  def getPointAtLengthPosition(normalizedLengthPosition: Double): Vector2 = js.native
  
  /**
    * Gets the points which construct the path
    * @returns the Path2 internal array of points.
    */
  def getPoints(): js.Array[Vector2] = js.native
  
  /**
    * Gets the sum of the distance between each sequential point in the path
    * @returns the Path2 total length (float).
    */
  def length(): Double = js.native
}
