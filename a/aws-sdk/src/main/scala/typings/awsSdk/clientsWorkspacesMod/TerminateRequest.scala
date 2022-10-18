package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateRequest extends StObject {
  
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsSdk.clientsWorkspacesMod.WorkspaceId
}
object TerminateRequest {
  
  inline def apply(WorkspaceId: WorkspaceId): TerminateRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateRequest]
  }
  
  extension [Self <: TerminateRequest](x: Self) {
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
  }
}
