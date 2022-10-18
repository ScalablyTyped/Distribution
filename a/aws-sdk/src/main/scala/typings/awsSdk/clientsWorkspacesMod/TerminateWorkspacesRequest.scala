package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateWorkspacesRequest extends StObject {
  
  /**
    * The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
    */
  var TerminateWorkspaceRequests: typings.awsSdk.clientsWorkspacesMod.TerminateWorkspaceRequests
}
object TerminateWorkspacesRequest {
  
  inline def apply(TerminateWorkspaceRequests: TerminateWorkspaceRequests): TerminateWorkspacesRequest = {
    val __obj = js.Dynamic.literal(TerminateWorkspaceRequests = TerminateWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateWorkspacesRequest]
  }
  
  extension [Self <: TerminateWorkspacesRequest](x: Self) {
    
    inline def setTerminateWorkspaceRequests(value: TerminateWorkspaceRequests): Self = StObject.set(x, "TerminateWorkspaceRequests", value.asInstanceOf[js.Any])
    
    inline def setTerminateWorkspaceRequestsVarargs(value: TerminateRequest*): Self = StObject.set(x, "TerminateWorkspaceRequests", js.Array(value*))
  }
}
