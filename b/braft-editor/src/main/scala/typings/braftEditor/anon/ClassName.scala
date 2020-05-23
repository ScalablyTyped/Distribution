package typings.braftEditor.anon

import typings.braftEditor.braftEditorStrings.button
import typings.braftEditor.mod.ExtendControlType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName extends ExtendControlType {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var html: js.UndefOr[String | Null] = js.undefined
  var key: String
  var onClick: js.UndefOr[js.Function] = js.undefined
  var text: js.UndefOr[String | ReactNode] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: button
}

object ClassName {
  @scala.inline
  def apply(
    key: String,
    `type`: button,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Null | String] = js.undefined,
    onClick: js.Function = null,
    text: String | ReactNode = null,
    title: String = null
  ): ClassName = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}

