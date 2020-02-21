package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSmall extends js.Object {
  var small: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[AnonBaseFontSizeSpacing] = js.undefined
}

object AnonSmall {
  @scala.inline
  def apply(small: js.UndefOr[Boolean] = js.undefined, theme: AnonBaseFontSizeSpacing = null): AnonSmall = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSmall]
  }
}

