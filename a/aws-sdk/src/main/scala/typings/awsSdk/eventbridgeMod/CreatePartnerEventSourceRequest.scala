package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePartnerEventSourceRequest extends js.Object {
  /**
    * The AWS account ID of the customer who is permitted to create a matching partner event bus for this partner event source.
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
}

