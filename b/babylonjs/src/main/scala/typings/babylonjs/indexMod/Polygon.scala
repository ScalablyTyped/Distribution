package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Polygon")
@js.native
open class Polygon ()
  extends typings.babylonjs.meshesIndexMod.Polygon
/* static members */
object Polygon {
  
  @JSImport("babylonjs/index", "Polygon")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a circle
    * @param radius radius of circle
    * @param cx scale in x
    * @param cy scale in y
    * @param numberOfSides number of sides that make up the circle
    * @returns points that make the resulting circle
    */
  inline def Circle(radius: Double): js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2] = ^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2]]
  inline def Circle(radius: Double, cx: Double): js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2]]
  inline def Circle(radius: Double, cx: Double, cy: Double): js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2]]
  inline def Circle(radius: Double, cx: Double, cy: Double, numberOfSides: Double): js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], numberOfSides.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2]]
  inline def Circle(radius: Double, cx: Double, cy: Unit, numberOfSides: Double): js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], numberOfSides.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2]]
  inline def Circle(radius: Double, cx: Unit, cy: Double): js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2]]
  inline def Circle(radius: Double, cx: Unit, cy: Double, numberOfSides: Double): js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], numberOfSides.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2]]
  inline def Circle(radius: Double, cx: Unit, cy: Unit, numberOfSides: Double): js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], numberOfSides.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2]]
  
  /**
    * Creates a polygon from input string
    * @param input Input polygon data
    * @returns the parsed points
    */
  inline def Parse(input: String): js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2] = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2]]
  
  /**
    * Creates a rectangle
    * @param xmin bottom X coord
    * @param ymin bottom Y coord
    * @param xmax top X coord
    * @param ymax top Y coord
    * @returns points that make the resulting rectangle
    */
  inline def Rectangle(xmin: Double, ymin: Double, xmax: Double, ymax: Double): js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Rectangle")(xmin.asInstanceOf[js.Any], ymin.asInstanceOf[js.Any], xmax.asInstanceOf[js.Any], ymax.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.babylonjs.mathsMathDotvectorMod.Vector2]]
  
  /**
    * Starts building a polygon from x and y coordinates
    * @param x x coordinate
    * @param y y coordinate
    * @returns the started path2
    */
  inline def StartingAt(x: Double, y: Double): typings.babylonjs.mathsMathDotpathMod.Path2 = (^.asInstanceOf[js.Dynamic].applyDynamic("StartingAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotpathMod.Path2]
}
