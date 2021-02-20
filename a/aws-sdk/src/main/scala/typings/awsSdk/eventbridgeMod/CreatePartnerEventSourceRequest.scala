package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePartnerEventSourceRequest extends StObject {
  
  /**
    * The AWS account ID that is permitted to create a matching partner event bus for this partner event source.
    */
  var Account: AccountId = js.native
  
  /**
    * The name of the partner event source. This name must be unique and must be in the format  partner_name/event_namespace/event_name . The AWS account that wants to use this partner event source must create a partner event bus with a name that matches the name of the partner event source.
    */
  var Name: EventSourceName = js.native
}
object CreatePartnerEventSourceRequest {
  
  @scala.inline
  def apply(Account: AccountId, Name: EventSourceName): CreatePartnerEventSourceRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePartnerEventSourceRequest]
  }
  
  @scala.inline
  implicit class CreatePartnerEventSourceRequestMutableBuilder[Self <: CreatePartnerEventSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: AccountId): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: EventSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
