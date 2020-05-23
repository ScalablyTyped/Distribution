package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Xmax extends js.Object {
  var precision: js.UndefOr[H] = js.undefined
  var subdivisions: js.UndefOr[H] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
  var xmax: Double
  var xmin: Double
  var zmax: Double
  var zmin: Double
}

object Xmax {
  @scala.inline
  def apply(
    xmax: Double,
    xmin: Double,
    zmax: Double,
    zmin: Double,
    precision: H = null,
    subdivisions: H = null,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): Xmax = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], zmax = zmax.asInstanceOf[js.Any], zmin = zmin.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xmax]
  }
}

