package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateMembershipRequest extends js.Object {
  
  /**
    * The ARN of the behavior graph to remove the member account from. The member account's member status in the behavior graph must be ENABLED.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn = js.native
}
object DisassociateMembershipRequest {
  
  @scala.inline
  def apply(GraphArn: GraphArn): DisassociateMembershipRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMembershipRequest]
  }
  
  @scala.inline
  implicit class DisassociateMembershipRequestOps[Self <: DisassociateMembershipRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGraphArn(value: GraphArn): Self = this.set("GraphArn", value.asInstanceOf[js.Any])
  }
}
