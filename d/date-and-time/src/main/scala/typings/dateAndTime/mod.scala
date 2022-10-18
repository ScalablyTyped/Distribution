package typings.dateAndTime

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-and-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDays(dateObj: js.Date, days: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(dateObj.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addHours(dateObj: js.Date, hours: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addHours")(dateObj.asInstanceOf[js.Any], hours.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addMilliseconds(dateObj: js.Date, milliseconds: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMilliseconds")(dateObj.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addMinutes(dateObj: js.Date, minutes: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMinutes")(dateObj.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addMonths(dateObj: js.Date, months: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(dateObj.asInstanceOf[js.Any], months.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addSeconds(dateObj: js.Date, seconds: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addSeconds")(dateObj.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addYears(dateObj: js.Date, years: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addYears")(dateObj.asInstanceOf[js.Any], years.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def compile(formatString: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(formatString.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def extend(`extension`: Extension): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def format(dateObj: js.Date, compiledObj: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateObj.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(dateObj: js.Date, compiledObj: js.Array[String], utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateObj.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(dateObj: js.Date, formatString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateObj.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(dateObj: js.Date, formatString: String, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateObj.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatTZ(dateObj: js.Date, compiledObj: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTZ")(dateObj.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatTZ(dateObj: js.Date, compiledObj: js.Array[String], timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTZ")(dateObj.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatTZ(dateObj: js.Date, formatString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTZ")(dateObj.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatTZ(dateObj: js.Date, formatString: String, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTZ")(dateObj.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isLeapYear(y: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(y.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSameDay(date1: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValid(dateString: String, compiledObj: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(dateString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValid(dateString: String, formatString: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValid(preparseResult: PreparseResult): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(preparseResult.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def locale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[String]
  inline def locale(locale: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def locale(locale: Locale_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(dateString: String, compiledObj: js.Array[String]): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def parse(dateString: String, compiledObj: js.Array[String], utc: Boolean): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def parse(dateString: String, formatString: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def parse(dateString: String, formatString: String, utc: Boolean): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def parseTZ(dateString: String, compiledObj: js.Array[String]): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTZ")(dateString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def parseTZ(dateString: String, compiledObj: js.Array[String], timeZone: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTZ")(dateString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def parseTZ(dateString: String, formatString: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTZ")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def parseTZ(dateString: String, formatString: String, timeZone: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTZ")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def plugin(plugin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def plugin(plugin: Plugin_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def preparse(dateString: String, compiledObj: js.Array[String]): PreparseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("preparse")(dateString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any])).asInstanceOf[PreparseResult]
  inline def preparse(dateString: String, formatString: String): PreparseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("preparse")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[PreparseResult]
  
  inline def subtract(date1: js.Date, date2: js.Date): SubtractResult = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[SubtractResult]
  
  inline def timeSpan(date1: js.Date, date2: js.Date): typings.dateAndTime.pluginTimespanMod.dateAndTimeAugmentingMod.TimeSpanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("timeSpan")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[typings.dateAndTime.pluginTimespanMod.dateAndTimeAugmentingMod.TimeSpanResult]
  
  inline def transform(dateString: String, compiledObj1: js.Array[String], compiledObj2: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(dateString.asInstanceOf[js.Any], compiledObj1.asInstanceOf[js.Any], compiledObj2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transform(dateString: String, compiledObj1: js.Array[String], compiledObj2: js.Array[String], utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(dateString.asInstanceOf[js.Any], compiledObj1.asInstanceOf[js.Any], compiledObj2.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transform(dateString: String, compiledObj: js.Array[String], formatString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(dateString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transform(dateString: String, compiledObj: js.Array[String], formatString: String, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(dateString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transform(dateString: String, formatString1: String, formatString2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(dateString.asInstanceOf[js.Any], formatString1.asInstanceOf[js.Any], formatString2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transform(dateString: String, formatString1: String, formatString2: String, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(dateString.asInstanceOf[js.Any], formatString1.asInstanceOf[js.Any], formatString2.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transform(dateString: String, formatString: String, compiledObj: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transform(dateString: String, formatString: String, compiledObj: js.Array[String], utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def transformTZ(dateString: String, compiledObj1: js.Array[String], compiledObj2: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformTZ")(dateString.asInstanceOf[js.Any], compiledObj1.asInstanceOf[js.Any], compiledObj2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transformTZ(
    dateString: String,
    compiledObj1: js.Array[String],
    compiledObj2: js.Array[String],
    timeZone: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformTZ")(dateString.asInstanceOf[js.Any], compiledObj1.asInstanceOf[js.Any], compiledObj2.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transformTZ(dateString: String, compiledObj: js.Array[String], formatString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformTZ")(dateString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transformTZ(dateString: String, compiledObj: js.Array[String], formatString: String, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformTZ")(dateString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transformTZ(dateString: String, formatString1: String, formatString2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformTZ")(dateString.asInstanceOf[js.Any], formatString1.asInstanceOf[js.Any], formatString2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transformTZ(dateString: String, formatString1: String, formatString2: String, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformTZ")(dateString.asInstanceOf[js.Any], formatString1.asInstanceOf[js.Any], formatString2.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transformTZ(dateString: String, formatString: String, compiledObj: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformTZ")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transformTZ(dateString: String, formatString: String, compiledObj: js.Array[String], timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformTZ")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], compiledObj.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Extender = StringDictionary[js.Function1[/* args */ Any, Any]]
  
  trait Extension extends StObject {
    
    var extender: js.UndefOr[Extender] = js.undefined
    
    var formatter: js.UndefOr[Formatter] = js.undefined
    
    var parser: js.UndefOr[Parser] = js.undefined
    
    var res: js.UndefOr[Resources] = js.undefined
  }
  object Extension {
    
    inline def apply(): Extension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extension]
    }
    
    extension [Self <: Extension](x: Self) {
      
      inline def setExtender(value: Extender): Self = StObject.set(x, "extender", value.asInstanceOf[js.Any])
      
      inline def setExtenderUndefined: Self = StObject.set(x, "extender", js.undefined)
      
      inline def setFormatter(value: Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setParser(value: Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setRes(value: Resources): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
    }
  }
  
  type Formatter = js.Object
  
  type Locale_ = js.Function1[/* proto */ Any, String]
  
  type Parser = js.Object
  
  type Plugin_ = js.Function2[/* proto */ Any, /* localized_proto */ js.UndefOr[Any], String]
  
  trait PreparseResult extends StObject {
    
    /** Meridiem */
    var A: Double
    
    /** Day */
    var D: Double
    
    /** 24-hour */
    var H: Double
    
    /** Month */
    var M: Double
    
    /** Millisecond */
    var S: Double
    
    /** Year */
    var Y: Double
    
    /** Timezone offset */
    var Z: Double
    
    /** Pointer offset */
    var _index: Double
    
    /** Length of the date string */
    var _length: Double
    
    /** Token matching count */
    var _match: Double
    
    /** 12-hour */
    var h: Double
    
    /** Minute */
    var m: Double
    
    /** Second */
    var s: Double
  }
  object PreparseResult {
    
    inline def apply(
      A: Double,
      D: Double,
      H: Double,
      M: Double,
      S: Double,
      Y: Double,
      Z: Double,
      _index: Double,
      _length: Double,
      _match: Double,
      h: Double,
      m: Double,
      s: Double
    ): PreparseResult = {
      val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], D = D.asInstanceOf[js.Any], H = H.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _match = _match.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreparseResult]
    }
    
    extension [Self <: PreparseResult](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      inline def setD(value: Double): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
      
      inline def setM(value: Double): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "Z", value.asInstanceOf[js.Any])
      
      inline def set_index(value: Double): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
      
      inline def set_length(value: Double): Self = StObject.set(x, "_length", value.asInstanceOf[js.Any])
      
      inline def set_match(value: Double): Self = StObject.set(x, "_match", value.asInstanceOf[js.Any])
    }
  }
  
  type Resources = StringDictionary[js.Array[js.Array[String] | String]]
  
  trait SubtractResult extends StObject {
    
    /** Returns the result value in days. This value might be a real number. */
    def toDays(): Double
    
    /** Returns the result value in hours. This value might be a real number. */
    def toHours(): Double
    
    /** Returns the result value in milliseconds. */
    def toMilliseconds(): Double
    
    /** Returns the result value in minutes. This value might be a real number. */
    def toMinutes(): Double
    
    /** Returns the result value in seconds. */
    def toSeconds(): Double
  }
  object SubtractResult {
    
    inline def apply(
      toDays: () => Double,
      toHours: () => Double,
      toMilliseconds: () => Double,
      toMinutes: () => Double,
      toSeconds: () => Double
    ): SubtractResult = {
      val __obj = js.Dynamic.literal(toDays = js.Any.fromFunction0(toDays), toHours = js.Any.fromFunction0(toHours), toMilliseconds = js.Any.fromFunction0(toMilliseconds), toMinutes = js.Any.fromFunction0(toMinutes), toSeconds = js.Any.fromFunction0(toSeconds))
      __obj.asInstanceOf[SubtractResult]
    }
    
    extension [Self <: SubtractResult](x: Self) {
      
      inline def setToDays(value: () => Double): Self = StObject.set(x, "toDays", js.Any.fromFunction0(value))
      
      inline def setToHours(value: () => Double): Self = StObject.set(x, "toHours", js.Any.fromFunction0(value))
      
      inline def setToMilliseconds(value: () => Double): Self = StObject.set(x, "toMilliseconds", js.Any.fromFunction0(value))
      
      inline def setToMinutes(value: () => Double): Self = StObject.set(x, "toMinutes", js.Any.fromFunction0(value))
      
      inline def setToSeconds(value: () => Double): Self = StObject.set(x, "toSeconds", js.Any.fromFunction0(value))
    }
  }
  
  trait TimeSpanResult extends StObject {
    
    /** Returns the result value in days. */
    def toDays(formatString: String): String
    
    /** Returns the result value in hours. */
    def toHours(formatString: String): String
    
    /** Returns the result value in milliseconds. */
    def toMilliseconds(formatString: String): String
    
    /** Returns the result value in minutes. */
    def toMinutes(formatString: String): String
    
    /** Returns the result value in seconds. */
    def toSeconds(formatString: String): String
  }
  object TimeSpanResult {
    
    inline def apply(
      toDays: String => String,
      toHours: String => String,
      toMilliseconds: String => String,
      toMinutes: String => String,
      toSeconds: String => String
    ): TimeSpanResult = {
      val __obj = js.Dynamic.literal(toDays = js.Any.fromFunction1(toDays), toHours = js.Any.fromFunction1(toHours), toMilliseconds = js.Any.fromFunction1(toMilliseconds), toMinutes = js.Any.fromFunction1(toMinutes), toSeconds = js.Any.fromFunction1(toSeconds))
      __obj.asInstanceOf[TimeSpanResult]
    }
    
    extension [Self <: TimeSpanResult](x: Self) {
      
      inline def setToDays(value: String => String): Self = StObject.set(x, "toDays", js.Any.fromFunction1(value))
      
      inline def setToHours(value: String => String): Self = StObject.set(x, "toHours", js.Any.fromFunction1(value))
      
      inline def setToMilliseconds(value: String => String): Self = StObject.set(x, "toMilliseconds", js.Any.fromFunction1(value))
      
      inline def setToMinutes(value: String => String): Self = StObject.set(x, "toMinutes", js.Any.fromFunction1(value))
      
      inline def setToSeconds(value: String => String): Self = StObject.set(x, "toSeconds", js.Any.fromFunction1(value))
    }
  }
}
