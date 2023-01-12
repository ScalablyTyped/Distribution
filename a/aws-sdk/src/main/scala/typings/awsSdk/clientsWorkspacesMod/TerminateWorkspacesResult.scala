package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateWorkspacesResult extends StObject {
  
  /**
    * Information about the WorkSpaces that could not be terminated.
    */
  var FailedRequests: js.UndefOr[FailedTerminateWorkspaceRequests] = js.undefined
}
object TerminateWorkspacesResult {
  
  inline def apply(): TerminateWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateWorkspacesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminateWorkspacesResult] (val x: Self) extends AnyVal {
    
    inline def setFailedRequests(value: FailedTerminateWorkspaceRequests): Self = StObject.set(x, "FailedRequests", value.asInstanceOf[js.Any])
    
    inline def setFailedRequestsUndefined: Self = StObject.set(x, "FailedRequests", js.undefined)
    
    inline def setFailedRequestsVarargs(value: FailedWorkspaceChangeRequest*): Self = StObject.set(x, "FailedRequests", js.Array(value*))
  }
}
