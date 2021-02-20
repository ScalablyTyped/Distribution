package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartWorkspacesRequest extends StObject {
  
  /**
    * The WorkSpaces to start. You can specify up to 25 WorkSpaces.
    */
  var StartWorkspaceRequests: typings.awsSdk.workspacesMod.StartWorkspaceRequests = js.native
}
object StartWorkspacesRequest {
  
  @scala.inline
  def apply(StartWorkspaceRequests: StartWorkspaceRequests): StartWorkspacesRequest = {
    val __obj = js.Dynamic.literal(StartWorkspaceRequests = StartWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartWorkspacesRequest]
  }
  
  @scala.inline
  implicit class StartWorkspacesRequestMutableBuilder[Self <: StartWorkspacesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartWorkspaceRequests(value: StartWorkspaceRequests): Self = StObject.set(x, "StartWorkspaceRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartWorkspaceRequestsVarargs(value: StartRequest*): Self = StObject.set(x, "StartWorkspaceRequests", js.Array(value :_*))
  }
}
