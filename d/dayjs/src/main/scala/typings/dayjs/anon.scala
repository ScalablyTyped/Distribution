package typings.dayjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Format extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var utc: js.UndefOr[Boolean] = js.undefined
  }
  object Format {
    
    inline def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      inline def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
  
  /* Inlined std.Partial<dayjs.ILocale> */
  trait PartialILocale extends StObject {
    
    var formats: js.UndefOr[PartialLTstringLTSstringL] = js.undefined
    
    var months: js.UndefOr[js.Array[String]] = js.undefined
    
    var monthsShort: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var ordinal: js.UndefOr[js.Function1[/* n */ Double, Double | String]] = js.undefined
    
    var relativeTime: js.UndefOr[Partialfuturestringpastst] = js.undefined
    
    var weekStart: js.UndefOr[Double] = js.undefined
    
    var weekdays: js.UndefOr[js.Array[String]] = js.undefined
    
    var weekdaysMin: js.UndefOr[js.Array[String]] = js.undefined
    
    var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PartialILocale {
    
    inline def apply(): PartialILocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialILocale]
    }
    
    extension [Self <: PartialILocale](x: Self) {
      
      inline def setFormats(value: PartialLTstringLTSstringL): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsShort(value: js.Array[String]): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
      
      inline def setMonthsShortUndefined: Self = StObject.set(x, "monthsShort", js.undefined)
      
      inline def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value :_*))
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrdinal(value: /* n */ Double => Double | String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
      
      inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
      
      inline def setRelativeTime(value: Partialfuturestringpastst): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
      
      inline def setRelativeTimeUndefined: Self = StObject.set(x, "relativeTime", js.undefined)
      
      inline def setWeekStart(value: Double): Self = StObject.set(x, "weekStart", value.asInstanceOf[js.Any])
      
      inline def setWeekStartUndefined: Self = StObject.set(x, "weekStart", js.undefined)
      
      inline def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysMin(value: js.Array[String]): Self = StObject.set(x, "weekdaysMin", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysMinUndefined: Self = StObject.set(x, "weekdaysMin", js.undefined)
      
      inline def setWeekdaysMinVarargs(value: String*): Self = StObject.set(x, "weekdaysMin", js.Array(value :_*))
      
      inline def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysShortUndefined: Self = StObject.set(x, "weekdaysShort", js.undefined)
      
      inline def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value :_*))
      
      inline def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
      
      inline def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<{  LT :string,   LTS :string,   L :string,   LL :string,   LLL :string,   LLLL :string}> */
  trait PartialLTstringLTSstringL extends StObject {
    
    var L: js.UndefOr[String] = js.undefined
    
    var LL: js.UndefOr[String] = js.undefined
    
    var LLL: js.UndefOr[String] = js.undefined
    
    var LLLL: js.UndefOr[String] = js.undefined
    
    var LT: js.UndefOr[String] = js.undefined
    
    var LTS: js.UndefOr[String] = js.undefined
  }
  object PartialLTstringLTSstringL {
    
    inline def apply(): PartialLTstringLTSstringL = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLTstringLTSstringL]
    }
    
    extension [Self <: PartialLTstringLTSstringL](x: Self) {
      
      inline def setL(value: String): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setLL(value: String): Self = StObject.set(x, "LL", value.asInstanceOf[js.Any])
      
      inline def setLLL(value: String): Self = StObject.set(x, "LLL", value.asInstanceOf[js.Any])
      
      inline def setLLLL(value: String): Self = StObject.set(x, "LLLL", value.asInstanceOf[js.Any])
      
      inline def setLLLLUndefined: Self = StObject.set(x, "LLLL", js.undefined)
      
      inline def setLLLUndefined: Self = StObject.set(x, "LLL", js.undefined)
      
      inline def setLLUndefined: Self = StObject.set(x, "LL", js.undefined)
      
      inline def setLT(value: String): Self = StObject.set(x, "LT", value.asInstanceOf[js.Any])
      
      inline def setLTS(value: String): Self = StObject.set(x, "LTS", value.asInstanceOf[js.Any])
      
      inline def setLTSUndefined: Self = StObject.set(x, "LTS", js.undefined)
      
      inline def setLTUndefined: Self = StObject.set(x, "LT", js.undefined)
      
      inline def setLUndefined: Self = StObject.set(x, "L", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  future :string,   past :string,   s :string,   m :string,   mm :string,   h :string,   hh :string,   d :string,   dd :string,   M :string,   MM :string,   y :string,   yy :string}> */
  trait Partialfuturestringpastst extends StObject {
    
    var M: js.UndefOr[String] = js.undefined
    
    var MM: js.UndefOr[String] = js.undefined
    
    var d: js.UndefOr[String] = js.undefined
    
    var dd: js.UndefOr[String] = js.undefined
    
    var future: js.UndefOr[String] = js.undefined
    
    var h: js.UndefOr[String] = js.undefined
    
    var hh: js.UndefOr[String] = js.undefined
    
    var m: js.UndefOr[String] = js.undefined
    
    var mm: js.UndefOr[String] = js.undefined
    
    var past: js.UndefOr[String] = js.undefined
    
    var s: js.UndefOr[String] = js.undefined
    
    var y: js.UndefOr[String] = js.undefined
    
    var yy: js.UndefOr[String] = js.undefined
  }
  object Partialfuturestringpastst {
    
    inline def apply(): Partialfuturestringpastst = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialfuturestringpastst]
    }
    
    extension [Self <: Partialfuturestringpastst](x: Self) {
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setDd(value: String): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
      
      inline def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
      
      inline def setFuture(value: String): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      inline def setFutureUndefined: Self = StObject.set(x, "future", js.undefined)
      
      inline def setH(value: String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setHh(value: String): Self = StObject.set(x, "hh", value.asInstanceOf[js.Any])
      
      inline def setHhUndefined: Self = StObject.set(x, "hh", js.undefined)
      
      inline def setM(value: String): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      inline def setMM(value: String): Self = StObject.set(x, "MM", value.asInstanceOf[js.Any])
      
      inline def setMMUndefined: Self = StObject.set(x, "MM", js.undefined)
      
      inline def setMUndefined: Self = StObject.set(x, "M", js.undefined)
      
      inline def setPast(value: String): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
      
      inline def setPastUndefined: Self = StObject.set(x, "past", js.undefined)
      
      inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setYy(value: String): Self = StObject.set(x, "yy", value.asInstanceOf[js.Any])
      
      inline def setYyUndefined: Self = StObject.set(x, "yy", js.undefined)
    }
  }
}
