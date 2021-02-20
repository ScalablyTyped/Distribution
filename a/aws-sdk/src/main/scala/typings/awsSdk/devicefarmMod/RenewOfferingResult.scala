package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenewOfferingResult extends StObject {
  
  /**
    * Represents the status of the offering transaction for the renewal.
    */
  var offeringTransaction: js.UndefOr[OfferingTransaction] = js.native
}
object RenewOfferingResult {
  
  @scala.inline
  def apply(): RenewOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewOfferingResult]
  }
  
  @scala.inline
  implicit class RenewOfferingResultMutableBuilder[Self <: RenewOfferingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOfferingTransaction(value: OfferingTransaction): Self = StObject.set(x, "offeringTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingTransactionUndefined: Self = StObject.set(x, "offeringTransaction", js.undefined)
  }
}
