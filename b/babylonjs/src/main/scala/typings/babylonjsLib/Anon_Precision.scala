package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Precision extends js.Object {
  var precision: js.UndefOr[Anon_H] = js.undefined
  var subdivisions: js.UndefOr[Anon_H] = js.undefined
  var xmax: scala.Double
  var xmin: scala.Double
  var zmax: scala.Double
  var zmin: scala.Double
}

object Anon_Precision {
  @scala.inline
  def apply(
    xmax: scala.Double,
    xmin: scala.Double,
    zmax: scala.Double,
    zmin: scala.Double,
    precision: Anon_H = null,
    subdivisions: Anon_H = null
  ): Anon_Precision = {
    val __obj = js.Dynamic.literal(xmax = xmax, xmin = xmin, zmax = zmax, zmin = zmin)
    if (precision != null) __obj.updateDynamic("precision")(precision)
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions)
    __obj.asInstanceOf[Anon_Precision]
  }
}

