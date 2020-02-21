package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSmallTheme extends js.Object {
  var small: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[AnonBaseFontSizeObject] = js.undefined
}

object AnonSmallTheme {
  @scala.inline
  def apply(small: js.UndefOr[Boolean] = js.undefined, theme: AnonBaseFontSizeObject = null): AnonSmallTheme = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSmallTheme]
  }
}

