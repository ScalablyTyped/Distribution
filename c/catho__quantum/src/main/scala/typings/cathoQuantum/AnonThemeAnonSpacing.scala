package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThemeAnonSpacing extends js.Object {
  var theme: js.UndefOr[AnonSpacing] = js.undefined
}

object AnonThemeAnonSpacing {
  @scala.inline
  def apply(theme: AnonSpacing = null): AnonThemeAnonSpacing = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThemeAnonSpacing]
  }
}

