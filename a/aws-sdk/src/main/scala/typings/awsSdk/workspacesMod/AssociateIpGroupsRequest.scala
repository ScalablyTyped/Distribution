package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateIpGroupsRequest extends StObject {
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.workspacesMod.DirectoryId
  
  /**
    * The identifiers of one or more IP access control groups.
    */
  var GroupIds: IpGroupIdList
}
object AssociateIpGroupsRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, GroupIds: IpGroupIdList): AssociateIpGroupsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], GroupIds = GroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateIpGroupsRequest]
  }
  
  @scala.inline
  implicit class AssociateIpGroupsRequestMutableBuilder[Self <: AssociateIpGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIds(value: IpGroupIdList): Self = StObject.set(x, "GroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdsVarargs(value: IpGroupId*): Self = StObject.set(x, "GroupIds", js.Array(value :_*))
  }
}
