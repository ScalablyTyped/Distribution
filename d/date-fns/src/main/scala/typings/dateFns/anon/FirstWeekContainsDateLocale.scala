package typings.dateFns.anon

import typings.dateFns.dateFnsNumbers.`1`
import typings.dateFns.dateFnsNumbers.`2`
import typings.dateFns.dateFnsNumbers.`3`
import typings.dateFns.dateFnsNumbers.`4`
import typings.dateFns.dateFnsNumbers.`5`
import typings.dateFns.dateFnsNumbers.`6`
import typings.dateFns.dateFnsNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstWeekContainsDateLocale extends StObject {
  
  var firstWeekContainsDate: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
  
  var locale: js.UndefOr[typings.dateFns.Locale] = js.undefined
  
  var weekStartsOn: js.UndefOr[typings.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}
object FirstWeekContainsDateLocale {
  
  @scala.inline
  def apply(): FirstWeekContainsDateLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstWeekContainsDateLocale]
  }
  
  @scala.inline
  implicit class FirstWeekContainsDateLocaleMutableBuilder[Self <: FirstWeekContainsDateLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstWeekContainsDate(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "firstWeekContainsDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstWeekContainsDateUndefined: Self = StObject.set(x, "firstWeekContainsDate", js.undefined)
    
    @scala.inline
    def setLocale(value: typings.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setWeekStartsOn(value: typings.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
  }
}
