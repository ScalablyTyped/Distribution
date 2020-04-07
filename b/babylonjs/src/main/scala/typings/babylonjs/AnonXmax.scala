package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXmax extends js.Object {
  var precision: js.UndefOr[AnonH] = js.undefined
  var subdivisions: js.UndefOr[AnonH] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
  var xmax: Double
  var xmin: Double
  var zmax: Double
  var zmin: Double
}

object AnonXmax {
  @scala.inline
  def apply(
    xmax: Double,
    xmin: Double,
    zmax: Double,
    zmin: Double,
    precision: AnonH = null,
    subdivisions: AnonH = null,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): AnonXmax = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], zmax = zmax.asInstanceOf[js.Any], zmin = zmin.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXmax]
  }
}

