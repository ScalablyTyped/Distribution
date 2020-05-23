package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Precision extends js.Object {
  var precision: js.UndefOr[H] = js.undefined
  var subdivisions: js.UndefOr[H] = js.undefined
  var xmax: Double
  var xmin: Double
  var zmax: Double
  var zmin: Double
}

object Precision {
  @scala.inline
  def apply(
    xmax: Double,
    xmin: Double,
    zmax: Double,
    zmin: Double,
    precision: H = null,
    subdivisions: H = null
  ): Precision = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], zmax = zmax.asInstanceOf[js.Any], zmin = zmin.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Precision]
  }
}

