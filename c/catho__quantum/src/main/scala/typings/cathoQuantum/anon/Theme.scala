package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var theme: js.UndefOr[BaseFontSizeSpacing] = js.undefined
}

object Theme {
  @scala.inline
  def apply(theme: BaseFontSizeSpacing = null): Theme = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

