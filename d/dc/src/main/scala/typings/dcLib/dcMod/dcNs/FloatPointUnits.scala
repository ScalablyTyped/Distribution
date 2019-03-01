package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatPointUnits extends js.Object {
  def precision(precision: scala.Double): UnitFunction
}

object FloatPointUnits {
  @scala.inline
  def apply(precision: js.Function1[scala.Double, UnitFunction]): FloatPointUnits = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("precision")(precision)
    __obj.asInstanceOf[FloatPointUnits]
  }
}

