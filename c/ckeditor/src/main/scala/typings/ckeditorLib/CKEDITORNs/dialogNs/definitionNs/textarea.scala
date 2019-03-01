package typings
package ckeditorLib.CKEDITORNs.dialogNs.definitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textarea extends labeledElement {
  var bidi: js.UndefOr[scala.Boolean] = js.undefined
  var cols: js.UndefOr[scala.Double] = js.undefined
  var default: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var validate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object textarea {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    bidi: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    cols: scala.Int | scala.Double = null,
    commit: js.Function1[/* widget */ ckeditorLib.CKEDITORNs.pluginsNs.widget, scala.Unit] = null,
    controlStyle: java.lang.String = null,
    default: java.lang.String = null,
    id: java.lang.String = null,
    inputStyle: java.lang.String = null,
    label: java.lang.String = null,
    labelLayout: java.lang.String = null,
    labelStyle: java.lang.String = null,
    onHide: js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit] = null,
    onLoad: js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit] = null,
    onShow: js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit] = null,
    requiredContent: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] | ckeditorLib.CKEDITORNs.style = null,
    rows: scala.Int | scala.Double = null,
    setup: js.Function1[/* widget */ ckeditorLib.CKEDITORNs.pluginsNs.widget, scala.Unit] = null,
    style: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    validate: js.Function0[scala.Boolean] = null,
    widths: js.Array[scala.Double] = null
  ): textarea = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(bidi)) __obj.updateDynamic("bidi")(bidi)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (commit != null) __obj.updateDynamic("commit")(commit)
    if (controlStyle != null) __obj.updateDynamic("controlStyle")(controlStyle)
    if (default != null) __obj.updateDynamic("default")(default)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelLayout != null) __obj.updateDynamic("labelLayout")(labelLayout)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[textarea]
  }
}

