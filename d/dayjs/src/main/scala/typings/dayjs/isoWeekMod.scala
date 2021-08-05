package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.dayjsStrings.m_
import typings.dayjs.esmMod.ConfigType
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isoWeekMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isoWeek", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.dayjs.dayjsStrings.isoWeek
    - typings.dayjs.dayjsStrings.week
    - typings.dayjs.dayjsStrings.w
    - typings.dayjs.dayjsStrings.millisecond
    - typings.dayjs.dayjsStrings.second
    - typings.dayjs.dayjsStrings.minute
    - typings.dayjs.dayjsStrings.hour
    - typings.dayjs.dayjsStrings.day
    - typings.dayjs.dayjsStrings.month
    - typings.dayjs.dayjsStrings.year
    - typings.dayjs.dayjsStrings.date
    - typings.dayjs.dayjsStrings.d
    - typings.dayjs.dayjsStrings.M
    - typings.dayjs.dayjsStrings.y
    - typings.dayjs.dayjsStrings.h
    - typings.dayjs.dayjsStrings.m_
    - typings.dayjs.dayjsStrings.s
    - typings.dayjs.dayjsStrings.ms
  */
  trait ISOUnitType extends StObject
  object ISOUnitType {
    
    inline def M: typings.dayjs.dayjsStrings.M = "M".asInstanceOf[typings.dayjs.dayjsStrings.M]
    
    inline def d: typings.dayjs.dayjsStrings.d = "d".asInstanceOf[typings.dayjs.dayjsStrings.d]
    
    inline def date: typings.dayjs.dayjsStrings.date = "date".asInstanceOf[typings.dayjs.dayjsStrings.date]
    
    inline def day: typings.dayjs.dayjsStrings.day = "day".asInstanceOf[typings.dayjs.dayjsStrings.day]
    
    inline def h: typings.dayjs.dayjsStrings.h = "h".asInstanceOf[typings.dayjs.dayjsStrings.h]
    
    inline def hour: typings.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typings.dayjs.dayjsStrings.hour]
    
    inline def isoWeek: typings.dayjs.dayjsStrings.isoWeek = "isoWeek".asInstanceOf[typings.dayjs.dayjsStrings.isoWeek]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def millisecond: typings.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typings.dayjs.dayjsStrings.millisecond]
    
    inline def minute: typings.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typings.dayjs.dayjsStrings.minute]
    
    inline def month: typings.dayjs.dayjsStrings.month = "month".asInstanceOf[typings.dayjs.dayjsStrings.month]
    
    inline def ms: typings.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typings.dayjs.dayjsStrings.ms]
    
    inline def s: typings.dayjs.dayjsStrings.s = "s".asInstanceOf[typings.dayjs.dayjsStrings.s]
    
    inline def second: typings.dayjs.dayjsStrings.second = "second".asInstanceOf[typings.dayjs.dayjsStrings.second]
    
    inline def w: typings.dayjs.dayjsStrings.w = "w".asInstanceOf[typings.dayjs.dayjsStrings.w]
    
    inline def week: typings.dayjs.dayjsStrings.week = "week".asInstanceOf[typings.dayjs.dayjsStrings.week]
    
    inline def y: typings.dayjs.dayjsStrings.y = "y".asInstanceOf[typings.dayjs.dayjsStrings.y]
    
    inline def year: typings.dayjs.dayjsStrings.year = "year".asInstanceOf[typings.dayjs.dayjsStrings.year]
  }
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `isoWeekMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
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
