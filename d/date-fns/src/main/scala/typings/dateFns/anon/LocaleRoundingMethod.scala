package typings.dateFns.anon

import typings.dateFns.dateFnsStrings.ceil
import typings.dateFns.dateFnsStrings.day
import typings.dateFns.dateFnsStrings.floor
import typings.dateFns.dateFnsStrings.hour
import typings.dateFns.dateFnsStrings.minute
import typings.dateFns.dateFnsStrings.month
import typings.dateFns.dateFnsStrings.round
import typings.dateFns.dateFnsStrings.second
import typings.dateFns.dateFnsStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleRoundingMethod extends StObject {
  
  var addSuffix: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[typings.dateFns.Locale] = js.undefined
  
  var roundingMethod: js.UndefOr[floor | ceil | round] = js.undefined
  
  var unit: js.UndefOr[second | minute | hour | day | month | year] = js.undefined
}
object LocaleRoundingMethod {
  
  inline def apply(): LocaleRoundingMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleRoundingMethod]
  }
  
  extension [Self <: LocaleRoundingMethod](x: Self) {
    
    inline def setAddSuffix(value: Boolean): Self = StObject.set(x, "addSuffix", value.asInstanceOf[js.Any])
    
    inline def setAddSuffixUndefined: Self = StObject.set(x, "addSuffix", js.undefined)
    
    inline def setLocale(value: typings.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setRoundingMethod(value: floor | ceil | round): Self = StObject.set(x, "roundingMethod", value.asInstanceOf[js.Any])
    
    inline def setRoundingMethodUndefined: Self = StObject.set(x, "roundingMethod", js.undefined)
    
    inline def setUnit(value: second | minute | hour | day | month | year): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
