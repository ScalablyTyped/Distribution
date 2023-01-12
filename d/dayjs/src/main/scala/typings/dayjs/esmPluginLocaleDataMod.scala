package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginLocaleDataMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/localeData", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginLocaleDataMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def localeData(): InstanceLocaleDataReturn
    }
    object Dayjs {
      
      inline def apply(localeData: () => InstanceLocaleDataReturn): Dayjs = {
        val __obj = js.Dynamic.literal(localeData = js.Any.fromFunction0(localeData))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        inline def setLocaleData(value: () => InstanceLocaleDataReturn): Self = StObject.set(x, "localeData", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait GlobalLocaleDataReturn extends StObject {
      
      def firstDayOfWeek(): Double = js.native
      
      def longDateFormat(format: String): String = js.native
      
      def meridiem(): String = js.native
      def meridiem(hour: Double): String = js.native
      def meridiem(hour: Double, minute: Double): String = js.native
      def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
      def meridiem(hour: Double, minute: Unit, isLower: Boolean): String = js.native
      def meridiem(hour: Unit, minute: Double): String = js.native
      def meridiem(hour: Unit, minute: Double, isLower: Boolean): String = js.native
      def meridiem(hour: Unit, minute: Unit, isLower: Boolean): String = js.native
      
      def months(): MonthNames = js.native
      
      def monthsShort(): MonthNames = js.native
      
      def ordinal(n: Double): String = js.native
      
      def weekdays(): WeekdayNames = js.native
      
      def weekdaysMin(): WeekdayNames = js.native
      
      def weekdaysShort(): WeekdayNames = js.native
    }
    
    @js.native
    trait InstanceLocaleDataReturn extends StObject {
      
      def firstDayOfWeek(): Double = js.native
      
      def longDateFormat(format: String): String = js.native
      
      def meridiem(): String = js.native
      def meridiem(hour: Double): String = js.native
      def meridiem(hour: Double, minute: Double): String = js.native
      def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
      def meridiem(hour: Double, minute: Unit, isLower: Boolean): String = js.native
      def meridiem(hour: Unit, minute: Double): String = js.native
      def meridiem(hour: Unit, minute: Double, isLower: Boolean): String = js.native
      def meridiem(hour: Unit, minute: Unit, isLower: Boolean): String = js.native
      
      def months(): MonthNames = js.native
      def months(instance: Dayjs): MonthNames = js.native
      
      def monthsShort(): MonthNames = js.native
      def monthsShort(instance: Dayjs): MonthNames = js.native
      
      def ordinal(n: Double): String = js.native
      
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
