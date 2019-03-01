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
  var buttonPosition: js.UndefOr[
    atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.left | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.right | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.none
  ] = js.undefined
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
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement
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
    * Element to render on right side of input.
    * For best results, use a minimal button, tag, or small spinner.
    */
  var rightElement: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
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

object INumericInputProps {
  @scala.inline
  def apply(
    allowNumericCharactersOnly: js.UndefOr[scala.Boolean] = js.undefined,
    buttonPosition: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.left | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.right | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.none = null,
    clampValueOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    inputRef: js.Function1[/* ref */ reactLib.HTMLInputElement | scala.Null, _] = null,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    large: js.UndefOr[scala.Boolean] = js.undefined,
    leftIcon: atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement = null,
    majorStepSize: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minorStepSize: scala.Int | scala.Double = null,
    onButtonClick: js.Function2[/* valueAsNumber */ scala.Double, /* valueAsString */ java.lang.String, scala.Unit] = null,
    onValueChange: js.Function2[/* valueAsNumber */ scala.Double, /* valueAsString */ java.lang.String, scala.Unit] = null,
    placeholder: java.lang.String = null,
    rightElement: reactLib.reactMod.Global.JSXNs.Element = null,
    selectAllOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    selectAllOnIncrement: js.UndefOr[scala.Boolean] = js.undefined,
    stepSize: scala.Int | scala.Double = null,
    value: scala.Double | java.lang.String = null
  ): INumericInputProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNumericCharactersOnly)) __obj.updateDynamic("allowNumericCharactersOnly")(allowNumericCharactersOnly)
    if (buttonPosition != null) __obj.updateDynamic("buttonPosition")(buttonPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(clampValueOnBlur)) __obj.updateDynamic("clampValueOnBlur")(clampValueOnBlur)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (majorStepSize != null) __obj.updateDynamic("majorStepSize")(majorStepSize.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minorStepSize != null) __obj.updateDynamic("minorStepSize")(minorStepSize.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(onButtonClick)
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(onValueChange)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement)
    if (!js.isUndefined(selectAllOnFocus)) __obj.updateDynamic("selectAllOnFocus")(selectAllOnFocus)
    if (!js.isUndefined(selectAllOnIncrement)) __obj.updateDynamic("selectAllOnIncrement")(selectAllOnIncrement)
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumericInputProps]
  }
}

