package typings.dateFns.anon

import typings.dateFns.dateFnsNumbers.`1`
import typings.dateFns.dateFnsNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalDigits extends StObject {
  
  var additionalDigits: js.UndefOr[typings.dateFns.dateFnsNumbers.`0` | `1` | `2`] = js.undefined
}
object AdditionalDigits {
  
  @scala.inline
  def apply(): AdditionalDigits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalDigits]
  }
  
  @scala.inline
  implicit class AdditionalDigitsMutableBuilder[Self <: AdditionalDigits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalDigits(value: typings.dateFns.dateFnsNumbers.`0` | `1` | `2`): Self = StObject.set(x, "additionalDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDigitsUndefined: Self = StObject.set(x, "additionalDigits", js.undefined)
  }
}
