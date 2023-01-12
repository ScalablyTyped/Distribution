package typings.chayns

import typings.chayns.chayns.dialog.dateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedDateDialogConfig extends StObject {
  
  /**
    * The buttons the user could interact with
    */
  var buttons: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * The type of the dateDialog
    */
  var dateType: js.UndefOr[typings.chayns.chayns.dialog.dateType] = js.undefined
  
  /**
    * This array defines dates which the user could not select
    */
  var disabledDates: js.UndefOr[js.Array[js.Date | Double]] = js.undefined
  
  /**
    * Allows to disable intervals
    */
  var disabledIntervals: js.UndefOr[js.Array[IntervalObject]] = js.undefined
  
  /**
    * Allows to disable intervals for every weekday, e.g. tuesdays, 7:00-9:30
    */
  var disabledWeeDayIntervals: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * The dialog will return the timestamp in the local timezone with the date from preSelect
    */
  var getLocalTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows to select an interval. Can't be used with multiselect
    */
  var interval: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The biggest possible value which the user could select
    */
  var maxDate: js.UndefOr[js.Date | Double] = js.undefined
  
  /**
    * The max-interval the user has to select in minutes
    */
  var maxInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * The description below the headline
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The smallest possible value which the user could select
    */
  var minDate: js.UndefOr[js.Date | Double] = js.undefined
  
  /**
    * The min-interval the user has to select in minutes
    */
  var minInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * The user can only dial e.g. every 10th minute instead of every minute.
    */
  var minuteInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Allows to select a month with an extra menu
    */
  var monthSelect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user could select different dates.
    * Multiple Times are not supported
    */
  var multiselect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date(s) which should be preselected
    */
  var preSelect: js.UndefOr[js.Date | (js.Array[js.Date | Double]) | Double] = js.undefined
  
  /**
    * This Blocks could be used in DATE_TIME Dialog to be displayed between the calendar and the time select
    */
  var textBlocks: js.UndefOr[js.Array[TextBlock]] = js.undefined
  
  /**
    * The headline of the dialog
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Allows to select a year with an extra menu
    */
  var yearSelect: js.UndefOr[Boolean] = js.undefined
}
object AdvancedDateDialogConfig {
  
  inline def apply(): AdvancedDateDialogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedDateDialogConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedDateDialogConfig] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: js.Array[Any]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: Any*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDateType(value: dateType): Self = StObject.set(x, "dateType", value.asInstanceOf[js.Any])
    
    inline def setDateTypeUndefined: Self = StObject.set(x, "dateType", js.undefined)
    
    inline def setDisabledDates(value: js.Array[js.Date | Double]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
    
    inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
    
    inline def setDisabledDatesVarargs(value: (js.Date | Double)*): Self = StObject.set(x, "disabledDates", js.Array(value*))
    
    inline def setDisabledIntervals(value: js.Array[IntervalObject]): Self = StObject.set(x, "disabledIntervals", value.asInstanceOf[js.Any])
    
    inline def setDisabledIntervalsUndefined: Self = StObject.set(x, "disabledIntervals", js.undefined)
    
    inline def setDisabledIntervalsVarargs(value: IntervalObject*): Self = StObject.set(x, "disabledIntervals", js.Array(value*))
    
    inline def setDisabledWeeDayIntervals(value: js.Array[Any]): Self = StObject.set(x, "disabledWeeDayIntervals", value.asInstanceOf[js.Any])
    
    inline def setDisabledWeeDayIntervalsUndefined: Self = StObject.set(x, "disabledWeeDayIntervals", js.undefined)
    
    inline def setDisabledWeeDayIntervalsVarargs(value: Any*): Self = StObject.set(x, "disabledWeeDayIntervals", js.Array(value*))
    
    inline def setGetLocalTime(value: Boolean): Self = StObject.set(x, "getLocalTime", value.asInstanceOf[js.Any])
    
    inline def setGetLocalTimeUndefined: Self = StObject.set(x, "getLocalTime", js.undefined)
    
    inline def setInterval(value: Boolean): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setMaxDate(value: js.Date | Double): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMaxInterval(value: Double): Self = StObject.set(x, "maxInterval", value.asInstanceOf[js.Any])
    
    inline def setMaxIntervalUndefined: Self = StObject.set(x, "maxInterval", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMinDate(value: js.Date | Double): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setMinInterval(value: Double): Self = StObject.set(x, "minInterval", value.asInstanceOf[js.Any])
    
    inline def setMinIntervalUndefined: Self = StObject.set(x, "minInterval", js.undefined)
    
    inline def setMinuteInterval(value: Double): Self = StObject.set(x, "minuteInterval", value.asInstanceOf[js.Any])
    
    inline def setMinuteIntervalUndefined: Self = StObject.set(x, "minuteInterval", js.undefined)
    
    inline def setMonthSelect(value: Boolean): Self = StObject.set(x, "monthSelect", value.asInstanceOf[js.Any])
    
    inline def setMonthSelectUndefined: Self = StObject.set(x, "monthSelect", js.undefined)
    
    inline def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    inline def setPreSelect(value: js.Date | (js.Array[js.Date | Double]) | Double): Self = StObject.set(x, "preSelect", value.asInstanceOf[js.Any])
    
    inline def setPreSelectUndefined: Self = StObject.set(x, "preSelect", js.undefined)
    
    inline def setPreSelectVarargs(value: (js.Date | Double)*): Self = StObject.set(x, "preSelect", js.Array(value*))
    
    inline def setTextBlocks(value: js.Array[TextBlock]): Self = StObject.set(x, "textBlocks", value.asInstanceOf[js.Any])
    
    inline def setTextBlocksUndefined: Self = StObject.set(x, "textBlocks", js.undefined)
    
    inline def setTextBlocksVarargs(value: TextBlock*): Self = StObject.set(x, "textBlocks", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setYearSelect(value: Boolean): Self = StObject.set(x, "yearSelect", value.asInstanceOf[js.Any])
    
    inline def setYearSelectUndefined: Self = StObject.set(x, "yearSelect", js.undefined)
  }
}
