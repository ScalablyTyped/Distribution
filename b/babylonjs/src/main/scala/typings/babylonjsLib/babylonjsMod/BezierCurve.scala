package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class used to represent a Bezier curve */
@JSImport("babylonjs", "BezierCurve")
@js.native
class BezierCurve ()
  extends babylonjsLib.BABYLONNs.BezierCurve

/** Class used to represent a Bezier curve */
@JSImport("babylonjs", "BezierCurve")
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
  def Interpolate(t: scala.Double, x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double = js.native
}

