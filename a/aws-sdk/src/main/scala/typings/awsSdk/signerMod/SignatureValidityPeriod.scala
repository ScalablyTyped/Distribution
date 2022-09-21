package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureValidityPeriod extends StObject {
  
  /**
    * The time unit for signature validity.
    */
  var `type`: js.UndefOr[ValidityType] = js.undefined
  
  /**
    * The numerical value of the time unit for signature validity.
    */
  var value: js.UndefOr[Integer] = js.undefined
}
object SignatureValidityPeriod {
  
  inline def apply(): SignatureValidityPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureValidityPeriod]
  }
  
  extension [Self <: SignatureValidityPeriod](x: Self) {
    
    inline def setType(value: ValidityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Integer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
