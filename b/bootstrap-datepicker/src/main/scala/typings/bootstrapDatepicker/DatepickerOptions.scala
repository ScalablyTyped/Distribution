package typings.bootstrapDatepicker

import typings.bootstrapDatepicker.bootstrapDatepickerStrings.linked
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait DatepickerOptions extends StObject {
  
  var assumeNearbyYear: js.UndefOr[Boolean | Double] = js.undefined
  
  var autoclose: js.UndefOr[Boolean] = js.undefined
  
  var beforeShowCentury: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.undefined
  
  var beforeShowDay: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowDayResponse]]
  ] = js.undefined
  
  var beforeShowDecade: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.undefined
  
  var beforeShowMonth: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.undefined
  
  var beforeShowYear: js.UndefOr[
    js.Function1[/* date */ Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.undefined
  
  var calendarWeeks: js.UndefOr[Boolean] = js.undefined
  
  var clearBtn: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var datesDisabled: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var daysOfWeekDisabled: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var daysOfWeekHighlighted: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var defaultViewDate: js.UndefOr[Date | String | DatepickerViewDate] = js.undefined
  
  var enableOnReadonly: js.UndefOr[Boolean] = js.undefined
  
  var endDate: js.UndefOr[Date | String] = js.undefined
  
  var forceParse: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[String | DatepickerCustomFormatOptions] = js.undefined
  
  var immediateUpdates: js.UndefOr[Boolean] = js.undefined
  
  var inputs: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var keepEmptyValues: js.UndefOr[Boolean] = js.undefined
  
  var keyboardNavigation: js.UndefOr[Boolean] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var maxViewMode: js.UndefOr[DatepickerViewModes] = js.undefined
  
  var minViewMode: js.UndefOr[DatepickerViewModes] = js.undefined
  
  var multidate: js.UndefOr[Boolean | Double] = js.undefined
  
  var multidateSeparator: js.UndefOr[String] = js.undefined
  
  var orientation: js.UndefOr[DatepickerOrientations] = js.undefined
  
  var showOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var showWeekDays: js.UndefOr[Boolean] = js.undefined
  
  var startDate: js.UndefOr[Date | String] = js.undefined
  
  var startView: js.UndefOr[DatepickerViewModes] = js.undefined
  
  var templates: js.UndefOr[js.Any] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var todayBtn: js.UndefOr[Boolean | linked] = js.undefined
  
  var todayHighlight: js.UndefOr[Boolean] = js.undefined
  
  var updateViewDate: js.UndefOr[Boolean] = js.undefined
  
  var weekStart: js.UndefOr[Double] = js.undefined
  
  var zIndexOffset: js.UndefOr[Double] = js.undefined
}
object DatepickerOptions {
  
  @scala.inline
  def apply(): DatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerOptions]
  }
  
  @scala.inline
  implicit class DatepickerOptionsMutableBuilder[Self <: DatepickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssumeNearbyYear(value: Boolean | Double): Self = StObject.set(x, "assumeNearbyYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssumeNearbyYearUndefined: Self = StObject.set(x, "assumeNearbyYear", js.undefined)
    
    @scala.inline
    def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
    
    @scala.inline
    def setBeforeShowCentury(value: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = StObject.set(x, "beforeShowCentury", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeShowCenturyUndefined: Self = StObject.set(x, "beforeShowCentury", js.undefined)
    
    @scala.inline
    def setBeforeShowDay(value: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowDayResponse]): Self = StObject.set(x, "beforeShowDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeShowDayUndefined: Self = StObject.set(x, "beforeShowDay", js.undefined)
    
    @scala.inline
    def setBeforeShowDecade(value: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = StObject.set(x, "beforeShowDecade", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeShowDecadeUndefined: Self = StObject.set(x, "beforeShowDecade", js.undefined)
    
    @scala.inline
    def setBeforeShowMonth(value: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = StObject.set(x, "beforeShowMonth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeShowMonthUndefined: Self = StObject.set(x, "beforeShowMonth", js.undefined)
    
    @scala.inline
    def setBeforeShowYear(value: /* date */ Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = StObject.set(x, "beforeShowYear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeShowYearUndefined: Self = StObject.set(x, "beforeShowYear", js.undefined)
    
    @scala.inline
    def setCalendarWeeks(value: Boolean): Self = StObject.set(x, "calendarWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarWeeksUndefined: Self = StObject.set(x, "calendarWeeks", js.undefined)
    
    @scala.inline
    def setClearBtn(value: Boolean): Self = StObject.set(x, "clearBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearBtnUndefined: Self = StObject.set(x, "clearBtn", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDatesDisabled(value: String | js.Array[String]): Self = StObject.set(x, "datesDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatesDisabledUndefined: Self = StObject.set(x, "datesDisabled", js.undefined)
    
    @scala.inline
    def setDatesDisabledVarargs(value: String*): Self = StObject.set(x, "datesDisabled", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeekDisabled(value: String | js.Array[Double]): Self = StObject.set(x, "daysOfWeekDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOfWeekDisabledUndefined: Self = StObject.set(x, "daysOfWeekDisabled", js.undefined)
    
    @scala.inline
    def setDaysOfWeekDisabledVarargs(value: Double*): Self = StObject.set(x, "daysOfWeekDisabled", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeekHighlighted(value: String | js.Array[Double]): Self = StObject.set(x, "daysOfWeekHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOfWeekHighlightedUndefined: Self = StObject.set(x, "daysOfWeekHighlighted", js.undefined)
    
    @scala.inline
    def setDaysOfWeekHighlightedVarargs(value: Double*): Self = StObject.set(x, "daysOfWeekHighlighted", js.Array(value :_*))
    
    @scala.inline
    def setDefaultViewDate(value: Date | String | DatepickerViewDate): Self = StObject.set(x, "defaultViewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultViewDateUndefined: Self = StObject.set(x, "defaultViewDate", js.undefined)
    
    @scala.inline
    def setEnableOnReadonly(value: Boolean): Self = StObject.set(x, "enableOnReadonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableOnReadonlyUndefined: Self = StObject.set(x, "enableOnReadonly", js.undefined)
    
    @scala.inline
    def setEndDate(value: Date | String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setForceParse(value: Boolean): Self = StObject.set(x, "forceParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceParseUndefined: Self = StObject.set(x, "forceParse", js.undefined)
    
    @scala.inline
    def setFormat(value: String | DatepickerCustomFormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setImmediateUpdates(value: Boolean): Self = StObject.set(x, "immediateUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediateUpdatesUndefined: Self = StObject.set(x, "immediateUpdates", js.undefined)
    
    @scala.inline
    def setInputs(value: js.Array[js.Any]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: js.Any*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setKeepEmptyValues(value: Boolean): Self = StObject.set(x, "keepEmptyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepEmptyValuesUndefined: Self = StObject.set(x, "keepEmptyValues", js.undefined)
    
    @scala.inline
    def setKeyboardNavigation(value: Boolean): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMaxViewMode(value: DatepickerViewModes): Self = StObject.set(x, "maxViewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxViewModeUndefined: Self = StObject.set(x, "maxViewMode", js.undefined)
    
    @scala.inline
    def setMinViewMode(value: DatepickerViewModes): Self = StObject.set(x, "minViewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinViewModeUndefined: Self = StObject.set(x, "minViewMode", js.undefined)
    
    @scala.inline
    def setMultidate(value: Boolean | Double): Self = StObject.set(x, "multidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultidateSeparator(value: String): Self = StObject.set(x, "multidateSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultidateSeparatorUndefined: Self = StObject.set(x, "multidateSeparator", js.undefined)
    
    @scala.inline
    def setMultidateUndefined: Self = StObject.set(x, "multidate", js.undefined)
    
    @scala.inline
    def setOrientation(value: DatepickerOrientations): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
    
    @scala.inline
    def setShowWeekDays(value: Boolean): Self = StObject.set(x, "showWeekDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWeekDaysUndefined: Self = StObject.set(x, "showWeekDays", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date | String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setStartView(value: DatepickerViewModes): Self = StObject.set(x, "startView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartViewUndefined: Self = StObject.set(x, "startView", js.undefined)
    
    @scala.inline
    def setTemplates(value: js.Any): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTodayBtn(value: Boolean | linked): Self = StObject.set(x, "todayBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTodayBtnUndefined: Self = StObject.set(x, "todayBtn", js.undefined)
    
    @scala.inline
    def setTodayHighlight(value: Boolean): Self = StObject.set(x, "todayHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTodayHighlightUndefined: Self = StObject.set(x, "todayHighlight", js.undefined)
    
    @scala.inline
    def setUpdateViewDate(value: Boolean): Self = StObject.set(x, "updateViewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateViewDateUndefined: Self = StObject.set(x, "updateViewDate", js.undefined)
    
    @scala.inline
    def setWeekStart(value: Double): Self = StObject.set(x, "weekStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekStartUndefined: Self = StObject.set(x, "weekStart", js.undefined)
    
    @scala.inline
    def setZIndexOffset(value: Double): Self = StObject.set(x, "zIndexOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexOffsetUndefined: Self = StObject.set(x, "zIndexOffset", js.undefined)
  }
}
