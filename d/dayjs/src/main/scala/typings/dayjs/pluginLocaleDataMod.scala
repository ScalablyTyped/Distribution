package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginLocaleDataMod extends Shortcut {
  
  @JSImport("dayjs/plugin/localeData", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginLocaleDataMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def localeData(): InstanceLocaleDataReturn = js.native
    }
    object Dayjs {
      
      @scala.inline
      def apply(localeData: () => InstanceLocaleDataReturn): Dayjs = {
        val __obj = js.Dynamic.literal(localeData = js.Any.fromFunction0(localeData))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit class DayjsMutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLocaleData(value: () => InstanceLocaleDataReturn): Self = StObject.set(x, "localeData", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait GlobalLocaleDataReturn extends StObject {
      
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
      
      def monthsShort(): MonthNames = js.native
      
      def weekdays(): WeekdayNames = js.native
      
      def weekdaysMin(): WeekdayNames = js.native
      
      def weekdaysShort(): WeekdayNames = js.native
    }
    
    @js.native
    trait InstanceLocaleDataReturn extends StObject {
      
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
    
    type MonthNames = js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
    
    type WeekdayNames = js.Tuple7[String, String, String, String, String, String, String]
  }
}
