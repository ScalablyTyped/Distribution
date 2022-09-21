package typings.awsSdk.cloudformationMod

import typings.awsSdk.anon.DescribeChangeSetInputwai
import typings.awsSdk.anon.DescribeStacksInputwaiter
import typings.awsSdk.anon.DescribeTypeRegistrationI
import typings.awsSdk.awsSdkStrings.changeSetCreateComplete
import typings.awsSdk.awsSdkStrings.stackCreateComplete
import typings.awsSdk.awsSdkStrings.stackDeleteComplete
import typings.awsSdk.awsSdkStrings.stackExists
import typings.awsSdk.awsSdkStrings.stackImportComplete
import typings.awsSdk.awsSdkStrings.stackRollbackComplete
import typings.awsSdk.awsSdkStrings.stackUpdateComplete
import typings.awsSdk.awsSdkStrings.typeRegistrationComplete
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFormation extends Service {
  
  /**
    * Activates a public third-party extension, making it available for use in stack templates. For more information, see Using public extensions in the CloudFormation User Guide. Once you have activated a public third-party extension in your account and region, use SetTypeConfiguration to specify configuration properties for the extension. For more information, see Configuring extensions at the account level in the CloudFormation User Guide.
    */
  def activateType(): Request[ActivateTypeOutput, AWSError] = js.native
  def activateType(callback: js.Function2[/* err */ AWSError, /* data */ ActivateTypeOutput, Unit]): Request[ActivateTypeOutput, AWSError] = js.native
  /**
    * Activates a public third-party extension, making it available for use in stack templates. For more information, see Using public extensions in the CloudFormation User Guide. Once you have activated a public third-party extension in your account and region, use SetTypeConfiguration to specify configuration properties for the extension. For more information, see Configuring extensions at the account level in the CloudFormation User Guide.
    */
  def activateType(params: ActivateTypeInput): Request[ActivateTypeOutput, AWSError] = js.native
  def activateType(
    params: ActivateTypeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ActivateTypeOutput, Unit]
  ): Request[ActivateTypeOutput, AWSError] = js.native
  
  /**
    * Returns configuration data for the specified CloudFormation extensions, from the CloudFormation registry for the account and region. For more information, see Configuring extensions at the account level in the CloudFormation User Guide.
    */
  def batchDescribeTypeConfigurations(): Request[BatchDescribeTypeConfigurationsOutput, AWSError] = js.native
  def batchDescribeTypeConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ BatchDescribeTypeConfigurationsOutput, Unit]): Request[BatchDescribeTypeConfigurationsOutput, AWSError] = js.native
  /**
    * Returns configuration data for the specified CloudFormation extensions, from the CloudFormation registry for the account and region. For more information, see Configuring extensions at the account level in the CloudFormation User Guide.
    */
  def batchDescribeTypeConfigurations(params: BatchDescribeTypeConfigurationsInput): Request[BatchDescribeTypeConfigurationsOutput, AWSError] = js.native
  def batchDescribeTypeConfigurations(
    params: BatchDescribeTypeConfigurationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDescribeTypeConfigurationsOutput, Unit]
  ): Request[BatchDescribeTypeConfigurationsOutput, AWSError] = js.native
  
  /**
    * Cancels an update on the specified stack. If the call completes successfully, the stack rolls back the update and reverts to the previous stack configuration.  You can cancel only stacks that are in the UPDATE_IN_PROGRESS state. 
    */
  def cancelUpdateStack(): Request[js.Object, AWSError] = js.native
  def cancelUpdateStack(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Cancels an update on the specified stack. If the call completes successfully, the stack rolls back the update and reverts to the previous stack configuration.  You can cancel only stacks that are in the UPDATE_IN_PROGRESS state. 
    */
  def cancelUpdateStack(params: CancelUpdateStackInput): Request[js.Object, AWSError] = js.native
  def cancelUpdateStack(
    params: CancelUpdateStackInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  @JSName("config")
  var config_CloudFormation: ConfigBase & ClientConfiguration = js.native
  
  /**
    * For a specified stack that's in the UPDATE_ROLLBACK_FAILED state, continues rolling it back to the UPDATE_ROLLBACK_COMPLETE state. Depending on the cause of the failure, you can manually  fix the error and continue the rollback. By continuing the rollback, you can return your stack to a working state (the UPDATE_ROLLBACK_COMPLETE state), and then try to update the stack again. A stack goes into the UPDATE_ROLLBACK_FAILED state when CloudFormation can't roll back all changes after a failed stack update. For example, you might have a stack that's rolling back to an old database instance that was deleted outside of CloudFormation. Because CloudFormation doesn't know the database was deleted, it assumes that the database instance still exists and attempts to roll back to it, causing the update rollback to fail.
    */
  def continueUpdateRollback(): Request[ContinueUpdateRollbackOutput, AWSError] = js.native
  def continueUpdateRollback(callback: js.Function2[/* err */ AWSError, /* data */ ContinueUpdateRollbackOutput, Unit]): Request[ContinueUpdateRollbackOutput, AWSError] = js.native
  /**
    * For a specified stack that's in the UPDATE_ROLLBACK_FAILED state, continues rolling it back to the UPDATE_ROLLBACK_COMPLETE state. Depending on the cause of the failure, you can manually  fix the error and continue the rollback. By continuing the rollback, you can return your stack to a working state (the UPDATE_ROLLBACK_COMPLETE state), and then try to update the stack again. A stack goes into the UPDATE_ROLLBACK_FAILED state when CloudFormation can't roll back all changes after a failed stack update. For example, you might have a stack that's rolling back to an old database instance that was deleted outside of CloudFormation. Because CloudFormation doesn't know the database was deleted, it assumes that the database instance still exists and attempts to roll back to it, causing the update rollback to fail.
    */
  def continueUpdateRollback(params: ContinueUpdateRollbackInput): Request[ContinueUpdateRollbackOutput, AWSError] = js.native
  def continueUpdateRollback(
    params: ContinueUpdateRollbackInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ContinueUpdateRollbackOutput, Unit]
  ): Request[ContinueUpdateRollbackOutput, AWSError] = js.native
  
  /**
    * Creates a list of changes that will be applied to a stack so that you can review the changes before executing them. You can create a change set for a stack that doesn't exist or an existing stack. If you create a change set for a stack that doesn't exist, the change set shows all of the resources that CloudFormation will create. If you create a change set for an existing stack, CloudFormation compares the stack's information with the information that you submit in the change set and lists the differences. Use change sets to understand which resources CloudFormation will create or change, and how it will change resources in an existing stack, before you create or update a stack. To create a change set for a stack that doesn't exist, for the ChangeSetType parameter, specify CREATE. To create a change set for an existing stack, specify UPDATE for the ChangeSetType parameter. To create a change set for an import operation, specify IMPORT for the ChangeSetType parameter. After the CreateChangeSet call successfully completes, CloudFormation starts creating the change set. To check the status of the change set or to review it, use the DescribeChangeSet action. When you are satisfied with the changes the change set will make, execute the change set by using the ExecuteChangeSet action. CloudFormation doesn't make changes until you execute the change set. To create a change set for the entire stack hierarchy, set IncludeNestedStacks to True.
    */
  def createChangeSet(): Request[CreateChangeSetOutput, AWSError] = js.native
  def createChangeSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateChangeSetOutput, Unit]): Request[CreateChangeSetOutput, AWSError] = js.native
  /**
    * Creates a list of changes that will be applied to a stack so that you can review the changes before executing them. You can create a change set for a stack that doesn't exist or an existing stack. If you create a change set for a stack that doesn't exist, the change set shows all of the resources that CloudFormation will create. If you create a change set for an existing stack, CloudFormation compares the stack's information with the information that you submit in the change set and lists the differences. Use change sets to understand which resources CloudFormation will create or change, and how it will change resources in an existing stack, before you create or update a stack. To create a change set for a stack that doesn't exist, for the ChangeSetType parameter, specify CREATE. To create a change set for an existing stack, specify UPDATE for the ChangeSetType parameter. To create a change set for an import operation, specify IMPORT for the ChangeSetType parameter. After the CreateChangeSet call successfully completes, CloudFormation starts creating the change set. To check the status of the change set or to review it, use the DescribeChangeSet action. When you are satisfied with the changes the change set will make, execute the change set by using the ExecuteChangeSet action. CloudFormation doesn't make changes until you execute the change set. To create a change set for the entire stack hierarchy, set IncludeNestedStacks to True.
    */
  def createChangeSet(params: CreateChangeSetInput): Request[CreateChangeSetOutput, AWSError] = js.native
  def createChangeSet(
    params: CreateChangeSetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChangeSetOutput, Unit]
  ): Request[CreateChangeSetOutput, AWSError] = js.native
  
  /**
    * Creates a stack as specified in the template. After the call completes successfully, the stack creation starts. You can check the status of the stack through the DescribeStacksoperation.
    */
  def createStack(): Request[CreateStackOutput, AWSError] = js.native
  def createStack(callback: js.Function2[/* err */ AWSError, /* data */ CreateStackOutput, Unit]): Request[CreateStackOutput, AWSError] = js.native
  /**
    * Creates a stack as specified in the template. After the call completes successfully, the stack creation starts. You can check the status of the stack through the DescribeStacksoperation.
    */
  def createStack(params: CreateStackInput): Request[CreateStackOutput, AWSError] = js.native
  def createStack(
    params: CreateStackInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStackOutput, Unit]
  ): Request[CreateStackOutput, AWSError] = js.native
  
  /**
    * Creates stack instances for the specified accounts, within the specified Amazon Web Services Regions. A stack instance refers to a stack in a specific account and Region. You must specify at least one value for either Accounts or DeploymentTargets, and you must specify at least one value for Regions.
    */
  def createStackInstances(): Request[CreateStackInstancesOutput, AWSError] = js.native
  def createStackInstances(callback: js.Function2[/* err */ AWSError, /* data */ CreateStackInstancesOutput, Unit]): Request[CreateStackInstancesOutput, AWSError] = js.native
  /**
    * Creates stack instances for the specified accounts, within the specified Amazon Web Services Regions. A stack instance refers to a stack in a specific account and Region. You must specify at least one value for either Accounts or DeploymentTargets, and you must specify at least one value for Regions.
    */
  def createStackInstances(params: CreateStackInstancesInput): Request[CreateStackInstancesOutput, AWSError] = js.native
  def createStackInstances(
    params: CreateStackInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStackInstancesOutput, Unit]
  ): Request[CreateStackInstancesOutput, AWSError] = js.native
  
  /**
    * Creates a stack set.
    */
  def createStackSet(): Request[CreateStackSetOutput, AWSError] = js.native
  def createStackSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateStackSetOutput, Unit]): Request[CreateStackSetOutput, AWSError] = js.native
  /**
    * Creates a stack set.
    */
  def createStackSet(params: CreateStackSetInput): Request[CreateStackSetOutput, AWSError] = js.native
  def createStackSet(
    params: CreateStackSetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStackSetOutput, Unit]
  ): Request[CreateStackSetOutput, AWSError] = js.native
  
  /**
    * Deactivates a public extension that was previously activated in this account and region. Once deactivated, an extension can't be used in any CloudFormation operation. This includes stack update operations where the stack template includes the extension, even if no updates are being made to the extension. In addition, deactivated extensions aren't automatically updated if a new version of the extension is released.
    */
  def deactivateType(): Request[DeactivateTypeOutput, AWSError] = js.native
  def deactivateType(callback: js.Function2[/* err */ AWSError, /* data */ DeactivateTypeOutput, Unit]): Request[DeactivateTypeOutput, AWSError] = js.native
  /**
    * Deactivates a public extension that was previously activated in this account and region. Once deactivated, an extension can't be used in any CloudFormation operation. This includes stack update operations where the stack template includes the extension, even if no updates are being made to the extension. In addition, deactivated extensions aren't automatically updated if a new version of the extension is released.
    */
  def deactivateType(params: DeactivateTypeInput): Request[DeactivateTypeOutput, AWSError] = js.native
  def deactivateType(
    params: DeactivateTypeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeactivateTypeOutput, Unit]
  ): Request[DeactivateTypeOutput, AWSError] = js.native
  
  /**
    * Deletes the specified change set. Deleting change sets ensures that no one executes the wrong change set. If the call successfully completes, CloudFormation successfully deleted the change set. If IncludeNestedStacks specifies True during the creation of the nested change set, then DeleteChangeSet will delete all change sets that belong to the stacks hierarchy and will also delete all change sets for nested stacks with the status of REVIEW_IN_PROGRESS.
    */
  def deleteChangeSet(): Request[DeleteChangeSetOutput, AWSError] = js.native
  def deleteChangeSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteChangeSetOutput, Unit]): Request[DeleteChangeSetOutput, AWSError] = js.native
  /**
    * Deletes the specified change set. Deleting change sets ensures that no one executes the wrong change set. If the call successfully completes, CloudFormation successfully deleted the change set. If IncludeNestedStacks specifies True during the creation of the nested change set, then DeleteChangeSet will delete all change sets that belong to the stacks hierarchy and will also delete all change sets for nested stacks with the status of REVIEW_IN_PROGRESS.
    */
  def deleteChangeSet(params: DeleteChangeSetInput): Request[DeleteChangeSetOutput, AWSError] = js.native
  def deleteChangeSet(
    params: DeleteChangeSetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteChangeSetOutput, Unit]
  ): Request[DeleteChangeSetOutput, AWSError] = js.native
  
  /**
    * Deletes a specified stack. Once the call completes successfully, stack deletion starts. Deleted stacks don't show up in the DescribeStacks operation if the deletion has been completed successfully.
    */
  def deleteStack(): Request[js.Object, AWSError] = js.native
  def deleteStack(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specified stack. Once the call completes successfully, stack deletion starts. Deleted stacks don't show up in the DescribeStacks operation if the deletion has been completed successfully.
    */
  def deleteStack(params: DeleteStackInput): Request[js.Object, AWSError] = js.native
  def deleteStack(params: DeleteStackInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes stack instances for the specified accounts, in the specified Amazon Web Services Regions.
    */
  def deleteStackInstances(): Request[DeleteStackInstancesOutput, AWSError] = js.native
  def deleteStackInstances(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStackInstancesOutput, Unit]): Request[DeleteStackInstancesOutput, AWSError] = js.native
  /**
    * Deletes stack instances for the specified accounts, in the specified Amazon Web Services Regions.
    */
  def deleteStackInstances(params: DeleteStackInstancesInput): Request[DeleteStackInstancesOutput, AWSError] = js.native
  def deleteStackInstances(
    params: DeleteStackInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStackInstancesOutput, Unit]
  ): Request[DeleteStackInstancesOutput, AWSError] = js.native
  
  /**
    * Deletes a stack set. Before you can delete a stack set, all its member stack instances must be deleted. For more information about how to complete this, see DeleteStackInstances.
    */
  def deleteStackSet(): Request[DeleteStackSetOutput, AWSError] = js.native
  def deleteStackSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStackSetOutput, Unit]): Request[DeleteStackSetOutput, AWSError] = js.native
  /**
    * Deletes a stack set. Before you can delete a stack set, all its member stack instances must be deleted. For more information about how to complete this, see DeleteStackInstances.
    */
  def deleteStackSet(params: DeleteStackSetInput): Request[DeleteStackSetOutput, AWSError] = js.native
  def deleteStackSet(
    params: DeleteStackSetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStackSetOutput, Unit]
  ): Request[DeleteStackSetOutput, AWSError] = js.native
  
  /**
    * Marks an extension or extension version as DEPRECATED in the CloudFormation registry, removing it from active use. Deprecated extensions or extension versions cannot be used in CloudFormation operations. To deregister an entire extension, you must individually deregister all active versions of that extension. If an extension has only a single active version, deregistering that version results in the extension itself being deregistered and marked as deprecated in the registry. You can't deregister the default version of an extension if there are other active version of that extension. If you do deregister the default version of an extension, the extension type itself is deregistered as well and marked as deprecated. To view the deprecation status of an extension or extension version, use DescribeType.
    */
  def deregisterType(): Request[DeregisterTypeOutput, AWSError] = js.native
  def deregisterType(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTypeOutput, Unit]): Request[DeregisterTypeOutput, AWSError] = js.native
  /**
    * Marks an extension or extension version as DEPRECATED in the CloudFormation registry, removing it from active use. Deprecated extensions or extension versions cannot be used in CloudFormation operations. To deregister an entire extension, you must individually deregister all active versions of that extension. If an extension has only a single active version, deregistering that version results in the extension itself being deregistered and marked as deprecated in the registry. You can't deregister the default version of an extension if there are other active version of that extension. If you do deregister the default version of an extension, the extension type itself is deregistered as well and marked as deprecated. To view the deprecation status of an extension or extension version, use DescribeType.
    */
  def deregisterType(params: DeregisterTypeInput): Request[DeregisterTypeOutput, AWSError] = js.native
  def deregisterType(
    params: DeregisterTypeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTypeOutput, Unit]
  ): Request[DeregisterTypeOutput, AWSError] = js.native
  
  /**
    * Retrieves your account's CloudFormation limits, such as the maximum number of stacks that you can create in your account. For more information about account limits, see CloudFormation Quotas in the CloudFormation User Guide.
    */
  def describeAccountLimits(): Request[DescribeAccountLimitsOutput, AWSError] = js.native
  def describeAccountLimits(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountLimitsOutput, Unit]): Request[DescribeAccountLimitsOutput, AWSError] = js.native
  /**
    * Retrieves your account's CloudFormation limits, such as the maximum number of stacks that you can create in your account. For more information about account limits, see CloudFormation Quotas in the CloudFormation User Guide.
    */
  def describeAccountLimits(params: DescribeAccountLimitsInput): Request[DescribeAccountLimitsOutput, AWSError] = js.native
  def describeAccountLimits(
    params: DescribeAccountLimitsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountLimitsOutput, Unit]
  ): Request[DescribeAccountLimitsOutput, AWSError] = js.native
  
  /**
    * Returns the inputs for the change set and a list of changes that CloudFormation will make if you execute the change set. For more information, see Updating Stacks Using Change Sets in the CloudFormation User Guide.
    */
  def describeChangeSet(): Request[DescribeChangeSetOutput, AWSError] = js.native
  def describeChangeSet(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChangeSetOutput, Unit]): Request[DescribeChangeSetOutput, AWSError] = js.native
  /**
    * Returns the inputs for the change set and a list of changes that CloudFormation will make if you execute the change set. For more information, see Updating Stacks Using Change Sets in the CloudFormation User Guide.
    */
  def describeChangeSet(params: DescribeChangeSetInput): Request[DescribeChangeSetOutput, AWSError] = js.native
  def describeChangeSet(
    params: DescribeChangeSetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChangeSetOutput, Unit]
  ): Request[DescribeChangeSetOutput, AWSError] = js.native
  
  /**
    * Returns hook-related information for the change set and a list of changes that CloudFormation makes when you run the change set.
    */
  def describeChangeSetHooks(): Request[DescribeChangeSetHooksOutput, AWSError] = js.native
  def describeChangeSetHooks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChangeSetHooksOutput, Unit]): Request[DescribeChangeSetHooksOutput, AWSError] = js.native
  /**
    * Returns hook-related information for the change set and a list of changes that CloudFormation makes when you run the change set.
    */
  def describeChangeSetHooks(params: DescribeChangeSetHooksInput): Request[DescribeChangeSetHooksOutput, AWSError] = js.native
  def describeChangeSetHooks(
    params: DescribeChangeSetHooksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChangeSetHooksOutput, Unit]
  ): Request[DescribeChangeSetHooksOutput, AWSError] = js.native
  
  /**
    * Returns information about a CloudFormation extension publisher. If you don't supply a PublisherId, and you have registered as an extension publisher, DescribePublisher returns information about your own publisher account. For more information about registering as a publisher, see:    RegisterPublisher     Publishing extensions to make them available for public use in the CloudFormation CLI User Guide   
    */
  def describePublisher(): Request[DescribePublisherOutput, AWSError] = js.native
  def describePublisher(callback: js.Function2[/* err */ AWSError, /* data */ DescribePublisherOutput, Unit]): Request[DescribePublisherOutput, AWSError] = js.native
  /**
    * Returns information about a CloudFormation extension publisher. If you don't supply a PublisherId, and you have registered as an extension publisher, DescribePublisher returns information about your own publisher account. For more information about registering as a publisher, see:    RegisterPublisher     Publishing extensions to make them available for public use in the CloudFormation CLI User Guide   
    */
  def describePublisher(params: DescribePublisherInput): Request[DescribePublisherOutput, AWSError] = js.native
  def describePublisher(
    params: DescribePublisherInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePublisherOutput, Unit]
  ): Request[DescribePublisherOutput, AWSError] = js.native
  
  /**
    * Returns information about a stack drift detection operation. A stack drift detection operation detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. A stack is considered to have drifted if one or more of its resources have drifted. For more information about stack and resource drift, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackDrift to initiate a stack drift detection operation. DetectStackDrift returns a StackDriftDetectionId you can use to monitor the progress of the operation using DescribeStackDriftDetectionStatus. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return drift information about the stack and its resources.
    */
  def describeStackDriftDetectionStatus(): Request[DescribeStackDriftDetectionStatusOutput, AWSError] = js.native
  def describeStackDriftDetectionStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackDriftDetectionStatusOutput, Unit]
  ): Request[DescribeStackDriftDetectionStatusOutput, AWSError] = js.native
  /**
    * Returns information about a stack drift detection operation. A stack drift detection operation detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. A stack is considered to have drifted if one or more of its resources have drifted. For more information about stack and resource drift, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackDrift to initiate a stack drift detection operation. DetectStackDrift returns a StackDriftDetectionId you can use to monitor the progress of the operation using DescribeStackDriftDetectionStatus. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return drift information about the stack and its resources.
    */
  def describeStackDriftDetectionStatus(params: DescribeStackDriftDetectionStatusInput): Request[DescribeStackDriftDetectionStatusOutput, AWSError] = js.native
  def describeStackDriftDetectionStatus(
    params: DescribeStackDriftDetectionStatusInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackDriftDetectionStatusOutput, Unit]
  ): Request[DescribeStackDriftDetectionStatusOutput, AWSError] = js.native
  
  /**
    * Returns all stack related events for a specified stack in reverse chronological order. For more information about a stack's event history, go to Stacks in the CloudFormation User Guide.  You can list events for stacks that have failed to create or have been deleted by specifying the unique stack identifier (stack ID). 
    */
  def describeStackEvents(): Request[DescribeStackEventsOutput, AWSError] = js.native
  def describeStackEvents(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackEventsOutput, Unit]): Request[DescribeStackEventsOutput, AWSError] = js.native
  /**
    * Returns all stack related events for a specified stack in reverse chronological order. For more information about a stack's event history, go to Stacks in the CloudFormation User Guide.  You can list events for stacks that have failed to create or have been deleted by specifying the unique stack identifier (stack ID). 
    */
  def describeStackEvents(params: DescribeStackEventsInput): Request[DescribeStackEventsOutput, AWSError] = js.native
  def describeStackEvents(
    params: DescribeStackEventsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackEventsOutput, Unit]
  ): Request[DescribeStackEventsOutput, AWSError] = js.native
  
  /**
    * Returns the stack instance that's associated with the specified stack set, Amazon Web Services account, and Region. For a list of stack instances that are associated with a specific stack set, use ListStackInstances.
    */
  def describeStackInstance(): Request[DescribeStackInstanceOutput, AWSError] = js.native
  def describeStackInstance(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackInstanceOutput, Unit]): Request[DescribeStackInstanceOutput, AWSError] = js.native
  /**
    * Returns the stack instance that's associated with the specified stack set, Amazon Web Services account, and Region. For a list of stack instances that are associated with a specific stack set, use ListStackInstances.
    */
  def describeStackInstance(params: DescribeStackInstanceInput): Request[DescribeStackInstanceOutput, AWSError] = js.native
  def describeStackInstance(
    params: DescribeStackInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackInstanceOutput, Unit]
  ): Request[DescribeStackInstanceOutput, AWSError] = js.native
  
  /**
    * Returns a description of the specified resource in the specified stack. For deleted stacks, DescribeStackResource returns resource information for up to 90 days after the stack has been deleted.
    */
  def describeStackResource(): Request[DescribeStackResourceOutput, AWSError] = js.native
  def describeStackResource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackResourceOutput, Unit]): Request[DescribeStackResourceOutput, AWSError] = js.native
  /**
    * Returns a description of the specified resource in the specified stack. For deleted stacks, DescribeStackResource returns resource information for up to 90 days after the stack has been deleted.
    */
  def describeStackResource(params: DescribeStackResourceInput): Request[DescribeStackResourceOutput, AWSError] = js.native
  def describeStackResource(
    params: DescribeStackResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackResourceOutput, Unit]
  ): Request[DescribeStackResourceOutput, AWSError] = js.native
  
  /**
    * Returns drift information for the resources that have been checked for drift in the specified stack. This includes actual and expected configuration values for resources where CloudFormation detects configuration drift. For a given stack, there will be one StackResourceDrift for each stack resource that has been checked for drift. Resources that haven't yet been checked for drift aren't included. Resources that don't currently support drift detection aren't checked, and so not included. For a list of resources that support drift detection, see Resources that Support Drift Detection. Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect drift on all supported resources for a given stack.
    */
  def describeStackResourceDrifts(): Request[DescribeStackResourceDriftsOutput, AWSError] = js.native
  def describeStackResourceDrifts(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackResourceDriftsOutput, Unit]): Request[DescribeStackResourceDriftsOutput, AWSError] = js.native
  /**
    * Returns drift information for the resources that have been checked for drift in the specified stack. This includes actual and expected configuration values for resources where CloudFormation detects configuration drift. For a given stack, there will be one StackResourceDrift for each stack resource that has been checked for drift. Resources that haven't yet been checked for drift aren't included. Resources that don't currently support drift detection aren't checked, and so not included. For a list of resources that support drift detection, see Resources that Support Drift Detection. Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect drift on all supported resources for a given stack.
    */
  def describeStackResourceDrifts(params: DescribeStackResourceDriftsInput): Request[DescribeStackResourceDriftsOutput, AWSError] = js.native
  def describeStackResourceDrifts(
    params: DescribeStackResourceDriftsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackResourceDriftsOutput, Unit]
  ): Request[DescribeStackResourceDriftsOutput, AWSError] = js.native
  
  /**
    * Returns Amazon Web Services resource descriptions for running and deleted stacks. If StackName is specified, all the associated resources that are part of the stack are returned. If PhysicalResourceId is specified, the associated resources of the stack that the resource belongs to are returned.  Only the first 100 resources will be returned. If your stack has more resources than this, you should use ListStackResources instead.  For deleted stacks, DescribeStackResources returns resource information for up to 90 days after the stack has been deleted. You must specify either StackName or PhysicalResourceId, but not both. In addition, you can specify LogicalResourceId to filter the returned result. For more information about resources, the LogicalResourceId and PhysicalResourceId, go to the CloudFormation User Guide.  A ValidationError is returned if you specify both StackName and PhysicalResourceId in the same request. 
    */
  def describeStackResources(): Request[DescribeStackResourcesOutput, AWSError] = js.native
  def describeStackResources(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackResourcesOutput, Unit]): Request[DescribeStackResourcesOutput, AWSError] = js.native
  /**
    * Returns Amazon Web Services resource descriptions for running and deleted stacks. If StackName is specified, all the associated resources that are part of the stack are returned. If PhysicalResourceId is specified, the associated resources of the stack that the resource belongs to are returned.  Only the first 100 resources will be returned. If your stack has more resources than this, you should use ListStackResources instead.  For deleted stacks, DescribeStackResources returns resource information for up to 90 days after the stack has been deleted. You must specify either StackName or PhysicalResourceId, but not both. In addition, you can specify LogicalResourceId to filter the returned result. For more information about resources, the LogicalResourceId and PhysicalResourceId, go to the CloudFormation User Guide.  A ValidationError is returned if you specify both StackName and PhysicalResourceId in the same request. 
    */
  def describeStackResources(params: DescribeStackResourcesInput): Request[DescribeStackResourcesOutput, AWSError] = js.native
  def describeStackResources(
    params: DescribeStackResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackResourcesOutput, Unit]
  ): Request[DescribeStackResourcesOutput, AWSError] = js.native
  
  /**
    * Returns the description of the specified stack set.
    */
  def describeStackSet(): Request[DescribeStackSetOutput, AWSError] = js.native
  def describeStackSet(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackSetOutput, Unit]): Request[DescribeStackSetOutput, AWSError] = js.native
  /**
    * Returns the description of the specified stack set.
    */
  def describeStackSet(params: DescribeStackSetInput): Request[DescribeStackSetOutput, AWSError] = js.native
  def describeStackSet(
    params: DescribeStackSetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackSetOutput, Unit]
  ): Request[DescribeStackSetOutput, AWSError] = js.native
  
  /**
    * Returns the description of the specified stack set operation.
    */
  def describeStackSetOperation(): Request[DescribeStackSetOperationOutput, AWSError] = js.native
  def describeStackSetOperation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackSetOperationOutput, Unit]): Request[DescribeStackSetOperationOutput, AWSError] = js.native
  /**
    * Returns the description of the specified stack set operation.
    */
  def describeStackSetOperation(params: DescribeStackSetOperationInput): Request[DescribeStackSetOperationOutput, AWSError] = js.native
  def describeStackSetOperation(
    params: DescribeStackSetOperationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackSetOperationOutput, Unit]
  ): Request[DescribeStackSetOperationOutput, AWSError] = js.native
  
  /**
    * Returns the description for the specified stack; if no stack name was specified, then it returns the description for all the stacks created.  If the stack doesn't exist, an ValidationError is returned. 
    */
  def describeStacks(): Request[DescribeStacksOutput, AWSError] = js.native
  def describeStacks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]): Request[DescribeStacksOutput, AWSError] = js.native
  /**
    * Returns the description for the specified stack; if no stack name was specified, then it returns the description for all the stacks created.  If the stack doesn't exist, an ValidationError is returned. 
    */
  def describeStacks(params: DescribeStacksInput): Request[DescribeStacksOutput, AWSError] = js.native
  def describeStacks(
    params: DescribeStacksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]
  ): Request[DescribeStacksOutput, AWSError] = js.native
  
  /**
    * Returns detailed information about an extension that has been registered. If you specify a VersionId, DescribeType returns information about that specific extension version. Otherwise, it returns information about the default extension version.
    */
  def describeType(): Request[DescribeTypeOutput, AWSError] = js.native
  def describeType(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTypeOutput, Unit]): Request[DescribeTypeOutput, AWSError] = js.native
  /**
    * Returns detailed information about an extension that has been registered. If you specify a VersionId, DescribeType returns information about that specific extension version. Otherwise, it returns information about the default extension version.
    */
  def describeType(params: DescribeTypeInput): Request[DescribeTypeOutput, AWSError] = js.native
  def describeType(
    params: DescribeTypeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTypeOutput, Unit]
  ): Request[DescribeTypeOutput, AWSError] = js.native
  
  /**
    * Returns information about an extension's registration, including its current status and type and version identifiers. When you initiate a registration request using  RegisterType , you can then use  DescribeTypeRegistration  to monitor the progress of that registration request. Once the registration request has completed, use  DescribeType  to return detailed information about an extension.
    */
  def describeTypeRegistration(): Request[DescribeTypeRegistrationOutput, AWSError] = js.native
  def describeTypeRegistration(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTypeRegistrationOutput, Unit]): Request[DescribeTypeRegistrationOutput, AWSError] = js.native
  /**
    * Returns information about an extension's registration, including its current status and type and version identifiers. When you initiate a registration request using  RegisterType , you can then use  DescribeTypeRegistration  to monitor the progress of that registration request. Once the registration request has completed, use  DescribeType  to return detailed information about an extension.
    */
  def describeTypeRegistration(params: DescribeTypeRegistrationInput): Request[DescribeTypeRegistrationOutput, AWSError] = js.native
  def describeTypeRegistration(
    params: DescribeTypeRegistrationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTypeRegistrationOutput, Unit]
  ): Request[DescribeTypeRegistrationOutput, AWSError] = js.native
  
  /**
    * Detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For each resource in the stack that supports drift detection, CloudFormation compares the actual configuration of the resource with its expected template configuration. Only resource properties explicitly defined in the stack template are checked for drift. A stack is considered to have drifted if one or more of its resources differ from their expected template configurations. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackDrift to detect drift on all supported resources for a given stack, or DetectStackResourceDrift to detect drift on individual resources. For a list of stack resources that currently support drift detection, see Resources that Support Drift Detection.  DetectStackDrift can take up to several minutes, depending on the number of resources contained within the stack. Use DescribeStackDriftDetectionStatus to monitor the progress of a detect stack drift operation. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return drift information about the stack and its resources. When detecting drift on a stack, CloudFormation doesn't detect drift on any nested stacks belonging to that stack. Perform DetectStackDrift directly on the nested stack itself.
    */
  def detectStackDrift(): Request[DetectStackDriftOutput, AWSError] = js.native
  def detectStackDrift(callback: js.Function2[/* err */ AWSError, /* data */ DetectStackDriftOutput, Unit]): Request[DetectStackDriftOutput, AWSError] = js.native
  /**
    * Detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For each resource in the stack that supports drift detection, CloudFormation compares the actual configuration of the resource with its expected template configuration. Only resource properties explicitly defined in the stack template are checked for drift. A stack is considered to have drifted if one or more of its resources differ from their expected template configurations. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackDrift to detect drift on all supported resources for a given stack, or DetectStackResourceDrift to detect drift on individual resources. For a list of stack resources that currently support drift detection, see Resources that Support Drift Detection.  DetectStackDrift can take up to several minutes, depending on the number of resources contained within the stack. Use DescribeStackDriftDetectionStatus to monitor the progress of a detect stack drift operation. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return drift information about the stack and its resources. When detecting drift on a stack, CloudFormation doesn't detect drift on any nested stacks belonging to that stack. Perform DetectStackDrift directly on the nested stack itself.
    */
  def detectStackDrift(params: DetectStackDriftInput): Request[DetectStackDriftOutput, AWSError] = js.native
  def detectStackDrift(
    params: DetectStackDriftInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectStackDriftOutput, Unit]
  ): Request[DetectStackDriftOutput, AWSError] = js.native
  
  /**
    * Returns information about whether a resource's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. This information includes actual and expected property values for resources in which CloudFormation detects drift. Only resource properties explicitly defined in the stack template are checked for drift. For more information about stack and resource drift, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect drift on all resources in a given stack that support drift detection. Resources that don't currently support drift detection can't be checked. For a list of resources that support drift detection, see Resources that Support Drift Detection.
    */
  def detectStackResourceDrift(): Request[DetectStackResourceDriftOutput, AWSError] = js.native
  def detectStackResourceDrift(callback: js.Function2[/* err */ AWSError, /* data */ DetectStackResourceDriftOutput, Unit]): Request[DetectStackResourceDriftOutput, AWSError] = js.native
  /**
    * Returns information about whether a resource's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. This information includes actual and expected property values for resources in which CloudFormation detects drift. Only resource properties explicitly defined in the stack template are checked for drift. For more information about stack and resource drift, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect drift on all resources in a given stack that support drift detection. Resources that don't currently support drift detection can't be checked. For a list of resources that support drift detection, see Resources that Support Drift Detection.
    */
  def detectStackResourceDrift(params: DetectStackResourceDriftInput): Request[DetectStackResourceDriftOutput, AWSError] = js.native
  def detectStackResourceDrift(
    params: DetectStackResourceDriftInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectStackResourceDriftOutput, Unit]
  ): Request[DetectStackResourceDriftOutput, AWSError] = js.native
  
  /**
    * Detect drift on a stack set. When CloudFormation performs drift detection on a stack set, it performs drift detection on the stack associated with each stack instance in the stack set. For more information, see How CloudFormation performs drift detection on a stack set.  DetectStackSetDrift returns the OperationId of the stack set drift detection operation. Use this operation id with  DescribeStackSetOperation  to monitor the progress of the drift detection operation. The drift detection operation may take some time, depending on the number of stack instances included in the stack set, in addition to the number of resources included in each stack. Once the operation has completed, use the following actions to return drift information:   Use  DescribeStackSet  to return detailed information about the stack set, including detailed information about the last completed drift operation performed on the stack set. (Information about drift operations that are in progress isn't included.)   Use  ListStackInstances  to return a list of stack instances belonging to the stack set, including the drift status and last drift time checked of each instance.   Use  DescribeStackInstance  to return detailed information about a specific stack instance, including its drift status and last drift time checked.   For more information about performing a drift detection operation on a stack set, see Detecting unmanaged changes in stack sets. You can only run a single drift detection operation on a given stack set at one time. To stop a drift detection stack set operation, use  StopStackSetOperation .
    */
  def detectStackSetDrift(): Request[DetectStackSetDriftOutput, AWSError] = js.native
  def detectStackSetDrift(callback: js.Function2[/* err */ AWSError, /* data */ DetectStackSetDriftOutput, Unit]): Request[DetectStackSetDriftOutput, AWSError] = js.native
  /**
    * Detect drift on a stack set. When CloudFormation performs drift detection on a stack set, it performs drift detection on the stack associated with each stack instance in the stack set. For more information, see How CloudFormation performs drift detection on a stack set.  DetectStackSetDrift returns the OperationId of the stack set drift detection operation. Use this operation id with  DescribeStackSetOperation  to monitor the progress of the drift detection operation. The drift detection operation may take some time, depending on the number of stack instances included in the stack set, in addition to the number of resources included in each stack. Once the operation has completed, use the following actions to return drift information:   Use  DescribeStackSet  to return detailed information about the stack set, including detailed information about the last completed drift operation performed on the stack set. (Information about drift operations that are in progress isn't included.)   Use  ListStackInstances  to return a list of stack instances belonging to the stack set, including the drift status and last drift time checked of each instance.   Use  DescribeStackInstance  to return detailed information about a specific stack instance, including its drift status and last drift time checked.   For more information about performing a drift detection operation on a stack set, see Detecting unmanaged changes in stack sets. You can only run a single drift detection operation on a given stack set at one time. To stop a drift detection stack set operation, use  StopStackSetOperation .
    */
  def detectStackSetDrift(params: DetectStackSetDriftInput): Request[DetectStackSetDriftOutput, AWSError] = js.native
  def detectStackSetDrift(
    params: DetectStackSetDriftInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectStackSetDriftOutput, Unit]
  ): Request[DetectStackSetDriftOutput, AWSError] = js.native
  
  /**
    * Returns the estimated monthly cost of a template. The return value is an Amazon Web Services Simple Monthly Calculator URL with a query string that describes the resources required to run the template.
    */
  def estimateTemplateCost(): Request[EstimateTemplateCostOutput, AWSError] = js.native
  def estimateTemplateCost(callback: js.Function2[/* err */ AWSError, /* data */ EstimateTemplateCostOutput, Unit]): Request[EstimateTemplateCostOutput, AWSError] = js.native
  /**
    * Returns the estimated monthly cost of a template. The return value is an Amazon Web Services Simple Monthly Calculator URL with a query string that describes the resources required to run the template.
    */
  def estimateTemplateCost(params: EstimateTemplateCostInput): Request[EstimateTemplateCostOutput, AWSError] = js.native
  def estimateTemplateCost(
    params: EstimateTemplateCostInput,
    callback: js.Function2[/* err */ AWSError, /* data */ EstimateTemplateCostOutput, Unit]
  ): Request[EstimateTemplateCostOutput, AWSError] = js.native
  
  /**
    * Updates a stack using the input information that was provided when the specified change set was created. After the call successfully completes, CloudFormation starts updating the stack. Use the DescribeStacks action to view the status of the update. When you execute a change set, CloudFormation deletes all other change sets associated with the stack because they aren't valid for the updated stack. If a stack policy is associated with the stack, CloudFormation enforces the policy during the update. You can't specify a temporary stack policy that overrides the current policy. To create a change set for the entire stack hierarchy, IncludeNestedStacks must have been set to True.
    */
  def executeChangeSet(): Request[ExecuteChangeSetOutput, AWSError] = js.native
  def executeChangeSet(callback: js.Function2[/* err */ AWSError, /* data */ ExecuteChangeSetOutput, Unit]): Request[ExecuteChangeSetOutput, AWSError] = js.native
  /**
    * Updates a stack using the input information that was provided when the specified change set was created. After the call successfully completes, CloudFormation starts updating the stack. Use the DescribeStacks action to view the status of the update. When you execute a change set, CloudFormation deletes all other change sets associated with the stack because they aren't valid for the updated stack. If a stack policy is associated with the stack, CloudFormation enforces the policy during the update. You can't specify a temporary stack policy that overrides the current policy. To create a change set for the entire stack hierarchy, IncludeNestedStacks must have been set to True.
    */
  def executeChangeSet(params: ExecuteChangeSetInput): Request[ExecuteChangeSetOutput, AWSError] = js.native
  def executeChangeSet(
    params: ExecuteChangeSetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ExecuteChangeSetOutput, Unit]
  ): Request[ExecuteChangeSetOutput, AWSError] = js.native
  
  /**
    * Returns the stack policy for a specified stack. If a stack doesn't have a policy, a null value is returned.
    */
  def getStackPolicy(): Request[GetStackPolicyOutput, AWSError] = js.native
  def getStackPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetStackPolicyOutput, Unit]): Request[GetStackPolicyOutput, AWSError] = js.native
  /**
    * Returns the stack policy for a specified stack. If a stack doesn't have a policy, a null value is returned.
    */
  def getStackPolicy(params: GetStackPolicyInput): Request[GetStackPolicyOutput, AWSError] = js.native
  def getStackPolicy(
    params: GetStackPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStackPolicyOutput, Unit]
  ): Request[GetStackPolicyOutput, AWSError] = js.native
  
  /**
    * Returns the template body for a specified stack. You can get the template for running or deleted stacks. For deleted stacks, GetTemplate returns the template for up to 90 days after the stack has been deleted.  If the template doesn't exist, a ValidationError is returned. 
    */
  def getTemplate(): Request[GetTemplateOutput, AWSError] = js.native
  def getTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateOutput, Unit]): Request[GetTemplateOutput, AWSError] = js.native
  /**
    * Returns the template body for a specified stack. You can get the template for running or deleted stacks. For deleted stacks, GetTemplate returns the template for up to 90 days after the stack has been deleted.  If the template doesn't exist, a ValidationError is returned. 
    */
  def getTemplate(params: GetTemplateInput): Request[GetTemplateOutput, AWSError] = js.native
  def getTemplate(
    params: GetTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateOutput, Unit]
  ): Request[GetTemplateOutput, AWSError] = js.native
  
  /**
    * Returns information about a new or existing template. The GetTemplateSummary action is useful for viewing parameter information, such as default parameter values and parameter types, before you create or update a stack or stack set. You can use the GetTemplateSummary action when you submit a template, or you can get template information for a stack set, or a running or deleted stack. For deleted stacks, GetTemplateSummary returns the template information for up to 90 days after the stack has been deleted. If the template doesn't exist, a ValidationError is returned.
    */
  def getTemplateSummary(): Request[GetTemplateSummaryOutput, AWSError] = js.native
  def getTemplateSummary(callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateSummaryOutput, Unit]): Request[GetTemplateSummaryOutput, AWSError] = js.native
  /**
    * Returns information about a new or existing template. The GetTemplateSummary action is useful for viewing parameter information, such as default parameter values and parameter types, before you create or update a stack or stack set. You can use the GetTemplateSummary action when you submit a template, or you can get template information for a stack set, or a running or deleted stack. For deleted stacks, GetTemplateSummary returns the template information for up to 90 days after the stack has been deleted. If the template doesn't exist, a ValidationError is returned.
    */
  def getTemplateSummary(params: GetTemplateSummaryInput): Request[GetTemplateSummaryOutput, AWSError] = js.native
  def getTemplateSummary(
    params: GetTemplateSummaryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateSummaryOutput, Unit]
  ): Request[GetTemplateSummaryOutput, AWSError] = js.native
  
  /**
    * Import existing stacks into a new stack sets. Use the stack import operation to import up to 10 stacks into a new stack set in the same account as the source stack or in a different administrator account and Region, by specifying the stack ID of the stack you intend to import.   ImportStacksToStackSet is only supported by self-managed permissions. 
    */
  def importStacksToStackSet(): Request[ImportStacksToStackSetOutput, AWSError] = js.native
  def importStacksToStackSet(callback: js.Function2[/* err */ AWSError, /* data */ ImportStacksToStackSetOutput, Unit]): Request[ImportStacksToStackSetOutput, AWSError] = js.native
  /**
    * Import existing stacks into a new stack sets. Use the stack import operation to import up to 10 stacks into a new stack set in the same account as the source stack or in a different administrator account and Region, by specifying the stack ID of the stack you intend to import.   ImportStacksToStackSet is only supported by self-managed permissions. 
    */
  def importStacksToStackSet(params: ImportStacksToStackSetInput): Request[ImportStacksToStackSetOutput, AWSError] = js.native
  def importStacksToStackSet(
    params: ImportStacksToStackSetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportStacksToStackSetOutput, Unit]
  ): Request[ImportStacksToStackSetOutput, AWSError] = js.native
  
  /**
    * Returns the ID and status of each active change set for a stack. For example, CloudFormation lists change sets that are in the CREATE_IN_PROGRESS or CREATE_PENDING state.
    */
  def listChangeSets(): Request[ListChangeSetsOutput, AWSError] = js.native
  def listChangeSets(callback: js.Function2[/* err */ AWSError, /* data */ ListChangeSetsOutput, Unit]): Request[ListChangeSetsOutput, AWSError] = js.native
  /**
    * Returns the ID and status of each active change set for a stack. For example, CloudFormation lists change sets that are in the CREATE_IN_PROGRESS or CREATE_PENDING state.
    */
  def listChangeSets(params: ListChangeSetsInput): Request[ListChangeSetsOutput, AWSError] = js.native
  def listChangeSets(
    params: ListChangeSetsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChangeSetsOutput, Unit]
  ): Request[ListChangeSetsOutput, AWSError] = js.native
  
  /**
    * Lists all exported output values in the account and Region in which you call this action. Use this action to see the exported output values that you can import into other stacks. To import values, use the  Fn::ImportValue  function. For more information, see  CloudFormation export stack output values.
    */
  def listExports(): Request[ListExportsOutput, AWSError] = js.native
  def listExports(callback: js.Function2[/* err */ AWSError, /* data */ ListExportsOutput, Unit]): Request[ListExportsOutput, AWSError] = js.native
  /**
    * Lists all exported output values in the account and Region in which you call this action. Use this action to see the exported output values that you can import into other stacks. To import values, use the  Fn::ImportValue  function. For more information, see  CloudFormation export stack output values.
    */
  def listExports(params: ListExportsInput): Request[ListExportsOutput, AWSError] = js.native
  def listExports(
    params: ListExportsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExportsOutput, Unit]
  ): Request[ListExportsOutput, AWSError] = js.native
  
  /**
    * Lists all stacks that are importing an exported output value. To modify or remove an exported output value, first use this action to see which stacks are using it. To see the exported output values in your account, see ListExports. For more information about importing an exported output value, see the  Fn::ImportValue  function.
    */
  def listImports(): Request[ListImportsOutput, AWSError] = js.native
  def listImports(callback: js.Function2[/* err */ AWSError, /* data */ ListImportsOutput, Unit]): Request[ListImportsOutput, AWSError] = js.native
  /**
    * Lists all stacks that are importing an exported output value. To modify or remove an exported output value, first use this action to see which stacks are using it. To see the exported output values in your account, see ListExports. For more information about importing an exported output value, see the  Fn::ImportValue  function.
    */
  def listImports(params: ListImportsInput): Request[ListImportsOutput, AWSError] = js.native
  def listImports(
    params: ListImportsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImportsOutput, Unit]
  ): Request[ListImportsOutput, AWSError] = js.native
  
  /**
    * Returns summary information about stack instances that are associated with the specified stack set. You can filter for stack instances that are associated with a specific Amazon Web Services account name or Region, or that have a specific status.
    */
  def listStackInstances(): Request[ListStackInstancesOutput, AWSError] = js.native
  def listStackInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListStackInstancesOutput, Unit]): Request[ListStackInstancesOutput, AWSError] = js.native
  /**
    * Returns summary information about stack instances that are associated with the specified stack set. You can filter for stack instances that are associated with a specific Amazon Web Services account name or Region, or that have a specific status.
    */
  def listStackInstances(params: ListStackInstancesInput): Request[ListStackInstancesOutput, AWSError] = js.native
  def listStackInstances(
    params: ListStackInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStackInstancesOutput, Unit]
  ): Request[ListStackInstancesOutput, AWSError] = js.native
  
  /**
    * Returns descriptions of all resources of the specified stack. For deleted stacks, ListStackResources returns resource information for up to 90 days after the stack has been deleted.
    */
  def listStackResources(): Request[ListStackResourcesOutput, AWSError] = js.native
  def listStackResources(callback: js.Function2[/* err */ AWSError, /* data */ ListStackResourcesOutput, Unit]): Request[ListStackResourcesOutput, AWSError] = js.native
  /**
    * Returns descriptions of all resources of the specified stack. For deleted stacks, ListStackResources returns resource information for up to 90 days after the stack has been deleted.
    */
  def listStackResources(params: ListStackResourcesInput): Request[ListStackResourcesOutput, AWSError] = js.native
  def listStackResources(
    params: ListStackResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStackResourcesOutput, Unit]
  ): Request[ListStackResourcesOutput, AWSError] = js.native
  
  /**
    * Returns summary information about the results of a stack set operation.
    */
  def listStackSetOperationResults(): Request[ListStackSetOperationResultsOutput, AWSError] = js.native
  def listStackSetOperationResults(callback: js.Function2[/* err */ AWSError, /* data */ ListStackSetOperationResultsOutput, Unit]): Request[ListStackSetOperationResultsOutput, AWSError] = js.native
  /**
    * Returns summary information about the results of a stack set operation.
    */
  def listStackSetOperationResults(params: ListStackSetOperationResultsInput): Request[ListStackSetOperationResultsOutput, AWSError] = js.native
  def listStackSetOperationResults(
    params: ListStackSetOperationResultsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStackSetOperationResultsOutput, Unit]
  ): Request[ListStackSetOperationResultsOutput, AWSError] = js.native
  
  /**
    * Returns summary information about operations performed on a stack set.
    */
  def listStackSetOperations(): Request[ListStackSetOperationsOutput, AWSError] = js.native
  def listStackSetOperations(callback: js.Function2[/* err */ AWSError, /* data */ ListStackSetOperationsOutput, Unit]): Request[ListStackSetOperationsOutput, AWSError] = js.native
  /**
    * Returns summary information about operations performed on a stack set.
    */
  def listStackSetOperations(params: ListStackSetOperationsInput): Request[ListStackSetOperationsOutput, AWSError] = js.native
  def listStackSetOperations(
    params: ListStackSetOperationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStackSetOperationsOutput, Unit]
  ): Request[ListStackSetOperationsOutput, AWSError] = js.native
  
  /**
    * Returns summary information about stack sets that are associated with the user.   [Self-managed permissions] If you set the CallAs parameter to SELF while signed in to your Amazon Web Services account, ListStackSets returns all self-managed stack sets in your Amazon Web Services account.   [Service-managed permissions] If you set the CallAs parameter to SELF while signed in to the organization's management account, ListStackSets returns all stack sets in the management account.   [Service-managed permissions] If you set the CallAs parameter to DELEGATED_ADMIN while signed in to your member account, ListStackSets returns all stack sets with service-managed permissions in the management account.  
    */
  def listStackSets(): Request[ListStackSetsOutput, AWSError] = js.native
  def listStackSets(callback: js.Function2[/* err */ AWSError, /* data */ ListStackSetsOutput, Unit]): Request[ListStackSetsOutput, AWSError] = js.native
  /**
    * Returns summary information about stack sets that are associated with the user.   [Self-managed permissions] If you set the CallAs parameter to SELF while signed in to your Amazon Web Services account, ListStackSets returns all self-managed stack sets in your Amazon Web Services account.   [Service-managed permissions] If you set the CallAs parameter to SELF while signed in to the organization's management account, ListStackSets returns all stack sets in the management account.   [Service-managed permissions] If you set the CallAs parameter to DELEGATED_ADMIN while signed in to your member account, ListStackSets returns all stack sets with service-managed permissions in the management account.  
    */
  def listStackSets(params: ListStackSetsInput): Request[ListStackSetsOutput, AWSError] = js.native
  def listStackSets(
    params: ListStackSetsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStackSetsOutput, Unit]
  ): Request[ListStackSetsOutput, AWSError] = js.native
  
  /**
    * Returns the summary information for stacks whose status matches the specified StackStatusFilter. Summary information for stacks that have been deleted is kept for 90 days after the stack is deleted. If no StackStatusFilter is specified, summary information for all stacks is returned (including existing stacks and stacks that have been deleted).
    */
  def listStacks(): Request[ListStacksOutput, AWSError] = js.native
  def listStacks(callback: js.Function2[/* err */ AWSError, /* data */ ListStacksOutput, Unit]): Request[ListStacksOutput, AWSError] = js.native
  /**
    * Returns the summary information for stacks whose status matches the specified StackStatusFilter. Summary information for stacks that have been deleted is kept for 90 days after the stack is deleted. If no StackStatusFilter is specified, summary information for all stacks is returned (including existing stacks and stacks that have been deleted).
    */
  def listStacks(params: ListStacksInput): Request[ListStacksOutput, AWSError] = js.native
  def listStacks(
    params: ListStacksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStacksOutput, Unit]
  ): Request[ListStacksOutput, AWSError] = js.native
  
  /**
    * Returns a list of registration tokens for the specified extension(s).
    */
  def listTypeRegistrations(): Request[ListTypeRegistrationsOutput, AWSError] = js.native
  def listTypeRegistrations(callback: js.Function2[/* err */ AWSError, /* data */ ListTypeRegistrationsOutput, Unit]): Request[ListTypeRegistrationsOutput, AWSError] = js.native
  /**
    * Returns a list of registration tokens for the specified extension(s).
    */
  def listTypeRegistrations(params: ListTypeRegistrationsInput): Request[ListTypeRegistrationsOutput, AWSError] = js.native
  def listTypeRegistrations(
    params: ListTypeRegistrationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTypeRegistrationsOutput, Unit]
  ): Request[ListTypeRegistrationsOutput, AWSError] = js.native
  
  /**
    * Returns summary information about the versions of an extension.
    */
  def listTypeVersions(): Request[ListTypeVersionsOutput, AWSError] = js.native
  def listTypeVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListTypeVersionsOutput, Unit]): Request[ListTypeVersionsOutput, AWSError] = js.native
  /**
    * Returns summary information about the versions of an extension.
    */
  def listTypeVersions(params: ListTypeVersionsInput): Request[ListTypeVersionsOutput, AWSError] = js.native
  def listTypeVersions(
    params: ListTypeVersionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTypeVersionsOutput, Unit]
  ): Request[ListTypeVersionsOutput, AWSError] = js.native
  
  /**
    * Returns summary information about extension that have been registered with CloudFormation.
    */
  def listTypes(): Request[ListTypesOutput, AWSError] = js.native
  def listTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListTypesOutput, Unit]): Request[ListTypesOutput, AWSError] = js.native
  /**
    * Returns summary information about extension that have been registered with CloudFormation.
    */
  def listTypes(params: ListTypesInput): Request[ListTypesOutput, AWSError] = js.native
  def listTypes(
    params: ListTypesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTypesOutput, Unit]
  ): Request[ListTypesOutput, AWSError] = js.native
  
  /**
    * Publishes the specified extension to the CloudFormation registry as a public extension in this region. Public extensions are available for use by all CloudFormation users. For more information about publishing extensions, see Publishing extensions to make them available for public use in the CloudFormation CLI User Guide. To publish an extension, you must be registered as a publisher with CloudFormation. For more information, see RegisterPublisher.
    */
  def publishType(): Request[PublishTypeOutput, AWSError] = js.native
  def publishType(callback: js.Function2[/* err */ AWSError, /* data */ PublishTypeOutput, Unit]): Request[PublishTypeOutput, AWSError] = js.native
  /**
    * Publishes the specified extension to the CloudFormation registry as a public extension in this region. Public extensions are available for use by all CloudFormation users. For more information about publishing extensions, see Publishing extensions to make them available for public use in the CloudFormation CLI User Guide. To publish an extension, you must be registered as a publisher with CloudFormation. For more information, see RegisterPublisher.
    */
  def publishType(params: PublishTypeInput): Request[PublishTypeOutput, AWSError] = js.native
  def publishType(
    params: PublishTypeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PublishTypeOutput, Unit]
  ): Request[PublishTypeOutput, AWSError] = js.native
  
  /**
    * Reports progress of a resource handler to CloudFormation. Reserved for use by the CloudFormation CLI. Don't use this API in your code.
    */
  def recordHandlerProgress(): Request[RecordHandlerProgressOutput, AWSError] = js.native
  def recordHandlerProgress(callback: js.Function2[/* err */ AWSError, /* data */ RecordHandlerProgressOutput, Unit]): Request[RecordHandlerProgressOutput, AWSError] = js.native
  /**
    * Reports progress of a resource handler to CloudFormation. Reserved for use by the CloudFormation CLI. Don't use this API in your code.
    */
  def recordHandlerProgress(params: RecordHandlerProgressInput): Request[RecordHandlerProgressOutput, AWSError] = js.native
  def recordHandlerProgress(
    params: RecordHandlerProgressInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RecordHandlerProgressOutput, Unit]
  ): Request[RecordHandlerProgressOutput, AWSError] = js.native
  
  /**
    * Registers your account as a publisher of public extensions in the CloudFormation registry. Public extensions are available for use by all CloudFormation users. This publisher ID applies to your account in all Amazon Web Services Regions. For information about requirements for registering as a public extension publisher, see Registering your account to publish CloudFormation extensions in the CloudFormation CLI User Guide. 
    */
  def registerPublisher(): Request[RegisterPublisherOutput, AWSError] = js.native
  def registerPublisher(callback: js.Function2[/* err */ AWSError, /* data */ RegisterPublisherOutput, Unit]): Request[RegisterPublisherOutput, AWSError] = js.native
  /**
    * Registers your account as a publisher of public extensions in the CloudFormation registry. Public extensions are available for use by all CloudFormation users. This publisher ID applies to your account in all Amazon Web Services Regions. For information about requirements for registering as a public extension publisher, see Registering your account to publish CloudFormation extensions in the CloudFormation CLI User Guide. 
    */
  def registerPublisher(params: RegisterPublisherInput): Request[RegisterPublisherOutput, AWSError] = js.native
  def registerPublisher(
    params: RegisterPublisherInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterPublisherOutput, Unit]
  ): Request[RegisterPublisherOutput, AWSError] = js.native
  
  /**
    * Registers an extension with the CloudFormation service. Registering an extension makes it available for use in CloudFormation templates in your Amazon Web Services account, and includes:   Validating the extension schema.   Determining which handlers, if any, have been specified for the extension.   Making the extension available for use in your account.   For more information about how to develop extensions and ready them for registration, see Creating Resource Providers in the CloudFormation CLI User Guide. You can have a maximum of 50 resource extension versions registered at a time. This maximum is per account and per region. Use DeregisterType to deregister specific extension versions if necessary. Once you have initiated a registration request using  RegisterType , you can use  DescribeTypeRegistration  to monitor the progress of the registration request. Once you have registered a private extension in your account and region, use SetTypeConfiguration to specify configuration properties for the extension. For more information, see Configuring extensions at the account level in the CloudFormation User Guide.
    */
  def registerType(): Request[RegisterTypeOutput, AWSError] = js.native
  def registerType(callback: js.Function2[/* err */ AWSError, /* data */ RegisterTypeOutput, Unit]): Request[RegisterTypeOutput, AWSError] = js.native
  /**
    * Registers an extension with the CloudFormation service. Registering an extension makes it available for use in CloudFormation templates in your Amazon Web Services account, and includes:   Validating the extension schema.   Determining which handlers, if any, have been specified for the extension.   Making the extension available for use in your account.   For more information about how to develop extensions and ready them for registration, see Creating Resource Providers in the CloudFormation CLI User Guide. You can have a maximum of 50 resource extension versions registered at a time. This maximum is per account and per region. Use DeregisterType to deregister specific extension versions if necessary. Once you have initiated a registration request using  RegisterType , you can use  DescribeTypeRegistration  to monitor the progress of the registration request. Once you have registered a private extension in your account and region, use SetTypeConfiguration to specify configuration properties for the extension. For more information, see Configuring extensions at the account level in the CloudFormation User Guide.
    */
  def registerType(params: RegisterTypeInput): Request[RegisterTypeOutput, AWSError] = js.native
  def registerType(
    params: RegisterTypeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterTypeOutput, Unit]
  ): Request[RegisterTypeOutput, AWSError] = js.native
  
  /**
    * When specifying RollbackStack, you preserve the state of previously provisioned resources when an operation fails. You can check the status of the stack through the DescribeStacks operation. Rolls back the specified stack to the last known stable state from CREATE_FAILED or UPDATE_FAILED stack statuses. This operation will delete a stack if it doesn't contain a last known stable state. A last known stable state includes any status in a *_COMPLETE. This includes the following stack statuses.    CREATE_COMPLETE     UPDATE_COMPLETE     UPDATE_ROLLBACK_COMPLETE     IMPORT_COMPLETE     IMPORT_ROLLBACK_COMPLETE   
    */
  def rollbackStack(): Request[RollbackStackOutput, AWSError] = js.native
  def rollbackStack(callback: js.Function2[/* err */ AWSError, /* data */ RollbackStackOutput, Unit]): Request[RollbackStackOutput, AWSError] = js.native
  /**
    * When specifying RollbackStack, you preserve the state of previously provisioned resources when an operation fails. You can check the status of the stack through the DescribeStacks operation. Rolls back the specified stack to the last known stable state from CREATE_FAILED or UPDATE_FAILED stack statuses. This operation will delete a stack if it doesn't contain a last known stable state. A last known stable state includes any status in a *_COMPLETE. This includes the following stack statuses.    CREATE_COMPLETE     UPDATE_COMPLETE     UPDATE_ROLLBACK_COMPLETE     IMPORT_COMPLETE     IMPORT_ROLLBACK_COMPLETE   
    */
  def rollbackStack(params: RollbackStackInput): Request[RollbackStackOutput, AWSError] = js.native
  def rollbackStack(
    params: RollbackStackInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RollbackStackOutput, Unit]
  ): Request[RollbackStackOutput, AWSError] = js.native
  
  /**
    * Sets a stack policy for a specified stack.
    */
  def setStackPolicy(): Request[js.Object, AWSError] = js.native
  def setStackPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets a stack policy for a specified stack.
    */
  def setStackPolicy(params: SetStackPolicyInput): Request[js.Object, AWSError] = js.native
  def setStackPolicy(
    params: SetStackPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Specifies the configuration data for a registered CloudFormation extension, in the given account and region. To view the current configuration data for an extension, refer to the ConfigurationSchema element of DescribeType. For more information, see Configuring extensions at the account level in the CloudFormation User Guide.  It's strongly recommended that you use dynamic references to restrict sensitive configuration definitions, such as third-party credentials. For more details on dynamic references, see Using dynamic references to specify template values in the CloudFormation User Guide. 
    */
  def setTypeConfiguration(): Request[SetTypeConfigurationOutput, AWSError] = js.native
  def setTypeConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ SetTypeConfigurationOutput, Unit]): Request[SetTypeConfigurationOutput, AWSError] = js.native
  /**
    * Specifies the configuration data for a registered CloudFormation extension, in the given account and region. To view the current configuration data for an extension, refer to the ConfigurationSchema element of DescribeType. For more information, see Configuring extensions at the account level in the CloudFormation User Guide.  It's strongly recommended that you use dynamic references to restrict sensitive configuration definitions, such as third-party credentials. For more details on dynamic references, see Using dynamic references to specify template values in the CloudFormation User Guide. 
    */
  def setTypeConfiguration(params: SetTypeConfigurationInput): Request[SetTypeConfigurationOutput, AWSError] = js.native
  def setTypeConfiguration(
    params: SetTypeConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SetTypeConfigurationOutput, Unit]
  ): Request[SetTypeConfigurationOutput, AWSError] = js.native
  
  /**
    * Specify the default version of an extension. The default version of an extension will be used in CloudFormation operations.
    */
  def setTypeDefaultVersion(): Request[SetTypeDefaultVersionOutput, AWSError] = js.native
  def setTypeDefaultVersion(callback: js.Function2[/* err */ AWSError, /* data */ SetTypeDefaultVersionOutput, Unit]): Request[SetTypeDefaultVersionOutput, AWSError] = js.native
  /**
    * Specify the default version of an extension. The default version of an extension will be used in CloudFormation operations.
    */
  def setTypeDefaultVersion(params: SetTypeDefaultVersionInput): Request[SetTypeDefaultVersionOutput, AWSError] = js.native
  def setTypeDefaultVersion(
    params: SetTypeDefaultVersionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SetTypeDefaultVersionOutput, Unit]
  ): Request[SetTypeDefaultVersionOutput, AWSError] = js.native
  
  /**
    * Sends a signal to the specified resource with a success or failure status. You can use the SignalResource operation in conjunction with a creation policy or update policy. CloudFormation doesn't proceed with a stack creation or update until resources receive the required number of signals or the timeout period is exceeded. The SignalResource operation is useful in cases where you want to send signals from anywhere other than an Amazon EC2 instance.
    */
  def signalResource(): Request[js.Object, AWSError] = js.native
  def signalResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sends a signal to the specified resource with a success or failure status. You can use the SignalResource operation in conjunction with a creation policy or update policy. CloudFormation doesn't proceed with a stack creation or update until resources receive the required number of signals or the timeout period is exceeded. The SignalResource operation is useful in cases where you want to send signals from anywhere other than an Amazon EC2 instance.
    */
  def signalResource(params: SignalResourceInput): Request[js.Object, AWSError] = js.native
  def signalResource(
    params: SignalResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops an in-progress operation on a stack set and its associated stack instances. StackSets will cancel all the unstarted stack instance deployments and wait for those are in-progress to complete.
    */
  def stopStackSetOperation(): Request[StopStackSetOperationOutput, AWSError] = js.native
  def stopStackSetOperation(callback: js.Function2[/* err */ AWSError, /* data */ StopStackSetOperationOutput, Unit]): Request[StopStackSetOperationOutput, AWSError] = js.native
  /**
    * Stops an in-progress operation on a stack set and its associated stack instances. StackSets will cancel all the unstarted stack instance deployments and wait for those are in-progress to complete.
    */
  def stopStackSetOperation(params: StopStackSetOperationInput): Request[StopStackSetOperationOutput, AWSError] = js.native
  def stopStackSetOperation(
    params: StopStackSetOperationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StopStackSetOperationOutput, Unit]
  ): Request[StopStackSetOperationOutput, AWSError] = js.native
  
  /**
    * Tests a registered extension to make sure it meets all necessary requirements for being published in the CloudFormation registry.   For resource types, this includes passing all contracts tests defined for the type.   For modules, this includes determining if the module's model meets all necessary requirements.   For more information, see Testing your public extension prior to publishing in the CloudFormation CLI User Guide. If you don't specify a version, CloudFormation uses the default version of the extension in your account and region for testing. To perform testing, CloudFormation assumes the execution role specified when the type was registered. For more information, see RegisterType. Once you've initiated testing on an extension using TestType, you can use DescribeType to monitor the current test status and test status description for the extension. An extension must have a test status of PASSED before it can be published. For more information, see Publishing extensions to make them available for public use in the CloudFormation CLI User Guide.
    */
  def testType(): Request[TestTypeOutput, AWSError] = js.native
  def testType(callback: js.Function2[/* err */ AWSError, /* data */ TestTypeOutput, Unit]): Request[TestTypeOutput, AWSError] = js.native
  /**
    * Tests a registered extension to make sure it meets all necessary requirements for being published in the CloudFormation registry.   For resource types, this includes passing all contracts tests defined for the type.   For modules, this includes determining if the module's model meets all necessary requirements.   For more information, see Testing your public extension prior to publishing in the CloudFormation CLI User Guide. If you don't specify a version, CloudFormation uses the default version of the extension in your account and region for testing. To perform testing, CloudFormation assumes the execution role specified when the type was registered. For more information, see RegisterType. Once you've initiated testing on an extension using TestType, you can use DescribeType to monitor the current test status and test status description for the extension. An extension must have a test status of PASSED before it can be published. For more information, see Publishing extensions to make them available for public use in the CloudFormation CLI User Guide.
    */
  def testType(params: TestTypeInput): Request[TestTypeOutput, AWSError] = js.native
  def testType(params: TestTypeInput, callback: js.Function2[/* err */ AWSError, /* data */ TestTypeOutput, Unit]): Request[TestTypeOutput, AWSError] = js.native
  
  /**
    * Updates a stack as specified in the template. After the call completes successfully, the stack update starts. You can check the status of the stack through the DescribeStacks action. To get a copy of the template for an existing stack, you can use the GetTemplate action. For more information about creating an update template, updating a stack, and monitoring the progress of the update, see Updating a Stack.
    */
  def updateStack(): Request[UpdateStackOutput, AWSError] = js.native
  def updateStack(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStackOutput, Unit]): Request[UpdateStackOutput, AWSError] = js.native
  /**
    * Updates a stack as specified in the template. After the call completes successfully, the stack update starts. You can check the status of the stack through the DescribeStacks action. To get a copy of the template for an existing stack, you can use the GetTemplate action. For more information about creating an update template, updating a stack, and monitoring the progress of the update, see Updating a Stack.
    */
  def updateStack(params: UpdateStackInput): Request[UpdateStackOutput, AWSError] = js.native
  def updateStack(
    params: UpdateStackInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStackOutput, Unit]
  ): Request[UpdateStackOutput, AWSError] = js.native
  
  /**
    * Updates the parameter values for stack instances for the specified accounts, within the specified Amazon Web Services Regions. A stack instance refers to a stack in a specific account and Region. You can only update stack instances in Amazon Web Services Regions and accounts where they already exist; to create additional stack instances, use CreateStackInstances. During stack set updates, any parameters overridden for a stack instance aren't updated, but retain their overridden value. You can only update the parameter values that are specified in the stack set; to add or delete a parameter itself, use UpdateStackSet to update the stack set template. If you add a parameter to a template, before you can override the parameter value specified in the stack set you must first use UpdateStackSet to update all stack instances with the updated template and parameter value specified in the stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter value using UpdateStackInstances.
    */
  def updateStackInstances(): Request[UpdateStackInstancesOutput, AWSError] = js.native
  def updateStackInstances(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStackInstancesOutput, Unit]): Request[UpdateStackInstancesOutput, AWSError] = js.native
  /**
    * Updates the parameter values for stack instances for the specified accounts, within the specified Amazon Web Services Regions. A stack instance refers to a stack in a specific account and Region. You can only update stack instances in Amazon Web Services Regions and accounts where they already exist; to create additional stack instances, use CreateStackInstances. During stack set updates, any parameters overridden for a stack instance aren't updated, but retain their overridden value. You can only update the parameter values that are specified in the stack set; to add or delete a parameter itself, use UpdateStackSet to update the stack set template. If you add a parameter to a template, before you can override the parameter value specified in the stack set you must first use UpdateStackSet to update all stack instances with the updated template and parameter value specified in the stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter value using UpdateStackInstances.
    */
  def updateStackInstances(params: UpdateStackInstancesInput): Request[UpdateStackInstancesOutput, AWSError] = js.native
  def updateStackInstances(
    params: UpdateStackInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStackInstancesOutput, Unit]
  ): Request[UpdateStackInstancesOutput, AWSError] = js.native
  
  /**
    * Updates the stack set, and associated stack instances in the specified accounts and Amazon Web Services Regions. Even if the stack set operation created by updating the stack set fails (completely or partially, below or above a specified failure tolerance), the stack set is updated with your changes. Subsequent CreateStackInstances calls on the specified stack set use the updated stack set.
    */
  def updateStackSet(): Request[UpdateStackSetOutput, AWSError] = js.native
  def updateStackSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStackSetOutput, Unit]): Request[UpdateStackSetOutput, AWSError] = js.native
  /**
    * Updates the stack set, and associated stack instances in the specified accounts and Amazon Web Services Regions. Even if the stack set operation created by updating the stack set fails (completely or partially, below or above a specified failure tolerance), the stack set is updated with your changes. Subsequent CreateStackInstances calls on the specified stack set use the updated stack set.
    */
  def updateStackSet(params: UpdateStackSetInput): Request[UpdateStackSetOutput, AWSError] = js.native
  def updateStackSet(
    params: UpdateStackSetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStackSetOutput, Unit]
  ): Request[UpdateStackSetOutput, AWSError] = js.native
  
  /**
    * Updates termination protection for the specified stack. If a user attempts to delete a stack with termination protection enabled, the operation fails and the stack remains unchanged. For more information, see Protecting a Stack From Being Deleted in the CloudFormation User Guide. For nested stacks, termination protection is set on the root stack and can't be changed directly on the nested stack.
    */
  def updateTerminationProtection(): Request[UpdateTerminationProtectionOutput, AWSError] = js.native
  def updateTerminationProtection(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTerminationProtectionOutput, Unit]): Request[UpdateTerminationProtectionOutput, AWSError] = js.native
  /**
    * Updates termination protection for the specified stack. If a user attempts to delete a stack with termination protection enabled, the operation fails and the stack remains unchanged. For more information, see Protecting a Stack From Being Deleted in the CloudFormation User Guide. For nested stacks, termination protection is set on the root stack and can't be changed directly on the nested stack.
    */
  def updateTerminationProtection(params: UpdateTerminationProtectionInput): Request[UpdateTerminationProtectionOutput, AWSError] = js.native
  def updateTerminationProtection(
    params: UpdateTerminationProtectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTerminationProtectionOutput, Unit]
  ): Request[UpdateTerminationProtectionOutput, AWSError] = js.native
  
  /**
    * Validates a specified template. CloudFormation first checks if the template is valid JSON. If it isn't, CloudFormation checks if the template is valid YAML. If both these checks fail, CloudFormation returns a template validation error.
    */
  def validateTemplate(): Request[ValidateTemplateOutput, AWSError] = js.native
  def validateTemplate(callback: js.Function2[/* err */ AWSError, /* data */ ValidateTemplateOutput, Unit]): Request[ValidateTemplateOutput, AWSError] = js.native
  /**
    * Validates a specified template. CloudFormation first checks if the template is valid JSON. If it isn't, CloudFormation checks if the template is valid YAML. If both these checks fail, CloudFormation returns a template validation error.
    */
  def validateTemplate(params: ValidateTemplateInput): Request[ValidateTemplateOutput, AWSError] = js.native
  def validateTemplate(
    params: ValidateTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ValidateTemplateOutput, Unit]
  ): Request[ValidateTemplateOutput, AWSError] = js.native
  
  /**
    * Waits for the changeSetCreateComplete state by periodically calling the underlying CloudFormation.describeChangeSetoperation every 30 seconds (at most 120 times). Wait until change set status is CREATE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_changeSetCreateComplete(state: changeSetCreateComplete): Request[DescribeChangeSetOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_changeSetCreateComplete(
    state: changeSetCreateComplete,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChangeSetOutput, Unit]
  ): Request[DescribeChangeSetOutput, AWSError] = js.native
  /**
    * Waits for the changeSetCreateComplete state by periodically calling the underlying CloudFormation.describeChangeSetoperation every 30 seconds (at most 120 times). Wait until change set status is CREATE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_changeSetCreateComplete(state: changeSetCreateComplete, params: DescribeChangeSetInputwai): Request[DescribeChangeSetOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_changeSetCreateComplete(
    state: changeSetCreateComplete,
    params: DescribeChangeSetInputwai,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChangeSetOutput, Unit]
  ): Request[DescribeChangeSetOutput, AWSError] = js.native
  /**
    * Waits for the stackCreateComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is CREATE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackCreateComplete(state: stackCreateComplete): Request[DescribeStacksOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stackCreateComplete(
    state: stackCreateComplete,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]
  ): Request[DescribeStacksOutput, AWSError] = js.native
  /**
    * Waits for the stackCreateComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is CREATE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackCreateComplete(state: stackCreateComplete, params: DescribeStacksInputwaiter): Request[DescribeStacksOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stackCreateComplete(
    state: stackCreateComplete,
    params: DescribeStacksInputwaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]
  ): Request[DescribeStacksOutput, AWSError] = js.native
  /**
    * Waits for the stackDeleteComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is DELETE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackDeleteComplete(state: stackDeleteComplete): Request[DescribeStacksOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stackDeleteComplete(
    state: stackDeleteComplete,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]
  ): Request[DescribeStacksOutput, AWSError] = js.native
  /**
    * Waits for the stackDeleteComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is DELETE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackDeleteComplete(state: stackDeleteComplete, params: DescribeStacksInputwaiter): Request[DescribeStacksOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stackDeleteComplete(
    state: stackDeleteComplete,
    params: DescribeStacksInputwaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]
  ): Request[DescribeStacksOutput, AWSError] = js.native
  /**
    * Waits for the stackExists state by periodically calling the underlying CloudFormation.describeStacksoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_stackExists(state: stackExists): Request[DescribeStacksOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stackExists(
    state: stackExists,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]
  ): Request[DescribeStacksOutput, AWSError] = js.native
  /**
    * Waits for the stackExists state by periodically calling the underlying CloudFormation.describeStacksoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_stackExists(state: stackExists, params: DescribeStacksInputwaiter): Request[DescribeStacksOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stackExists(
    state: stackExists,
    params: DescribeStacksInputwaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]
  ): Request[DescribeStacksOutput, AWSError] = js.native
  /**
    * Waits for the stackImportComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is IMPORT_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackImportComplete(state: stackImportComplete): Request[DescribeStacksOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stackImportComplete(
    state: stackImportComplete,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]
  ): Request[DescribeStacksOutput, AWSError] = js.native
  /**
    * Waits for the stackImportComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is IMPORT_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackImportComplete(state: stackImportComplete, params: DescribeStacksInputwaiter): Request[DescribeStacksOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stackImportComplete(
    state: stackImportComplete,
    params: DescribeStacksInputwaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]
  ): Request[DescribeStacksOutput, AWSError] = js.native
  /**
    * Waits for the stackRollbackComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is UPDATE_ROLLBACK_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackRollbackComplete(state: stackRollbackComplete): Request[DescribeStacksOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stackRollbackComplete(
    state: stackRollbackComplete,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]
  ): Request[DescribeStacksOutput, AWSError] = js.native
  /**
    * Waits for the stackRollbackComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is UPDATE_ROLLBACK_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackRollbackComplete(state: stackRollbackComplete, params: DescribeStacksInputwaiter): Request[DescribeStacksOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stackRollbackComplete(
    state: stackRollbackComplete,
    params: DescribeStacksInputwaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]
  ): Request[DescribeStacksOutput, AWSError] = js.native
  /**
    * Waits for the stackUpdateComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is UPDATE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackUpdateComplete(state: stackUpdateComplete): Request[DescribeStacksOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stackUpdateComplete(
    state: stackUpdateComplete,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]
  ): Request[DescribeStacksOutput, AWSError] = js.native
  /**
    * Waits for the stackUpdateComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is UPDATE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackUpdateComplete(state: stackUpdateComplete, params: DescribeStacksInputwaiter): Request[DescribeStacksOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stackUpdateComplete(
    state: stackUpdateComplete,
    params: DescribeStacksInputwaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksOutput, Unit]
  ): Request[DescribeStacksOutput, AWSError] = js.native
  /**
    * Waits for the typeRegistrationComplete state by periodically calling the underlying CloudFormation.describeTypeRegistrationoperation every 30 seconds (at most 120 times). Wait until type registration is COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_typeRegistrationComplete(state: typeRegistrationComplete): Request[DescribeTypeRegistrationOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_typeRegistrationComplete(
    state: typeRegistrationComplete,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTypeRegistrationOutput, Unit]
  ): Request[DescribeTypeRegistrationOutput, AWSError] = js.native
  /**
    * Waits for the typeRegistrationComplete state by periodically calling the underlying CloudFormation.describeTypeRegistrationoperation every 30 seconds (at most 120 times). Wait until type registration is COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_typeRegistrationComplete(state: typeRegistrationComplete, params: DescribeTypeRegistrationI): Request[DescribeTypeRegistrationOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_typeRegistrationComplete(
    state: typeRegistrationComplete,
    params: DescribeTypeRegistrationI,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTypeRegistrationOutput, Unit]
  ): Request[DescribeTypeRegistrationOutput, AWSError] = js.native
}
