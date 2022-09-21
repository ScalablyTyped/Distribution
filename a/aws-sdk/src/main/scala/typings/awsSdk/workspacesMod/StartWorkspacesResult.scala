package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartWorkspacesResult extends StObject {
  
  /**
    * Information about the WorkSpaces that could not be started.
    */
  var FailedRequests: js.UndefOr[FailedStartWorkspaceRequests] = js.undefined
}
object StartWorkspacesResult {
  
  inline def apply(): StartWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartWorkspacesResult]
  }
  
  extension [Self <: StartWorkspacesResult](x: Self) {
    
    inline def setFailedRequests(value: FailedStartWorkspaceRequests): Self = StObject.set(x, "FailedRequests", value.asInstanceOf[js.Any])
    
    inline def setFailedRequestsUndefined: Self = StObject.set(x, "FailedRequests", js.undefined)
    
    inline def setFailedRequestsVarargs(value: FailedWorkspaceChangeRequest*): Self = StObject.set(x, "FailedRequests", js.Array(value*))
  }
}
