package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.mod.ConfigType
import typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginIsoWeekMod extends Shortcut {
  
  @JSImport("dayjs/plugin/isoWeek", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  object ISOUnitType {
    
    inline def D: "D" = "D".asInstanceOf["D"]
    
    inline def M: "M" = "M".asInstanceOf["M"]
    
    inline def d: "d" = "d".asInstanceOf["d"]
    
    inline def date: "date" = "date".asInstanceOf["date"]
    
    inline def dates: "dates" = "dates".asInstanceOf["dates"]
    
    inline def day: "day" = "day".asInstanceOf["day"]
    
    inline def days: "days" = "days".asInstanceOf["days"]
    
    inline def h: "h" = "h".asInstanceOf["h"]
    
    inline def hour: "hour" = "hour".asInstanceOf["hour"]
    
    inline def hours: "hours" = "hours".asInstanceOf["hours"]
    
    inline def isoWeek: "isoWeek" = "isoWeek".asInstanceOf["isoWeek"]
    
    inline def m: "m" = "m".asInstanceOf["m"]
    
    inline def millisecond: "millisecond" = "millisecond".asInstanceOf["millisecond"]
    
    inline def milliseconds: "milliseconds" = "milliseconds".asInstanceOf["milliseconds"]
    
    inline def minute: "minute" = "minute".asInstanceOf["minute"]
    
    inline def minutes: "minutes" = "minutes".asInstanceOf["minutes"]
    
    inline def month: "month" = "month".asInstanceOf["month"]
    
    inline def months: "months" = "months".asInstanceOf["months"]
    
    inline def ms: "ms" = "ms".asInstanceOf["ms"]
    
    inline def s: "s" = "s".asInstanceOf["s"]
    
    inline def second: "second" = "second".asInstanceOf["second"]
    
    inline def seconds: "seconds" = "seconds".asInstanceOf["seconds"]
    
    inline def w: "w" = "w".asInstanceOf["w"]
    
    inline def week: "week" = "week".asInstanceOf["week"]
    
    inline def weeks: "weeks" = "weeks".asInstanceOf["weeks"]
    
    inline def y: "y" = "y".asInstanceOf["y"]
    
    inline def year: "year" = "year".asInstanceOf["year"]
    
    inline def years: "years" = "years".asInstanceOf["years"]
  }
  type ISOUnitType = "isoWeek" | "week" | "weeks" | "w" | "millisecond" | "second" | "minute" | "hour" | "day" | "month" | "year" | "date" | "milliseconds" | "seconds" | "minutes" | "hours" | "days" | "months" | "years" | "dates" | "d" | "D" | "M" | "y" | "h" | "m" | "s" | "ms"
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginIsoWeekMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def endOf(unit: ISOUnitType): Dayjs = js.native
      
      def isAfter(date: ConfigType): Boolean = js.native
      def isAfter(date: ConfigType, unit: ISOUnitType): Boolean = js.native
      
      def isBefore(date: ConfigType): Boolean = js.native
      def isBefore(date: ConfigType, unit: ISOUnitType): Boolean = js.native
      
      def isSame(date: ConfigType): Boolean = js.native
      def isSame(date: ConfigType, unit: ISOUnitType): Boolean = js.native
      
      def isoWeek(): Double = js.native
      def isoWeek(value: Double): Dayjs = js.native
      
      def isoWeekYear(): Double = js.native
      
      def isoWeekday(): Double = js.native
      def isoWeekday(value: Double): Dayjs = js.native
      
      def startOf(unit: ISOUnitType): Dayjs = js.native
    }
  }
}
