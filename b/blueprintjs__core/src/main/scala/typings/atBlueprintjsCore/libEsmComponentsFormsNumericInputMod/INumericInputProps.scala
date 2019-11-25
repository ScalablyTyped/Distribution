package typings.atBlueprintjsCore.libEsmComponentsFormsNumericInputMod

import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.left
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.none
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.right
import typings.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.atBlueprintjsIcons.libEsmIconNameMod.IconName
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumericInputProps
  extends IIntentProps
     with IProps {
  /**
    * Whether to allow only floating-point number characters in the field,
    * mimicking the native `input[type="number"]`.
    * @default true
    */
  var allowNumericCharactersOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The position of the buttons with respect to the input field.
    * @default Position.RIGHT
    */
  var buttonPosition: js.UndefOr[left | right | none] = js.undefined
  /**
    * Whether the value should be clamped to `[min, max]` on blur.
    * The value will be clamped to each bound only if the bound is defined.
    * Note that native `input[type="number"]` controls do *NOT* clamp on blur.
    * @default false
    */
  var clampValueOnBlur: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the input is non-interactive.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Whether the numeric input should take up the full width of its container. */
  var fill: js.UndefOr[Boolean] = js.undefined
  /**
    * Ref handler that receives HTML `<input>` element backing this component.
    */
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLInputElement | Null, _]] = js.undefined
  /**
    * If set to `true`, the input will display with larger styling.
    * This is equivalent to setting `Classes.LARGE` via className on the
    * parent control group and on the child input group.
    * @default false
    */
  var large: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of a Blueprint UI icon (or an icon element) to render on the left side of input.
    */
  var leftIcon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /**
    * The increment between successive values when <kbd>shift</kbd> is held.
    * Pass explicit `null` value to disable this interaction.
    * @default 10
    */
  var majorStepSize: js.UndefOr[Double | Null] = js.undefined
  /** The maximum value of the input. */
  var max: js.UndefOr[Double] = js.undefined
  /** The minimum value of the input. */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * The increment between successive values when <kbd>alt</kbd> is held.
    * Pass explicit `null` value to disable this interaction.
    * @default 0.1
    */
  var minorStepSize: js.UndefOr[Double | Null] = js.undefined
  /** The callback invoked when the value changes due to a button click. */
  var onButtonClick: js.UndefOr[js.Function2[/* valueAsNumber */ Double, /* valueAsString */ String, Unit]] = js.undefined
  /** The callback invoked when the value changes due to typing, arrow keys, or button clicks. */
  var onValueChange: js.UndefOr[js.Function2[/* valueAsNumber */ Double, /* valueAsString */ String, Unit]] = js.undefined
  /** The placeholder text in the absence of any value. */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * Element to render on right side of input.
    * For best results, use a minimal button, tag, or small spinner.
    */
  var rightElement: js.UndefOr[Element] = js.undefined
  /**
    * Whether the entire text field should be selected on focus.
    * @default false
    */
  var selectAllOnFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the entire text field should be selected on increment.
    * @default false
    */
  var selectAllOnIncrement: js.UndefOr[Boolean] = js.undefined
  /**
    * The increment between successive values when no modifier keys are held.
    * @default 1
    */
  var stepSize: js.UndefOr[Double] = js.undefined
  /** The value to display in the input field. */
  var value: js.UndefOr[Double | String] = js.undefined
}

object INumericInputProps {
  @scala.inline
  def apply(
    allowNumericCharactersOnly: js.UndefOr[Boolean] = js.undefined,
    buttonPosition: left | right | none = null,
    clampValueOnBlur: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* ref */ HTMLInputElement | Null => _ = null,
    intent: Intent = null,
    large: js.UndefOr[Boolean] = js.undefined,
    leftIcon: IconName | MaybeElement = null,
    majorStepSize: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    minorStepSize: Int | Double = null,
    onButtonClick: (/* valueAsNumber */ Double, /* valueAsString */ String) => Unit = null,
    onValueChange: (/* valueAsNumber */ Double, /* valueAsString */ String) => Unit = null,
    placeholder: String = null,
    rightElement: Element = null,
    selectAllOnFocus: js.UndefOr[Boolean] = js.undefined,
    selectAllOnIncrement: js.UndefOr[Boolean] = js.undefined,
    stepSize: Int | Double = null,
    value: Double | String = null
  ): INumericInputProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNumericCharactersOnly)) __obj.updateDynamic("allowNumericCharactersOnly")(allowNumericCharactersOnly.asInstanceOf[js.Any])
    if (buttonPosition != null) __obj.updateDynamic("buttonPosition")(buttonPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(clampValueOnBlur)) __obj.updateDynamic("clampValueOnBlur")(clampValueOnBlur.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (majorStepSize != null) __obj.updateDynamic("majorStepSize")(majorStepSize.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minorStepSize != null) __obj.updateDynamic("minorStepSize")(minorStepSize.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(js.Any.fromFunction2(onButtonClick))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (!js.isUndefined(selectAllOnFocus)) __obj.updateDynamic("selectAllOnFocus")(selectAllOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(selectAllOnIncrement)) __obj.updateDynamic("selectAllOnIncrement")(selectAllOnIncrement.asInstanceOf[js.Any])
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumericInputProps]
  }
}

