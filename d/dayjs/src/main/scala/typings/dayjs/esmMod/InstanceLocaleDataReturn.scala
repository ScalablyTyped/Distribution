package typings.dayjs.esmMod

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
  
  def months(): typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
  def months(instance: typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.Dayjs): typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
  
  def monthsShort(): typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
  def monthsShort(instance: typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.Dayjs): typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
  
  def weekdays(): typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  def weekdays(instance: typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.Dayjs): typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  
  def weekdaysMin(): typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  def weekdaysMin(instance: typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.Dayjs): typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  
  def weekdaysShort(): typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  def weekdaysShort(instance: typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.Dayjs): typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
}
