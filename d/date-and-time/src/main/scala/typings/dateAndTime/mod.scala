package typings.dateAndTime

import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-and-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDays(dateObj: Date, days: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(dateObj.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def addHours(dateObj: Date, hours: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addHours")(dateObj.asInstanceOf[js.Any], hours.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def addMilliseconds(dateObj: Date, milliseconds: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMilliseconds")(dateObj.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def addMinutes(dateObj: Date, minutes: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMinutes")(dateObj.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def addMonths(dateObj: Date, months: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(dateObj.asInstanceOf[js.Any], months.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def addSeconds(dateObj: Date, seconds: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addSeconds")(dateObj.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def addYears(dateObj: Date, years: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addYears")(dateObj.asInstanceOf[js.Any], years.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def compile(formatString: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(formatString.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def extend(`extension`: Record[String, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def format(dateObj: Date, formatString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateObj.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(dateObj: Date, formatString: String, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateObj.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(dateObj: Date, formatString: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateObj.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(dateObj: Date, formatString: js.Array[String], utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateObj.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isLeapYear(y: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(y.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSameDay(date1: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValid(dateValue: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(dateValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(dateValue: String, formatter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(dateValue.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValid(dateValue: String, formatter: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(dateValue.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValid(dateValue: PreparseResult): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(dateValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(dateValue: PreparseResult, formatter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(dateValue.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValid(dateValue: PreparseResult, formatter: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(dateValue.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def locale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[String]
  inline def locale(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def locale(code: String, locale: Record[String, js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(code.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(code: Unit, locale: Record[String, js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(code.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parse(dateString: String, formatter: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def parse(dateString: String, formatter: String, utc: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def parse(dateString: String, formatter: js.Array[String]): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def parse(dateString: String, formatter: js.Array[String], utc: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def plugin(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def plugin(name: String, `extension`: Record[String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(name.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def preparse(dateString: String, formatString: String): PreparseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("preparse")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[PreparseResult]
  inline def preparse(dateString: String, formatString: js.Array[String]): PreparseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("preparse")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[PreparseResult]
  
  inline def subtract(date1: Date, date2: Date): SubtractResult = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[SubtractResult]
  
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
  
  trait SubtractResult extends StObject {
    
    def toDays(): Double
    
    def toHours(): Double
    
    def toMilliseconds(): Double
    
    def toMinutes(): Double
    
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
  
  type Subtract_ = SubtractResult
  
  type getDelta = js.Function0[Double]
}
