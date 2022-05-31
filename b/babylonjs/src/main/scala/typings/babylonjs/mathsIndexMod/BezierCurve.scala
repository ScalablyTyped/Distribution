package typings.babylonjs.mathsIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/index", "BezierCurve")
@js.native
class BezierCurve ()
  extends typings.babylonjs.mathMod.BezierCurve
/* static members */
object BezierCurve {
  
  @JSImport("babylonjs/Maths/index", "BezierCurve")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the cubic Bezier interpolated value (float) at "t" (float) from the given x1, y1, x2, y2 floats
    * @param t defines the time
    * @param x1 defines the left coordinate on X axis
    * @param y1 defines the left coordinate on Y axis
    * @param x2 defines the right coordinate on X axis
    * @param y2 defines the right coordinate on Y axis
    * @returns the interpolated value
    */
  inline def Interpolate(t: Double, x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Interpolate")(t.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
}
