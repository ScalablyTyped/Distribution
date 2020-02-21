package typings.cathoQuantum.toggleMod

import typings.cathoQuantum.AnonBaseFontSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[AnonBaseFontSize] = js.undefined
}

object ToggleProps {
  @scala.inline
  def apply(checked: js.UndefOr[Boolean] = js.undefined, id: String = null, theme: AnonBaseFontSize = null): ToggleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleProps]
  }
}

