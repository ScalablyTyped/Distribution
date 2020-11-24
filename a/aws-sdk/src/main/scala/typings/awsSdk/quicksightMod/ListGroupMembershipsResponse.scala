package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGroupMembershipsResponse extends js.Object {
  
  /**
    * The list of the members of the group.
    */
  var GroupMemberList: js.UndefOr[typings.awsSdk.quicksightMod.GroupMemberList] = js.native
  
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object ListGroupMembershipsResponse {
  
  @scala.inline
  def apply(): ListGroupMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupMembershipsResponse]
  }
  
  @scala.inline
  implicit class ListGroupMembershipsResponseOps[Self <: ListGroupMembershipsResponse] (val x: Self) extends AnyVal {
    
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
    def setGroupMemberListVarargs(value: GroupMember*): Self = this.set("GroupMemberList", js.Array(value :_*))
    
    @scala.inline
    def setGroupMemberList(value: GroupMemberList): Self = this.set("GroupMemberList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupMemberList: Self = this.set("GroupMemberList", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
