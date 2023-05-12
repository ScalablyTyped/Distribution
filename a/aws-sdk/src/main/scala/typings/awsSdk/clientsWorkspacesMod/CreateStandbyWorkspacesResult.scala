package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStandbyWorkspacesResult extends StObject {
  
  /**
    * Information about the standby WorkSpace that could not be created. 
    */
  var FailedStandbyRequests: js.UndefOr[FailedCreateStandbyWorkspacesRequestList] = js.undefined
  
  /**
    * Information about the standby WorkSpace that was created.
    */
  var PendingStandbyRequests: js.UndefOr[PendingCreateStandbyWorkspacesRequestList] = js.undefined
}
object CreateStandbyWorkspacesResult {
  
  inline def apply(): CreateStandbyWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStandbyWorkspacesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStandbyWorkspacesResult] (val x: Self) extends AnyVal {
    
    inline def setFailedStandbyRequests(value: FailedCreateStandbyWorkspacesRequestList): Self = StObject.set(x, "FailedStandbyRequests", value.asInstanceOf[js.Any])
    
    inline def setFailedStandbyRequestsUndefined: Self = StObject.set(x, "FailedStandbyRequests", js.undefined)
    
    inline def setFailedStandbyRequestsVarargs(value: FailedCreateStandbyWorkspacesRequest*): Self = StObject.set(x, "FailedStandbyRequests", js.Array(value*))
    
    inline def setPendingStandbyRequests(value: PendingCreateStandbyWorkspacesRequestList): Self = StObject.set(x, "PendingStandbyRequests", value.asInstanceOf[js.Any])
    
    inline def setPendingStandbyRequestsUndefined: Self = StObject.set(x, "PendingStandbyRequests", js.undefined)
    
    inline def setPendingStandbyRequestsVarargs(value: PendingCreateStandbyWorkspacesRequest*): Self = StObject.set(x, "PendingStandbyRequests", js.Array(value*))
  }
}
