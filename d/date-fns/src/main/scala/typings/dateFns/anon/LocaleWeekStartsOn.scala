package typings.dateFns.anon

import typings.dateFns.dateFnsNumbers.`1`
import typings.dateFns.dateFnsNumbers.`2`
import typings.dateFns.dateFnsNumbers.`3`
import typings.dateFns.dateFnsNumbers.`4`
import typings.dateFns.dateFnsNumbers.`5`
import typings.dateFns.dateFnsNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleWeekStartsOn extends StObject {
  
  var locale: js.UndefOr[typings.dateFns.Locale] = js.undefined
  
  var weekStartsOn: js.UndefOr[typings.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}
object LocaleWeekStartsOn {
  
  inline def apply(): LocaleWeekStartsOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleWeekStartsOn]
  }
  
  extension [Self <: LocaleWeekStartsOn](x: Self) {
    
    inline def setLocale(value: typings.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setWeekStartsOn(value: typings.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    
    inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
  }
}
