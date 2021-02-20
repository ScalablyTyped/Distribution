package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnerEventSourceAccount extends StObject {
  
  /**
    * The AWS account ID that the partner event source was offered to.
    */
  var Account: js.UndefOr[AccountId] = js.native
  
  /**
    * The date and time the event source was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The date and time that the event source will expire, if the AWS account doesn't create a matching event bus for it.
    */
  var ExpirationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The state of the event source. If it is ACTIVE, you have already created a matching event bus for this event source, and that event bus is active. If it is PENDING, either you haven't yet created a matching event bus, or that event bus is deactivated. If it is DELETED, you have created a matching event bus, but the event source has since been deleted.
    */
  var State: js.UndefOr[EventSourceState] = js.native
}
object PartnerEventSourceAccount {
  
  @scala.inline
  def apply(): PartnerEventSourceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerEventSourceAccount]
  }
  
  @scala.inline
  implicit class PartnerEventSourceAccountMutableBuilder[Self <: PartnerEventSourceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: AccountId): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: Timestamp): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    @scala.inline
    def setState(value: EventSourceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
