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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unit extends StObject {
  
  var addSuffix: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[typings.dateFns.Locale] = js.native
  
  var roundingMethod: js.UndefOr[floor | ceil | round] = js.native
  
  var unit: js.UndefOr[second | minute | hour | day | month | year] = js.native
}
object Unit {
  
  @scala.inline
  def apply(): Unit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Unit]
  }
  
  @scala.inline
  implicit class UnitMutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSuffix(value: Boolean): Self = StObject.set(x, "addSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSuffixUndefined: Self = StObject.set(x, "addSuffix", js.undefined)
    
    @scala.inline
    def setLocale(value: typings.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setRoundingMethod(value: floor | ceil | round): Self = StObject.set(x, "roundingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundingMethodUndefined: Self = StObject.set(x, "roundingMethod", js.undefined)
    
    @scala.inline
    def setUnit(value: second | minute | hour | day | month | year): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
