package typings.bootstrapDatepicker

import typings.bootstrapDatepicker.bootstrapDatepickerStrings.linked
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All options that take a “Date” can handle a Date object; a String
  * formatted according to the given format; or a timedelta relative
  * to today, eg “-1d”, “+6m +1y”, etc, where valid units are “d” (day),
  * “w” (week), “m” (month), and “y” (year).
  *
  * See online docs for more info:
  *  https://bootstrap-datepicker.readthedocs.io/en/latest/options.html
  */
@js.native
trait DatepickerOptions extends js.Object {
  
  var assumeNearbyYear: js.UndefOr[Boolean | Double] = js.native
  
  var autoclose: js.UndefOr[Boolean] = js.native
  
  var beforeShowCentury: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.native
  
  var beforeShowDay: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowDayResponse]]
  ] = js.native
  
  var beforeShowDecade: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.native
  
  var beforeShowMonth: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.native
  
  var beforeShowYear: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.native
  
  var calendarWeeks: js.UndefOr[Boolean] = js.native
  
  var clearBtn: js.UndefOr[Boolean] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var datesDisabled: js.UndefOr[String | js.Array[String]] = js.native
  
  var daysOfWeekDisabled: js.UndefOr[String | js.Array[Double]] = js.native
  
  var daysOfWeekHighlighted: js.UndefOr[String | js.Array[Double]] = js.native
  
  var defaultViewDate: js.UndefOr[Date | String | DatepickerViewDate] = js.native
  
  var enableOnReadonly: js.UndefOr[Boolean] = js.native
  
  var endDate: js.UndefOr[Date | String] = js.native
  
  var forceParse: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[String | DatepickerCustomFormatOptions] = js.native
  
  var immediateUpdates: js.UndefOr[Boolean] = js.native
  
  var inputs: js.UndefOr[js.Array[_]] = js.native
  
  var keepEmptyValues: js.UndefOr[Boolean] = js.native
  
  var keyboardNavigation: js.UndefOr[Boolean] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var maxViewMode: js.UndefOr[DatepickerViewModes] = js.native
  
  var minViewMode: js.UndefOr[DatepickerViewModes] = js.native
  
  var multidate: js.UndefOr[Boolean | Double] = js.native
  
  var multidateSeparator: js.UndefOr[String] = js.native
  
  var orientation: js.UndefOr[DatepickerOrientations] = js.native
  
  var showOnFocus: js.UndefOr[Boolean] = js.native
  
  var showWeekDays: js.UndefOr[Boolean] = js.native
  
  var startDate: js.UndefOr[Date | String] = js.native
  
  var startView: js.UndefOr[DatepickerViewModes] = js.native
  
  var templates: js.UndefOr[js.Any] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var todayBtn: js.UndefOr[Boolean | linked] = js.native
  
  var todayHighlight: js.UndefOr[Boolean] = js.native
  
  var updateViewDate: js.UndefOr[Boolean] = js.native
  
  var weekStart: js.UndefOr[Double] = js.native
  
  var zIndexOffset: js.UndefOr[Double] = js.native
}
object DatepickerOptions {
  
  @scala.inline
  def apply(): DatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerOptions]
  }
  
  @scala.inline
  implicit class DatepickerOptionsOps[Self <: DatepickerOptions] (val x: Self) extends AnyVal {
    
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
    def setAssumeNearbyYear(value: Boolean | Double): Self = this.set("assumeNearbyYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssumeNearbyYear: Self = this.set("assumeNearbyYear", js.undefined)
    
    @scala.inline
    def setAutoclose(value: Boolean): Self = this.set("autoclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoclose: Self = this.set("autoclose", js.undefined)
    
    @scala.inline
    def setBeforeShowCentury(value: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = this.set("beforeShowCentury", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeShowCentury: Self = this.set("beforeShowCentury", js.undefined)
    
    @scala.inline
    def setBeforeShowDay(value: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowDayResponse]): Self = this.set("beforeShowDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeShowDay: Self = this.set("beforeShowDay", js.undefined)
    
    @scala.inline
    def setBeforeShowDecade(value: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = this.set("beforeShowDecade", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeShowDecade: Self = this.set("beforeShowDecade", js.undefined)
    
    @scala.inline
    def setBeforeShowMonth(value: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = this.set("beforeShowMonth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeShowMonth: Self = this.set("beforeShowMonth", js.undefined)
    
    @scala.inline
    def setBeforeShowYear(value: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = this.set("beforeShowYear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeShowYear: Self = this.set("beforeShowYear", js.undefined)
    
    @scala.inline
    def setCalendarWeeks(value: Boolean): Self = this.set("calendarWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarWeeks: Self = this.set("calendarWeeks", js.undefined)
    
    @scala.inline
    def setClearBtn(value: Boolean): Self = this.set("clearBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearBtn: Self = this.set("clearBtn", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDatesDisabledVarargs(value: String*): Self = this.set("datesDisabled", js.Array(value :_*))
    
    @scala.inline
    def setDatesDisabled(value: String | js.Array[String]): Self = this.set("datesDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatesDisabled: Self = this.set("datesDisabled", js.undefined)
    
    @scala.inline
    def setDaysOfWeekDisabledVarargs(value: Double*): Self = this.set("daysOfWeekDisabled", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeekDisabled(value: String | js.Array[Double]): Self = this.set("daysOfWeekDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysOfWeekDisabled: Self = this.set("daysOfWeekDisabled", js.undefined)
    
    @scala.inline
    def setDaysOfWeekHighlightedVarargs(value: Double*): Self = this.set("daysOfWeekHighlighted", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeekHighlighted(value: String | js.Array[Double]): Self = this.set("daysOfWeekHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysOfWeekHighlighted: Self = this.set("daysOfWeekHighlighted", js.undefined)
    
    @scala.inline
    def setDefaultViewDate(value: Date | String | DatepickerViewDate): Self = this.set("defaultViewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultViewDate: Self = this.set("defaultViewDate", js.undefined)
    
    @scala.inline
    def setEnableOnReadonly(value: Boolean): Self = this.set("enableOnReadonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableOnReadonly: Self = this.set("enableOnReadonly", js.undefined)
    
    @scala.inline
    def setEndDate(value: Date | String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setForceParse(value: Boolean): Self = this.set("forceParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceParse: Self = this.set("forceParse", js.undefined)
    
    @scala.inline
    def setFormat(value: String | DatepickerCustomFormatOptions): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setImmediateUpdates(value: Boolean): Self = this.set("immediateUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmediateUpdates: Self = this.set("immediateUpdates", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: js.Any*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[_]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    
    @scala.inline
    def setKeepEmptyValues(value: Boolean): Self = this.set("keepEmptyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepEmptyValues: Self = this.set("keepEmptyValues", js.undefined)
    
    @scala.inline
    def setKeyboardNavigation(value: Boolean): Self = this.set("keyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardNavigation: Self = this.set("keyboardNavigation", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setMaxViewMode(value: DatepickerViewModes): Self = this.set("maxViewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxViewMode: Self = this.set("maxViewMode", js.undefined)
    
    @scala.inline
    def setMinViewMode(value: DatepickerViewModes): Self = this.set("minViewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinViewMode: Self = this.set("minViewMode", js.undefined)
    
    @scala.inline
    def setMultidate(value: Boolean | Double): Self = this.set("multidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultidate: Self = this.set("multidate", js.undefined)
    
    @scala.inline
    def setMultidateSeparator(value: String): Self = this.set("multidateSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultidateSeparator: Self = this.set("multidateSeparator", js.undefined)
    
    @scala.inline
    def setOrientation(value: DatepickerOrientations): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setShowOnFocus(value: Boolean): Self = this.set("showOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnFocus: Self = this.set("showOnFocus", js.undefined)
    
    @scala.inline
    def setShowWeekDays(value: Boolean): Self = this.set("showWeekDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWeekDays: Self = this.set("showWeekDays", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date | String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setStartView(value: DatepickerViewModes): Self = this.set("startView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartView: Self = this.set("startView", js.undefined)
    
    @scala.inline
    def setTemplates(value: js.Any): Self = this.set("templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTodayBtn(value: Boolean | linked): Self = this.set("todayBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayBtn: Self = this.set("todayBtn", js.undefined)
    
    @scala.inline
    def setTodayHighlight(value: Boolean): Self = this.set("todayHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayHighlight: Self = this.set("todayHighlight", js.undefined)
    
    @scala.inline
    def setUpdateViewDate(value: Boolean): Self = this.set("updateViewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateViewDate: Self = this.set("updateViewDate", js.undefined)
    
    @scala.inline
    def setWeekStart(value: Double): Self = this.set("weekStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekStart: Self = this.set("weekStart", js.undefined)
    
    @scala.inline
    def setZIndexOffset(value: Double): Self = this.set("zIndexOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndexOffset: Self = this.set("zIndexOffset", js.undefined)
  }
}
