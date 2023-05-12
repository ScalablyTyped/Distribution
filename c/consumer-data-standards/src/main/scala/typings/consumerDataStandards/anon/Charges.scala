package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Charges
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Charges for metering included in the plan
    */
  var charges: js.Array[MinimumValue]
}
object Charges {
  
  inline def apply(charges: js.Array[MinimumValue]): Charges = {
    val __obj = js.Dynamic.literal(charges = charges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Charges] (val x: Self) extends AnyVal {
    
    inline def setCharges(value: js.Array[MinimumValue]): Self = StObject.set(x, "charges", value.asInstanceOf[js.Any])
    
    inline def setChargesVarargs(value: MinimumValue*): Self = StObject.set(x, "charges", js.Array(value*))
  }
}
