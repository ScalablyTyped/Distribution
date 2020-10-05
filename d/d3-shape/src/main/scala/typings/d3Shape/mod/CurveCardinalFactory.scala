package typings.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurveCardinalFactory extends CurveFactory {
  /**
    * Returns a cardinal curve factory with the specified tension in the range [0, 1].
    * The tension determines the length of the tangents: a tension of one yields all zero tangents, equivalent to curveLinear; a tension of zero produces a uniform Catmull–Rom spline.
    *
    * @param tension A constant in the [0, 1] interval.
    */
  def tension(tension: Double): this.type = js.native
}

