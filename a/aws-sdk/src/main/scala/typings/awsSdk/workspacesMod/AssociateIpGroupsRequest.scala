package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateIpGroupsRequest extends js.Object {
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.workspacesMod.DirectoryId = js.native
  
  /**
    * The identifiers of one or more IP access control groups.
    */
  var GroupIds: IpGroupIdList = js.native
}
object AssociateIpGroupsRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, GroupIds: IpGroupIdList): AssociateIpGroupsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], GroupIds = GroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateIpGroupsRequest]
  }
  
  @scala.inline
  implicit class AssociateIpGroupsRequestOps[Self <: AssociateIpGroupsRequest] (val x: Self) extends AnyVal {
    
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
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdsVarargs(value: IpGroupId*): Self = this.set("GroupIds", js.Array(value :_*))
    
    @scala.inline
    def setGroupIds(value: IpGroupIdList): Self = this.set("GroupIds", value.asInstanceOf[js.Any])
  }
}
