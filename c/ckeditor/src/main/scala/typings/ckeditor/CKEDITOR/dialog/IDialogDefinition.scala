package typings.ckeditor.CKEDITOR.dialog

import typings.ckeditor.CKEDITOR.dialog.definition.button
import typings.ckeditor.CKEDITOR.dialog.definition.content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogDefinition extends js.Object {
  var buttons: js.UndefOr[js.Array[button]] = js.undefined
  var contents: js.UndefOr[js.Array[content]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var resizable: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object IDialogDefinition {
  @scala.inline
  def apply(
    buttons: js.Array[button] = null,
    contents: js.Array[content] = null,
    height: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    onCancel: () => Unit = null,
    onHide: () => Unit = null,
    onLoad: () => Unit = null,
    onOk: () => Unit = null,
    onShow: () => Unit = null,
    resizable: js.UndefOr[Double] = js.undefined,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): IDialogDefinition = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction0(onOk))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogDefinition]
  }
}

