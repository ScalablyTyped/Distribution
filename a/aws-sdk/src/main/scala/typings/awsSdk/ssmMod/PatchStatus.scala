package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchStatus extends StObject {
  
  /**
    * The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).
    */
  var ApprovalDate: js.UndefOr[DateTime] = js.native
  
  /**
    * The compliance severity level for a patch.
    */
  var ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  
  /**
    * The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
    */
  var DeploymentStatus: js.UndefOr[PatchDeploymentStatus] = js.native
}
object PatchStatus {
  
  @scala.inline
  def apply(): PatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchStatus]
  }
  
  @scala.inline
  implicit class PatchStatusMutableBuilder[Self <: PatchStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalDate(value: DateTime): Self = StObject.set(x, "ApprovalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalDateUndefined: Self = StObject.set(x, "ApprovalDate", js.undefined)
    
    @scala.inline
    def setComplianceLevel(value: PatchComplianceLevel): Self = StObject.set(x, "ComplianceLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceLevelUndefined: Self = StObject.set(x, "ComplianceLevel", js.undefined)
    
    @scala.inline
    def setDeploymentStatus(value: PatchDeploymentStatus): Self = StObject.set(x, "DeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentStatusUndefined: Self = StObject.set(x, "DeploymentStatus", js.undefined)
  }
}
