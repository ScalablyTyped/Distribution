package typings
package ckeditorLib.CKEDITORNs.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogDefinition extends js.Object {
  var buttons: js.UndefOr[js.Array[ckeditorLib.CKEDITORNs.dialogNs.definitionNs.button]] = js.undefined
  var contents: js.UndefOr[js.Array[ckeditorLib.CKEDITORNs.dialogNs.definitionNs.content]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var onCancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var resizable: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object IDialogDefinition {
  @scala.inline
  def apply(
    buttons: js.Array[ckeditorLib.CKEDITORNs.dialogNs.definitionNs.button] = null,
    contents: js.Array[ckeditorLib.CKEDITORNs.dialogNs.definitionNs.content] = null,
    height: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    onCancel: () => scala.Unit = null,
    onHide: () => scala.Unit = null,
    onLoad: () => scala.Unit = null,
    onOk: () => scala.Unit = null,
    onShow: () => scala.Unit = null,
    resizable: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): IDialogDefinition = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction0(onOk))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogDefinition]
  }
}

