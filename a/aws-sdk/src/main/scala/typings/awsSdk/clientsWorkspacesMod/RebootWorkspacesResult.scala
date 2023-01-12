package typings.awsSdk.clientsWorkspacesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RebootWorkspacesResult] (val x: Self) extends AnyVal {
    
    inline def setFailedRequests(value: FailedRebootWorkspaceRequests): Self = StObject.set(x, "FailedRequests", value.asInstanceOf[js.Any])
    
    inline def setFailedRequestsUndefined: Self = StObject.set(x, "FailedRequests", js.undefined)
    
    inline def setFailedRequestsVarargs(value: FailedWorkspaceChangeRequest*): Self = StObject.set(x, "FailedRequests", js.Array(value*))
  }
}
