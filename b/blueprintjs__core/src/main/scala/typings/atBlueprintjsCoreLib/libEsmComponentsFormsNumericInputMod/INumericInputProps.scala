package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsNumericInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait INumericInputProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
       * Whether to allow only floating-point number characters in the field,
       * mimicking the native `input[type="number"]`.
       * @default true
       */
  var allowNumericCharactersOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The position of the buttons with respect to the input field.
       * @default Position.RIGHT
       */
  var buttonPosition: js.UndefOr[js.Any | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.none] = js.undefined
  /**
       * Whether the value should be clamped to `[min, max]` on blur.
       * The value will be clamped to each bound only if the bound is defined.
       * Note that native `input[type="number"]` controls do *NOT* clamp on blur.
       * @default false
       */
  var clampValueOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the input is non-interactive.
       * @default false
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the numeric input should take up the full width of its container. */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Ref handler that receives HTML `<input>` element backing this component.
       */
  var inputRef: js.UndefOr[js.Function1[/* ref */ reactLib.HTMLInputElement | scala.Null, _]] = js.undefined
  /**
       * If set to `true`, the input will display with larger styling.
       * This is equivalent to setting `Classes.LARGE` via className on the
       * parent control group and on the child input group.
       * @default false
       */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Name of a Blueprint UI icon (or an icon element) to render on the left side of input.
       */
  var leftIcon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  /**
       * The increment between successive values when <kbd>shift</kbd> is held.
       * Pass explicit `null` value to disable this interaction.
       * @default 10
       */
  var majorStepSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** The maximum value of the input. */
  var max: js.UndefOr[scala.Double] = js.undefined
  /** The minimum value of the input. */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
       * The increment between successive values when <kbd>alt</kbd> is held.
       * Pass explicit `null` value to disable this interaction.
       * @default 0.1
       */
  var minorStepSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** The callback invoked when the value changes due to a button click. */
  var onButtonClick: js.UndefOr[
    js.Function2[/* valueAsNumber */ scala.Double, /* valueAsString */ java.lang.String, scala.Unit]
  ] = js.undefined
  /** The callback invoked when the value changes due to typing, arrow keys, or button clicks. */
  var onValueChange: js.UndefOr[
    js.Function2[/* valueAsNumber */ scala.Double, /* valueAsString */ java.lang.String, scala.Unit]
  ] = js.undefined
  /** The placeholder text in the absence of any value. */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether the entire text field should be selected on focus.
       * @default false
       */
  var selectAllOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the entire text field should be selected on increment.
       * @default false
       */
  var selectAllOnIncrement: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The increment between successive values when no modifier keys are held.
       * @default 1
       */
  var stepSize: js.UndefOr[scala.Double] = js.undefined
  /** The value to display in the input field. */
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

