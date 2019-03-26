package typings
package atBlueprintjsTableLib.libEsmHeadersEditableNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableNameProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * The index of the name in the header. If provided, this will be passed as an argument to any
    * callbacks when they are invoked.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name displayed in the text box. Be sure to update this value when
    * rendering this component after a confirmed change.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A listener that is triggered if the user cancels the edit. This is
    * important to listen to if you are doing anything with `onChange` events,
    * since you'll likely want to revert whatever changes you made.
    */
  var onCancel: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * A listener that is triggered as soon as the editable name is modified.
    * This can be due, for example, to keyboard input or the clipboard.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * A listener that is triggered once the editing is confirmed. This is
    * usually due to the `return` (or `enter`) key press.
    */
  var onConfirm: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
}

object IEditableNameProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    name: java.lang.String = null,
    onCancel: /* value */ java.lang.String => scala.Unit = null,
    onChange: /* value */ java.lang.String => scala.Unit = null,
    onConfirm: /* value */ java.lang.String => scala.Unit = null
  ): IEditableNameProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction1(onConfirm))
    __obj.asInstanceOf[IEditableNameProps]
  }
}

