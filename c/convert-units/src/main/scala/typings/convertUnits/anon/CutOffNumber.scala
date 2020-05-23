package typings.convertUnits.anon

import typings.convertUnits.mod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CutOffNumber extends js.Object {
  var cutOffNumber: js.UndefOr[Double] = js.undefined
  var exclude: js.UndefOr[js.Array[unit]] = js.undefined
}

object CutOffNumber {
  @scala.inline
  def apply(cutOffNumber: js.UndefOr[Double] = js.undefined, exclude: js.Array[unit] = null): CutOffNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cutOffNumber)) __obj.updateDynamic("cutOffNumber")(cutOffNumber.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[CutOffNumber]
  }
}

