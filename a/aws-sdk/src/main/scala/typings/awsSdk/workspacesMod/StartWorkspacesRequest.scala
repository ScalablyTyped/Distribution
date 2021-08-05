package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartWorkspacesRequest extends StObject {
  
  /**
    * The WorkSpaces to start. You can specify up to 25 WorkSpaces.
    */
  var StartWorkspaceRequests: typings.awsSdk.workspacesMod.StartWorkspaceRequests
}
object StartWorkspacesRequest {
  
  inline def apply(StartWorkspaceRequests: StartWorkspaceRequests): StartWorkspacesRequest = {
    val __obj = js.Dynamic.literal(StartWorkspaceRequests = StartWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartWorkspacesRequest]
  }
  
  extension [Self <: StartWorkspacesRequest](x: Self) {
    
    inline def setStartWorkspaceRequests(value: StartWorkspaceRequests): Self = StObject.set(x, "StartWorkspaceRequests", value.asInstanceOf[js.Any])
    
    inline def setStartWorkspaceRequestsVarargs(value: StartRequest*): Self = StObject.set(x, "StartWorkspaceRequests", js.Array(value :_*))
  }
}
