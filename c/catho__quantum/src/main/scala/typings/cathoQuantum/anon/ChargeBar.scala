package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChargeBar extends StObject {
  
  var chargeBar: js.UndefOr[js.Object] = js.undefined
}
object ChargeBar {
  
  inline def apply(): ChargeBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChargeBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChargeBar] (val x: Self) extends AnyVal {
    
    inline def setChargeBar(value: js.Object): Self = StObject.set(x, "chargeBar", value.asInstanceOf[js.Any])
    
    inline def setChargeBarUndefined: Self = StObject.set(x, "chargeBar", js.undefined)
  }
}
