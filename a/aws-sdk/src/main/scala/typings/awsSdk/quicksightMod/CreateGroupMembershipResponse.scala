package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGroupMembershipResponse extends StObject {
  
  /**
    * The group member.
    */
  var GroupMember: js.UndefOr[typings.awsSdk.quicksightMod.GroupMember] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object CreateGroupMembershipResponse {
  
  @scala.inline
  def apply(): CreateGroupMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGroupMembershipResponse]
  }
  
  @scala.inline
  implicit class CreateGroupMembershipResponseMutableBuilder[Self <: CreateGroupMembershipResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupMember(value: GroupMember): Self = StObject.set(x, "GroupMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupMemberUndefined: Self = StObject.set(x, "GroupMember", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
