package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseFontSize extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[js.Object] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object AnonBaseFontSize {
  @scala.inline
  def apply(baseFontSize: Int | Double = null, colors: js.Object = null, spacing: js.Object = null): AnonBaseFontSize = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseFontSize]
  }
}

