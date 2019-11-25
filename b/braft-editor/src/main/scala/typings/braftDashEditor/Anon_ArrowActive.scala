package typings.braftDashEditor

import typings.braftDashEditor.braftDashEditorMod.ExtendControlType
import typings.braftDashEditor.braftDashEditorStrings.dropdown
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrowActive extends ExtendControlType {
  var arrowActive: js.UndefOr[Boolean] = js.undefined
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var component: ReactNode
  var disabled: js.UndefOr[Boolean] = js.undefined
  var html: js.UndefOr[String | Null] = js.undefined
  var key: String
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String | ReactNode] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: dropdown
}

object Anon_ArrowActive {
  @scala.inline
  def apply(
    key: String,
    `type`: dropdown,
    arrowActive: js.UndefOr[Boolean] = js.undefined,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    component: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    text: String | ReactNode = null,
    title: String = null
  ): Anon_ArrowActive = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowActive)) __obj.updateDynamic("arrowActive")(arrowActive.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArrowActive]
  }
}

