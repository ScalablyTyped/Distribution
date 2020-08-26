package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttribType extends js.Object {
  var attribType: String = js.native
  var classCalendarContainer: String = js.native
  var classDay: String = js.native
  var classDays: String = js.native
  var classFlatpickrCurrentMonth: String = js.native
  var classFocused: String = js.native
  var classMonth: String = js.native
  var classVisuallyHidden: String = js.native
  var classWeekday: String = js.native
  var classWeekdays: String = js.native
  var dateFormat: String = js.native
  var selectorDatePickerIcon: String = js.native
  var selectorDatePickerInput: String = js.native
  var selectorDatePickerInputFrom: String = js.native
  var selectorDatePickerInputTo: String = js.native
  var selectorFlatpickrCurrentMonth: String = js.native
  var selectorFlatpickrMonthYearContainer: String = js.native
  var selectorFlatpickrYearContainer: String = js.native
  var selectorInit: String = js.native
}

object AttribType {
  @scala.inline
  def apply(
    attribType: String,
    classCalendarContainer: String,
    classDay: String,
    classDays: String,
    classFlatpickrCurrentMonth: String,
    classFocused: String,
    classMonth: String,
    classVisuallyHidden: String,
    classWeekday: String,
    classWeekdays: String,
    dateFormat: String,
    selectorDatePickerIcon: String,
    selectorDatePickerInput: String,
    selectorDatePickerInputFrom: String,
    selectorDatePickerInputTo: String,
    selectorFlatpickrCurrentMonth: String,
    selectorFlatpickrMonthYearContainer: String,
    selectorFlatpickrYearContainer: String,
    selectorInit: String
  ): AttribType = {
    val __obj = js.Dynamic.literal(attribType = attribType.asInstanceOf[js.Any], classCalendarContainer = classCalendarContainer.asInstanceOf[js.Any], classDay = classDay.asInstanceOf[js.Any], classDays = classDays.asInstanceOf[js.Any], classFlatpickrCurrentMonth = classFlatpickrCurrentMonth.asInstanceOf[js.Any], classFocused = classFocused.asInstanceOf[js.Any], classMonth = classMonth.asInstanceOf[js.Any], classVisuallyHidden = classVisuallyHidden.asInstanceOf[js.Any], classWeekday = classWeekday.asInstanceOf[js.Any], classWeekdays = classWeekdays.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], selectorDatePickerIcon = selectorDatePickerIcon.asInstanceOf[js.Any], selectorDatePickerInput = selectorDatePickerInput.asInstanceOf[js.Any], selectorDatePickerInputFrom = selectorDatePickerInputFrom.asInstanceOf[js.Any], selectorDatePickerInputTo = selectorDatePickerInputTo.asInstanceOf[js.Any], selectorFlatpickrCurrentMonth = selectorFlatpickrCurrentMonth.asInstanceOf[js.Any], selectorFlatpickrMonthYearContainer = selectorFlatpickrMonthYearContainer.asInstanceOf[js.Any], selectorFlatpickrYearContainer = selectorFlatpickrYearContainer.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttribType]
  }
  @scala.inline
  implicit class AttribTypeOps[Self <: AttribType] (val x: Self) extends AnyVal {
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
    def setAttribType(value: String): Self = this.set("attribType", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassCalendarContainer(value: String): Self = this.set("classCalendarContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassDay(value: String): Self = this.set("classDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassDays(value: String): Self = this.set("classDays", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassFlatpickrCurrentMonth(value: String): Self = this.set("classFlatpickrCurrentMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassFocused(value: String): Self = this.set("classFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassMonth(value: String): Self = this.set("classMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassVisuallyHidden(value: String): Self = this.set("classVisuallyHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassWeekday(value: String): Self = this.set("classWeekday", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassWeekdays(value: String): Self = this.set("classWeekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorDatePickerIcon(value: String): Self = this.set("selectorDatePickerIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorDatePickerInput(value: String): Self = this.set("selectorDatePickerInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorDatePickerInputFrom(value: String): Self = this.set("selectorDatePickerInputFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorDatePickerInputTo(value: String): Self = this.set("selectorDatePickerInputTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorFlatpickrCurrentMonth(value: String): Self = this.set("selectorFlatpickrCurrentMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorFlatpickrMonthYearContainer(value: String): Self = this.set("selectorFlatpickrMonthYearContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorFlatpickrYearContainer(value: String): Self = this.set("selectorFlatpickrYearContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
  }
  
}

