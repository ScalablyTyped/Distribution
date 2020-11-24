package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackInstance extends js.Object {
  
  /**
    * [Self-managed permissions] The name of the AWS account that the stack instance is associated with.
    */
  var Account: js.UndefOr[typings.awsSdk.cloudformationMod.Account] = js.native
  
  /**
    * Status of the stack instance's actual configuration compared to the expected template and parameter configuration of the stack set to which it belongs.     DRIFTED: The stack differs from the expected template and parameter configuration of the stack set to which it belongs. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: AWS CloudFormation has not checked if the stack instance differs from its expected stack set configuration.    IN_SYNC: The stack instance's actual configuration matches its expected stack set configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var DriftStatus: js.UndefOr[StackDriftStatus] = js.native
  
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack instance. This value will be NULL for any stack instance on which drift detection has not yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * [Service-managed permissions] The organization root ID or organizational unit (OU) IDs that you specified for DeploymentTargets.
    */
  var OrganizationalUnitId: js.UndefOr[typings.awsSdk.cloudformationMod.OrganizationalUnitId] = js.native
  
  /**
    * A list of parameters from the stack set template whose values have been overridden in this stack instance.
    */
  var ParameterOverrides: js.UndefOr[Parameters] = js.native
  
  /**
    * The name of the AWS Region that the stack instance is associated with.
    */
  var Region: js.UndefOr[typings.awsSdk.cloudformationMod.Region] = js.native
  
  /**
    * The ID of the stack instance.
    */
  var StackId: js.UndefOr[typings.awsSdk.cloudformationMod.StackId] = js.native
  
  /**
    * The detailed status of the stack instance.
    */
  var StackInstanceStatus: js.UndefOr[StackInstanceComprehensiveStatus] = js.native
  
  /**
    * The name or unique ID of the stack set that the stack instance is associated with.
    */
  var StackSetId: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetId] = js.native
  
  /**
    * The status of the stack instance, in terms of its synchronization with its associated stack set.    INOPERABLE: A DeleteStackInstances operation has failed and left the stack in an unstable state. Stacks in this state are excluded from further UpdateStackSet operations. You might need to perform a DeleteStackInstances operation, with RetainStacks set to true, to delete the stack instance, and then delete the stack manually.    OUTDATED: The stack isn't currently up to date with the stack set because:   The associated stack failed during a CreateStackSet or UpdateStackSet operation.    The stack was part of a CreateStackSet or UpdateStackSet operation that failed or was stopped before the stack was created or updated.       CURRENT: The stack is currently up to date with the stack set.  
    */
  var Status: js.UndefOr[StackInstanceStatus] = js.native
  
  /**
    * The explanation for the specific status code that is assigned to this stack instance.
    */
  var StatusReason: js.UndefOr[Reason] = js.native
}
object StackInstance {
  
  @scala.inline
  def apply(): StackInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackInstance]
  }
  
  @scala.inline
  implicit class StackInstanceOps[Self <: StackInstance] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: Account): Self = this.set("Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("Account", js.undefined)
    
    @scala.inline
    def setDriftStatus(value: StackDriftStatus): Self = this.set("DriftStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriftStatus: Self = this.set("DriftStatus", js.undefined)
    
    @scala.inline
    def setLastDriftCheckTimestamp(value: Timestamp): Self = this.set("LastDriftCheckTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDriftCheckTimestamp: Self = this.set("LastDriftCheckTimestamp", js.undefined)
    
    @scala.inline
    def setOrganizationalUnitId(value: OrganizationalUnitId): Self = this.set("OrganizationalUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationalUnitId: Self = this.set("OrganizationalUnitId", js.undefined)
    
    @scala.inline
    def setParameterOverridesVarargs(value: Parameter*): Self = this.set("ParameterOverrides", js.Array(value :_*))
    
    @scala.inline
    def setParameterOverrides(value: Parameters): Self = this.set("ParameterOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterOverrides: Self = this.set("ParameterOverrides", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setStackId(value: StackId): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
    
    @scala.inline
    def setStackInstanceStatus(value: StackInstanceComprehensiveStatus): Self = this.set("StackInstanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackInstanceStatus: Self = this.set("StackInstanceStatus", js.undefined)
    
    @scala.inline
    def setStackSetId(value: StackSetId): Self = this.set("StackSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetId: Self = this.set("StackSetId", js.undefined)
    
    @scala.inline
    def setStatus(value: StackInstanceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusReason(value: Reason): Self = this.set("StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("StatusReason", js.undefined)
  }
}
