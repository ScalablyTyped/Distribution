package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebuildWorkspacesRequest extends StObject {
  
  /**
    * The WorkSpace to rebuild. You can specify a single WorkSpace.
    */
  var RebuildWorkspaceRequests: typings.awsSdk.clientsWorkspacesMod.RebuildWorkspaceRequests
}
object RebuildWorkspacesRequest {
  
  inline def apply(RebuildWorkspaceRequests: RebuildWorkspaceRequests): RebuildWorkspacesRequest = {
    val __obj = js.Dynamic.literal(RebuildWorkspaceRequests = RebuildWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebuildWorkspacesRequest]
  }
  
  extension [Self <: RebuildWorkspacesRequest](x: Self) {
    
    inline def setRebuildWorkspaceRequests(value: RebuildWorkspaceRequests): Self = StObject.set(x, "RebuildWorkspaceRequests", value.asInstanceOf[js.Any])
    
    inline def setRebuildWorkspaceRequestsVarargs(value: RebuildRequest*): Self = StObject.set(x, "RebuildWorkspaceRequests", js.Array(value*))
  }
}
