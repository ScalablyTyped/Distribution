package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerEventSourceAccount extends StObject {
  
  /**
    * The AWS account ID that the partner event source was offered to.
    */
  var Account: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The date and time the event source was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The date and time that the event source will expire, if the AWS account doesn't create a matching event bus for it.
    */
  var ExpirationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The state of the event source. If it is ACTIVE, you have already created a matching event bus for this event source, and that event bus is active. If it is PENDING, either you haven't yet created a matching event bus, or that event bus is deactivated. If it is DELETED, you have created a matching event bus, but the event source has since been deleted.
    */
  var State: js.UndefOr[EventSourceState] = js.undefined
}
object PartnerEventSourceAccount {
  
  inline def apply(): PartnerEventSourceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerEventSourceAccount]
  }
  
  extension [Self <: PartnerEventSourceAccount](x: Self) {
    
    inline def setAccount(value: AccountId): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setExpirationTime(value: Timestamp): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    inline def setState(value: EventSourceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
