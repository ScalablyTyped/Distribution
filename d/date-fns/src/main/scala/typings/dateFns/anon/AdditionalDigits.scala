package typings.dateFns.anon

import typings.dateFns.dateFnsInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalDigits extends StObject {
  
  var additionalDigits: js.UndefOr[typings.dateFns.dateFnsInts.`0` | typings.dateFns.dateFnsInts.`1` | `2`] = js.undefined
}
object AdditionalDigits {
  
  inline def apply(): AdditionalDigits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalDigits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalDigits] (val x: Self) extends AnyVal {
    
    inline def setAdditionalDigits(value: typings.dateFns.dateFnsInts.`0` | typings.dateFns.dateFnsInts.`1` | `2`): Self = StObject.set(x, "additionalDigits", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDigitsUndefined: Self = StObject.set(x, "additionalDigits", js.undefined)
  }
}
