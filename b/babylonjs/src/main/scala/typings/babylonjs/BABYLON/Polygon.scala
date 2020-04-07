package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Polygon")
@js.native
class Polygon () extends js.Object

/* static members */
@JSGlobal("BABYLON.Polygon")
@js.native
object Polygon extends js.Object {
  /**
    * Creates a circle
    * @param radius radius of circle
    * @param cx scale in x
    * @param cy scale in y
    * @param numberOfSides number of sides that make up the circle
    * @returns points that make the resulting circle
    */
  def Circle(radius: Double): js.Array[Vector2] = js.native
  def Circle(radius: Double, cx: Double): js.Array[Vector2] = js.native
  def Circle(radius: Double, cx: Double, cy: Double): js.Array[Vector2] = js.native
  def Circle(radius: Double, cx: Double, cy: Double, numberOfSides: Double): js.Array[Vector2] = js.native
  /**
    * Creates a polygon from input string
    * @param input Input polygon data
    * @returns the parsed points
    */
  def Parse(input: String): js.Array[Vector2] = js.native
  /**
    * Creates a rectangle
    * @param xmin bottom X coord
    * @param ymin bottom Y coord
    * @param xmax top X coord
    * @param ymax top Y coord
    * @returns points that make the resulting rectation
    */
  def Rectangle(xmin: Double, ymin: Double, xmax: Double, ymax: Double): js.Array[Vector2] = js.native
  /**
    * Starts building a polygon from x and y coordinates
    * @param x x coordinate
    * @param y y coordinate
    * @returns the started path2
    */
  def StartingAt(x: Double, y: Double): Path2 = js.native
}

