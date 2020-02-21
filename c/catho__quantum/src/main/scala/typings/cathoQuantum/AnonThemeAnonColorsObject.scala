package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThemeAnonColorsObject extends js.Object {
  var theme: js.UndefOr[AnonColorsObject] = js.undefined
}

object AnonThemeAnonColorsObject {
  @scala.inline
  def apply(theme: AnonColorsObject = null): AnonThemeAnonColorsObject = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThemeAnonColorsObject]
  }
}

