package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmallTheme extends js.Object {
  var small: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[BaseFontSizeObject] = js.undefined
}

object SmallTheme {
  @scala.inline
  def apply(small: js.UndefOr[Boolean] = js.undefined, theme: BaseFontSizeObject = null): SmallTheme = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmallTheme]
  }
}

