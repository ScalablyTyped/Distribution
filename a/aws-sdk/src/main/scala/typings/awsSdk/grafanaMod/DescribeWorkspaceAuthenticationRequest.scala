package typings.awsSdk.grafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceAuthenticationRequest extends StObject {
  
  /**
    * The ID of the workspace to return authentication information about.
    */
  var workspaceId: WorkspaceId
}
object DescribeWorkspaceAuthenticationRequest {
  
  inline def apply(workspaceId: WorkspaceId): DescribeWorkspaceAuthenticationRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceAuthenticationRequest]
  }
  
  extension [Self <: DescribeWorkspaceAuthenticationRequest](x: Self) {
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
