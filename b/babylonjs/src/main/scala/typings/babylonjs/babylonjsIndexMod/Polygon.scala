package typings.babylonjs.babylonjsIndexMod

import typings.babylonjs.mathPathMod.Path2
import typings.babylonjs.mathVectorMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "Polygon")
@js.native
class Polygon ()
  extends typings.babylonjs.polygonMeshMod.Polygon
/* static members */
object Polygon {
  
  /**
    * Creates a circle
    * @param radius radius of circle
    * @param cx scale in x
    * @param cy scale in y
    * @param numberOfSides number of sides that make up the circle
    * @returns points that make the resulting circle
    */
  @JSImport("babylonjs/Meshes/index", "Polygon.Circle")
  @js.native
  def Circle(radius: Double): js.Array[Vector2] = js.native
  @JSImport("babylonjs/Meshes/index", "Polygon.Circle")
  @js.native
  def Circle(
    radius: Double,
    cx: js.UndefOr[scala.Nothing],
    cy: js.UndefOr[scala.Nothing],
    numberOfSides: Double
  ): js.Array[Vector2] = js.native
  @JSImport("babylonjs/Meshes/index", "Polygon.Circle")
  @js.native
  def Circle(radius: Double, cx: js.UndefOr[scala.Nothing], cy: Double): js.Array[Vector2] = js.native
  @JSImport("babylonjs/Meshes/index", "Polygon.Circle")
  @js.native
  def Circle(radius: Double, cx: js.UndefOr[scala.Nothing], cy: Double, numberOfSides: Double): js.Array[Vector2] = js.native
  @JSImport("babylonjs/Meshes/index", "Polygon.Circle")
  @js.native
  def Circle(radius: Double, cx: Double): js.Array[Vector2] = js.native
  @JSImport("babylonjs/Meshes/index", "Polygon.Circle")
  @js.native
  def Circle(radius: Double, cx: Double, cy: js.UndefOr[scala.Nothing], numberOfSides: Double): js.Array[Vector2] = js.native
  @JSImport("babylonjs/Meshes/index", "Polygon.Circle")
  @js.native
  def Circle(radius: Double, cx: Double, cy: Double): js.Array[Vector2] = js.native
  @JSImport("babylonjs/Meshes/index", "Polygon.Circle")
  @js.native
  def Circle(radius: Double, cx: Double, cy: Double, numberOfSides: Double): js.Array[Vector2] = js.native
  
  /**
    * Creates a polygon from input string
    * @param input Input polygon data
    * @returns the parsed points
    */
  @JSImport("babylonjs/Meshes/index", "Polygon.Parse")
  @js.native
  def Parse(input: String): js.Array[Vector2] = js.native
  
  /**
    * Creates a rectangle
    * @param xmin bottom X coord
    * @param ymin bottom Y coord
    * @param xmax top X coord
    * @param ymax top Y coord
    * @returns points that make the resulting rectation
    */
  @JSImport("babylonjs/Meshes/index", "Polygon.Rectangle")
  @js.native
  def Rectangle(xmin: Double, ymin: Double, xmax: Double, ymax: Double): js.Array[Vector2] = js.native
  
  /**
    * Starts building a polygon from x and y coordinates
    * @param x x coordinate
    * @param y y coordinate
    * @returns the started path2
    */
  @JSImport("babylonjs/Meshes/index", "Polygon.StartingAt")
  @js.native
  def StartingAt(x: Double, y: Double): Path2 = js.native
}
