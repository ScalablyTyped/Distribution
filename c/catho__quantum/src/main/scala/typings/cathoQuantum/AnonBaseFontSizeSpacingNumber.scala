package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseFontSizeSpacingNumber extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object AnonBaseFontSizeSpacingNumber {
  @scala.inline
  def apply(baseFontSize: Int | Double = null, spacing: js.Object = null): AnonBaseFontSizeSpacingNumber = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseFontSizeSpacingNumber]
  }
}

