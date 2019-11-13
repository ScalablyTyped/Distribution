package typings.convertDashUnits

import typings.convertDashUnits.convertDashUnitsMod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CutOffNumber extends js.Object {
  var cutOffNumber: js.UndefOr[Double] = js.undefined
  var exclude: js.UndefOr[js.Array[unit]] = js.undefined
}

object Anon_CutOffNumber {
  @scala.inline
  def apply(cutOffNumber: Int | Double = null, exclude: js.Array[unit] = null): Anon_CutOffNumber = {
    val __obj = js.Dynamic.literal()
    if (cutOffNumber != null) __obj.updateDynamic("cutOffNumber")(cutOffNumber.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    __obj.asInstanceOf[Anon_CutOffNumber]
  }
}

