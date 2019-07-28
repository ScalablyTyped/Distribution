package typings.ckeditor.CKEDITORNs.dialogNs.definitionNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITORNs.pluginsNs.widget
import typings.ckeditor.CKEDITORNs.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textInput extends labeledElement {
  var bidi: js.UndefOr[Boolean] = js.undefined
  var default: js.UndefOr[String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object textInput {
  @scala.inline
  def apply(
    align: String = null,
    bidi: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    commit: /* widget */ widget => Unit = null,
    controlStyle: String = null,
    default: String = null,
    id: String = null,
    inputStyle: String = null,
    label: String = null,
    labelLayout: String = null,
    labelStyle: String = null,
    maxLength: Int | Double = null,
    onHide: /* elem */ typings.ckeditor.CKEDITORNs.uiNs.dialogNs.uiElement => Unit = null,
    onLoad: /* elem */ typings.ckeditor.CKEDITORNs.uiNs.dialogNs.uiElement => Unit = null,
    onShow: /* elem */ typings.ckeditor.CKEDITORNs.uiNs.dialogNs.uiElement => Unit = null,
    requiredContent: String | StringDictionary[js.Any] | style = null,
    setup: /* widget */ widget => Unit = null,
    size: Int | Double = null,
    style: String = null,
    title: String = null,
    `type`: String = null,
    validate: () => Boolean = null,
    widths: js.Array[Double] = null
  ): textInput = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(bidi)) __obj.updateDynamic("bidi")(bidi)
    if (className != null) __obj.updateDynamic("className")(className)
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction1(commit))
    if (controlStyle != null) __obj.updateDynamic("controlStyle")(controlStyle)
    if (default != null) __obj.updateDynamic("default")(default)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelLayout != null) __obj.updateDynamic("labelLayout")(labelLayout)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1(setup))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[textInput]
  }
}

