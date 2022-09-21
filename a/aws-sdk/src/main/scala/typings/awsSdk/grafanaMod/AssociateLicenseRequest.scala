package typings.awsSdk.grafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateLicenseRequest extends StObject {
  
  /**
    * The type of license to associate with the workspace.
    */
  var licenseType: LicenseType
  
  /**
    * The ID of the workspace to associate the license with.
    */
  var workspaceId: WorkspaceId
}
object AssociateLicenseRequest {
  
  inline def apply(licenseType: LicenseType, workspaceId: WorkspaceId): AssociateLicenseRequest = {
    val __obj = js.Dynamic.literal(licenseType = licenseType.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateLicenseRequest]
  }
  
  extension [Self <: AssociateLicenseRequest](x: Self) {
    
    inline def setLicenseType(value: LicenseType): Self = StObject.set(x, "licenseType", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
