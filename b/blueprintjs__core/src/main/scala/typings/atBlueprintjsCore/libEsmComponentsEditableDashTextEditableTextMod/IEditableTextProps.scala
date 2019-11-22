package typings.atBlueprintjsCore.libEsmComponentsEditableDashTextEditableTextMod

import typings.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableTextProps
  extends IIntentProps
     with IProps {
  /**
    * EXPERIMENTAL FEATURE.
    *
    * When true, this forces the component to _always_ render an editable input (or textarea)
    * both when the component is focussed and unfocussed, instead of the component's default
    * behavior of switching between a text span and a text input upon interaction.
    *
    * This behavior can help in certain applications where, for example, a custom right-click
    * context menu is used to supply clipboard copy and paste functionality.
    * @default false
    */
  var alwaysRenderInput: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true` and in multiline mode, the `enter` key will trigger onConfirm and `mod+enter`
    * will insert a newline. If `false`, the key bindings are inverted such that `enter`
    * adds a newline.
    * @default false
    */
  var confirmOnEnterKey: js.UndefOr[Boolean] = js.undefined
  /** Default text value of uncontrolled input. */
  var defaultValue: js.UndefOr[String] = js.undefined
  /**
    * Whether the text can be edited.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Whether the component is currently being edited. */
  var isEditing: js.UndefOr[Boolean] = js.undefined
  /** Maximum number of characters allowed. Unlimited by default. */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of lines before scrolling begins, when `multiline`.
    */
  var maxLines: js.UndefOr[Double] = js.undefined
  /**
    * Minimum number of lines (essentially minimum height), when `multiline`.
    * @default 1
    */
  var minLines: js.UndefOr[Double] = js.undefined
  /** Minimum width in pixels of the input, when not `multiline`. */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * Whether the component supports multiple lines of text.
    * This prop should not be changed during the component's lifetime.
    * @default false
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
  /** Callback invoked when user cancels input with the `esc` key. Receives last confirmed value. */
  var onCancel: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  /** Callback invoked when user changes input in any way. */
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  /** Callback invoked when user confirms value with `enter` key or by blurring input. */
  var onConfirm: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  /** Callback invoked after the user enters edit mode. */
  var onEdit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  /**
    * Placeholder text when there is no value.
    * @default "Click to Edit"
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * Whether the entire text field should be selected on focus.
    * If `false`, the cursor is placed at the end of the text.
    * This prop is ignored on inputs with type other then text, search, url, tel and password. See https://html.spec.whatwg.org/multipage/input.html#do-not-apply for details.
    * @default false
    */
  var selectAllOnFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of input that should be shown, when not `multiline`.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Text value of controlled input. */
  var value: js.UndefOr[String] = js.undefined
}

object IEditableTextProps {
  @scala.inline
  def apply(
    alwaysRenderInput: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    confirmOnEnterKey: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    intent: Intent = null,
    isEditing: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    maxLines: Int | Double = null,
    minLines: Int | Double = null,
    minWidth: Int | Double = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onCancel: /* value */ String => Unit = null,
    onChange: /* value */ String => Unit = null,
    onConfirm: /* value */ String => Unit = null,
    onEdit: /* value */ String => Unit = null,
    placeholder: String = null,
    selectAllOnFocus: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    value: String = null
  ): IEditableTextProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysRenderInput)) __obj.updateDynamic("alwaysRenderInput")(alwaysRenderInput)
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
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction1(onConfirm))
    if (onEdit != null) __obj.updateDynamic("onEdit")(js.Any.fromFunction1(onEdit))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(selectAllOnFocus)) __obj.updateDynamic("selectAllOnFocus")(selectAllOnFocus)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IEditableTextProps]
  }
}

