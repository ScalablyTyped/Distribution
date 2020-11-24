package typings.baseui.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatepickerOverrides[T] extends js.Object {
  
  var CalendarContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var CalendarHeader: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var Day: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var Input: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var InputWrapper: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var Month: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var MonthContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var MonthHeader: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var MonthYearSelectButton: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var MonthYearSelectIconContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var MonthYearSelectPopover: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var MonthYearSelectStatefulMenu: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var NextButton: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var NextButtonIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var Popover: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var PrevButton: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var PrevButtonIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var QuickSelect: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var QuickSelectContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var QuickSelectFormControl: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var TimeSelect: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var TimeSelectContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var TimeSelectFormControl: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var Week: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var WeekdayHeader: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
}
object DatepickerOverrides {
  
  @scala.inline
  def apply[T](): DatepickerOverrides[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerOverrides[T]]
  }
  
  @scala.inline
  implicit class DatepickerOverridesOps[Self <: DatepickerOverrides[_], T] (val x: Self with DatepickerOverrides[T]) extends AnyVal {
    
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
    def setCalendarContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("CalendarContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarContainer: Self = this.set("CalendarContainer", js.undefined)
    
    @scala.inline
    def setCalendarHeader(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("CalendarHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarHeader: Self = this.set("CalendarHeader", js.undefined)
    
    @scala.inline
    def setDay(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("Day", js.undefined)
    
    @scala.inline
    def setInput(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("Input", js.undefined)
    
    @scala.inline
    def setInputWrapper(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("InputWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputWrapper: Self = this.set("InputWrapper", js.undefined)
    
    @scala.inline
    def setMonth(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("Month", js.undefined)
    
    @scala.inline
    def setMonthContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("MonthContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthContainer: Self = this.set("MonthContainer", js.undefined)
    
    @scala.inline
    def setMonthHeader(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("MonthHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthHeader: Self = this.set("MonthHeader", js.undefined)
    
    @scala.inline
    def setMonthYearSelectButton(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("MonthYearSelectButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthYearSelectButton: Self = this.set("MonthYearSelectButton", js.undefined)
    
    @scala.inline
    def setMonthYearSelectIconContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("MonthYearSelectIconContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthYearSelectIconContainer: Self = this.set("MonthYearSelectIconContainer", js.undefined)
    
    @scala.inline
    def setMonthYearSelectPopover(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("MonthYearSelectPopover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthYearSelectPopover: Self = this.set("MonthYearSelectPopover", js.undefined)
    
    @scala.inline
    def setMonthYearSelectStatefulMenu(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("MonthYearSelectStatefulMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthYearSelectStatefulMenu: Self = this.set("MonthYearSelectStatefulMenu", js.undefined)
    
    @scala.inline
    def setNextButton(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("NextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextButton: Self = this.set("NextButton", js.undefined)
    
    @scala.inline
    def setNextButtonIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("NextButtonIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextButtonIcon: Self = this.set("NextButtonIcon", js.undefined)
    
    @scala.inline
    def setPopover(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Popover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopover: Self = this.set("Popover", js.undefined)
    
    @scala.inline
    def setPrevButton(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("PrevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevButton: Self = this.set("PrevButton", js.undefined)
    
    @scala.inline
    def setPrevButtonIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("PrevButtonIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevButtonIcon: Self = this.set("PrevButtonIcon", js.undefined)
    
    @scala.inline
    def setQuickSelect(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("QuickSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickSelect: Self = this.set("QuickSelect", js.undefined)
    
    @scala.inline
    def setQuickSelectContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("QuickSelectContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickSelectContainer: Self = this.set("QuickSelectContainer", js.undefined)
    
    @scala.inline
    def setQuickSelectFormControl(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("QuickSelectFormControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickSelectFormControl: Self = this.set("QuickSelectFormControl", js.undefined)
    
    @scala.inline
    def setRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    
    @scala.inline
    def setTimeSelect(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("TimeSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSelect: Self = this.set("TimeSelect", js.undefined)
    
    @scala.inline
    def setTimeSelectContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("TimeSelectContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSelectContainer: Self = this.set("TimeSelectContainer", js.undefined)
    
    @scala.inline
    def setTimeSelectFormControl(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("TimeSelectFormControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSelectFormControl: Self = this.set("TimeSelectFormControl", js.undefined)
    
    @scala.inline
    def setWeek(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeek: Self = this.set("Week", js.undefined)
    
    @scala.inline
    def setWeekdayHeader(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("WeekdayHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdayHeader: Self = this.set("WeekdayHeader", js.undefined)
  }
}
