package typings.dayjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Format extends StObject {
    
    var format: js.UndefOr[String] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var utc: js.UndefOr[Boolean] = js.native
  }
  object Format {
    
    @scala.inline
    def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
  
  /* Inlined std.Partial<dayjs.ILocale> */
  @js.native
  trait PartialILocale extends StObject {
    
    var formats: js.UndefOr[PartialLTstringLTSstringL] = js.native
    
    var months: js.UndefOr[js.Array[String]] = js.native
    
    var monthsShort: js.UndefOr[js.Array[String]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var ordinal: js.UndefOr[js.Function1[/* n */ Double, Double | String]] = js.native
    
    var relativeTime: js.UndefOr[Partialfuturestringpastst] = js.native
    
    var weekStart: js.UndefOr[Double] = js.native
    
    var weekdays: js.UndefOr[js.Array[String]] = js.native
    
    var weekdaysMin: js.UndefOr[js.Array[String]] = js.native
    
    var weekdaysShort: js.UndefOr[js.Array[String]] = js.native
  }
  object PartialILocale {
    
    @scala.inline
    def apply(): PartialILocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialILocale]
    }
    
    @scala.inline
    implicit class PartialILocaleMutableBuilder[Self <: PartialILocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormats(value: PartialLTstringLTSstringL): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      @scala.inline
      def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsShort(value: js.Array[String]): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsShortUndefined: Self = StObject.set(x, "monthsShort", js.undefined)
      
      @scala.inline
      def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value :_*))
      
      @scala.inline
      def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      @scala.inline
      def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOrdinal(value: /* n */ Double => Double | String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
      
      @scala.inline
      def setRelativeTime(value: Partialfuturestringpastst): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeTimeUndefined: Self = StObject.set(x, "relativeTime", js.undefined)
      
      @scala.inline
      def setWeekStart(value: Double): Self = StObject.set(x, "weekStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekStartUndefined: Self = StObject.set(x, "weekStart", js.undefined)
      
      @scala.inline
      def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysMin(value: js.Array[String]): Self = StObject.set(x, "weekdaysMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysMinUndefined: Self = StObject.set(x, "weekdaysMin", js.undefined)
      
      @scala.inline
      def setWeekdaysMinVarargs(value: String*): Self = StObject.set(x, "weekdaysMin", js.Array(value :_*))
      
      @scala.inline
      def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysShortUndefined: Self = StObject.set(x, "weekdaysShort", js.undefined)
      
      @scala.inline
      def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value :_*))
      
      @scala.inline
      def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
      
      @scala.inline
      def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<{  LT :string,   LTS :string,   L :string,   LL :string,   LLL :string,   LLLL :string}> */
  @js.native
  trait PartialLTstringLTSstringL extends StObject {
    
    var L: js.UndefOr[String] = js.native
    
    var LL: js.UndefOr[String] = js.native
    
    var LLL: js.UndefOr[String] = js.native
    
    var LLLL: js.UndefOr[String] = js.native
    
    var LT: js.UndefOr[String] = js.native
    
    var LTS: js.UndefOr[String] = js.native
  }
  object PartialLTstringLTSstringL {
    
    @scala.inline
    def apply(): PartialLTstringLTSstringL = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLTstringLTSstringL]
    }
    
    @scala.inline
    implicit class PartialLTstringLTSstringLMutableBuilder[Self <: PartialLTstringLTSstringL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setL(value: String): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLL(value: String): Self = StObject.set(x, "LL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLLL(value: String): Self = StObject.set(x, "LLL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLLLL(value: String): Self = StObject.set(x, "LLLL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLLLLUndefined: Self = StObject.set(x, "LLLL", js.undefined)
      
      @scala.inline
      def setLLLUndefined: Self = StObject.set(x, "LLL", js.undefined)
      
      @scala.inline
      def setLLUndefined: Self = StObject.set(x, "LL", js.undefined)
      
      @scala.inline
      def setLT(value: String): Self = StObject.set(x, "LT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLTS(value: String): Self = StObject.set(x, "LTS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLTSUndefined: Self = StObject.set(x, "LTS", js.undefined)
      
      @scala.inline
      def setLTUndefined: Self = StObject.set(x, "LT", js.undefined)
      
      @scala.inline
      def setLUndefined: Self = StObject.set(x, "L", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  future :string,   past :string,   s :string,   m :string,   mm :string,   h :string,   hh :string,   d :string,   dd :string,   M :string,   MM :string,   y :string,   yy :string}> */
  @js.native
  trait Partialfuturestringpastst extends StObject {
    
    var M: js.UndefOr[String] = js.native
    
    var MM: js.UndefOr[String] = js.native
    
    var d: js.UndefOr[String] = js.native
    
    var dd: js.UndefOr[String] = js.native
    
    var future: js.UndefOr[String] = js.native
    
    var h: js.UndefOr[String] = js.native
    
    var hh: js.UndefOr[String] = js.native
    
    var m: js.UndefOr[String] = js.native
    
    var mm: js.UndefOr[String] = js.native
    
    var past: js.UndefOr[String] = js.native
    
    var s: js.UndefOr[String] = js.native
    
    var y: js.UndefOr[String] = js.native
    
    var yy: js.UndefOr[String] = js.native
  }
  object Partialfuturestringpastst {
    
    @scala.inline
    def apply(): Partialfuturestringpastst = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialfuturestringpastst]
    }
    
    @scala.inline
    implicit class PartialfuturestringpaststMutableBuilder[Self <: Partialfuturestringpastst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setDd(value: String): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
      
      @scala.inline
      def setFuture(value: String): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFutureUndefined: Self = StObject.set(x, "future", js.undefined)
      
      @scala.inline
      def setH(value: String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setHh(value: String): Self = StObject.set(x, "hh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHhUndefined: Self = StObject.set(x, "hh", js.undefined)
      
      @scala.inline
      def setM(value: String): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMM(value: String): Self = StObject.set(x, "MM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMMUndefined: Self = StObject.set(x, "MM", js.undefined)
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "M", js.undefined)
      
      @scala.inline
      def setPast(value: String): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPastUndefined: Self = StObject.set(x, "past", js.undefined)
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      @scala.inline
      def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setYy(value: String): Self = StObject.set(x, "yy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYyUndefined: Self = StObject.set(x, "yy", js.undefined)
    }
  }
}
