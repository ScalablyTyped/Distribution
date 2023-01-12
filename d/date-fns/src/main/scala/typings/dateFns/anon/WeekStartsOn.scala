package typings.dateFns.anon

import typings.dateFns.dateFnsInts.`2`
import typings.dateFns.dateFnsInts.`3`
import typings.dateFns.dateFnsInts.`4`
import typings.dateFns.dateFnsInts.`5`
import typings.dateFns.dateFnsInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeekStartsOn extends StObject {
  
  var locale: js.UndefOr[typings.dateFns.Locale] = js.undefined
  
  var weekStartsOn: js.UndefOr[
    typings.dateFns.dateFnsInts.`0` | typings.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6`
  ] = js.undefined
}
object WeekStartsOn {
  
  inline def apply(): WeekStartsOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeekStartsOn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeekStartsOn] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: typings.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setWeekStartsOn(
      value: typings.dateFns.dateFnsInts.`0` | typings.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6`
    ): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    
    inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
  }
}
