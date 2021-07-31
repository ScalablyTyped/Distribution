package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BonusPayment extends StObject {
  
  /**
    * The ID of the assignment associated with this bonus payment.
    */
  var AssignmentId: js.UndefOr[EntityId] = js.undefined
  
  var BonusAmount: js.UndefOr[CurrencyAmount] = js.undefined
  
  /**
    * The date and time of when the bonus was granted.
    */
  var GrantTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Reason text given when the bonus was granted, if any.
    */
  var Reason: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Worker to whom the bonus was paid.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.undefined
}
object BonusPayment {
  
  @scala.inline
  def apply(): BonusPayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BonusPayment]
  }
  
  @scala.inline
  implicit class BonusPaymentMutableBuilder[Self <: BonusPayment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentId(value: EntityId): Self = StObject.set(x, "AssignmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentIdUndefined: Self = StObject.set(x, "AssignmentId", js.undefined)
    
    @scala.inline
    def setBonusAmount(value: CurrencyAmount): Self = StObject.set(x, "BonusAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBonusAmountUndefined: Self = StObject.set(x, "BonusAmount", js.undefined)
    
    @scala.inline
    def setGrantTime(value: Timestamp): Self = StObject.set(x, "GrantTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantTimeUndefined: Self = StObject.set(x, "GrantTime", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    @scala.inline
    def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdUndefined: Self = StObject.set(x, "WorkerId", js.undefined)
  }
}
