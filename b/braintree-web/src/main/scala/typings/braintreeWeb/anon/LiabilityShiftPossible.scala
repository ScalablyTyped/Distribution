package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiabilityShiftPossible extends StObject {
  
  var liabilityShiftPossible: Boolean
  
  var liabilityShifted: Boolean
}
object LiabilityShiftPossible {
  
  inline def apply(liabilityShiftPossible: Boolean, liabilityShifted: Boolean): LiabilityShiftPossible = {
    val __obj = js.Dynamic.literal(liabilityShiftPossible = liabilityShiftPossible.asInstanceOf[js.Any], liabilityShifted = liabilityShifted.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiabilityShiftPossible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiabilityShiftPossible] (val x: Self) extends AnyVal {
    
    inline def setLiabilityShiftPossible(value: Boolean): Self = StObject.set(x, "liabilityShiftPossible", value.asInstanceOf[js.Any])
    
    inline def setLiabilityShifted(value: Boolean): Self = StObject.set(x, "liabilityShifted", value.asInstanceOf[js.Any])
  }
}
