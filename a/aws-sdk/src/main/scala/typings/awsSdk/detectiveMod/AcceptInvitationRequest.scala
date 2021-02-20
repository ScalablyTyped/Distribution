package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptInvitationRequest extends StObject {
  
  /**
    * The ARN of the behavior graph that the member account is accepting the invitation for. The member account status in the behavior graph must be INVITED.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn = js.native
}
object AcceptInvitationRequest {
  
  @scala.inline
  def apply(GraphArn: GraphArn): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
  
  @scala.inline
  implicit class AcceptInvitationRequestMutableBuilder[Self <: AcceptInvitationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
