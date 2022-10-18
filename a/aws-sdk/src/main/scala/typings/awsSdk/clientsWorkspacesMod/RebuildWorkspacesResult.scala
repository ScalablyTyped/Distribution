package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebuildWorkspacesResult extends StObject {
  
  /**
    * Information about the WorkSpace that could not be rebuilt.
    */
  var FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests] = js.undefined
}
object RebuildWorkspacesResult {
  
  inline def apply(): RebuildWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebuildWorkspacesResult]
  }
  
  extension [Self <: RebuildWorkspacesResult](x: Self) {
    
    inline def setFailedRequests(value: FailedRebuildWorkspaceRequests): Self = StObject.set(x, "FailedRequests", value.asInstanceOf[js.Any])
    
    inline def setFailedRequestsUndefined: Self = StObject.set(x, "FailedRequests", js.undefined)
    
    inline def setFailedRequestsVarargs(value: FailedWorkspaceChangeRequest*): Self = StObject.set(x, "FailedRequests", js.Array(value*))
  }
}
