package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseOfferingResult extends StObject {
  
  /**
    * Represents the offering transaction for the purchase result.
    */
  var offeringTransaction: js.UndefOr[OfferingTransaction] = js.undefined
}
object PurchaseOfferingResult {
  
  inline def apply(): PurchaseOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseOfferingResult]
  }
  
  extension [Self <: PurchaseOfferingResult](x: Self) {
    
    inline def setOfferingTransaction(value: OfferingTransaction): Self = StObject.set(x, "offeringTransaction", value.asInstanceOf[js.Any])
    
    inline def setOfferingTransactionUndefined: Self = StObject.set(x, "offeringTransaction", js.undefined)
  }
}
