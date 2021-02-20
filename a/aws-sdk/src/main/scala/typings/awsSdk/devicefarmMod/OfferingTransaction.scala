package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfferingTransaction extends StObject {
  
  /**
    * The cost of an offering transaction.
    */
  var cost: js.UndefOr[MonetaryAmount] = js.native
  
  /**
    * The date on which an offering transaction was created.
    */
  var createdOn: js.UndefOr[DateTime] = js.native
  
  /**
    * The ID that corresponds to a device offering promotion.
    */
  var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.native
  
  /**
    * The status of an offering transaction.
    */
  var offeringStatus: js.UndefOr[OfferingStatus] = js.native
  
  /**
    * The transaction ID of the offering transaction.
    */
  var transactionId: js.UndefOr[TransactionIdentifier] = js.native
}
object OfferingTransaction {
  
  @scala.inline
  def apply(): OfferingTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferingTransaction]
  }
  
  @scala.inline
  implicit class OfferingTransactionMutableBuilder[Self <: OfferingTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCost(value: MonetaryAmount): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    @scala.inline
    def setCreatedOn(value: DateTime): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOnUndefined: Self = StObject.set(x, "createdOn", js.undefined)
    
    @scala.inline
    def setOfferingPromotionId(value: OfferingPromotionIdentifier): Self = StObject.set(x, "offeringPromotionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingPromotionIdUndefined: Self = StObject.set(x, "offeringPromotionId", js.undefined)
    
    @scala.inline
    def setOfferingStatus(value: OfferingStatus): Self = StObject.set(x, "offeringStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingStatusUndefined: Self = StObject.set(x, "offeringStatus", js.undefined)
    
    @scala.inline
    def setTransactionId(value: TransactionIdentifier): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
