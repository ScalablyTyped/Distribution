package typings.atBlueprintjsTable.libEsmHeadersEditableNameMod

import typings.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableNameProps
  extends IIntentProps
     with IProps {
  /**
    * The index of the name in the header. If provided, this will be passed as an argument to any
    * callbacks when they are invoked.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * The name displayed in the text box. Be sure to update this value when
    * rendering this component after a confirmed change.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A listener that is triggered if the user cancels the edit. This is
    * important to listen to if you are doing anything with `onChange` events,
    * since you'll likely want to revert whatever changes you made.
    */
  var onCancel: js.UndefOr[js.Function2[/* value */ String, /* columnIndex */ js.UndefOr[Double], Unit]] = js.undefined
  /**
    * A listener that is triggered as soon as the editable name is modified.
    * This can be due, for example, to keyboard input or the clipboard.
    */
  var onChange: js.UndefOr[js.Function2[/* value */ String, /* columnIndex */ js.UndefOr[Double], Unit]] = js.undefined
  /**
    * A listener that is triggered once the editing is confirmed. This is
    * usually due to the `return` (or `enter`) key press.
    */
  var onConfirm: js.UndefOr[js.Function2[/* value */ String, /* columnIndex */ js.UndefOr[Double], Unit]] = js.undefined
}

object IEditableNameProps {
  @scala.inline
  def apply(
    className: String = null,
    index: Int | Double = null,
    intent: Intent = null,
    name: String = null,
    onCancel: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit = null,
    onChange: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit = null,
    onConfirm: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit = null
  ): IEditableNameProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction2(onConfirm))
    __obj.asInstanceOf[IEditableNameProps]
  }
}

