package typings
package atBlueprintjsDatetimeLib.libEsmDateTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateTimePickerProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Allows the user to clear the selection by clicking the currently selected day.
    * @default true
    */
  var canClearSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Any props to be passed on to the `DatePicker` other than the `value` and `onChange` props as they come directly
    * from the `DateTimePicker` props.
    */
  var datePickerProps: js.UndefOr[atBlueprintjsDatetimeLib.libEsmDatePickerMod.IDatePickerProps] = js.undefined
  /**
    * The initial date and time value that will be set.
    * This will be ignored if `value` is set.
    * @default Date.now()
    */
  var defaultValue: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Callback invoked when the user changes the date or time.
    */
  var onChange: js.UndefOr[
    js.Function2[/* selectedDate */ stdLib.Date, /* isUserChange */ scala.Boolean, scala.Unit]
  ] = js.undefined
  /**
    * Any props to be passed on to the `TimePicker` other than the `value` and `onChange` props as they come directly
    * from the `DateTimePicker` props.
    */
  var timePickerProps: js.UndefOr[atBlueprintjsDatetimeLib.libEsmTimePickerMod.ITimePickerProps] = js.undefined
  /**
    * The currently set date and time. If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[stdLib.Date] = js.undefined
}

object IDateTimePickerProps {
  @scala.inline
  def apply(
    canClearSelection: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    datePickerProps: atBlueprintjsDatetimeLib.libEsmDatePickerMod.IDatePickerProps = null,
    defaultValue: stdLib.Date = null,
    onChange: (/* selectedDate */ stdLib.Date, /* isUserChange */ scala.Boolean) => scala.Unit = null,
    timePickerProps: atBlueprintjsDatetimeLib.libEsmTimePickerMod.ITimePickerProps = null,
    value: stdLib.Date = null
  ): IDateTimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canClearSelection)) __obj.updateDynamic("canClearSelection")(canClearSelection)
    if (className != null) __obj.updateDynamic("className")(className)
    if (datePickerProps != null) __obj.updateDynamic("datePickerProps")(datePickerProps)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IDateTimePickerProps]
  }
}

