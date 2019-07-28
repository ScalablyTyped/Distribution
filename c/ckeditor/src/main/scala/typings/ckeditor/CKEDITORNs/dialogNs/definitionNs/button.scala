package typings.ckeditor.CKEDITORNs.dialogNs.definitionNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITORNs.pluginsNs.widget
import typings.ckeditor.CKEDITORNs.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait button extends uiElement {
  var disabled: js.UndefOr[Boolean] = js.undefined
}

object button {
  @scala.inline
  def apply(
    align: String = null,
    className: String = null,
    commit: /* widget */ widget => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    label: String = null,
    onHide: /* elem */ typings.ckeditor.CKEDITORNs.uiNs.dialogNs.uiElement => Unit = null,
    onLoad: /* elem */ typings.ckeditor.CKEDITORNs.uiNs.dialogNs.uiElement => Unit = null,
    onShow: /* elem */ typings.ckeditor.CKEDITORNs.uiNs.dialogNs.uiElement => Unit = null,
    requiredContent: String | StringDictionary[js.Any] | style = null,
    setup: /* widget */ widget => Unit = null,
    style: String = null,
    title: String = null,
    `type`: String = null
  ): button = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (className != null) __obj.updateDynamic("className")(className)
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction1(commit))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1(setup))
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[button]
  }
}

