package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChangeSetOutput extends js.Object {
  
  /**
    * If you execute the change set, the list of capabilities that were explicitly acknowledged when the change set was created.
    */
  var Capabilities: js.UndefOr[typings.awsSdk.cloudformationMod.Capabilities] = js.native
  
  /**
    * The ARN of the change set.
    */
  var ChangeSetId: js.UndefOr[typings.awsSdk.cloudformationMod.ChangeSetId] = js.native
  
  /**
    * The name of the change set.
    */
  var ChangeSetName: js.UndefOr[typings.awsSdk.cloudformationMod.ChangeSetName] = js.native
  
  /**
    * A list of Change structures that describes the resources AWS CloudFormation changes if you execute the change set.
    */
  var Changes: js.UndefOr[typings.awsSdk.cloudformationMod.Changes] = js.native
  
  /**
    * The start time when the change set was created, in UTC.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.cloudformationMod.CreationTime] = js.native
  
  /**
    * Information about the change set.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * If the change set execution status is AVAILABLE, you can execute the change set. If you can’t execute the change set, the status indicates why. For example, a change set might be in an UNAVAILABLE state because AWS CloudFormation is still creating it or in an OBSOLETE state because the stack was already updated.
    */
  var ExecutionStatus: js.UndefOr[typings.awsSdk.cloudformationMod.ExecutionStatus] = js.native
  
  /**
    * Verifies if IncludeNestedStacks is set to True.
    */
  var IncludeNestedStacks: js.UndefOr[typings.awsSdk.cloudformationMod.IncludeNestedStacks] = js.native
  
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of changes. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * The ARNs of the Amazon Simple Notification Service (Amazon SNS) topics that will be associated with the stack if you execute the change set.
    */
  var NotificationARNs: js.UndefOr[typings.awsSdk.cloudformationMod.NotificationARNs] = js.native
  
  /**
    * A list of Parameter structures that describes the input parameters and their values used to create the change set. For more information, see the Parameter data type.
    */
  var Parameters: js.UndefOr[typings.awsSdk.cloudformationMod.Parameters] = js.native
  
  /**
    * Specifies the change set ID of the parent change set in the current nested change set hierarchy.
    */
  var ParentChangeSetId: js.UndefOr[ChangeSetId] = js.native
  
  /**
    * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    */
  var RollbackConfiguration: js.UndefOr[typings.awsSdk.cloudformationMod.RollbackConfiguration] = js.native
  
  /**
    * Specifies the change set ID of the root change set in the current nested change set hierarchy.
    */
  var RootChangeSetId: js.UndefOr[ChangeSetId] = js.native
  
  /**
    * The ARN of the stack that is associated with the change set.
    */
  var StackId: js.UndefOr[typings.awsSdk.cloudformationMod.StackId] = js.native
  
  /**
    * The name of the stack that is associated with the change set.
    */
  var StackName: js.UndefOr[typings.awsSdk.cloudformationMod.StackName] = js.native
  
  /**
    * The current status of the change set, such as CREATE_IN_PROGRESS, CREATE_COMPLETE, or FAILED.
    */
  var Status: js.UndefOr[ChangeSetStatus] = js.native
  
  /**
    * A description of the change set's status. For example, if your attempt to create a change set failed, AWS CloudFormation shows the error message.
    */
  var StatusReason: js.UndefOr[ChangeSetStatusReason] = js.native
  
  /**
    * If you execute the change set, the tags that will be associated with the stack.
    */
  var Tags: js.UndefOr[typings.awsSdk.cloudformationMod.Tags] = js.native
}
object DescribeChangeSetOutput {
  
  @scala.inline
  def apply(): DescribeChangeSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChangeSetOutput]
  }
  
  @scala.inline
  implicit class DescribeChangeSetOutputOps[Self <: DescribeChangeSetOutput] (val x: Self) extends AnyVal {
    
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
    def setCapabilitiesVarargs(value: Capability*): Self = this.set("Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCapabilities(value: Capabilities): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("Capabilities", js.undefined)
    
    @scala.inline
    def setChangeSetId(value: ChangeSetId): Self = this.set("ChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSetId: Self = this.set("ChangeSetId", js.undefined)
    
    @scala.inline
    def setChangeSetName(value: ChangeSetName): Self = this.set("ChangeSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSetName: Self = this.set("ChangeSetName", js.undefined)
    
    @scala.inline
    def setChangesVarargs(value: Change*): Self = this.set("Changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: Changes): Self = this.set("Changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChanges: Self = this.set("Changes", js.undefined)
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setExecutionStatus(value: ExecutionStatus): Self = this.set("ExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionStatus: Self = this.set("ExecutionStatus", js.undefined)
    
    @scala.inline
    def setIncludeNestedStacks(value: IncludeNestedStacks): Self = this.set("IncludeNestedStacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNestedStacks: Self = this.set("IncludeNestedStacks", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setNotificationARNsVarargs(value: NotificationARN*): Self = this.set("NotificationARNs", js.Array(value :_*))
    
    @scala.inline
    def setNotificationARNs(value: NotificationARNs): Self = this.set("NotificationARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationARNs: Self = this.set("NotificationARNs", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = this.set("Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setParentChangeSetId(value: ChangeSetId): Self = this.set("ParentChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentChangeSetId: Self = this.set("ParentChangeSetId", js.undefined)
    
    @scala.inline
    def setRollbackConfiguration(value: RollbackConfiguration): Self = this.set("RollbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollbackConfiguration: Self = this.set("RollbackConfiguration", js.undefined)
    
    @scala.inline
    def setRootChangeSetId(value: ChangeSetId): Self = this.set("RootChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootChangeSetId: Self = this.set("RootChangeSetId", js.undefined)
    
    @scala.inline
    def setStackId(value: StackId): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
    
    @scala.inline
    def setStackName(value: StackName): Self = this.set("StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackName: Self = this.set("StackName", js.undefined)
    
    @scala.inline
    def setStatus(value: ChangeSetStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusReason(value: ChangeSetStatusReason): Self = this.set("StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("StatusReason", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
