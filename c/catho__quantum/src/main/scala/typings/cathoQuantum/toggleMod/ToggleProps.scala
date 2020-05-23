package typings.cathoQuantum.toggleMod

import typings.cathoQuantum.anon.BaseFontSize
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var theme: js.UndefOr[BaseFontSize] = js.undefined
}

object ToggleProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    theme: BaseFontSize = null
  ): ToggleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleProps]
  }
}

