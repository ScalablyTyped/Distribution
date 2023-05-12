package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingCreateStandbyWorkspacesRequest extends StObject {
  
  /**
    * The identifier of the directory for the standby WorkSpace.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.DirectoryId] = js.undefined
  
  /**
    * The operational state of the standby WorkSpace.
    */
  var State: js.UndefOr[WorkspaceState] = js.undefined
  
  /**
    * Describes the standby WorkSpace that was created. Because this operation is asynchronous, the identifier returned is not immediately available for use with other operations. For example, if you call  DescribeWorkspaces before the WorkSpace is created, the information returned can be incomplete. 
    */
  var UserName: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.UserName] = js.undefined
  
  /**
    * The identifier of the standby WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.WorkspaceId] = js.undefined
}
object PendingCreateStandbyWorkspacesRequest {
  
  inline def apply(): PendingCreateStandbyWorkspacesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingCreateStandbyWorkspacesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PendingCreateStandbyWorkspacesRequest] (val x: Self) extends AnyVal {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setState(value: WorkspaceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "WorkspaceId", js.undefined)
  }
}
