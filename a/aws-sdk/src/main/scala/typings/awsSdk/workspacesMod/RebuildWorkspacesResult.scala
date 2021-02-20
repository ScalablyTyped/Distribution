package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebuildWorkspacesResult extends StObject {
  
  /**
    * Information about the WorkSpace that could not be rebuilt.
    */
  var FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests] = js.native
}
object RebuildWorkspacesResult {
  
  @scala.inline
  def apply(): RebuildWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebuildWorkspacesResult]
  }
  
  @scala.inline
  implicit class RebuildWorkspacesResultMutableBuilder[Self <: RebuildWorkspacesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedRequests(value: FailedRebuildWorkspaceRequests): Self = StObject.set(x, "FailedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedRequestsUndefined: Self = StObject.set(x, "FailedRequests", js.undefined)
    
    @scala.inline
    def setFailedRequestsVarargs(value: FailedWorkspaceChangeRequest*): Self = StObject.set(x, "FailedRequests", js.Array(value :_*))
  }
}
