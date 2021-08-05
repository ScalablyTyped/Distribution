package typings.dayjs

import typings.dayjs.anon.PartialLTstringLTSstringL
import typings.dayjs.anon.Partialfuturestringpastst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocale extends StObject {
  
  var formats: PartialLTstringLTSstringL
  
  var months: js.UndefOr[js.Array[String]] = js.undefined
  
  var monthsShort: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: String
  
  var ordinal: js.UndefOr[js.Function1[/* n */ Double, Double | String]] = js.undefined
  
  var relativeTime: Partialfuturestringpastst
  
  var weekStart: js.UndefOr[Double] = js.undefined
  
  var weekdays: js.UndefOr[js.Array[String]] = js.undefined
  
  var weekdaysMin: js.UndefOr[js.Array[String]] = js.undefined
  
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
}
object ILocale {
  
  inline def apply(formats: PartialLTstringLTSstringL, name: String, relativeTime: Partialfuturestringpastst): ILocale = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocale]
  }
  
  extension [Self <: ILocale](x: Self) {
    
    inline def setFormats(value: PartialLTstringLTSstringL): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsShort(value: js.Array[String]): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
    
    inline def setMonthsShortUndefined: Self = StObject.set(x, "monthsShort", js.undefined)
    
    inline def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value :_*))
    
    inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    
    inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: /* n */ Double => Double | String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
    
    inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    inline def setRelativeTime(value: Partialfuturestringpastst): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
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
