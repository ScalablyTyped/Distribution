package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeSpacingObject extends js.Object {
  var theme: js.UndefOr[SpacingObject] = js.undefined
}

object ThemeSpacingObject {
  @scala.inline
  def apply(theme: SpacingObject = null): ThemeSpacingObject = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeSpacingObject]
  }
}

