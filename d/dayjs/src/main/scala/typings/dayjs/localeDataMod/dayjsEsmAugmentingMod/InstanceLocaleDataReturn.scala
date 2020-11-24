package typings.dayjs.localeDataMod.dayjsEsmAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceLocaleDataReturn extends js.Object {
  
  def firstDayOfWeek(): Double = js.native
  
  def longDateFormat(format: String): String = js.native
  
  def meridiem(): String = js.native
  def meridiem(hour: js.UndefOr[scala.Nothing], minute: js.UndefOr[scala.Nothing], isLower: Boolean): String = js.native
  def meridiem(hour: js.UndefOr[scala.Nothing], minute: Double): String = js.native
  def meridiem(hour: js.UndefOr[scala.Nothing], minute: Double, isLower: Boolean): String = js.native
  def meridiem(hour: Double): String = js.native
  def meridiem(hour: Double, minute: js.UndefOr[scala.Nothing], isLower: Boolean): String = js.native
  def meridiem(hour: Double, minute: Double): String = js.native
  def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
  
  def months(): MonthNames = js.native
  def months(instance: Dayjs): MonthNames = js.native
  
  def monthsShort(): MonthNames = js.native
  def monthsShort(instance: Dayjs): MonthNames = js.native
  
  def weekdays(): WeekdayNames = js.native
  def weekdays(instance: Dayjs): WeekdayNames = js.native
  
  def weekdaysMin(): WeekdayNames = js.native
  def weekdaysMin(instance: Dayjs): WeekdayNames = js.native
  
  def weekdaysShort(): WeekdayNames = js.native
  def weekdaysShort(instance: Dayjs): WeekdayNames = js.native
}
