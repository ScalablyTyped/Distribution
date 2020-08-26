package typings.blueprintjsDatetime.dateTimePickerMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typings.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateTimePickerProps extends IProps {
  /**
    * Allows the user to clear the selection by clicking the currently selected day.
    * @default true
    */
  var canClearSelection: js.UndefOr[Boolean] = js.native
  /**
    * Any props to be passed on to the `DatePicker` other than the `value` and `onChange` props as they come directly
    * from the `DateTimePicker` props.
    */
  var datePickerProps: js.UndefOr[IDatePickerProps] = js.native
  /**
    * The initial date and time value that will be set.
    * This will be ignored if `value` is set.
    * @default Date.now()
    */
  var defaultValue: js.UndefOr[Date] = js.native
  /**
    * Callback invoked when the user changes the date or time.
    */
  var onChange: js.UndefOr[js.Function2[/* selectedDate */ Date, /* isUserChange */ Boolean, Unit]] = js.native
  /**
    * Any props to be passed on to the `TimePicker` other than the `value` and `onChange` props as they come directly
    * from the `DateTimePicker` props.
    */
  var timePickerProps: js.UndefOr[ITimePickerProps] = js.native
  /**
    * The currently set date and time. If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[Date] = js.native
}

object IDateTimePickerProps {
  @scala.inline
  def apply(): IDateTimePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateTimePickerProps]
  }
  @scala.inline
  implicit class IDateTimePickerPropsOps[Self <: IDateTimePickerProps] (val x: Self) extends AnyVal {
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
    def setCanClearSelection(value: Boolean): Self = this.set("canClearSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanClearSelection: Self = this.set("canClearSelection", js.undefined)
    @scala.inline
    def setDatePickerProps(value: IDatePickerProps): Self = this.set("datePickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatePickerProps: Self = this.set("datePickerProps", js.undefined)
    @scala.inline
    def setDefaultValue(value: Date): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setOnChange(value: (/* selectedDate */ Date, /* isUserChange */ Boolean) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setTimePickerProps(value: ITimePickerProps): Self = this.set("timePickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePickerProps: Self = this.set("timePickerProps", js.undefined)
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

