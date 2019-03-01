package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrecisionSubdivisions extends js.Object {
  var precision: js.UndefOr[Anon_H] = js.undefined
  var subdivisions: js.UndefOr[Anon_H] = js.undefined
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
  var xmax: scala.Double
  var xmin: scala.Double
  var zmax: scala.Double
  var zmin: scala.Double
}

object Anon_PrecisionSubdivisions {
  @scala.inline
  def apply(
    xmax: scala.Double,
    xmin: scala.Double,
    zmax: scala.Double,
    zmin: scala.Double,
    precision: Anon_H = null,
    subdivisions: Anon_H = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_PrecisionSubdivisions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xmax")(xmax)
    __obj.updateDynamic("xmin")(xmin)
    __obj.updateDynamic("zmax")(zmax)
    __obj.updateDynamic("zmin")(zmin)
    if (precision != null) __obj.updateDynamic("precision")(precision)
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions)
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    __obj.asInstanceOf[Anon_PrecisionSubdivisions]
  }
}

