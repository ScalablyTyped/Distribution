package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackSetSummary extends js.Object {
  
  /**
    * [Service-managed permissions] Describes whether StackSets automatically deploys to AWS Organizations accounts that are added to a target organizational unit (OU).
    */
  var AutoDeployment: js.UndefOr[typings.awsSdk.cloudformationMod.AutoDeployment] = js.native
  
  /**
    * A description of the stack set that you specify when the stack set is created or updated.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A stack set is considered to have drifted if one or more of its stack instances have drifted from their expected template and parameter configuration.    DRIFTED: One or more of the stack instances belonging to the stack set stack differs from the expected template and parameter configuration. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: AWS CloudFormation has not checked the stack set for drift.    IN_SYNC: All of the stack instances belonging to the stack set stack match from the expected template and parameter configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var DriftStatus: js.UndefOr[StackDriftStatus] = js.native
  
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be NULL for any stack set on which drift detection has not yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * Describes how the IAM roles required for stack set operations are created.   With self-managed permissions, you must create the administrator and execution roles required to deploy to target accounts. For more information, see Grant Self-Managed Stack Set Permissions.   With service-managed permissions, StackSets automatically creates the IAM roles required to deploy to accounts managed by AWS Organizations. For more information, see Grant Service-Managed Stack Set Permissions.  
    */
  var PermissionModel: js.UndefOr[PermissionModels] = js.native
  
  /**
    * The ID of the stack set.
    */
  var StackSetId: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetId] = js.native
  
  /**
    * The name of the stack set.
    */
  var StackSetName: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetName] = js.native
  
  /**
    * The status of the stack set.
    */
  var Status: js.UndefOr[StackSetStatus] = js.native
}
object StackSetSummary {
  
  @scala.inline
  def apply(): StackSetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetSummary]
  }
  
  @scala.inline
  implicit class StackSetSummaryOps[Self <: StackSetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoDeployment(value: AutoDeployment): Self = this.set("AutoDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDeployment: Self = this.set("AutoDeployment", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDriftStatus(value: StackDriftStatus): Self = this.set("DriftStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriftStatus: Self = this.set("DriftStatus", js.undefined)
    
    @scala.inline
    def setLastDriftCheckTimestamp(value: Timestamp): Self = this.set("LastDriftCheckTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDriftCheckTimestamp: Self = this.set("LastDriftCheckTimestamp", js.undefined)
    
    @scala.inline
    def setPermissionModel(value: PermissionModels): Self = this.set("PermissionModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionModel: Self = this.set("PermissionModel", js.undefined)
    
    @scala.inline
    def setStackSetId(value: StackSetId): Self = this.set("StackSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetId: Self = this.set("StackSetId", js.undefined)
    
    @scala.inline
    def setStackSetName(value: StackSetName): Self = this.set("StackSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetName: Self = this.set("StackSetName", js.undefined)
    
    @scala.inline
    def setStatus(value: StackSetStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
