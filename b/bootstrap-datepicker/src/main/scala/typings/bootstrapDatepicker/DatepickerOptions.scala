package typings.bootstrapDatepicker

import typings.bootstrapDatepicker.bootstrapDatepickerStrings.linked
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
    js.Function1[/* date */ js.Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.undefined
  
  var beforeShowDay: js.UndefOr[
    js.Function1[/* date */ js.Date, js.UndefOr[String | Boolean | DatepickerBeforeShowDayResponse]]
  ] = js.undefined
  
  var beforeShowDecade: js.UndefOr[
    js.Function1[/* date */ js.Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.undefined
  
  var beforeShowMonth: js.UndefOr[
    js.Function1[/* date */ js.Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.undefined
  
  var beforeShowYear: js.UndefOr[
    js.Function1[/* date */ js.Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.undefined
  
  var calendarWeeks: js.UndefOr[Boolean] = js.undefined
  
  var clearBtn: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var datesDisabled: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var daysOfWeekDisabled: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var daysOfWeekHighlighted: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var defaultViewDate: js.UndefOr[js.Date | String | DatepickerViewDate] = js.undefined
  
  var enableOnReadonly: js.UndefOr[Boolean] = js.undefined
  
  var endDate: js.UndefOr[js.Date | String] = js.undefined
  
  var forceParse: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[String | DatepickerCustomFormatOptions] = js.undefined
  
  var immediateUpdates: js.UndefOr[Boolean] = js.undefined
  
  var inputs: js.UndefOr[js.Array[Any]] = js.undefined
  
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
  
  var startDate: js.UndefOr[js.Date | String] = js.undefined
  
  var startView: js.UndefOr[DatepickerViewModes] = js.undefined
  
  var templates: js.UndefOr[Any] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var todayBtn: js.UndefOr[Boolean | linked] = js.undefined
  
  var todayHighlight: js.UndefOr[Boolean] = js.undefined
  
  var toggleActive: js.UndefOr[Boolean] = js.undefined
  
  var updateViewDate: js.UndefOr[Boolean] = js.undefined
  
  var weekStart: js.UndefOr[Double] = js.undefined
  
  var zIndexOffset: js.UndefOr[Double] = js.undefined
}
object DatepickerOptions {
  
  inline def apply(): DatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatepickerOptions] (val x: Self) extends AnyVal {
    
    inline def setAssumeNearbyYear(value: Boolean | Double): Self = StObject.set(x, "assumeNearbyYear", value.asInstanceOf[js.Any])
    
    inline def setAssumeNearbyYearUndefined: Self = StObject.set(x, "assumeNearbyYear", js.undefined)
    
    inline def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
    
    inline def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
    
    inline def setBeforeShowCentury(value: /* date */ js.Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = StObject.set(x, "beforeShowCentury", js.Any.fromFunction1(value))
    
    inline def setBeforeShowCenturyUndefined: Self = StObject.set(x, "beforeShowCentury", js.undefined)
    
    inline def setBeforeShowDay(value: /* date */ js.Date => js.UndefOr[String | Boolean | DatepickerBeforeShowDayResponse]): Self = StObject.set(x, "beforeShowDay", js.Any.fromFunction1(value))
    
    inline def setBeforeShowDayUndefined: Self = StObject.set(x, "beforeShowDay", js.undefined)
    
    inline def setBeforeShowDecade(value: /* date */ js.Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = StObject.set(x, "beforeShowDecade", js.Any.fromFunction1(value))
    
    inline def setBeforeShowDecadeUndefined: Self = StObject.set(x, "beforeShowDecade", js.undefined)
    
    inline def setBeforeShowMonth(value: /* date */ js.Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = StObject.set(x, "beforeShowMonth", js.Any.fromFunction1(value))
    
    inline def setBeforeShowMonthUndefined: Self = StObject.set(x, "beforeShowMonth", js.undefined)
    
    inline def setBeforeShowYear(value: /* date */ js.Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = StObject.set(x, "beforeShowYear", js.Any.fromFunction1(value))
    
    inline def setBeforeShowYearUndefined: Self = StObject.set(x, "beforeShowYear", js.undefined)
    
    inline def setCalendarWeeks(value: Boolean): Self = StObject.set(x, "calendarWeeks", value.asInstanceOf[js.Any])
    
    inline def setCalendarWeeksUndefined: Self = StObject.set(x, "calendarWeeks", js.undefined)
    
    inline def setClearBtn(value: Boolean): Self = StObject.set(x, "clearBtn", value.asInstanceOf[js.Any])
    
    inline def setClearBtnUndefined: Self = StObject.set(x, "clearBtn", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDatesDisabled(value: String | js.Array[String]): Self = StObject.set(x, "datesDisabled", value.asInstanceOf[js.Any])
    
    inline def setDatesDisabledUndefined: Self = StObject.set(x, "datesDisabled", js.undefined)
    
    inline def setDatesDisabledVarargs(value: String*): Self = StObject.set(x, "datesDisabled", js.Array(value*))
    
    inline def setDaysOfWeekDisabled(value: String | js.Array[Double]): Self = StObject.set(x, "daysOfWeekDisabled", value.asInstanceOf[js.Any])
    
    inline def setDaysOfWeekDisabledUndefined: Self = StObject.set(x, "daysOfWeekDisabled", js.undefined)
    
    inline def setDaysOfWeekDisabledVarargs(value: Double*): Self = StObject.set(x, "daysOfWeekDisabled", js.Array(value*))
    
    inline def setDaysOfWeekHighlighted(value: String | js.Array[Double]): Self = StObject.set(x, "daysOfWeekHighlighted", value.asInstanceOf[js.Any])
    
    inline def setDaysOfWeekHighlightedUndefined: Self = StObject.set(x, "daysOfWeekHighlighted", js.undefined)
    
    inline def setDaysOfWeekHighlightedVarargs(value: Double*): Self = StObject.set(x, "daysOfWeekHighlighted", js.Array(value*))
    
    inline def setDefaultViewDate(value: js.Date | String | DatepickerViewDate): Self = StObject.set(x, "defaultViewDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultViewDateUndefined: Self = StObject.set(x, "defaultViewDate", js.undefined)
    
    inline def setEnableOnReadonly(value: Boolean): Self = StObject.set(x, "enableOnReadonly", value.asInstanceOf[js.Any])
    
    inline def setEnableOnReadonlyUndefined: Self = StObject.set(x, "enableOnReadonly", js.undefined)
    
    inline def setEndDate(value: js.Date | String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setForceParse(value: Boolean): Self = StObject.set(x, "forceParse", value.asInstanceOf[js.Any])
    
    inline def setForceParseUndefined: Self = StObject.set(x, "forceParse", js.undefined)
    
    inline def setFormat(value: String | DatepickerCustomFormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setImmediateUpdates(value: Boolean): Self = StObject.set(x, "immediateUpdates", value.asInstanceOf[js.Any])
    
    inline def setImmediateUpdatesUndefined: Self = StObject.set(x, "immediateUpdates", js.undefined)
    
    inline def setInputs(value: js.Array[Any]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: Any*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setKeepEmptyValues(value: Boolean): Self = StObject.set(x, "keepEmptyValues", value.asInstanceOf[js.Any])
    
    inline def setKeepEmptyValuesUndefined: Self = StObject.set(x, "keepEmptyValues", js.undefined)
    
    inline def setKeyboardNavigation(value: Boolean): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
    
    inline def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMaxViewMode(value: DatepickerViewModes): Self = StObject.set(x, "maxViewMode", value.asInstanceOf[js.Any])
    
    inline def setMaxViewModeUndefined: Self = StObject.set(x, "maxViewMode", js.undefined)
    
    inline def setMinViewMode(value: DatepickerViewModes): Self = StObject.set(x, "minViewMode", value.asInstanceOf[js.Any])
    
    inline def setMinViewModeUndefined: Self = StObject.set(x, "minViewMode", js.undefined)
    
    inline def setMultidate(value: Boolean | Double): Self = StObject.set(x, "multidate", value.asInstanceOf[js.Any])
    
    inline def setMultidateSeparator(value: String): Self = StObject.set(x, "multidateSeparator", value.asInstanceOf[js.Any])
    
    inline def setMultidateSeparatorUndefined: Self = StObject.set(x, "multidateSeparator", js.undefined)
    
    inline def setMultidateUndefined: Self = StObject.set(x, "multidate", js.undefined)
    
    inline def setOrientation(value: DatepickerOrientations): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
    
    inline def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
    
    inline def setShowWeekDays(value: Boolean): Self = StObject.set(x, "showWeekDays", value.asInstanceOf[js.Any])
    
    inline def setShowWeekDaysUndefined: Self = StObject.set(x, "showWeekDays", js.undefined)
    
    inline def setStartDate(value: js.Date | String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStartView(value: DatepickerViewModes): Self = StObject.set(x, "startView", value.asInstanceOf[js.Any])
    
    inline def setStartViewUndefined: Self = StObject.set(x, "startView", js.undefined)
    
    inline def setTemplates(value: Any): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTodayBtn(value: Boolean | linked): Self = StObject.set(x, "todayBtn", value.asInstanceOf[js.Any])
    
    inline def setTodayBtnUndefined: Self = StObject.set(x, "todayBtn", js.undefined)
    
    inline def setTodayHighlight(value: Boolean): Self = StObject.set(x, "todayHighlight", value.asInstanceOf[js.Any])
    
    inline def setTodayHighlightUndefined: Self = StObject.set(x, "todayHighlight", js.undefined)
    
    inline def setToggleActive(value: Boolean): Self = StObject.set(x, "toggleActive", value.asInstanceOf[js.Any])
    
    inline def setToggleActiveUndefined: Self = StObject.set(x, "toggleActive", js.undefined)
    
    inline def setUpdateViewDate(value: Boolean): Self = StObject.set(x, "updateViewDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateViewDateUndefined: Self = StObject.set(x, "updateViewDate", js.undefined)
    
    inline def setWeekStart(value: Double): Self = StObject.set(x, "weekStart", value.asInstanceOf[js.Any])
    
    inline def setWeekStartUndefined: Self = StObject.set(x, "weekStart", js.undefined)
    
    inline def setZIndexOffset(value: Double): Self = StObject.set(x, "zIndexOffset", value.asInstanceOf[js.Any])
    
    inline def setZIndexOffsetUndefined: Self = StObject.set(x, "zIndexOffset", js.undefined)
  }
}
