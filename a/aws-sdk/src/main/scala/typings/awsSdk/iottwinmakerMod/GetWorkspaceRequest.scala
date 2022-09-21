package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkspaceRequest extends StObject {
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: IdOrArn
}
object GetWorkspaceRequest {
  
  inline def apply(workspaceId: IdOrArn): GetWorkspaceRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkspaceRequest]
  }
  
  extension [Self <: GetWorkspaceRequest](x: Self) {
    
    inline def setWorkspaceId(value: IdOrArn): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
