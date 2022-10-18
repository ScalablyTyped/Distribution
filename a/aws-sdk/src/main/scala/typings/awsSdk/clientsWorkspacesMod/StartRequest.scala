package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRequest extends StObject {
  
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.WorkspaceId] = js.undefined
}
object StartRequest {
  
  inline def apply(): StartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRequest]
  }
  
  extension [Self <: StartRequest](x: Self) {
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "WorkspaceId", js.undefined)
  }
}
