package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Polygon")
@js.native
class Polygon ()
  extends typings.babylonjs.BABYLON.Polygon
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
  def Circle(radius: Double): js.Array[typings.babylonjs.BABYLON.Vector2] = js.native
  def Circle(
    radius: Double,
    cx: js.UndefOr[scala.Nothing],
    cy: js.UndefOr[scala.Nothing],
    numberOfSides: Double
  ): js.Array[typings.babylonjs.BABYLON.Vector2] = js.native
  def Circle(radius: Double, cx: js.UndefOr[scala.Nothing], cy: Double): js.Array[typings.babylonjs.BABYLON.Vector2] = js.native
  def Circle(radius: Double, cx: js.UndefOr[scala.Nothing], cy: Double, numberOfSides: Double): js.Array[typings.babylonjs.BABYLON.Vector2] = js.native
  def Circle(radius: Double, cx: Double): js.Array[typings.babylonjs.BABYLON.Vector2] = js.native
  def Circle(radius: Double, cx: Double, cy: js.UndefOr[scala.Nothing], numberOfSides: Double): js.Array[typings.babylonjs.BABYLON.Vector2] = js.native
  def Circle(radius: Double, cx: Double, cy: Double): js.Array[typings.babylonjs.BABYLON.Vector2] = js.native
  def Circle(radius: Double, cx: Double, cy: Double, numberOfSides: Double): js.Array[typings.babylonjs.BABYLON.Vector2] = js.native
  
  /**
    * Creates a polygon from input string
    * @param input Input polygon data
    * @returns the parsed points
    */
  def Parse(input: String): js.Array[typings.babylonjs.BABYLON.Vector2] = js.native
  
  /**
    * Creates a rectangle
    * @param xmin bottom X coord
    * @param ymin bottom Y coord
    * @param xmax top X coord
    * @param ymax top Y coord
    * @returns points that make the resulting rectation
    */
  def Rectangle(xmin: Double, ymin: Double, xmax: Double, ymax: Double): js.Array[typings.babylonjs.BABYLON.Vector2] = js.native
  
  /**
    * Starts building a polygon from x and y coordinates
    * @param x x coordinate
    * @param y y coordinate
    * @returns the started path2
    */
  def StartingAt(x: Double, y: Double): typings.babylonjs.BABYLON.Path2 = js.native
}
