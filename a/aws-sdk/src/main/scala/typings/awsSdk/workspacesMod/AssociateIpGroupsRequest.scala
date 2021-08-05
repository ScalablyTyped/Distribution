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
  
  inline def apply(DirectoryId: DirectoryId, GroupIds: IpGroupIdList): AssociateIpGroupsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], GroupIds = GroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateIpGroupsRequest]
  }
  
  extension [Self <: AssociateIpGroupsRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setGroupIds(value: IpGroupIdList): Self = StObject.set(x, "GroupIds", value.asInstanceOf[js.Any])
    
    inline def setGroupIdsVarargs(value: IpGroupId*): Self = StObject.set(x, "GroupIds", js.Array(value :_*))
  }
}
