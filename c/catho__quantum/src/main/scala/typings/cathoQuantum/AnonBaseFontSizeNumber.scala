package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseFontSizeNumber extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object AnonBaseFontSizeNumber {
  @scala.inline
  def apply(baseFontSize: Int | Double = null, spacing: js.Object = null): AnonBaseFontSizeNumber = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseFontSizeNumber]
  }
}

