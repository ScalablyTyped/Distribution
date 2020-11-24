package typings.babylonjs.mathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/math", "BezierCurve")
@js.native
class BezierCurve ()
  extends typings.babylonjs.mathPathMod.BezierCurve
/* static members */
@JSImport("babylonjs/Maths/math", "BezierCurve")
@js.native
object BezierCurve extends js.Object {
  
  /**
    * Returns the cubic Bezier interpolated value (float) at "t" (float) from the given x1, y1, x2, y2 floats
    * @param t defines the time
    * @param x1 defines the left coordinate on X axis
    * @param y1 defines the left coordinate on Y axis
    * @param x2 defines the right coordinate on X axis
    * @param y2 defines the right coordinate on Y axis
    * @returns the interpolated value
    */
  def Interpolate(t: Double, x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
}
