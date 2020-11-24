package typings.dayjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalLocaleDataReturn extends js.Object {
  
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
  
  def months(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.MonthNames = js.native
  
  def monthsShort(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.MonthNames = js.native
  
  def weekdays(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = js.native
  
  def weekdaysMin(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = js.native
  
  def weekdaysShort(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = js.native
}
