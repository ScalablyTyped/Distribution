package typings.dateFns.anon

import typings.dateFns.dateFnsNumbers.`1`
import typings.dateFns.dateFnsNumbers.`2`
import typings.dateFns.dateFnsNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FractionDigits extends StObject {
  
  var fractionDigits: js.UndefOr[typings.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3`] = js.undefined
}
object FractionDigits {
  
  @scala.inline
  def apply(): FractionDigits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FractionDigits]
  }
  
  @scala.inline
  implicit class FractionDigitsMutableBuilder[Self <: FractionDigits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFractionDigits(value: typings.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3`): Self = StObject.set(x, "fractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFractionDigitsUndefined: Self = StObject.set(x, "fractionDigits", js.undefined)
  }
}
