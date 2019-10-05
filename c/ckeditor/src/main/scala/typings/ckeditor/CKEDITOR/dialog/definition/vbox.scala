package typings.ckeditor.CKEDITOR.dialog.definition

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.plugins.widget
import typings.ckeditor.CKEDITOR.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait vbox extends uiElement {
  var children: js.UndefOr[js.Array[typings.ckeditor.CKEDITOR.ui.dialog.uiElement]] = js.undefined
  var expand: js.UndefOr[Boolean] = js.undefined
  var heights: js.UndefOr[js.Array[Double]] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var styles: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[js.Array[Double]] = js.undefined
}

object vbox {
  @scala.inline
  def apply(
    align: String = null,
    children: js.Array[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = null,
    className: String = null,
    commit: /* widget */ widget => Unit = null,
    expand: js.UndefOr[Boolean] = js.undefined,
    heights: js.Array[Double] = null,
    id: String = null,
    label: String = null,
    onHide: /* elem */ typings.ckeditor.CKEDITOR.ui.dialog.uiElement => Unit = null,
    onLoad: /* elem */ typings.ckeditor.CKEDITOR.ui.dialog.uiElement => Unit = null,
    onShow: /* elem */ typings.ckeditor.CKEDITOR.ui.dialog.uiElement => Unit = null,
    padding: Int | Double = null,
    requiredContent: String | StringDictionary[js.Any] | style = null,
    setup: /* widget */ widget => Unit = null,
    style: String = null,
    styles: String = null,
    title: String = null,
    `type`: String = null,
    width: js.Array[Double] = null
  ): vbox = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction1(commit))
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (heights != null) __obj.updateDynamic("heights")(heights)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1(setup))
    if (style != null) __obj.updateDynamic("style")(style)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[vbox]
  }
}

