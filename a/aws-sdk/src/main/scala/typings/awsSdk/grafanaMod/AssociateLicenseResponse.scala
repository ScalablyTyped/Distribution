package typings.awsSdk.grafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateLicenseResponse extends StObject {
  
  /**
    * A structure containing data about the workspace.
    */
  var workspace: WorkspaceDescription
}
object AssociateLicenseResponse {
  
  inline def apply(workspace: WorkspaceDescription): AssociateLicenseResponse = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateLicenseResponse]
  }
  
  extension [Self <: AssociateLicenseResponse](x: Self) {
    
    inline def setWorkspace(value: WorkspaceDescription): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
  }
}
