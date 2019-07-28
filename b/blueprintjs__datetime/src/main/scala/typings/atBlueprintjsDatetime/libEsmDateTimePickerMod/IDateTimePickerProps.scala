package typings.atBlueprintjsDatetime.libEsmDateTimePickerMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsDatetime.libEsmDatePickerMod.IDatePickerProps
import typings.atBlueprintjsDatetime.libEsmTimePickerMod.ITimePickerProps
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateTimePickerProps extends IProps {
  /**
    * Allows the user to clear the selection by clicking the currently selected day.
    * @default true
    */
  var canClearSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Any props to be passed on to the `DatePicker` other than the `value` and `onChange` props as they come directly
    * from the `DateTimePicker` props.
    */
  var datePickerProps: js.UndefOr[IDatePickerProps] = js.undefined
  /**
    * The initial date and time value that will be set.
    * This will be ignored if `value` is set.
    * @default Date.now()
    */
  var defaultValue: js.UndefOr[Date] = js.undefined
  /**
    * Callback invoked when the user changes the date or time.
    */
  var onChange: js.UndefOr[js.Function2[/* selectedDate */ Date, /* isUserChange */ Boolean, Unit]] = js.undefined
  /**
    * Any props to be passed on to the `TimePicker` other than the `value` and `onChange` props as they come directly
    * from the `DateTimePicker` props.
    */
  var timePickerProps: js.UndefOr[ITimePickerProps] = js.undefined
  /**
    * The currently set date and time. If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[Date] = js.undefined
}

object IDateTimePickerProps {
  @scala.inline
  def apply(
    canClearSelection: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    datePickerProps: IDatePickerProps = null,
    defaultValue: Date = null,
    onChange: (/* selectedDate */ Date, /* isUserChange */ Boolean) => Unit = null,
    timePickerProps: ITimePickerProps = null,
    value: Date = null
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

