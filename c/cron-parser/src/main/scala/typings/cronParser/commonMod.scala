package typings.cronParser

import typings.cronParser.cronParserBooleans.`false`
import typings.std.IteratorResult
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  trait CronDate extends StObject {
    
    def addDay(): Unit
    
    def addHour(): Unit
    
    def addMinute(): Unit
    
    def addMonth(): Unit
    
    def addSecond(): Unit
    
    def addYear(): Unit
    
    def getDate(): Double
    
    def getDay(): Double
    
    def getFullYear(): Double
    
    def getHours(): Double
    
    def getMilliseconds(): Double
    
    def getMinutes(): Double
    
    def getMonth(): Double
    
    def getSeconds(): Double
    
    def getTime(): Double
    
    def getUTCDate(): Double
    
    def getUTCDay(): Double
    
    def getUTCFullYear(): Double
    
    def getUTCHours(): Double
    
    def getUTCMinutes(): Double
    
    def getUTCMonth(): Double
    
    def getUTCSeconds(): Double
    
    def isLastDayOfMonth(): Boolean
    
    def setDate(d: Double): Unit
    
    def setDay(d: Double): Unit
    
    def setFullYear(y: Double): Unit
    
    def setHours(h: Double): Unit
    
    def setMilliseconds(s: Double): Unit
    
    def setMinutes(m: Double): Unit
    
    def setMonth(m: Double): Unit
    
    def setSeconds(s: Double): Unit
    
    def subtractDay(): Unit
    
    def subtractHour(): Unit
    
    def subtractMinute(): Unit
    
    def subtractMonth(): Unit
    
    def subtractSecond(): Unit
    
    def subtractYear(): Unit
    
    def toDate(): js.Date
    
    def toISOString(): String
    
    def toJSON(): String
  }
  object CronDate {
    
    inline def apply(
      addDay: () => Unit,
      addHour: () => Unit,
      addMinute: () => Unit,
      addMonth: () => Unit,
      addSecond: () => Unit,
      addYear: () => Unit,
      getDate: () => Double,
      getDay: () => Double,
      getFullYear: () => Double,
      getHours: () => Double,
      getMilliseconds: () => Double,
      getMinutes: () => Double,
      getMonth: () => Double,
      getSeconds: () => Double,
      getTime: () => Double,
      getUTCDate: () => Double,
      getUTCDay: () => Double,
      getUTCFullYear: () => Double,
      getUTCHours: () => Double,
      getUTCMinutes: () => Double,
      getUTCMonth: () => Double,
      getUTCSeconds: () => Double,
      isLastDayOfMonth: () => Boolean,
      setDate: Double => Unit,
      setDay: Double => Unit,
      setFullYear: Double => Unit,
      setHours: Double => Unit,
      setMilliseconds: Double => Unit,
      setMinutes: Double => Unit,
      setMonth: Double => Unit,
      setSeconds: Double => Unit,
      subtractDay: () => Unit,
      subtractHour: () => Unit,
      subtractMinute: () => Unit,
      subtractMonth: () => Unit,
      subtractSecond: () => Unit,
      subtractYear: () => Unit,
      toDate: () => js.Date,
      toISOString: () => String,
      toJSON: () => String
    ): CronDate = {
      val __obj = js.Dynamic.literal(addDay = js.Any.fromFunction0(addDay), addHour = js.Any.fromFunction0(addHour), addMinute = js.Any.fromFunction0(addMinute), addMonth = js.Any.fromFunction0(addMonth), addSecond = js.Any.fromFunction0(addSecond), addYear = js.Any.fromFunction0(addYear), getDate = js.Any.fromFunction0(getDate), getDay = js.Any.fromFunction0(getDay), getFullYear = js.Any.fromFunction0(getFullYear), getHours = js.Any.fromFunction0(getHours), getMilliseconds = js.Any.fromFunction0(getMilliseconds), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getUTCDate = js.Any.fromFunction0(getUTCDate), getUTCDay = js.Any.fromFunction0(getUTCDay), getUTCFullYear = js.Any.fromFunction0(getUTCFullYear), getUTCHours = js.Any.fromFunction0(getUTCHours), getUTCMinutes = js.Any.fromFunction0(getUTCMinutes), getUTCMonth = js.Any.fromFunction0(getUTCMonth), getUTCSeconds = js.Any.fromFunction0(getUTCSeconds), isLastDayOfMonth = js.Any.fromFunction0(isLastDayOfMonth), setDate = js.Any.fromFunction1(setDate), setDay = js.Any.fromFunction1(setDay), setFullYear = js.Any.fromFunction1(setFullYear), setHours = js.Any.fromFunction1(setHours), setMilliseconds = js.Any.fromFunction1(setMilliseconds), setMinutes = js.Any.fromFunction1(setMinutes), setMonth = js.Any.fromFunction1(setMonth), setSeconds = js.Any.fromFunction1(setSeconds), subtractDay = js.Any.fromFunction0(subtractDay), subtractHour = js.Any.fromFunction0(subtractHour), subtractMinute = js.Any.fromFunction0(subtractMinute), subtractMonth = js.Any.fromFunction0(subtractMonth), subtractSecond = js.Any.fromFunction0(subtractSecond), subtractYear = js.Any.fromFunction0(subtractYear), toDate = js.Any.fromFunction0(toDate), toISOString = js.Any.fromFunction0(toISOString), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[CronDate]
    }
    
    extension [Self <: CronDate](x: Self) {
      
      inline def setAddDay(value: () => Unit): Self = StObject.set(x, "addDay", js.Any.fromFunction0(value))
      
      inline def setAddHour(value: () => Unit): Self = StObject.set(x, "addHour", js.Any.fromFunction0(value))
      
      inline def setAddMinute(value: () => Unit): Self = StObject.set(x, "addMinute", js.Any.fromFunction0(value))
      
      inline def setAddMonth(value: () => Unit): Self = StObject.set(x, "addMonth", js.Any.fromFunction0(value))
      
      inline def setAddSecond(value: () => Unit): Self = StObject.set(x, "addSecond", js.Any.fromFunction0(value))
      
      inline def setAddYear(value: () => Unit): Self = StObject.set(x, "addYear", js.Any.fromFunction0(value))
      
      inline def setGetDate(value: () => Double): Self = StObject.set(x, "getDate", js.Any.fromFunction0(value))
      
      inline def setGetDay(value: () => Double): Self = StObject.set(x, "getDay", js.Any.fromFunction0(value))
      
      inline def setGetFullYear(value: () => Double): Self = StObject.set(x, "getFullYear", js.Any.fromFunction0(value))
      
      inline def setGetHours(value: () => Double): Self = StObject.set(x, "getHours", js.Any.fromFunction0(value))
      
      inline def setGetMilliseconds(value: () => Double): Self = StObject.set(x, "getMilliseconds", js.Any.fromFunction0(value))
      
      inline def setGetMinutes(value: () => Double): Self = StObject.set(x, "getMinutes", js.Any.fromFunction0(value))
      
      inline def setGetMonth(value: () => Double): Self = StObject.set(x, "getMonth", js.Any.fromFunction0(value))
      
      inline def setGetSeconds(value: () => Double): Self = StObject.set(x, "getSeconds", js.Any.fromFunction0(value))
      
      inline def setGetTime(value: () => Double): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
      
      inline def setGetUTCDate(value: () => Double): Self = StObject.set(x, "getUTCDate", js.Any.fromFunction0(value))
      
      inline def setGetUTCDay(value: () => Double): Self = StObject.set(x, "getUTCDay", js.Any.fromFunction0(value))
      
      inline def setGetUTCFullYear(value: () => Double): Self = StObject.set(x, "getUTCFullYear", js.Any.fromFunction0(value))
      
      inline def setGetUTCHours(value: () => Double): Self = StObject.set(x, "getUTCHours", js.Any.fromFunction0(value))
      
      inline def setGetUTCMinutes(value: () => Double): Self = StObject.set(x, "getUTCMinutes", js.Any.fromFunction0(value))
      
      inline def setGetUTCMonth(value: () => Double): Self = StObject.set(x, "getUTCMonth", js.Any.fromFunction0(value))
      
      inline def setGetUTCSeconds(value: () => Double): Self = StObject.set(x, "getUTCSeconds", js.Any.fromFunction0(value))
      
      inline def setIsLastDayOfMonth(value: () => Boolean): Self = StObject.set(x, "isLastDayOfMonth", js.Any.fromFunction0(value))
      
      inline def setSetDate(value: Double => Unit): Self = StObject.set(x, "setDate", js.Any.fromFunction1(value))
      
      inline def setSetDay(value: Double => Unit): Self = StObject.set(x, "setDay", js.Any.fromFunction1(value))
      
      inline def setSetFullYear(value: Double => Unit): Self = StObject.set(x, "setFullYear", js.Any.fromFunction1(value))
      
      inline def setSetHours(value: Double => Unit): Self = StObject.set(x, "setHours", js.Any.fromFunction1(value))
      
      inline def setSetMilliseconds(value: Double => Unit): Self = StObject.set(x, "setMilliseconds", js.Any.fromFunction1(value))
      
      inline def setSetMinutes(value: Double => Unit): Self = StObject.set(x, "setMinutes", js.Any.fromFunction1(value))
      
      inline def setSetMonth(value: Double => Unit): Self = StObject.set(x, "setMonth", js.Any.fromFunction1(value))
      
      inline def setSetSeconds(value: Double => Unit): Self = StObject.set(x, "setSeconds", js.Any.fromFunction1(value))
      
      inline def setSubtractDay(value: () => Unit): Self = StObject.set(x, "subtractDay", js.Any.fromFunction0(value))
      
      inline def setSubtractHour(value: () => Unit): Self = StObject.set(x, "subtractHour", js.Any.fromFunction0(value))
      
      inline def setSubtractMinute(value: () => Unit): Self = StObject.set(x, "subtractMinute", js.Any.fromFunction0(value))
      
      inline def setSubtractMonth(value: () => Unit): Self = StObject.set(x, "subtractMonth", js.Any.fromFunction0(value))
      
      inline def setSubtractSecond(value: () => Unit): Self = StObject.set(x, "subtractSecond", js.Any.fromFunction0(value))
      
      inline def setSubtractYear(value: () => Unit): Self = StObject.set(x, "subtractYear", js.Any.fromFunction0(value))
      
      inline def setToDate(value: () => js.Date): Self = StObject.set(x, "toDate", js.Any.fromFunction0(value))
      
      inline def setToISOString(value: () => String): Self = StObject.set(x, "toISOString", js.Any.fromFunction0(value))
      
      inline def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  type DateType = js.Date | Double | String
  
  @js.native
  trait ICronExpression[CronFields, IsIterable /* <: Boolean */] extends StObject {
    
    val fields: CronFields = js.native
    
    /** Check if next suitable date exists */
    def hasNext(): Boolean = js.native
    
    /** Check if previous suitable date exists */
    def hasPrev(): Boolean = js.native
    
    /** Iterate over expression iterator */
    def iterate(steps: Double): js.Array[IteratorResultOrCronDate[IsIterable]] = js.native
    def iterate(
      steps: Double,
      callback: js.Function2[/* item */ IteratorResultOrCronDate[IsIterable], /* i */ Double, Unit]
    ): js.Array[IteratorResultOrCronDate[IsIterable]] = js.native
    
    /** Find next suitable date */
    def next(): IteratorResultOrCronDate[IsIterable] = js.native
    
    /** Find previous suitable date */
    def prev(): IteratorResultOrCronDate[IsIterable] = js.native
    
    /** Reset expression iterator state */
    def reset(): Unit = js.native
    def reset(resetDate: String): Unit = js.native
    def reset(resetDate: js.Date): Unit = js.native
    def reset(resetDate: Double): Unit = js.native
    
    def stringify(): String = js.native
    def stringify(includeSeconds: Boolean): String = js.native
  }
  
  trait IStringResult[CronFields] extends StObject {
    
    var errors: Record[String, Any]
    
    var expressions: js.Array[ICronExpression[CronFields, `false`]]
    
    var variables: Record[String, String]
  }
  object IStringResult {
    
    inline def apply[CronFields](
      errors: Record[String, Any],
      expressions: js.Array[ICronExpression[CronFields, `false`]],
      variables: Record[String, String]
    ): IStringResult[CronFields] = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStringResult[CronFields]]
    }
    
    extension [Self <: IStringResult[?], CronFields](x: Self & IStringResult[CronFields]) {
      
      inline def setErrors(value: Record[String, Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setExpressions(value: js.Array[ICronExpression[CronFields, `false`]]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      inline def setExpressionsVarargs(value: (ICronExpression[CronFields, `false`])*): Self = StObject.set(x, "expressions", js.Array(value*))
      
      inline def setVariables(value: Record[String, String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  type IteratorResultOrCronDate[IsIterable /* <: Boolean */] = CronDate | (IteratorResult[CronDate, CronDate])
  
  trait ParserOptions[IsIterable /* <: Boolean */] extends StObject {
    
    var currentDate: js.UndefOr[DateType] = js.undefined
    
    var endDate: js.UndefOr[DateType] = js.undefined
    
    var iterator: js.UndefOr[IsIterable] = js.undefined
    
    var nthDayOfWeek: js.UndefOr[Double] = js.undefined
    
    var startDate: js.UndefOr[DateType] = js.undefined
    
    var tz: js.UndefOr[String] = js.undefined
    
    var utc: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptions {
    
    inline def apply[IsIterable /* <: Boolean */](): ParserOptions[IsIterable] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions[IsIterable]]
    }
    
    extension [Self <: ParserOptions[?], IsIterable /* <: Boolean */](x: Self & ParserOptions[IsIterable]) {
      
      inline def setCurrentDate(value: DateType): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
      
      inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
      
      inline def setEndDate(value: DateType): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setIterator(value: IsIterable): Self = StObject.set(x, "iterator", value.asInstanceOf[js.Any])
      
      inline def setIteratorUndefined: Self = StObject.set(x, "iterator", js.undefined)
      
      inline def setNthDayOfWeek(value: Double): Self = StObject.set(x, "nthDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setNthDayOfWeekUndefined: Self = StObject.set(x, "nthDayOfWeek", js.undefined)
      
      inline def setStartDate(value: DateType): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTz(value: String): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
      
      inline def setTzUndefined: Self = StObject.set(x, "tz", js.undefined)
      
      inline def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      inline def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
}
