package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThemeAnonSpacingObject extends js.Object {
  var theme: js.UndefOr[AnonSpacingObject] = js.undefined
}

object AnonThemeAnonSpacingObject {
  @scala.inline
  def apply(theme: AnonSpacingObject = null): AnonThemeAnonSpacingObject = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThemeAnonSpacingObject]
  }
}

