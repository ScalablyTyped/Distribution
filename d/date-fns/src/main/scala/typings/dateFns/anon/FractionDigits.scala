package typings.dateFns.anon

import typings.dateFns.dateFnsInts.`2`
import typings.dateFns.dateFnsInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FractionDigits extends StObject {
  
  var fractionDigits: js.UndefOr[typings.dateFns.dateFnsInts.`0` | typings.dateFns.dateFnsInts.`1` | `2` | `3`] = js.undefined
}
object FractionDigits {
  
  inline def apply(): FractionDigits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FractionDigits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FractionDigits] (val x: Self) extends AnyVal {
    
    inline def setFractionDigits(value: typings.dateFns.dateFnsInts.`0` | typings.dateFns.dateFnsInts.`1` | `2` | `3`): Self = StObject.set(x, "fractionDigits", value.asInstanceOf[js.Any])
    
    inline def setFractionDigitsUndefined: Self = StObject.set(x, "fractionDigits", js.undefined)
  }
}
