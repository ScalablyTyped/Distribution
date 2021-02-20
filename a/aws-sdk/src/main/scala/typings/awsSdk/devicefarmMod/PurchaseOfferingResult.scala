package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseOfferingResult extends StObject {
  
  /**
    * Represents the offering transaction for the purchase result.
    */
  var offeringTransaction: js.UndefOr[OfferingTransaction] = js.native
}
object PurchaseOfferingResult {
  
  @scala.inline
  def apply(): PurchaseOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseOfferingResult]
  }
  
  @scala.inline
  implicit class PurchaseOfferingResultMutableBuilder[Self <: PurchaseOfferingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOfferingTransaction(value: OfferingTransaction): Self = StObject.set(x, "offeringTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingTransactionUndefined: Self = StObject.set(x, "offeringTransaction", js.undefined)
  }
}
