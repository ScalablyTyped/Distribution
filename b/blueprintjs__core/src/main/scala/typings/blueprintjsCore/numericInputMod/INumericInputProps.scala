package typings.blueprintjsCore.numericInputMod

import typings.blueprintjsCore.blueprintjsCoreStrings.left
import typings.blueprintjsCore.blueprintjsCoreStrings.none
import typings.blueprintjsCore.blueprintjsCoreStrings.right
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumericInputProps
  extends IIntentProps
     with IProps {
  /**
    * Whether to allow only floating-point number characters in the field,
    * mimicking the native `input[type="number"]`.
    * @default true
    */
  var allowNumericCharactersOnly: js.UndefOr[Boolean] = js.native
  /**
    * The position of the buttons with respect to the input field.
    * @default Position.RIGHT
    */
  var buttonPosition: js.UndefOr[left | right | none] = js.native
  /**
    * Whether the value should be clamped to `[min, max]` on blur.
    * The value will be clamped to each bound only if the bound is defined.
    * Note that native `input[type="number"]` controls do *NOT* clamp on blur.
    * @default false
    */
  var clampValueOnBlur: js.UndefOr[Boolean] = js.native
  /**
    * In uncontrolled mode, this sets the default value of the input.
    * Note that this value is only used upon component instantiation and changes to this prop
    * during the component lifecycle will be ignored.
    * @default ""
    */
  var defaultValue: js.UndefOr[Double | String] = js.native
  /**
    * Whether the input is non-interactive.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Whether the numeric input should take up the full width of its container. */
  var fill: js.UndefOr[Boolean] = js.native
  /**
    * Ref handler that receives HTML `<input>` element backing this component.
    */
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLInputElement | Null, _]] = js.native
  /**
    * If set to `true`, the input will display with larger styling.
    * This is equivalent to setting `Classes.LARGE` via className on the
    * parent control group and on the child input group.
    * @default false
    */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * Name of a Blueprint UI icon (or an icon element) to render on the left side of input.
    */
  var leftIcon: js.UndefOr[IconName | MaybeElement] = js.native
  /**
    * The increment between successive values when <kbd>shift</kbd> is held.
    * Pass explicit `null` value to disable this interaction.
    * @default 10
    */
  var majorStepSize: js.UndefOr[Double | Null] = js.native
  /** The maximum value of the input. */
  var max: js.UndefOr[Double] = js.native
  /** The minimum value of the input. */
  var min: js.UndefOr[Double] = js.native
  /**
    * The increment between successive values when <kbd>alt</kbd> is held.
    * Pass explicit `null` value to disable this interaction.
    * @default 0.1
    */
  var minorStepSize: js.UndefOr[Double | Null] = js.native
  /** The callback invoked when the value changes due to a button click. */
  var onButtonClick: js.UndefOr[js.Function2[/* valueAsNumber */ Double, /* valueAsString */ String, Unit]] = js.native
  /** The callback invoked when the value changes due to typing, arrow keys, or button clicks. */
  var onValueChange: js.UndefOr[
    js.Function3[
      /* valueAsNumber */ Double, 
      /* valueAsString */ String, 
      /* inputElement */ HTMLInputElement | Null, 
      Unit
    ]
  ] = js.native
  /** The placeholder text in the absence of any value. */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Element to render on right side of input.
    * For best results, use a minimal button, tag, or small spinner.
    */
  var rightElement: js.UndefOr[Element] = js.native
  /**
    * Whether the entire text field should be selected on focus.
    * @default false
    */
  var selectAllOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * Whether the entire text field should be selected on increment.
    * @default false
    */
  var selectAllOnIncrement: js.UndefOr[Boolean] = js.native
  /**
    * The increment between successive values when no modifier keys are held.
    * @default 1
    */
  var stepSize: js.UndefOr[Double] = js.native
  /** The value to display in the input field. */
  var value: js.UndefOr[Double | String] = js.native
}

object INumericInputProps {
  @scala.inline
  def apply(): INumericInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumericInputProps]
  }
  @scala.inline
  implicit class INumericInputPropsOps[Self <: INumericInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowNumericCharactersOnly(value: Boolean): Self = this.set("allowNumericCharactersOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNumericCharactersOnly: Self = this.set("allowNumericCharactersOnly", js.undefined)
    @scala.inline
    def setButtonPosition(value: left | right | none): Self = this.set("buttonPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonPosition: Self = this.set("buttonPosition", js.undefined)
    @scala.inline
    def setClampValueOnBlur(value: Boolean): Self = this.set("clampValueOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClampValueOnBlur: Self = this.set("clampValueOnBlur", js.undefined)
    @scala.inline
    def setDefaultValue(value: Double | String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setInputRef(value: /* ref */ HTMLInputElement | Null => _): Self = this.set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setLeftIcon(value: IconName | MaybeElement): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    @scala.inline
    def setLeftIconNull: Self = this.set("leftIcon", null)
    @scala.inline
    def setMajorStepSize(value: Double): Self = this.set("majorStepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorStepSize: Self = this.set("majorStepSize", js.undefined)
    @scala.inline
    def setMajorStepSizeNull: Self = this.set("majorStepSize", null)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinorStepSize(value: Double): Self = this.set("minorStepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorStepSize: Self = this.set("minorStepSize", js.undefined)
    @scala.inline
    def setMinorStepSizeNull: Self = this.set("minorStepSize", null)
    @scala.inline
    def setOnButtonClick(value: (/* valueAsNumber */ Double, /* valueAsString */ String) => Unit): Self = this.set("onButtonClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnButtonClick: Self = this.set("onButtonClick", js.undefined)
    @scala.inline
    def setOnValueChange(
      value: (/* valueAsNumber */ Double, /* valueAsString */ String, /* inputElement */ HTMLInputElement | Null) => Unit
    ): Self = this.set("onValueChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setRightElement(value: Element): Self = this.set("rightElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightElement: Self = this.set("rightElement", js.undefined)
    @scala.inline
    def setSelectAllOnFocus(value: Boolean): Self = this.set("selectAllOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllOnFocus: Self = this.set("selectAllOnFocus", js.undefined)
    @scala.inline
    def setSelectAllOnIncrement(value: Boolean): Self = this.set("selectAllOnIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllOnIncrement: Self = this.set("selectAllOnIncrement", js.undefined)
    @scala.inline
    def setStepSize(value: Double): Self = this.set("stepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepSize: Self = this.set("stepSize", js.undefined)
    @scala.inline
    def setValue(value: Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

