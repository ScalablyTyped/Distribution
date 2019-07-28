package typings.d3DashShape.d3DashShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurveBundleFactory extends CurveFactoryLineOnly {
  /**
    * Returns a bundle curve factory with the specified beta in the range [0, 1], representing the bundle strength.
    * If beta equals zero, a straight line between the first and last point is produced; if beta equals one,
    * a standard basis spline is produced.
    *
    * @param beta A constant value in the [0, 1] interval.
    */
  def beta(beta: Double): this.type = js.native
}

