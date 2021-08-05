package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchStatus extends StObject {
  
  /**
    * The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).
    */
  var ApprovalDate: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The compliance severity level for a patch.
    */
  var ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined
  
  /**
    * The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
    */
  var DeploymentStatus: js.UndefOr[PatchDeploymentStatus] = js.undefined
}
object PatchStatus {
  
  inline def apply(): PatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchStatus]
  }
  
  extension [Self <: PatchStatus](x: Self) {
    
    inline def setApprovalDate(value: DateTime): Self = StObject.set(x, "ApprovalDate", value.asInstanceOf[js.Any])
    
    inline def setApprovalDateUndefined: Self = StObject.set(x, "ApprovalDate", js.undefined)
    
    inline def setComplianceLevel(value: PatchComplianceLevel): Self = StObject.set(x, "ComplianceLevel", value.asInstanceOf[js.Any])
    
    inline def setComplianceLevelUndefined: Self = StObject.set(x, "ComplianceLevel", js.undefined)
    
    inline def setDeploymentStatus(value: PatchDeploymentStatus): Self = StObject.set(x, "DeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusUndefined: Self = StObject.set(x, "DeploymentStatus", js.undefined)
  }
}
