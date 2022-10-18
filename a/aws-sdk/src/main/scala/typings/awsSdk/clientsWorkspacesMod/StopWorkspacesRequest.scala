package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopWorkspacesRequest extends StObject {
  
  /**
    * The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
    */
  var StopWorkspaceRequests: typings.awsSdk.clientsWorkspacesMod.StopWorkspaceRequests
}
object StopWorkspacesRequest {
  
  inline def apply(StopWorkspaceRequests: StopWorkspaceRequests): StopWorkspacesRequest = {
    val __obj = js.Dynamic.literal(StopWorkspaceRequests = StopWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopWorkspacesRequest]
  }
  
  extension [Self <: StopWorkspacesRequest](x: Self) {
    
    inline def setStopWorkspaceRequests(value: StopWorkspaceRequests): Self = StObject.set(x, "StopWorkspaceRequests", value.asInstanceOf[js.Any])
    
    inline def setStopWorkspaceRequestsVarargs(value: StopRequest*): Self = StObject.set(x, "StopWorkspaceRequests", js.Array(value*))
  }
}
