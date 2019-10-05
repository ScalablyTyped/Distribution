package typings.ckeditor.CKEDITOR.dialog.definition

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.plugins.widget
import typings.ckeditor.CKEDITOR.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uiElement extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var commit: js.UndefOr[js.Function1[/* widget */ widget, Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* elem */ typings.ckeditor.CKEDITOR.ui.dialog.uiElement, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* elem */ typings.ckeditor.CKEDITOR.ui.dialog.uiElement, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* elem */ typings.ckeditor.CKEDITOR.ui.dialog.uiElement, Unit]] = js.undefined
  var requiredContent: js.UndefOr[String | StringDictionary[js.Any] | style] = js.undefined
  var setup: js.UndefOr[js.Function1[/* widget */ widget, Unit]] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object uiElement {
  @scala.inline
  def apply(
    align: String = null,
    className: String = null,
    commit: /* widget */ widget => Unit = null,
    id: String = null,
    label: String = null,
    onHide: /* elem */ typings.ckeditor.CKEDITOR.ui.dialog.uiElement => Unit = null,
    onLoad: /* elem */ typings.ckeditor.CKEDITOR.ui.dialog.uiElement => Unit = null,
    onShow: /* elem */ typings.ckeditor.CKEDITOR.ui.dialog.uiElement => Unit = null,
    requiredContent: String | StringDictionary[js.Any] | style = null,
    setup: /* widget */ widget => Unit = null,
    style: String = null,
    title: String = null,
    `type`: String = null
  ): uiElement = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (className != null) __obj.updateDynamic("className")(className)
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction1(commit))
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
    __obj.asInstanceOf[uiElement]
  }
}

