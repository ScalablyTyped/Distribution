package typings.cronParser

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cron-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Wrapper for CronExpression.parse method */
  @scala.inline
  def parseExpression(expression: String): CronExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[CronExpression]
  @scala.inline
  def parseExpression(expression: String, options: ParserOptions): CronExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(expression.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CronExpression]
  
  /** Parse crontab file */
  @scala.inline
  def parseFile(filePath: String, callback: js.Function2[/* err */ js.Any, /* data */ StringResult, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(filePath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Parse content string */
  @scala.inline
  def parseString(data: String): StringResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(data.asInstanceOf[js.Any]).asInstanceOf[StringResult]
  
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
    
    def toDate(): Date
    
    def toISOString(): String
    
    def toJSON(): String
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
    def iterate(steps: Double, callback: js.Function2[/* item */ CronDate, /* i */ Double, js.Any]): js.Array[CronDate] = js.native
    
    /** Find next suitable date */
    def next(): CronDate = js.native
    
    /** Parse input expression (async) */
    def parse(expression: String): CronExpression = js.native
    def parse(expression: String, options: Unit, callback: js.Function0[js.Any]): CronExpression = js.native
    def parse(expression: String, options: ParserOptions): CronExpression = js.native
    def parse(expression: String, options: ParserOptions, callback: js.Function0[js.Any]): CronExpression = js.native
    
    /** Find previous suitable date */
    def prev(): CronDate = js.native
    
    /** Reset expression iterator state */
    def reset(): Unit = js.native
    def reset(resetDate: String): Unit = js.native
    def reset(resetDate: Double): Unit = js.native
    def reset(resetDate: Date): Unit = js.native
  }
  
  trait ParserOptions extends StObject {
    
    var currentDate: js.UndefOr[String | Double | Date] = js.undefined
    
    var endDate: js.UndefOr[String | Double | Date] = js.undefined
    
    var iterator: js.UndefOr[Boolean] = js.undefined
    
    var startDate: js.UndefOr[String | Double | Date] = js.undefined
    
    var tz: js.UndefOr[String] = js.undefined
    
    var utc: js.UndefOr[Boolean] = js.undefined
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
  
  trait StringResult extends StObject {
    
    var errors: StringDictionary[String]
    
    var expressions: js.Array[CronExpression]
    
    var variables: StringDictionary[String]
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
