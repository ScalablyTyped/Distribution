package typings.cronParser

import typings.cronParser.commonMod.ICronExpression
import typings.cronParser.commonMod.IStringResult
import typings.cronParser.commonMod.ParserOptions
import typings.cronParser.cronParserInts.`0`
import typings.cronParser.cronParserInts.`13`
import typings.cronParser.cronParserInts.`1`
import typings.cronParser.cronParserInts.`24`
import typings.cronParser.cronParserInts.`32`
import typings.cronParser.cronParserInts.`8`
import typings.cronParser.cronParserStrings.L
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("cron-parser/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fieldsToExpression[IsIterable /* <: Boolean */](fields: CronFields): CronExpression[IsIterable] = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldsToExpression")(fields.asInstanceOf[js.Any]).asInstanceOf[CronExpression[IsIterable]]
  inline def fieldsToExpression[IsIterable /* <: Boolean */](fields: CronFields, options: ParserOptions[IsIterable]): CronExpression[IsIterable] = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldsToExpression")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CronExpression[IsIterable]]
  
  inline def parseExpression[IsIterable /* <: Boolean */](expression: String): CronExpression[IsIterable] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[CronExpression[IsIterable]]
  inline def parseExpression[IsIterable /* <: Boolean */](expression: String, options: ParserOptions[IsIterable]): CronExpression[IsIterable] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(expression.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CronExpression[IsIterable]]
  
  inline def parseFile(filePath: String, callback: js.Function2[/* err */ Any, /* data */ StringResult, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(filePath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseString(data: String): StringResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(data.asInstanceOf[js.Any]).asInstanceOf[StringResult]
  
  type BuildRange[Current /* <: Double */, End /* <: Double */, Accu /* <: Array[Double] */] = Current
  
  type BuildRangeTuple[Current /* <: Array[Double] */, Count /* <: Double */] = Current
  
  type CronExpression[IsIterable /* <: Boolean */] = ICronExpression[CronFields, IsIterable]
  
  trait CronFields extends StObject {
    
    val dayOfMonth: js.Array[DayOfTheMonthRange]
    
    val dayOfWeek: js.Array[DayOfTheWeekRange]
    
    val hour: js.Array[HourRange]
    
    val minute: js.Array[SixtyRange]
    
    val month: js.Array[MonthRange]
    
    val second: js.Array[SixtyRange]
  }
  object CronFields {
    
    inline def apply(
      dayOfMonth: js.Array[DayOfTheMonthRange],
      dayOfWeek: js.Array[DayOfTheWeekRange],
      hour: js.Array[HourRange],
      minute: js.Array[SixtyRange],
      month: js.Array[MonthRange],
      second: js.Array[SixtyRange]
    ): CronFields = {
      val __obj = js.Dynamic.literal(dayOfMonth = dayOfMonth.asInstanceOf[js.Any], dayOfWeek = dayOfWeek.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
      __obj.asInstanceOf[CronFields]
    }
    
    extension [Self <: CronFields](x: Self) {
      
      inline def setDayOfMonth(value: js.Array[DayOfTheMonthRange]): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
      
      inline def setDayOfMonthVarargs(value: DayOfTheMonthRange*): Self = StObject.set(x, "dayOfMonth", js.Array(value*))
      
      inline def setDayOfWeek(value: js.Array[DayOfTheWeekRange]): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDayOfWeekVarargs(value: DayOfTheWeekRange*): Self = StObject.set(x, "dayOfWeek", js.Array(value*))
      
      inline def setHour(value: js.Array[HourRange]): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHourVarargs(value: HourRange*): Self = StObject.set(x, "hour", js.Array(value*))
      
      inline def setMinute(value: js.Array[SixtyRange]): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteVarargs(value: SixtyRange*): Self = StObject.set(x, "minute", js.Array(value*))
      
      inline def setMonth(value: js.Array[MonthRange]): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthVarargs(value: MonthRange*): Self = StObject.set(x, "month", js.Array(value*))
      
      inline def setSecond(value: js.Array[SixtyRange]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondVarargs(value: SixtyRange*): Self = StObject.set(x, "second", js.Array(value*))
    }
  }
  
  type DayOfTheMonthRange = (Range[`1`, `32`]) | L
  
  type DayOfTheWeekRange = Range[`0`, `8`]
  
  type HourRange = Range[`0`, `24`]
  
  type MonthRange = Range[`1`, `13`]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped cron-parser.cron-parser/types.RangeTuple<StartInclusive>['length'] extends EndExclusive ? StartInclusive : any */ trait Range[StartInclusive /* <: Double */, EndExclusive /* <: Double */] extends StObject
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped []['length'] extends Count ? [] : any */ trait RangeTuple[Count /* <: Double */] extends StObject
  
  type SixtyRange = Any
  
  type StringResult = IStringResult[CronFields]
}
