package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebuildRequest extends StObject {
  
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsSdk.clientsWorkspacesMod.WorkspaceId
}
object RebuildRequest {
  
  inline def apply(WorkspaceId: WorkspaceId): RebuildRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebuildRequest]
  }
  
  extension [Self <: RebuildRequest](x: Self) {
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
  }
}
