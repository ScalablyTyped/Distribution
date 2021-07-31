package typings.dateFns

import typings.dateFns.anon.DateTime
import typings.dateFns.anon.Day
import typings.dateFns.anon.FirstWeekContainsDateWeekStartsOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var formatDistance: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var formatLong: js.UndefOr[DateTime] = js.undefined
  
  var formatRelative: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var localize: js.UndefOr[Day] = js.undefined
  
  var `match`: js.UndefOr[Day] = js.undefined
  
  var options: js.UndefOr[FirstWeekContainsDateWeekStartsOn] = js.undefined
}
object Locale {
  
  @scala.inline
  def apply(): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setFormatDistance(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "formatDistance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatDistanceUndefined: Self = StObject.set(x, "formatDistance", js.undefined)
    
    @scala.inline
    def setFormatLong(value: DateTime): Self = StObject.set(x, "formatLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatLongUndefined: Self = StObject.set(x, "formatLong", js.undefined)
    
    @scala.inline
    def setFormatRelative(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "formatRelative", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatRelativeUndefined: Self = StObject.set(x, "formatRelative", js.undefined)
    
    @scala.inline
    def setLocalize(value: Day): Self = StObject.set(x, "localize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizeUndefined: Self = StObject.set(x, "localize", js.undefined)
    
    @scala.inline
    def setMatch(value: Day): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setOptions(value: FirstWeekContainsDateWeekStartsOn): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
