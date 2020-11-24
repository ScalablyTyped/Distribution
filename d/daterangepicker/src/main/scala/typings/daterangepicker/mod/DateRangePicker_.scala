package typings.daterangepicker.mod

import org.scalablytyped.runtime.StringDictionary
import typings.daterangepicker.anon.RequiredLocale
import typings.daterangepicker.daterangepickerBooleans.`false`
import typings.daterangepicker.daterangepickerStrings.center
import typings.daterangepicker.daterangepickerStrings.down
import typings.daterangepicker.daterangepickerStrings.left
import typings.daterangepicker.daterangepickerStrings.right
import typings.daterangepicker.daterangepickerStrings.up
import typings.daterangepicker.mod.global.JQuery
import typings.moment.mod.DurationInputArg1
import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangePicker_ extends js.Object {
  
  var alwaysShowCalendars: Boolean = js.native
  
  var applyButtonClasses: String = js.native
  
  var autoApply: Boolean = js.native
  
  var autoUpdateInput: Boolean = js.native
  
  var buttonClasses: js.Array[String] = js.native
  
  var cancelButtonClasses: String = js.native
  
  var chosenLabel: js.UndefOr[String] = js.native
  
  var container: JQuery = js.native
  
  var drops: down | up = js.native
  
  var element: JQuery = js.native
  
  var endDate: Moment = js.native
  
  def isCustomDate(date: DateOrString): js.UndefOr[String | js.Array[String] | `false`] = js.native
  
  def isInvalidDate(startDate: DateOrString): Boolean = js.native
  def isInvalidDate(startDate: DateOrString, endDate: DateOrString): Boolean = js.native
  
  var isShowing: Boolean = js.native
  
  var leftCalendar: Calendar = js.native
  
  var linkedCalendars: Boolean = js.native
  
  var locale: RequiredLocale = js.native
  
  var maxDate: Moment = js.native
  
  var maxSpan: DurationInputArg1 | Boolean = js.native
  
  var maxYear: Double = js.native
  
  var minDate: Moment = js.native
  
  var minYear: Double = js.native
  
  var oldEndDate: Moment = js.native
  
  var oldStartDate: Moment = js.native
  
  var opens: left | right | center = js.native
  
  var parentEl: JQuery = js.native
  
  var previousRightTime: Moment = js.native
  
  var ranges: StringDictionary[js.Tuple2[DateOrString, DateOrString]] = js.native
  
  var rightCalendar: Calendar = js.native
  
  var showCustomRangeLabel: Boolean = js.native
  
  var showDropdowns: Boolean = js.native
  
  var showISOWeekNumbers: Boolean = js.native
  
  var showWeekNumbers: Boolean = js.native
  
  var singleDatePicker: Boolean = js.native
  
  var startDate: Moment = js.native
  
  var timePicker: Boolean = js.native
  
  var timePicker24Hour: Boolean = js.native
  
  var timePickerIncrement: Double = js.native
  
  var timePickerSeconds: Boolean = js.native
}
