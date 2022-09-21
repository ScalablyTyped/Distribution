package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootWorkspacesResult extends StObject {
  
  /**
    * Information about the WorkSpaces that could not be rebooted.
    */
  var FailedRequests: js.UndefOr[FailedRebootWorkspaceRequests] = js.undefined
}
object RebootWorkspacesResult {
  
  inline def apply(): RebootWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootWorkspacesResult]
  }
  
  extension [Self <: RebootWorkspacesResult](x: Self) {
    
    inline def setFailedRequests(value: FailedRebootWorkspaceRequests): Self = StObject.set(x, "FailedRequests", value.asInstanceOf[js.Any])
    
    inline def setFailedRequestsUndefined: Self = StObject.set(x, "FailedRequests", js.undefined)
    
    inline def setFailedRequestsVarargs(value: FailedWorkspaceChangeRequest*): Self = StObject.set(x, "FailedRequests", js.Array(value*))
  }
}
