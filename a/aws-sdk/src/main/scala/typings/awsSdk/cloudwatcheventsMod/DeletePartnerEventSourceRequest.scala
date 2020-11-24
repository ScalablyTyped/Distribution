package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePartnerEventSourceRequest extends js.Object {
  
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
  implicit class DeletePartnerEventSourceRequestOps[Self <: DeletePartnerEventSourceRequest] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: AccountId): Self = this.set("Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: EventSourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
