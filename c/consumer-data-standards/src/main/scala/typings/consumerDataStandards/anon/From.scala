package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.INACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.SKIP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Object containing details of the source of the payment. Currently only specifies an account ID but provided as an object to facilitate future extensibility and consistency with the to object
    */
  var from: AccountId
  
  /**
    * The short display name of the scheduled payment as provided by the customer if provided. Where a customer has not provided a nickname, a display name derived by the bank for the scheduled payment should be provided that is consistent with existing digital banking channels
    */
  var nickname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reference for the transaction, if applicable, that will be provided by the originating institution for all payments in the payment set. Empty string if no data provided
    */
  var payeeReference: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reference for the transaction that will be used by the originating institution for the purposes of constructing a statement narrative on the payer’s account. Empty string if no data provided
    */
  var payerReference: String
  
  var paymentSet: js.Array[Currency]
  
  /**
    * Object containing the detail of the schedule for the payment
    */
  var recurrence: EventBased
  
  /**
    * A unique ID of the scheduled payment adhering to the standards for ID permanence
    */
  var scheduledPaymentId: String
  
  /**
    * Indicates whether the schedule is currently active. The value SKIP is equivalent to ACTIVE except that the customer has requested the next normal occurrence to be skipped.
    */
  var status: ACTIVE | INACTIVE | SKIP
}
object From {
  
  inline def apply(
    from: AccountId,
    payerReference: String,
    paymentSet: js.Array[Currency],
    recurrence: EventBased,
    scheduledPaymentId: String,
    status: ACTIVE | INACTIVE | SKIP
  ): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], payerReference = payerReference.asInstanceOf[js.Any], paymentSet = paymentSet.asInstanceOf[js.Any], recurrence = recurrence.asInstanceOf[js.Any], scheduledPaymentId = scheduledPaymentId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: AccountId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameNull: Self = StObject.set(x, "nickname", null)
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setPayeeReference(value: String): Self = StObject.set(x, "payeeReference", value.asInstanceOf[js.Any])
    
    inline def setPayeeReferenceNull: Self = StObject.set(x, "payeeReference", null)
    
    inline def setPayeeReferenceUndefined: Self = StObject.set(x, "payeeReference", js.undefined)
    
    inline def setPayerReference(value: String): Self = StObject.set(x, "payerReference", value.asInstanceOf[js.Any])
    
    inline def setPaymentSet(value: js.Array[Currency]): Self = StObject.set(x, "paymentSet", value.asInstanceOf[js.Any])
    
    inline def setPaymentSetVarargs(value: Currency*): Self = StObject.set(x, "paymentSet", js.Array(value*))
    
    inline def setRecurrence(value: EventBased): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    inline def setScheduledPaymentId(value: String): Self = StObject.set(x, "scheduledPaymentId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ACTIVE | INACTIVE | SKIP): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
