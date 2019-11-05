package typings.braftDashEditor

import typings.braftDashEditor.braftDashEditorMod.ExtendControlType
import typings.braftDashEditor.braftDashEditorStrings.modal
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends ExtendControlType {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var html: js.UndefOr[String | Null] = js.undefined
  var key: String
  var modal: Anon_BottomText
  var onClick: js.UndefOr[js.Function] = js.undefined
  var text: js.UndefOr[String | ReactNode] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: modal
}

object Anon_ClassName {
  @scala.inline
  def apply(
    key: String,
    modal: Anon_BottomText,
    `type`: modal,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    onClick: js.Function = null,
    text: String | ReactNode = null,
    title: String = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(key = key, modal = modal)
    __obj.updateDynamic("type")(`type`)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (html != null) __obj.updateDynamic("html")(html)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

