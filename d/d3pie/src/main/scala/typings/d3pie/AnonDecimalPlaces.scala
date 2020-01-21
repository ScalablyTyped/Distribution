package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecimalPlaces extends js.Object {
  var decimalPlaces: js.UndefOr[Double] = js.undefined
}

object AnonDecimalPlaces {
  @scala.inline
  def apply(decimalPlaces: Int | Double = null): AnonDecimalPlaces = {
    val __obj = js.Dynamic.literal()
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDecimalPlaces]
  }
}

