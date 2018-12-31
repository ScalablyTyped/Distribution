package typings
package d3DashShapeLib.d3DashShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurveCatmullRomFactory extends CurveFactory {
  /**
    * Returns a cubic Catmull–Rom curve factory with the specified alpha in the range [0, 1].
    * If alpha is zero, produces a uniform spline, equivalent to curveCardinal with a tension of zero;
    * if alpha is one, produces a chordal spline; if alpha is 0.5, produces a centripetal spline.
    * Centripetal splines are recommended to avoid self-intersections and overshoot.
    *
    * @param alpha A constant in the [0, 1] interval.
    */
  def alpha(alpha: scala.Double): this.type = js.native
}

