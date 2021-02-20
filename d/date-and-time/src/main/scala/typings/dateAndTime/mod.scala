package typings.dateAndTime

import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-and-time", "addDays")
  @js.native
  def addDays(dateObj: Date, days: Double): Date = js.native
  
  @JSImport("date-and-time", "addHours")
  @js.native
  def addHours(dateObj: Date, hours: Double): Date = js.native
  
  @JSImport("date-and-time", "addMilliseconds")
  @js.native
  def addMilliseconds(dateObj: Date, milliseconds: Double): Date = js.native
  
  @JSImport("date-and-time", "addMinutes")
  @js.native
  def addMinutes(dateObj: Date, minutes: Double): Date = js.native
  
  @JSImport("date-and-time", "addMonths")
  @js.native
  def addMonths(dateObj: Date, months: Double): Date = js.native
  
  @JSImport("date-and-time", "addSeconds")
  @js.native
  def addSeconds(dateObj: Date, seconds: Double): Date = js.native
  
  @JSImport("date-and-time", "addYears")
  @js.native
  def addYears(dateObj: Date, years: Double): Date = js.native
  
  @JSImport("date-and-time", "compile")
  @js.native
  def compile(formatString: String): js.Array[String] = js.native
  
  @JSImport("date-and-time", "extend")
  @js.native
  def extend(extension: Record[String, _]): Unit = js.native
  
  @JSImport("date-and-time", "format")
  @js.native
  def format(dateObj: Date, formatString: String): String = js.native
  @JSImport("date-and-time", "format")
  @js.native
  def format(dateObj: Date, formatString: String, utc: Boolean): String = js.native
  @JSImport("date-and-time", "format")
  @js.native
  def format(dateObj: Date, formatString: js.Array[String]): String = js.native
  @JSImport("date-and-time", "format")
  @js.native
  def format(dateObj: Date, formatString: js.Array[String], utc: Boolean): String = js.native
  
  @JSImport("date-and-time", "isLeapYear")
  @js.native
  def isLeapYear(y: Double): Boolean = js.native
  
  @JSImport("date-and-time", "isSameDay")
  @js.native
  def isSameDay(date1: Date, date2: Date): Boolean = js.native
  
  @JSImport("date-and-time", "isValid")
  @js.native
  def isValid(dateValue: String): Boolean = js.native
  @JSImport("date-and-time", "isValid")
  @js.native
  def isValid(dateValue: String, formatter: String): Boolean = js.native
  @JSImport("date-and-time", "isValid")
  @js.native
  def isValid(dateValue: String, formatter: js.Array[String]): Boolean = js.native
  @JSImport("date-and-time", "isValid")
  @js.native
  def isValid(dateValue: PreparseResult): Boolean = js.native
  @JSImport("date-and-time", "isValid")
  @js.native
  def isValid(dateValue: PreparseResult, formatter: String): Boolean = js.native
  @JSImport("date-and-time", "isValid")
  @js.native
  def isValid(dateValue: PreparseResult, formatter: js.Array[String]): Boolean = js.native
  
  @JSImport("date-and-time", "locale")
  @js.native
  def locale(): String = js.native
  @JSImport("date-and-time", "locale")
  @js.native
  def locale(code: js.UndefOr[scala.Nothing], locale: Record[String, _]): String = js.native
  @JSImport("date-and-time", "locale")
  @js.native
  def locale(code: String): String = js.native
  @JSImport("date-and-time", "locale")
  @js.native
  def locale(code: String, locale: Record[String, _]): String = js.native
  
  @JSImport("date-and-time", "parse")
  @js.native
  def parse(dateString: String, formatter: String): Date = js.native
  @JSImport("date-and-time", "parse")
  @js.native
  def parse(dateString: String, formatter: String, utc: Boolean): Date = js.native
  @JSImport("date-and-time", "parse")
  @js.native
  def parse(dateString: String, formatter: js.Array[String]): Date = js.native
  @JSImport("date-and-time", "parse")
  @js.native
  def parse(dateString: String, formatter: js.Array[String], utc: Boolean): Date = js.native
  
  @JSImport("date-and-time", "plugin")
  @js.native
  def plugin(name: String): Unit = js.native
  @JSImport("date-and-time", "plugin")
  @js.native
  def plugin(name: String, extension: Record[String, _]): Unit = js.native
  
  @JSImport("date-and-time", "preparse")
  @js.native
  def preparse(dateString: String, formatString: String): PreparseResult = js.native
  @JSImport("date-and-time", "preparse")
  @js.native
  def preparse(dateString: String, formatString: js.Array[String]): PreparseResult = js.native
  
  @JSImport("date-and-time", "subtract")
  @js.native
  def subtract(date1: Date, date2: Date): SubtractResult = js.native
  
  @js.native
  trait PreparseResult extends StObject {
    
    /** Meridiem */
    var A: Double = js.native
    
    /** Day */
    var D: Double = js.native
    
    /** 24-hour */
    var H: Double = js.native
    
    /** Month */
    var M: Double = js.native
    
    /** Millisecond */
    var S: Double = js.native
    
    /** Year */
    var Y: Double = js.native
    
    /** Timezone offset */
    var Z: Double = js.native
    
    /** Pointer offset */
    var _index: Double = js.native
    
    /** Length of the date string */
    var _length: Double = js.native
    
    /** Token matching count */
    var _match: Double = js.native
    
    /** 12-hour */
    var h: Double = js.native
    
    /** Minute */
    var m: Double = js.native
    
    /** Second */
    var s: Double = js.native
  }
  object PreparseResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class PreparseResultMutableBuilder[Self <: PreparseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM(value: Double): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "Z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_index(value: Double): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_length(value: Double): Self = StObject.set(x, "_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_match(value: Double): Self = StObject.set(x, "_match", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubtractResult extends StObject {
    
    def toDays(): Double = js.native
    
    def toHours(): Double = js.native
    
    def toMilliseconds(): Double = js.native
    
    def toMinutes(): Double = js.native
    
    def toSeconds(): Double = js.native
  }
  object SubtractResult {
    
    @scala.inline
    def apply(
      toDays: () => Double,
      toHours: () => Double,
      toMilliseconds: () => Double,
      toMinutes: () => Double,
      toSeconds: () => Double
    ): SubtractResult = {
      val __obj = js.Dynamic.literal(toDays = js.Any.fromFunction0(toDays), toHours = js.Any.fromFunction0(toHours), toMilliseconds = js.Any.fromFunction0(toMilliseconds), toMinutes = js.Any.fromFunction0(toMinutes), toSeconds = js.Any.fromFunction0(toSeconds))
      __obj.asInstanceOf[SubtractResult]
    }
    
    @scala.inline
    implicit class SubtractResultMutableBuilder[Self <: SubtractResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToDays(value: () => Double): Self = StObject.set(x, "toDays", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToHours(value: () => Double): Self = StObject.set(x, "toHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToMilliseconds(value: () => Double): Self = StObject.set(x, "toMilliseconds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToMinutes(value: () => Double): Self = StObject.set(x, "toMinutes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSeconds(value: () => Double): Self = StObject.set(x, "toSeconds", js.Any.fromFunction0(value))
    }
  }
  
  type Subtract_ = SubtractResult
  
  type getDelta = js.Function0[Double]
}
