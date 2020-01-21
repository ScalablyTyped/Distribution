package typings.convertUnits

import typings.convertUnits.mod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCutOffNumber extends js.Object {
  var cutOffNumber: js.UndefOr[Double] = js.undefined
  var exclude: js.UndefOr[js.Array[unit]] = js.undefined
}

object AnonCutOffNumber {
  @scala.inline
  def apply(cutOffNumber: Int | Double = null, exclude: js.Array[unit] = null): AnonCutOffNumber = {
    val __obj = js.Dynamic.literal()
    if (cutOffNumber != null) __obj.updateDynamic("cutOffNumber")(cutOffNumber.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCutOffNumber]
  }
}

