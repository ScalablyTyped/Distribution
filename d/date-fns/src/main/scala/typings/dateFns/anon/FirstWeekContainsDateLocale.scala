package typings.dateFns.anon

import typings.dateFns.dateFnsInts.`2`
import typings.dateFns.dateFnsInts.`3`
import typings.dateFns.dateFnsInts.`4`
import typings.dateFns.dateFnsInts.`5`
import typings.dateFns.dateFnsInts.`6`
import typings.dateFns.dateFnsInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstWeekContainsDateLocale extends StObject {
  
  var firstWeekContainsDate: js.UndefOr[typings.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
  
  var locale: js.UndefOr[typings.dateFns.Locale] = js.undefined
  
  var weekStartsOn: js.UndefOr[
    typings.dateFns.dateFnsInts.`0` | typings.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6`
  ] = js.undefined
}
object FirstWeekContainsDateLocale {
  
  inline def apply(): FirstWeekContainsDateLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstWeekContainsDateLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstWeekContainsDateLocale] (val x: Self) extends AnyVal {
    
    inline def setFirstWeekContainsDate(value: typings.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "firstWeekContainsDate", value.asInstanceOf[js.Any])
    
    inline def setFirstWeekContainsDateUndefined: Self = StObject.set(x, "firstWeekContainsDate", js.undefined)
    
    inline def setLocale(value: typings.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setWeekStartsOn(
      value: typings.dateFns.dateFnsInts.`0` | typings.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6`
    ): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    
    inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
  }
}
