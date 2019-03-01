package typings
package atBlueprintjsCoreLib.libEsmComponentsEditableDashTextEditableTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableTextProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * If `true` and in multiline mode, the `enter` key will trigger onConfirm and `mod+enter`
    * will insert a newline. If `false`, the key bindings are inverted such that `enter`
    * adds a newline.
    * @default false
    */
  var confirmOnEnterKey: js.UndefOr[scala.Boolean] = js.undefined
  /** Default text value of uncontrolled input. */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the text can be edited.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the component is currently being edited. */
  var isEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** Maximum number of characters allowed. Unlimited by default. */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum number of lines before scrolling begins, when `multiline`.
    */
  var maxLines: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum number of lines (essentially minimum height), when `multiline`.
    * @default 1
    */
  var minLines: js.UndefOr[scala.Double] = js.undefined
  /** Minimum width in pixels of the input, when not `multiline`. */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the component supports multiple lines of text.
    * This prop should not be changed during the component's lifetime.
    * @default false
    */
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  /** Callback invoked when user cancels input with the `esc` key. Receives last confirmed value. */
  var onCancel: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  /** Callback invoked when user changes input in any way. */
  var onChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  /** Callback invoked when user confirms value with `enter` key or by blurring input. */
  var onConfirm: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  /** Callback invoked after the user enters edit mode. */
  var onEdit: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Placeholder text when there is no value.
    * @default "Click to Edit"
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the entire text field should be selected on focus.
    * If `false`, the cursor is placed at the end of the text.
    * @default false
    */
  var selectAllOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The type of input that should be shown, when not `multiline`.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Text value of controlled input. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object IEditableTextProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    confirmOnEnterKey: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    isEditing: js.UndefOr[scala.Boolean] = js.undefined,
    maxLength: scala.Int | scala.Double = null,
    maxLines: scala.Int | scala.Double = null,
    minLines: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    multiline: js.UndefOr[scala.Boolean] = js.undefined,
    onCancel: js.Function1[/* value */ java.lang.String, scala.Unit] = null,
    onChange: js.Function1[/* value */ java.lang.String, scala.Unit] = null,
    onConfirm: js.Function1[/* value */ java.lang.String, scala.Unit] = null,
    onEdit: js.Function1[/* value */ java.lang.String, scala.Unit] = null,
    placeholder: java.lang.String = null,
    selectAllOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): IEditableTextProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(confirmOnEnterKey)) __obj.updateDynamic("confirmOnEnterKey")(confirmOnEnterKey)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (minLines != null) __obj.updateDynamic("minLines")(minLines.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(onConfirm)
    if (onEdit != null) __obj.updateDynamic("onEdit")(onEdit)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(selectAllOnFocus)) __obj.updateDynamic("selectAllOnFocus")(selectAllOnFocus)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IEditableTextProps]
  }
}

