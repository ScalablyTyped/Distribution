package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfferingTransaction extends js.Object {
  
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
  implicit class OfferingTransactionOps[Self <: OfferingTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCost(value: MonetaryAmount): Self = this.set("cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCost: Self = this.set("cost", js.undefined)
    
    @scala.inline
    def setCreatedOn(value: DateTime): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedOn: Self = this.set("createdOn", js.undefined)
    
    @scala.inline
    def setOfferingPromotionId(value: OfferingPromotionIdentifier): Self = this.set("offeringPromotionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingPromotionId: Self = this.set("offeringPromotionId", js.undefined)
    
    @scala.inline
    def setOfferingStatus(value: OfferingStatus): Self = this.set("offeringStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingStatus: Self = this.set("offeringStatus", js.undefined)
    
    @scala.inline
    def setTransactionId(value: TransactionIdentifier): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
  }
}
