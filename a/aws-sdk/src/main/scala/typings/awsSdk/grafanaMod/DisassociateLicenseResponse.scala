package typings.awsSdk.grafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateLicenseResponse extends StObject {
  
  /**
    * A structure containing information about the workspace.
    */
  var workspace: WorkspaceDescription
}
object DisassociateLicenseResponse {
  
  inline def apply(workspace: WorkspaceDescription): DisassociateLicenseResponse = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateLicenseResponse]
  }
  
  extension [Self <: DisassociateLicenseResponse](x: Self) {
    
    inline def setWorkspace(value: WorkspaceDescription): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
  }
}
