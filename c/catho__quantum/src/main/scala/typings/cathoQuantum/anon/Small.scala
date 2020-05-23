package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Small extends js.Object {
  var small: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[BaseFontSizeSpacing] = js.undefined
}

object Small {
  @scala.inline
  def apply(small: js.UndefOr[Boolean] = js.undefined, theme: BaseFontSizeSpacing = null): Small = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Small]
  }
}

