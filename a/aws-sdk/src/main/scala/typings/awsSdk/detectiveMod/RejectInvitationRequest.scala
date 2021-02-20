package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectInvitationRequest extends StObject {
  
  /**
    * The ARN of the behavior graph to reject the invitation to. The member account's current member status in the behavior graph must be INVITED.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn = js.native
}
object RejectInvitationRequest {
  
  @scala.inline
  def apply(GraphArn: GraphArn): RejectInvitationRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectInvitationRequest]
  }
  
  @scala.inline
  implicit class RejectInvitationRequestMutableBuilder[Self <: RejectInvitationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
