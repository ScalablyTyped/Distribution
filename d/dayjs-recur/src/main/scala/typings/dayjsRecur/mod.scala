package typings.dayjsRecur

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.mod.Dayjs
import typings.dayjs.mod.PluginFunc
import typings.dayjsRecur.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("dayjs-recur", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @JSImport("dayjs", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def recur(options: js.UndefOr[End]): Recurrence = ^.asInstanceOf[js.Dynamic].applyDynamic("recur")(options.asInstanceOf[js.Any]).asInstanceOf[Recurrence]
    inline def recur(start: js.UndefOr[String | Dayjs], end: js.UndefOr[String | Dayjs]): Recurrence = (^.asInstanceOf[js.Dynamic].applyDynamic("recur")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Recurrence]
    
    @js.native
    trait Dayjs extends StObject {
      
      def recur(): Recurrence = js.native
      def recur(options: End): Recurrence = js.native
      def recur(start: String): Recurrence = js.native
      def recur(start: String, end: String): Recurrence = js.native
      def recur(start: String, end: Dayjs): Recurrence = js.native
      def recur(start: Unit, end: String): Recurrence = js.native
      def recur(start: Unit, end: Dayjs): Recurrence = js.native
      def recur(start: Dayjs): Recurrence = js.native
      def recur(start: Dayjs, end: String): Recurrence = js.native
      def recur(start: Dayjs, end: Dayjs): Recurrence = js.native
    }
  }
  
  @js.native
  trait Recurrence extends StObject {
    
    def all(): js.Array[Dayjs] = js.native
    
    def day(): Recurrence = js.native
    def day(unit: String): Recurrence = js.native
    
    def dayOfMonth(): Recurrence = js.native
    def dayOfMonth(unit: String): Recurrence = js.native
    
    def dayOfWeek(): Recurrence = js.native
    def dayOfWeek(unit: String): Recurrence = js.native
    
    def days(): Recurrence = js.native
    def days(unit: String): Recurrence = js.native
    
    def daysOfMonth(): Recurrence = js.native
    def daysOfMonth(unit: String): Recurrence = js.native
    
    def daysOfWeek(): Recurrence = js.native
    def daysOfWeek(unit: String): Recurrence = js.native
    
    def every(unit: String): Recurrence = js.native
    def every(unit: String, measurementType: String): Recurrence = js.native
    def every(unit: js.Array[Double | String]): Recurrence = js.native
    def every(unit: js.Array[Double | String], measurementType: String): Recurrence = js.native
    def every(unit: Double): Recurrence = js.native
    def every(unit: Double, measurementType: String): Recurrence = js.native
    
    def except(date: String): Recurrence = js.native
    
    def forget(date: String): Recurrence = js.native
    
    def fromDate(date: String): Recurrence = js.native
    def fromDate(date: Dayjs): Recurrence = js.native
    
    def matches(date: String): Boolean = js.native
    def matches(date: String, outbound: Boolean): Boolean = js.native
    
    def month(): Recurrence = js.native
    def month(unit: String): Recurrence = js.native
    
    def monthOfYear(): Recurrence = js.native
    def monthOfYear(unit: String): Recurrence = js.native
    
    def months(): Recurrence = js.native
    def months(unit: String): Recurrence = js.native
    
    def monthsOfYear(): Recurrence = js.native
    def monthsOfYear(unit: String): Recurrence = js.native
    
    def next(): Dayjs = js.native
    def next(count: Double): js.Array[Dayjs] = js.native
    
    def previous(): Dayjs = js.native
    def previous(count: Double): js.Array[Dayjs] = js.native
    
    def week(): Recurrence = js.native
    def week(unit: String): Recurrence = js.native
    
    def weekOfMonth(): Recurrence = js.native
    def weekOfMonth(unit: String): Recurrence = js.native
    
    def weekOfYear(): Recurrence = js.native
    def weekOfYear(unit: String): Recurrence = js.native
    
    def weeks(): Recurrence = js.native
    def weeks(unit: String): Recurrence = js.native
    
    def weeksOfMonth(): Recurrence = js.native
    def weeksOfMonth(unit: String): Recurrence = js.native
    
    def weeksOfYear(): Recurrence = js.native
    def weeksOfYear(unit: String): Recurrence = js.native
    
    def year(): Recurrence = js.native
    def year(unit: String): Recurrence = js.native
    
    def years(): Recurrence = js.native
    def years(unit: String): Recurrence = js.native
  }
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginFunc[Any] = ^
}
