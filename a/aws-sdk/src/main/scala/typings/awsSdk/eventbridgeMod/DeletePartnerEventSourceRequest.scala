package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePartnerEventSourceRequest extends StObject {
  
  /**
    * The AWS account ID of the AWS customer that the event source was created for.
    */
  var Account: AccountId = js.native
  
  /**
    * The name of the event source to delete.
    */
  var Name: EventSourceName = js.native
}
object DeletePartnerEventSourceRequest {
  
  @scala.inline
  def apply(Account: AccountId, Name: EventSourceName): DeletePartnerEventSourceRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePartnerEventSourceRequest]
  }
  
  @scala.inline
  implicit class DeletePartnerEventSourceRequestMutableBuilder[Self <: DeletePartnerEventSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: AccountId): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: EventSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
