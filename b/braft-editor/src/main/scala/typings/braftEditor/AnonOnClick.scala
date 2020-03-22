package typings.braftEditor

import typings.braftEditor.mod.ImageControlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnClick extends ImageControlType {
  var onClick: js.UndefOr[js.Function1[/* block */ js.Any, Unit]] = js.undefined
  var render: js.UndefOr[js.Function1[/* mediaData */ js.Any, Unit]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonOnClick {
  @scala.inline
  def apply(
    onClick: /* block */ js.Any => Unit = null,
    render: /* mediaData */ js.Any => Unit = null,
    text: String = null
  ): AnonOnClick = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnClick]
  }
}

