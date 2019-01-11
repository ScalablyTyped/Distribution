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

