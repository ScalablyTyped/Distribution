package typings.cronParser

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Wrapper for CronExpression.parse method */
  @JSImport("cron-parser", "parseExpression")
  @js.native
  def parseExpression(expression: String): CronExpression = js.native
  @JSImport("cron-parser", "parseExpression")
  @js.native
  def parseExpression(expression: String, options: ParserOptions): CronExpression = js.native
  
  /** Parse crontab file */
  @JSImport("cron-parser", "parseFile")
  @js.native
  def parseFile(filePath: String, callback: js.Function2[/* err */ js.Any, /* data */ StringResult, _]): Unit = js.native
  
  /** Parse content string */
  @JSImport("cron-parser", "parseString")
  @js.native
  def parseString(data: String): StringResult = js.native
  
  @js.native
  trait CronDate extends StObject {
    
    def addDay(): Unit = js.native
    
    def addHour(): Unit = js.native
    
    def addMinute(): Unit = js.native
    
    def addMonth(): Unit = js.native
    
    def addSecond(): Unit = js.native
    
    def addYear(): Unit = js.native
    
    def getDate(): Double = js.native
    
    def getDay(): Double = js.native
    
    def getFullYear(): Double = js.native
    
    def getHours(): Double = js.native
    
    def getMilliseconds(): Double = js.native
    
    def getMinutes(): Double = js.native
    
    def getMonth(): Double = js.native
    
    def getSeconds(): Double = js.native
    
    def getTime(): Double = js.native
    
    def getUTCDate(): Double = js.native
    
    def getUTCDay(): Double = js.native
    
    def getUTCFullYear(): Double = js.native
    
    def getUTCHours(): Double = js.native
    
    def getUTCMinutes(): Double = js.native
    
    def getUTCMonth(): Double = js.native
    
    def getUTCSeconds(): Double = js.native
    
    def setDate(d: Double): Unit = js.native
    
    def setDay(d: Double): Unit = js.native
    
    def setFullYear(y: Double): Unit = js.native
    
    def setHours(h: Double): Unit = js.native
    
    def setMilliseconds(s: Double): Unit = js.native
    
    def setMinutes(m: Double): Unit = js.native
    
    def setMonth(m: Double): Unit = js.native
    
    def setSeconds(s: Double): Unit = js.native
    
    def subtractDay(): Unit = js.native
    
    def subtractHour(): Unit = js.native
    
    def subtractMinute(): Unit = js.native
    
    def subtractMonth(): Unit = js.native
    
    def subtractSecond(): Unit = js.native
    
    def subtractYear(): Unit = js.native
    
    def toDate(): Date = js.native
    
    def toISOString(): String = js.native
    
    def toJSON(): String = js.native
  }
  object CronDate {
    
    @scala.inline
    def apply(
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
      toDate: () => Date,
      toISOString: () => String,
      toJSON: () => String
    ): CronDate = {
      val __obj = js.Dynamic.literal(addDay = js.Any.fromFunction0(addDay), addHour = js.Any.fromFunction0(addHour), addMinute = js.Any.fromFunction0(addMinute), addMonth = js.Any.fromFunction0(addMonth), addSecond = js.Any.fromFunction0(addSecond), addYear = js.Any.fromFunction0(addYear), getDate = js.Any.fromFunction0(getDate), getDay = js.Any.fromFunction0(getDay), getFullYear = js.Any.fromFunction0(getFullYear), getHours = js.Any.fromFunction0(getHours), getMilliseconds = js.Any.fromFunction0(getMilliseconds), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getUTCDate = js.Any.fromFunction0(getUTCDate), getUTCDay = js.Any.fromFunction0(getUTCDay), getUTCFullYear = js.Any.fromFunction0(getUTCFullYear), getUTCHours = js.Any.fromFunction0(getUTCHours), getUTCMinutes = js.Any.fromFunction0(getUTCMinutes), getUTCMonth = js.Any.fromFunction0(getUTCMonth), getUTCSeconds = js.Any.fromFunction0(getUTCSeconds), setDate = js.Any.fromFunction1(setDate), setDay = js.Any.fromFunction1(setDay), setFullYear = js.Any.fromFunction1(setFullYear), setHours = js.Any.fromFunction1(setHours), setMilliseconds = js.Any.fromFunction1(setMilliseconds), setMinutes = js.Any.fromFunction1(setMinutes), setMonth = js.Any.fromFunction1(setMonth), setSeconds = js.Any.fromFunction1(setSeconds), subtractDay = js.Any.fromFunction0(subtractDay), subtractHour = js.Any.fromFunction0(subtractHour), subtractMinute = js.Any.fromFunction0(subtractMinute), subtractMonth = js.Any.fromFunction0(subtractMonth), subtractSecond = js.Any.fromFunction0(subtractSecond), subtractYear = js.Any.fromFunction0(subtractYear), toDate = js.Any.fromFunction0(toDate), toISOString = js.Any.fromFunction0(toISOString), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[CronDate]
    }
    
    @scala.inline
    implicit class CronDateMutableBuilder[Self <: CronDate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDay(value: () => Unit): Self = StObject.set(x, "addDay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddHour(value: () => Unit): Self = StObject.set(x, "addHour", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddMinute(value: () => Unit): Self = StObject.set(x, "addMinute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddMonth(value: () => Unit): Self = StObject.set(x, "addMonth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddSecond(value: () => Unit): Self = StObject.set(x, "addSecond", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddYear(value: () => Unit): Self = StObject.set(x, "addYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDate(value: () => Double): Self = StObject.set(x, "getDate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDay(value: () => Double): Self = StObject.set(x, "getDay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFullYear(value: () => Double): Self = StObject.set(x, "getFullYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHours(value: () => Double): Self = StObject.set(x, "getHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMilliseconds(value: () => Double): Self = StObject.set(x, "getMilliseconds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMinutes(value: () => Double): Self = StObject.set(x, "getMinutes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMonth(value: () => Double): Self = StObject.set(x, "getMonth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSeconds(value: () => Double): Self = StObject.set(x, "getSeconds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTime(value: () => Double): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUTCDate(value: () => Double): Self = StObject.set(x, "getUTCDate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUTCDay(value: () => Double): Self = StObject.set(x, "getUTCDay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUTCFullYear(value: () => Double): Self = StObject.set(x, "getUTCFullYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUTCHours(value: () => Double): Self = StObject.set(x, "getUTCHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUTCMinutes(value: () => Double): Self = StObject.set(x, "getUTCMinutes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUTCMonth(value: () => Double): Self = StObject.set(x, "getUTCMonth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUTCSeconds(value: () => Double): Self = StObject.set(x, "getUTCSeconds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetDate(value: Double => Unit): Self = StObject.set(x, "setDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDay(value: Double => Unit): Self = StObject.set(x, "setDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFullYear(value: Double => Unit): Self = StObject.set(x, "setFullYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHours(value: Double => Unit): Self = StObject.set(x, "setHours", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMilliseconds(value: Double => Unit): Self = StObject.set(x, "setMilliseconds", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinutes(value: Double => Unit): Self = StObject.set(x, "setMinutes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMonth(value: Double => Unit): Self = StObject.set(x, "setMonth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSeconds(value: Double => Unit): Self = StObject.set(x, "setSeconds", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubtractDay(value: () => Unit): Self = StObject.set(x, "subtractDay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubtractHour(value: () => Unit): Self = StObject.set(x, "subtractHour", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubtractMinute(value: () => Unit): Self = StObject.set(x, "subtractMinute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubtractMonth(value: () => Unit): Self = StObject.set(x, "subtractMonth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubtractSecond(value: () => Unit): Self = StObject.set(x, "subtractSecond", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubtractYear(value: () => Unit): Self = StObject.set(x, "subtractYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToDate(value: () => Date): Self = StObject.set(x, "toDate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToISOString(value: () => String): Self = StObject.set(x, "toISOString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CronExpression extends StObject {
    
    /** Check if next suitable date exists */
    def hasNext(): Boolean = js.native
    
    /** Check if previous suitable date exists */
    def hasPrev(): Boolean = js.native
    
    /** Iterate over expression iterator */
    def iterate(steps: Double): js.Array[CronDate] = js.native
    def iterate(steps: Double, callback: js.Function2[/* item */ CronDate, /* i */ Double, _]): js.Array[CronDate] = js.native
    
    /** Find next suitable date */
    def next(): CronDate = js.native
    
    /** Parse input expression (async) */
    def parse(expression: String): CronExpression = js.native
    def parse(expression: String, options: js.UndefOr[scala.Nothing], callback: js.Function0[_]): CronExpression = js.native
    def parse(expression: String, options: ParserOptions): CronExpression = js.native
    def parse(expression: String, options: ParserOptions, callback: js.Function0[_]): CronExpression = js.native
    
    /** Find previous suitable date */
    def prev(): CronDate = js.native
    
    /** Reset expression iterator state */
    def reset(): Unit = js.native
    def reset(resetDate: String): Unit = js.native
    def reset(resetDate: Double): Unit = js.native
    def reset(resetDate: Date): Unit = js.native
  }
  
  @js.native
  trait ParserOptions extends StObject {
    
    var currentDate: js.UndefOr[String | Double | Date] = js.native
    
    var endDate: js.UndefOr[String | Double | Date] = js.native
    
    var iterator: js.UndefOr[Boolean] = js.native
    
    var startDate: js.UndefOr[String | Double | Date] = js.native
    
    var tz: js.UndefOr[String] = js.native
    
    var utc: js.UndefOr[Boolean] = js.native
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentDate(value: String | Double | Date): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
      
      @scala.inline
      def setEndDate(value: String | Double | Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setIterator(value: Boolean): Self = StObject.set(x, "iterator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIteratorUndefined: Self = StObject.set(x, "iterator", js.undefined)
      
      @scala.inline
      def setStartDate(value: String | Double | Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      @scala.inline
      def setTz(value: String): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTzUndefined: Self = StObject.set(x, "tz", js.undefined)
      
      @scala.inline
      def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
  
  @js.native
  trait StringResult extends StObject {
    
    var errors: StringDictionary[String] = js.native
    
    var expressions: js.Array[CronExpression] = js.native
    
    var variables: StringDictionary[String] = js.native
  }
  object StringResult {
    
    @scala.inline
    def apply(
      errors: StringDictionary[String],
      expressions: js.Array[CronExpression],
      variables: StringDictionary[String]
    ): StringResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringResult]
    }
    
    @scala.inline
    implicit class StringResultMutableBuilder[Self <: StringResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: StringDictionary[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressions(value: js.Array[CronExpression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionsVarargs(value: CronExpression*): Self = StObject.set(x, "expressions", js.Array(value :_*))
      
      @scala.inline
      def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
