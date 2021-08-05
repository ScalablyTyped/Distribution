package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Total extends StObject {
  
  /**
    * The total usage.
    */
  var Amount: js.UndefOr[String] = js.undefined
  
  /**
    * The currency unit that the amount is given in.
    */
  var Unit: js.UndefOr[String] = js.undefined
}
object Total {
  
  inline def apply(): Total = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Total]
  }
  
  extension [Self <: Total](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "Amount", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
