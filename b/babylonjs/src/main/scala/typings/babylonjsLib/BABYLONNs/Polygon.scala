package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Polygon
     * @see https://doc.babylonjs.com/how_to/parametric_shapes#non-regular-polygon
     */
@JSGlobal("BABYLON.Polygon")
@js.native
class Polygon () extends js.Object

/**
     * Polygon
     * @see https://doc.babylonjs.com/how_to/parametric_shapes#non-regular-polygon
     */
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
  def Circle(radius: scala.Double): js.Array[babylonjsLib.BABYLONNs.Vector2] = js.native
  /**
           * Creates a circle
           * @param radius radius of circle
           * @param cx scale in x
           * @param cy scale in y
           * @param numberOfSides number of sides that make up the circle
           * @returns points that make the resulting circle
           */
  def Circle(radius: scala.Double, cx: scala.Double): js.Array[babylonjsLib.BABYLONNs.Vector2] = js.native
  /**
           * Creates a circle
           * @param radius radius of circle
           * @param cx scale in x
           * @param cy scale in y
           * @param numberOfSides number of sides that make up the circle
           * @returns points that make the resulting circle
           */
  def Circle(radius: scala.Double, cx: scala.Double, cy: scala.Double): js.Array[babylonjsLib.BABYLONNs.Vector2] = js.native
  /**
           * Creates a circle
           * @param radius radius of circle
           * @param cx scale in x
           * @param cy scale in y
           * @param numberOfSides number of sides that make up the circle
           * @returns points that make the resulting circle
           */
  def Circle(radius: scala.Double, cx: scala.Double, cy: scala.Double, numberOfSides: scala.Double): js.Array[babylonjsLib.BABYLONNs.Vector2] = js.native
  /**
           * Creates a polygon from input string
           * @param input Input polygon data
           * @returns the parsed points
           */
  def Parse(input: java.lang.String): js.Array[babylonjsLib.BABYLONNs.Vector2] = js.native
  /**
           * Creates a rectangle
           * @param xmin bottom X coord
           * @param ymin bottom Y coord
           * @param xmax top X coord
           * @param ymax top Y coord
           * @returns points that make the resulting rectation
           */
  def Rectangle(xmin: scala.Double, ymin: scala.Double, xmax: scala.Double, ymax: scala.Double): js.Array[babylonjsLib.BABYLONNs.Vector2] = js.native
  /**
           * Starts building a polygon from x and y coordinates
           * @param x x coordinate
           * @param y y coordinate
           * @returns the started path2
           */
  def StartingAt(x: scala.Double, y: scala.Double): babylonjsLib.BABYLONNs.Path2 = js.native
}

