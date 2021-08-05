package typings.baseui.anon

import typings.dateFns.anon.DateTime
import typings.dateFns.anon.Day
import typings.dateFns.anon.FirstWeekContainsDateWeekStartsOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<date-fns.Locale> */
trait PartialLocale extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var formatDistance: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var formatLong: js.UndefOr[DateTime] = js.undefined
  
  var formatRelative: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var localize: js.UndefOr[Day] = js.undefined
  
  var `match`: js.UndefOr[Day] = js.undefined
  
  var options: js.UndefOr[FirstWeekContainsDateWeekStartsOn] = js.undefined
}
object PartialLocale {
  
  inline def apply(): PartialLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLocale]
  }
  
  extension [Self <: PartialLocale](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setFormatDistance(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "formatDistance", js.Any.fromFunction1(value))
    
    inline def setFormatDistanceUndefined: Self = StObject.set(x, "formatDistance", js.undefined)
    
    inline def setFormatLong(value: DateTime): Self = StObject.set(x, "formatLong", value.asInstanceOf[js.Any])
    
    inline def setFormatLongUndefined: Self = StObject.set(x, "formatLong", js.undefined)
    
    inline def setFormatRelative(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "formatRelative", js.Any.fromFunction1(value))
    
    inline def setFormatRelativeUndefined: Self = StObject.set(x, "formatRelative", js.undefined)
    
    inline def setLocalize(value: Day): Self = StObject.set(x, "localize", value.asInstanceOf[js.Any])
    
    inline def setLocalizeUndefined: Self = StObject.set(x, "localize", js.undefined)
    
    inline def setMatch(value: Day): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setOptions(value: FirstWeekContainsDateWeekStartsOn): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
