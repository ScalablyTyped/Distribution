package typings.awsSdk.ssmMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSM extends Service {
  @JSName("config")
  var config_SSM: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds or overwrites one or more tags for the specified resource. Tags are metadata that you can assign to your documents, managed instances, maintenance windows, Parameter Store parameters, and patch baselines. Tags enable you to categorize your resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value, both of which you define. For example, you could define a set of tags for your account's managed instances that helps you track each instance's owner and stack level. For example: Key=Owner and Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production, Pre-Production, or Test. Each resource can have a maximum of 50 tags.  We recommend that you devise a set of tag keys that meets your needs for each resource type. Using a consistent set of tag keys makes it easier for you to manage your resources. You can search and filter the resources based on the tags you add. Tags don't have any semantic meaning to Amazon EC2 and are interpreted strictly as a string of characters.  For more information about tags, see Tagging Your Amazon EC2 Resources in the Amazon EC2 User Guide.
    */
  def addTagsToResource(): Request[AddTagsToResourceResult, AWSError] = js.native
  def addTagsToResource(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsToResourceResult, Unit]): Request[AddTagsToResourceResult, AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified resource. Tags are metadata that you can assign to your documents, managed instances, maintenance windows, Parameter Store parameters, and patch baselines. Tags enable you to categorize your resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value, both of which you define. For example, you could define a set of tags for your account's managed instances that helps you track each instance's owner and stack level. For example: Key=Owner and Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production, Pre-Production, or Test. Each resource can have a maximum of 50 tags.  We recommend that you devise a set of tag keys that meets your needs for each resource type. Using a consistent set of tag keys makes it easier for you to manage your resources. You can search and filter the resources based on the tags you add. Tags don't have any semantic meaning to Amazon EC2 and are interpreted strictly as a string of characters.  For more information about tags, see Tagging Your Amazon EC2 Resources in the Amazon EC2 User Guide.
    */
  def addTagsToResource(params: AddTagsToResourceRequest): Request[AddTagsToResourceResult, AWSError] = js.native
  def addTagsToResource(
    params: AddTagsToResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddTagsToResourceResult, Unit]
  ): Request[AddTagsToResourceResult, AWSError] = js.native
  /**
    * Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be terminated and the underlying process stopped.
    */
  def cancelCommand(): Request[CancelCommandResult, AWSError] = js.native
  def cancelCommand(callback: js.Function2[/* err */ AWSError, /* data */ CancelCommandResult, Unit]): Request[CancelCommandResult, AWSError] = js.native
  /**
    * Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be terminated and the underlying process stopped.
    */
  def cancelCommand(params: CancelCommandRequest): Request[CancelCommandResult, AWSError] = js.native
  def cancelCommand(
    params: CancelCommandRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelCommandResult, Unit]
  ): Request[CancelCommandResult, AWSError] = js.native
  /**
    * Stops a maintenance window execution that is already in progress and cancels any tasks in the window that have not already starting running. (Tasks already in progress will continue to completion.)
    */
  def cancelMaintenanceWindowExecution(): Request[CancelMaintenanceWindowExecutionResult, AWSError] = js.native
  def cancelMaintenanceWindowExecution(
    callback: js.Function2[/* err */ AWSError, /* data */ CancelMaintenanceWindowExecutionResult, Unit]
  ): Request[CancelMaintenanceWindowExecutionResult, AWSError] = js.native
  /**
    * Stops a maintenance window execution that is already in progress and cancels any tasks in the window that have not already starting running. (Tasks already in progress will continue to completion.)
    */
  def cancelMaintenanceWindowExecution(params: CancelMaintenanceWindowExecutionRequest): Request[CancelMaintenanceWindowExecutionResult, AWSError] = js.native
  def cancelMaintenanceWindowExecution(
    params: CancelMaintenanceWindowExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelMaintenanceWindowExecutionResult, Unit]
  ): Request[CancelMaintenanceWindowExecutionResult, AWSError] = js.native
  /**
    * Generates an activation code and activation ID you can use to register your on-premises server or virtual machine (VM) with Systems Manager. Registering these machines with Systems Manager makes it possible to manage them using Systems Manager capabilities. You use the activation code and ID when installing SSM Agent on machines in your hybrid environment. For more information about requirements for managing on-premises instances and VMs using Systems Manager, see Setting Up AWS Systems Manager for Hybrid Environments in the AWS Systems Manager User Guide.   On-premises servers or VMs that are registered with Systems Manager and Amazon EC2 instances that you manage with Systems Manager are all called managed instances. 
    */
  def createActivation(): Request[CreateActivationResult, AWSError] = js.native
  def createActivation(callback: js.Function2[/* err */ AWSError, /* data */ CreateActivationResult, Unit]): Request[CreateActivationResult, AWSError] = js.native
  /**
    * Generates an activation code and activation ID you can use to register your on-premises server or virtual machine (VM) with Systems Manager. Registering these machines with Systems Manager makes it possible to manage them using Systems Manager capabilities. You use the activation code and ID when installing SSM Agent on machines in your hybrid environment. For more information about requirements for managing on-premises instances and VMs using Systems Manager, see Setting Up AWS Systems Manager for Hybrid Environments in the AWS Systems Manager User Guide.   On-premises servers or VMs that are registered with Systems Manager and Amazon EC2 instances that you manage with Systems Manager are all called managed instances. 
    */
  def createActivation(params: CreateActivationRequest): Request[CreateActivationResult, AWSError] = js.native
  def createActivation(
    params: CreateActivationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateActivationResult, Unit]
  ): Request[CreateActivationResult, AWSError] = js.native
  /**
    * Associates the specified Systems Manager document with the specified instances or targets. When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the instance processes the document and configures the instance as specified. If you associate a document with an instance that already has an associated document, the system returns the AssociationAlreadyExists exception.
    */
  def createAssociation(): Request[CreateAssociationResult, AWSError] = js.native
  def createAssociation(callback: js.Function2[/* err */ AWSError, /* data */ CreateAssociationResult, Unit]): Request[CreateAssociationResult, AWSError] = js.native
  /**
    * Associates the specified Systems Manager document with the specified instances or targets. When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the instance processes the document and configures the instance as specified. If you associate a document with an instance that already has an associated document, the system returns the AssociationAlreadyExists exception.
    */
  def createAssociation(params: CreateAssociationRequest): Request[CreateAssociationResult, AWSError] = js.native
  def createAssociation(
    params: CreateAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAssociationResult, Unit]
  ): Request[CreateAssociationResult, AWSError] = js.native
  /**
    * Associates the specified Systems Manager document with the specified instances or targets. When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the instance processes the document and configures the instance as specified. If you associate a document with an instance that already has an associated document, the system returns the AssociationAlreadyExists exception.
    */
  def createAssociationBatch(): Request[CreateAssociationBatchResult, AWSError] = js.native
  def createAssociationBatch(callback: js.Function2[/* err */ AWSError, /* data */ CreateAssociationBatchResult, Unit]): Request[CreateAssociationBatchResult, AWSError] = js.native
  /**
    * Associates the specified Systems Manager document with the specified instances or targets. When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the instance processes the document and configures the instance as specified. If you associate a document with an instance that already has an associated document, the system returns the AssociationAlreadyExists exception.
    */
  def createAssociationBatch(params: CreateAssociationBatchRequest): Request[CreateAssociationBatchResult, AWSError] = js.native
  def createAssociationBatch(
    params: CreateAssociationBatchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAssociationBatchResult, Unit]
  ): Request[CreateAssociationBatchResult, AWSError] = js.native
  /**
    * Creates a Systems Manager document. After you create a document, you can use CreateAssociation to associate it with one or more running instances.
    */
  def createDocument(): Request[CreateDocumentResult, AWSError] = js.native
  def createDocument(callback: js.Function2[/* err */ AWSError, /* data */ CreateDocumentResult, Unit]): Request[CreateDocumentResult, AWSError] = js.native
  /**
    * Creates a Systems Manager document. After you create a document, you can use CreateAssociation to associate it with one or more running instances.
    */
  def createDocument(params: CreateDocumentRequest): Request[CreateDocumentResult, AWSError] = js.native
  def createDocument(
    params: CreateDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDocumentResult, Unit]
  ): Request[CreateDocumentResult, AWSError] = js.native
  /**
    * Creates a new maintenance window.  The value you specify for Duration determines the specific end time for the maintenance window based on the time it begins. No maintenance window tasks are permitted to start after the resulting endtime minus the number of hours you specify for Cutoff. For example, if the maintenance window starts at 3 PM, the duration is three hours, and the value you specify for Cutoff is one hour, no maintenance window tasks can start after 5 PM. 
    */
  def createMaintenanceWindow(): Request[CreateMaintenanceWindowResult, AWSError] = js.native
  def createMaintenanceWindow(callback: js.Function2[/* err */ AWSError, /* data */ CreateMaintenanceWindowResult, Unit]): Request[CreateMaintenanceWindowResult, AWSError] = js.native
  /**
    * Creates a new maintenance window.  The value you specify for Duration determines the specific end time for the maintenance window based on the time it begins. No maintenance window tasks are permitted to start after the resulting endtime minus the number of hours you specify for Cutoff. For example, if the maintenance window starts at 3 PM, the duration is three hours, and the value you specify for Cutoff is one hour, no maintenance window tasks can start after 5 PM. 
    */
  def createMaintenanceWindow(params: CreateMaintenanceWindowRequest): Request[CreateMaintenanceWindowResult, AWSError] = js.native
  def createMaintenanceWindow(
    params: CreateMaintenanceWindowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMaintenanceWindowResult, Unit]
  ): Request[CreateMaintenanceWindowResult, AWSError] = js.native
  /**
    * Creates a new OpsItem. You must have permission in AWS Identity and Access Management (IAM) to create a new OpsItem. For more information, see Getting Started with OpsCenter in the AWS Systems Manager User Guide. Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager OpsCenter in the AWS Systems Manager User Guide. 
    */
  def createOpsItem(): Request[CreateOpsItemResponse, AWSError] = js.native
  def createOpsItem(callback: js.Function2[/* err */ AWSError, /* data */ CreateOpsItemResponse, Unit]): Request[CreateOpsItemResponse, AWSError] = js.native
  /**
    * Creates a new OpsItem. You must have permission in AWS Identity and Access Management (IAM) to create a new OpsItem. For more information, see Getting Started with OpsCenter in the AWS Systems Manager User Guide. Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager OpsCenter in the AWS Systems Manager User Guide. 
    */
  def createOpsItem(params: CreateOpsItemRequest): Request[CreateOpsItemResponse, AWSError] = js.native
  def createOpsItem(
    params: CreateOpsItemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateOpsItemResponse, Unit]
  ): Request[CreateOpsItemResponse, AWSError] = js.native
  /**
    * Creates a patch baseline.  For information about valid key and value pairs in PatchFilters for each supported operating system type, see PatchFilter. 
    */
  def createPatchBaseline(): Request[CreatePatchBaselineResult, AWSError] = js.native
  def createPatchBaseline(callback: js.Function2[/* err */ AWSError, /* data */ CreatePatchBaselineResult, Unit]): Request[CreatePatchBaselineResult, AWSError] = js.native
  /**
    * Creates a patch baseline.  For information about valid key and value pairs in PatchFilters for each supported operating system type, see PatchFilter. 
    */
  def createPatchBaseline(params: CreatePatchBaselineRequest): Request[CreatePatchBaselineResult, AWSError] = js.native
  def createPatchBaseline(
    params: CreatePatchBaselineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePatchBaselineResult, Unit]
  ): Request[CreatePatchBaselineResult, AWSError] = js.native
  /**
    * A resource data sync helps you view data from multiple sources in a single location. Systems Manager offers two types of resource data sync: SyncToDestination and SyncFromSource. You can configure Systems Manager Inventory to use the SyncToDestination type to synchronize Inventory data from multiple AWS Regions to a single Amazon S3 bucket. For more information, see Configuring Resource Data Sync for Inventory in the AWS Systems Manager User Guide. You can configure Systems Manager Explorer to use the SyncToDestination type to synchronize operational work items (OpsItems) and operational data (OpsData) from multiple AWS Regions to a single Amazon S3 bucket. You can also configure Explorer to use the SyncFromSource type. This type synchronizes OpsItems and OpsData from multiple AWS accounts and Regions by using AWS Organizations. For more information, see Setting Up Explorer to Display Data from Multiple Accounts and Regions in the AWS Systems Manager User Guide. A resource data sync is an asynchronous operation that returns immediately. After a successful initial sync is completed, the system continuously syncs data. To check the status of a sync, use the ListResourceDataSync.  By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a restrictive bucket policy.  
    */
  def createResourceDataSync(): Request[CreateResourceDataSyncResult, AWSError] = js.native
  def createResourceDataSync(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceDataSyncResult, Unit]): Request[CreateResourceDataSyncResult, AWSError] = js.native
  /**
    * A resource data sync helps you view data from multiple sources in a single location. Systems Manager offers two types of resource data sync: SyncToDestination and SyncFromSource. You can configure Systems Manager Inventory to use the SyncToDestination type to synchronize Inventory data from multiple AWS Regions to a single Amazon S3 bucket. For more information, see Configuring Resource Data Sync for Inventory in the AWS Systems Manager User Guide. You can configure Systems Manager Explorer to use the SyncToDestination type to synchronize operational work items (OpsItems) and operational data (OpsData) from multiple AWS Regions to a single Amazon S3 bucket. You can also configure Explorer to use the SyncFromSource type. This type synchronizes OpsItems and OpsData from multiple AWS accounts and Regions by using AWS Organizations. For more information, see Setting Up Explorer to Display Data from Multiple Accounts and Regions in the AWS Systems Manager User Guide. A resource data sync is an asynchronous operation that returns immediately. After a successful initial sync is completed, the system continuously syncs data. To check the status of a sync, use the ListResourceDataSync.  By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a restrictive bucket policy.  
    */
  def createResourceDataSync(params: CreateResourceDataSyncRequest): Request[CreateResourceDataSyncResult, AWSError] = js.native
  def createResourceDataSync(
    params: CreateResourceDataSyncRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceDataSyncResult, Unit]
  ): Request[CreateResourceDataSyncResult, AWSError] = js.native
  /**
    * Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no longer use it to register additional managed instances. Deleting an activation does not de-register managed instances. You must manually de-register managed instances.
    */
  def deleteActivation(): Request[DeleteActivationResult, AWSError] = js.native
  def deleteActivation(callback: js.Function2[/* err */ AWSError, /* data */ DeleteActivationResult, Unit]): Request[DeleteActivationResult, AWSError] = js.native
  /**
    * Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no longer use it to register additional managed instances. Deleting an activation does not de-register managed instances. You must manually de-register managed instances.
    */
  def deleteActivation(params: DeleteActivationRequest): Request[DeleteActivationResult, AWSError] = js.native
  def deleteActivation(
    params: DeleteActivationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteActivationResult, Unit]
  ): Request[DeleteActivationResult, AWSError] = js.native
  /**
    * Disassociates the specified Systems Manager document from the specified instance. When you disassociate a document from an instance, it does not change the configuration of the instance. To change the configuration state of an instance after you disassociate a document, you must create a new document with the desired configuration and associate it with the instance.
    */
  def deleteAssociation(): Request[DeleteAssociationResult, AWSError] = js.native
  def deleteAssociation(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssociationResult, Unit]): Request[DeleteAssociationResult, AWSError] = js.native
  /**
    * Disassociates the specified Systems Manager document from the specified instance. When you disassociate a document from an instance, it does not change the configuration of the instance. To change the configuration state of an instance after you disassociate a document, you must create a new document with the desired configuration and associate it with the instance.
    */
  def deleteAssociation(params: DeleteAssociationRequest): Request[DeleteAssociationResult, AWSError] = js.native
  def deleteAssociation(
    params: DeleteAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssociationResult, Unit]
  ): Request[DeleteAssociationResult, AWSError] = js.native
  /**
    * Deletes the Systems Manager document and all instance associations to the document. Before you delete the document, we recommend that you use DeleteAssociation to disassociate all instances that are associated with the document.
    */
  def deleteDocument(): Request[DeleteDocumentResult, AWSError] = js.native
  def deleteDocument(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDocumentResult, Unit]): Request[DeleteDocumentResult, AWSError] = js.native
  /**
    * Deletes the Systems Manager document and all instance associations to the document. Before you delete the document, we recommend that you use DeleteAssociation to disassociate all instances that are associated with the document.
    */
  def deleteDocument(params: DeleteDocumentRequest): Request[DeleteDocumentResult, AWSError] = js.native
  def deleteDocument(
    params: DeleteDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDocumentResult, Unit]
  ): Request[DeleteDocumentResult, AWSError] = js.native
  /**
    * Delete a custom inventory type, or the data associated with a custom Inventory type. Deleting a custom inventory type is also referred to as deleting a custom inventory schema.
    */
  def deleteInventory(): Request[DeleteInventoryResult, AWSError] = js.native
  def deleteInventory(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInventoryResult, Unit]): Request[DeleteInventoryResult, AWSError] = js.native
  /**
    * Delete a custom inventory type, or the data associated with a custom Inventory type. Deleting a custom inventory type is also referred to as deleting a custom inventory schema.
    */
  def deleteInventory(params: DeleteInventoryRequest): Request[DeleteInventoryResult, AWSError] = js.native
  def deleteInventory(
    params: DeleteInventoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInventoryResult, Unit]
  ): Request[DeleteInventoryResult, AWSError] = js.native
  /**
    * Deletes a maintenance window.
    */
  def deleteMaintenanceWindow(): Request[DeleteMaintenanceWindowResult, AWSError] = js.native
  def deleteMaintenanceWindow(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMaintenanceWindowResult, Unit]): Request[DeleteMaintenanceWindowResult, AWSError] = js.native
  /**
    * Deletes a maintenance window.
    */
  def deleteMaintenanceWindow(params: DeleteMaintenanceWindowRequest): Request[DeleteMaintenanceWindowResult, AWSError] = js.native
  def deleteMaintenanceWindow(
    params: DeleteMaintenanceWindowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMaintenanceWindowResult, Unit]
  ): Request[DeleteMaintenanceWindowResult, AWSError] = js.native
  /**
    * Delete a parameter from the system.
    */
  def deleteParameter(): Request[DeleteParameterResult, AWSError] = js.native
  def deleteParameter(callback: js.Function2[/* err */ AWSError, /* data */ DeleteParameterResult, Unit]): Request[DeleteParameterResult, AWSError] = js.native
  /**
    * Delete a parameter from the system.
    */
  def deleteParameter(params: DeleteParameterRequest): Request[DeleteParameterResult, AWSError] = js.native
  def deleteParameter(
    params: DeleteParameterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteParameterResult, Unit]
  ): Request[DeleteParameterResult, AWSError] = js.native
  /**
    * Delete a list of parameters.
    */
  def deleteParameters(): Request[DeleteParametersResult, AWSError] = js.native
  def deleteParameters(callback: js.Function2[/* err */ AWSError, /* data */ DeleteParametersResult, Unit]): Request[DeleteParametersResult, AWSError] = js.native
  /**
    * Delete a list of parameters.
    */
  def deleteParameters(params: DeleteParametersRequest): Request[DeleteParametersResult, AWSError] = js.native
  def deleteParameters(
    params: DeleteParametersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteParametersResult, Unit]
  ): Request[DeleteParametersResult, AWSError] = js.native
  /**
    * Deletes a patch baseline.
    */
  def deletePatchBaseline(): Request[DeletePatchBaselineResult, AWSError] = js.native
  def deletePatchBaseline(callback: js.Function2[/* err */ AWSError, /* data */ DeletePatchBaselineResult, Unit]): Request[DeletePatchBaselineResult, AWSError] = js.native
  /**
    * Deletes a patch baseline.
    */
  def deletePatchBaseline(params: DeletePatchBaselineRequest): Request[DeletePatchBaselineResult, AWSError] = js.native
  def deletePatchBaseline(
    params: DeletePatchBaselineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePatchBaselineResult, Unit]
  ): Request[DeletePatchBaselineResult, AWSError] = js.native
  /**
    * Deletes a Resource Data Sync configuration. After the configuration is deleted, changes to data on managed instances are no longer synced to or from the target. Deleting a sync configuration does not delete data.
    */
  def deleteResourceDataSync(): Request[DeleteResourceDataSyncResult, AWSError] = js.native
  def deleteResourceDataSync(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceDataSyncResult, Unit]): Request[DeleteResourceDataSyncResult, AWSError] = js.native
  /**
    * Deletes a Resource Data Sync configuration. After the configuration is deleted, changes to data on managed instances are no longer synced to or from the target. Deleting a sync configuration does not delete data.
    */
  def deleteResourceDataSync(params: DeleteResourceDataSyncRequest): Request[DeleteResourceDataSyncResult, AWSError] = js.native
  def deleteResourceDataSync(
    params: DeleteResourceDataSyncRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceDataSyncResult, Unit]
  ): Request[DeleteResourceDataSyncResult, AWSError] = js.native
  /**
    * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again at any time. If you don't plan to use Run Command on the server, we suggest uninstalling SSM Agent first.
    */
  def deregisterManagedInstance(): Request[DeregisterManagedInstanceResult, AWSError] = js.native
  def deregisterManagedInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterManagedInstanceResult, Unit]): Request[DeregisterManagedInstanceResult, AWSError] = js.native
  /**
    * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again at any time. If you don't plan to use Run Command on the server, we suggest uninstalling SSM Agent first.
    */
  def deregisterManagedInstance(params: DeregisterManagedInstanceRequest): Request[DeregisterManagedInstanceResult, AWSError] = js.native
  def deregisterManagedInstance(
    params: DeregisterManagedInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterManagedInstanceResult, Unit]
  ): Request[DeregisterManagedInstanceResult, AWSError] = js.native
  /**
    * Removes a patch group from a patch baseline.
    */
  def deregisterPatchBaselineForPatchGroup(): Request[DeregisterPatchBaselineForPatchGroupResult, AWSError] = js.native
  def deregisterPatchBaselineForPatchGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterPatchBaselineForPatchGroupResult, Unit]
  ): Request[DeregisterPatchBaselineForPatchGroupResult, AWSError] = js.native
  /**
    * Removes a patch group from a patch baseline.
    */
  def deregisterPatchBaselineForPatchGroup(params: DeregisterPatchBaselineForPatchGroupRequest): Request[DeregisterPatchBaselineForPatchGroupResult, AWSError] = js.native
  def deregisterPatchBaselineForPatchGroup(
    params: DeregisterPatchBaselineForPatchGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterPatchBaselineForPatchGroupResult, Unit]
  ): Request[DeregisterPatchBaselineForPatchGroupResult, AWSError] = js.native
  /**
    * Removes a target from a maintenance window.
    */
  def deregisterTargetFromMaintenanceWindow(): Request[DeregisterTargetFromMaintenanceWindowResult, AWSError] = js.native
  def deregisterTargetFromMaintenanceWindow(
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTargetFromMaintenanceWindowResult, Unit]
  ): Request[DeregisterTargetFromMaintenanceWindowResult, AWSError] = js.native
  /**
    * Removes a target from a maintenance window.
    */
  def deregisterTargetFromMaintenanceWindow(params: DeregisterTargetFromMaintenanceWindowRequest): Request[DeregisterTargetFromMaintenanceWindowResult, AWSError] = js.native
  def deregisterTargetFromMaintenanceWindow(
    params: DeregisterTargetFromMaintenanceWindowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTargetFromMaintenanceWindowResult, Unit]
  ): Request[DeregisterTargetFromMaintenanceWindowResult, AWSError] = js.native
  /**
    * Removes a task from a maintenance window.
    */
  def deregisterTaskFromMaintenanceWindow(): Request[DeregisterTaskFromMaintenanceWindowResult, AWSError] = js.native
  def deregisterTaskFromMaintenanceWindow(
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTaskFromMaintenanceWindowResult, Unit]
  ): Request[DeregisterTaskFromMaintenanceWindowResult, AWSError] = js.native
  /**
    * Removes a task from a maintenance window.
    */
  def deregisterTaskFromMaintenanceWindow(params: DeregisterTaskFromMaintenanceWindowRequest): Request[DeregisterTaskFromMaintenanceWindowResult, AWSError] = js.native
  def deregisterTaskFromMaintenanceWindow(
    params: DeregisterTaskFromMaintenanceWindowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTaskFromMaintenanceWindowResult, Unit]
  ): Request[DeregisterTaskFromMaintenanceWindowResult, AWSError] = js.native
  /**
    * Describes details about the activation, such as the date and time the activation was created, its expiration date, the IAM role assigned to the instances in the activation, and the number of instances registered by using this activation.
    */
  def describeActivations(): Request[DescribeActivationsResult, AWSError] = js.native
  def describeActivations(callback: js.Function2[/* err */ AWSError, /* data */ DescribeActivationsResult, Unit]): Request[DescribeActivationsResult, AWSError] = js.native
  /**
    * Describes details about the activation, such as the date and time the activation was created, its expiration date, the IAM role assigned to the instances in the activation, and the number of instances registered by using this activation.
    */
  def describeActivations(params: DescribeActivationsRequest): Request[DescribeActivationsResult, AWSError] = js.native
  def describeActivations(
    params: DescribeActivationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeActivationsResult, Unit]
  ): Request[DescribeActivationsResult, AWSError] = js.native
  /**
    * Describes the association for the specified target or instance. If you created the association by using the Targets parameter, then you must retrieve the association by using the association ID. If you created the association by specifying an instance ID and a Systems Manager document, then you retrieve the association by specifying the document name and the instance ID. 
    */
  def describeAssociation(): Request[DescribeAssociationResult, AWSError] = js.native
  def describeAssociation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssociationResult, Unit]): Request[DescribeAssociationResult, AWSError] = js.native
  /**
    * Describes the association for the specified target or instance. If you created the association by using the Targets parameter, then you must retrieve the association by using the association ID. If you created the association by specifying an instance ID and a Systems Manager document, then you retrieve the association by specifying the document name and the instance ID. 
    */
  def describeAssociation(params: DescribeAssociationRequest): Request[DescribeAssociationResult, AWSError] = js.native
  def describeAssociation(
    params: DescribeAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssociationResult, Unit]
  ): Request[DescribeAssociationResult, AWSError] = js.native
  /**
    * Use this API action to view information about a specific execution of a specific association.
    */
  def describeAssociationExecutionTargets(): Request[DescribeAssociationExecutionTargetsResult, AWSError] = js.native
  def describeAssociationExecutionTargets(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssociationExecutionTargetsResult, Unit]
  ): Request[DescribeAssociationExecutionTargetsResult, AWSError] = js.native
  /**
    * Use this API action to view information about a specific execution of a specific association.
    */
  def describeAssociationExecutionTargets(params: DescribeAssociationExecutionTargetsRequest): Request[DescribeAssociationExecutionTargetsResult, AWSError] = js.native
  def describeAssociationExecutionTargets(
    params: DescribeAssociationExecutionTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssociationExecutionTargetsResult, Unit]
  ): Request[DescribeAssociationExecutionTargetsResult, AWSError] = js.native
  /**
    * Use this API action to view all executions for a specific association ID. 
    */
  def describeAssociationExecutions(): Request[DescribeAssociationExecutionsResult, AWSError] = js.native
  def describeAssociationExecutions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssociationExecutionsResult, Unit]): Request[DescribeAssociationExecutionsResult, AWSError] = js.native
  /**
    * Use this API action to view all executions for a specific association ID. 
    */
  def describeAssociationExecutions(params: DescribeAssociationExecutionsRequest): Request[DescribeAssociationExecutionsResult, AWSError] = js.native
  def describeAssociationExecutions(
    params: DescribeAssociationExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssociationExecutionsResult, Unit]
  ): Request[DescribeAssociationExecutionsResult, AWSError] = js.native
  /**
    * Provides details about all active and terminated Automation executions.
    */
  def describeAutomationExecutions(): Request[DescribeAutomationExecutionsResult, AWSError] = js.native
  def describeAutomationExecutions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAutomationExecutionsResult, Unit]): Request[DescribeAutomationExecutionsResult, AWSError] = js.native
  /**
    * Provides details about all active and terminated Automation executions.
    */
  def describeAutomationExecutions(params: DescribeAutomationExecutionsRequest): Request[DescribeAutomationExecutionsResult, AWSError] = js.native
  def describeAutomationExecutions(
    params: DescribeAutomationExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAutomationExecutionsResult, Unit]
  ): Request[DescribeAutomationExecutionsResult, AWSError] = js.native
  /**
    * Information about all active and terminated step executions in an Automation workflow.
    */
  def describeAutomationStepExecutions(): Request[DescribeAutomationStepExecutionsResult, AWSError] = js.native
  def describeAutomationStepExecutions(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAutomationStepExecutionsResult, Unit]
  ): Request[DescribeAutomationStepExecutionsResult, AWSError] = js.native
  /**
    * Information about all active and terminated step executions in an Automation workflow.
    */
  def describeAutomationStepExecutions(params: DescribeAutomationStepExecutionsRequest): Request[DescribeAutomationStepExecutionsResult, AWSError] = js.native
  def describeAutomationStepExecutions(
    params: DescribeAutomationStepExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAutomationStepExecutionsResult, Unit]
  ): Request[DescribeAutomationStepExecutionsResult, AWSError] = js.native
  /**
    * Lists all patches eligible to be included in a patch baseline.
    */
  def describeAvailablePatches(): Request[DescribeAvailablePatchesResult, AWSError] = js.native
  def describeAvailablePatches(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAvailablePatchesResult, Unit]): Request[DescribeAvailablePatchesResult, AWSError] = js.native
  /**
    * Lists all patches eligible to be included in a patch baseline.
    */
  def describeAvailablePatches(params: DescribeAvailablePatchesRequest): Request[DescribeAvailablePatchesResult, AWSError] = js.native
  def describeAvailablePatches(
    params: DescribeAvailablePatchesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAvailablePatchesResult, Unit]
  ): Request[DescribeAvailablePatchesResult, AWSError] = js.native
  /**
    * Describes the specified Systems Manager document.
    */
  def describeDocument(): Request[DescribeDocumentResult, AWSError] = js.native
  def describeDocument(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDocumentResult, Unit]): Request[DescribeDocumentResult, AWSError] = js.native
  /**
    * Describes the specified Systems Manager document.
    */
  def describeDocument(params: DescribeDocumentRequest): Request[DescribeDocumentResult, AWSError] = js.native
  def describeDocument(
    params: DescribeDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDocumentResult, Unit]
  ): Request[DescribeDocumentResult, AWSError] = js.native
  /**
    * Describes the permissions for a Systems Manager document. If you created the document, you are the owner. If a document is shared, it can either be shared privately (by specifying a user's AWS account ID) or publicly (All). 
    */
  def describeDocumentPermission(): Request[DescribeDocumentPermissionResponse, AWSError] = js.native
  def describeDocumentPermission(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDocumentPermissionResponse, Unit]): Request[DescribeDocumentPermissionResponse, AWSError] = js.native
  /**
    * Describes the permissions for a Systems Manager document. If you created the document, you are the owner. If a document is shared, it can either be shared privately (by specifying a user's AWS account ID) or publicly (All). 
    */
  def describeDocumentPermission(params: DescribeDocumentPermissionRequest): Request[DescribeDocumentPermissionResponse, AWSError] = js.native
  def describeDocumentPermission(
    params: DescribeDocumentPermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDocumentPermissionResponse, Unit]
  ): Request[DescribeDocumentPermissionResponse, AWSError] = js.native
  /**
    * All associations for the instance(s).
    */
  def describeEffectiveInstanceAssociations(): Request[DescribeEffectiveInstanceAssociationsResult, AWSError] = js.native
  def describeEffectiveInstanceAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEffectiveInstanceAssociationsResult, Unit]
  ): Request[DescribeEffectiveInstanceAssociationsResult, AWSError] = js.native
  /**
    * All associations for the instance(s).
    */
  def describeEffectiveInstanceAssociations(params: DescribeEffectiveInstanceAssociationsRequest): Request[DescribeEffectiveInstanceAssociationsResult, AWSError] = js.native
  def describeEffectiveInstanceAssociations(
    params: DescribeEffectiveInstanceAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEffectiveInstanceAssociationsResult, Unit]
  ): Request[DescribeEffectiveInstanceAssociationsResult, AWSError] = js.native
  /**
    * Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline. Note that this API applies only to Windows patch baselines.
    */
  def describeEffectivePatchesForPatchBaseline(): Request[DescribeEffectivePatchesForPatchBaselineResult, AWSError] = js.native
  def describeEffectivePatchesForPatchBaseline(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEffectivePatchesForPatchBaselineResult, Unit]
  ): Request[DescribeEffectivePatchesForPatchBaselineResult, AWSError] = js.native
  /**
    * Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline. Note that this API applies only to Windows patch baselines.
    */
  def describeEffectivePatchesForPatchBaseline(params: DescribeEffectivePatchesForPatchBaselineRequest): Request[DescribeEffectivePatchesForPatchBaselineResult, AWSError] = js.native
  def describeEffectivePatchesForPatchBaseline(
    params: DescribeEffectivePatchesForPatchBaselineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEffectivePatchesForPatchBaselineResult, Unit]
  ): Request[DescribeEffectivePatchesForPatchBaselineResult, AWSError] = js.native
  /**
    * The status of the associations for the instance(s).
    */
  def describeInstanceAssociationsStatus(): Request[DescribeInstanceAssociationsStatusResult, AWSError] = js.native
  def describeInstanceAssociationsStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceAssociationsStatusResult, Unit]
  ): Request[DescribeInstanceAssociationsStatusResult, AWSError] = js.native
  /**
    * The status of the associations for the instance(s).
    */
  def describeInstanceAssociationsStatus(params: DescribeInstanceAssociationsStatusRequest): Request[DescribeInstanceAssociationsStatusResult, AWSError] = js.native
  def describeInstanceAssociationsStatus(
    params: DescribeInstanceAssociationsStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceAssociationsStatusResult, Unit]
  ): Request[DescribeInstanceAssociationsStatusResult, AWSError] = js.native
  /**
    * Describes one or more of your instances. You can use this to get information about instances like the operating system platform, the SSM Agent version (Linux), status etc. If you specify one or more instance IDs, it returns information for those instances. If you do not specify instance IDs, it returns information for all your instances. If you specify an instance ID that is not valid or an instance that you do not own, you receive an error.   The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to on-premises instances. This call does not return the IAM role for Amazon EC2 instances. 
    */
  def describeInstanceInformation(): Request[DescribeInstanceInformationResult, AWSError] = js.native
  def describeInstanceInformation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceInformationResult, Unit]): Request[DescribeInstanceInformationResult, AWSError] = js.native
  /**
    * Describes one or more of your instances. You can use this to get information about instances like the operating system platform, the SSM Agent version (Linux), status etc. If you specify one or more instance IDs, it returns information for those instances. If you do not specify instance IDs, it returns information for all your instances. If you specify an instance ID that is not valid or an instance that you do not own, you receive an error.   The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to on-premises instances. This call does not return the IAM role for Amazon EC2 instances. 
    */
  def describeInstanceInformation(params: DescribeInstanceInformationRequest): Request[DescribeInstanceInformationResult, AWSError] = js.native
  def describeInstanceInformation(
    params: DescribeInstanceInformationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceInformationResult, Unit]
  ): Request[DescribeInstanceInformationResult, AWSError] = js.native
  /**
    * Retrieves the high-level patch state of one or more instances.
    */
  def describeInstancePatchStates(): Request[DescribeInstancePatchStatesResult, AWSError] = js.native
  def describeInstancePatchStates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancePatchStatesResult, Unit]): Request[DescribeInstancePatchStatesResult, AWSError] = js.native
  /**
    * Retrieves the high-level patch state of one or more instances.
    */
  def describeInstancePatchStates(params: DescribeInstancePatchStatesRequest): Request[DescribeInstancePatchStatesResult, AWSError] = js.native
  def describeInstancePatchStates(
    params: DescribeInstancePatchStatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancePatchStatesResult, Unit]
  ): Request[DescribeInstancePatchStatesResult, AWSError] = js.native
  /**
    * Retrieves the high-level patch state for the instances in the specified patch group.
    */
  def describeInstancePatchStatesForPatchGroup(): Request[DescribeInstancePatchStatesForPatchGroupResult, AWSError] = js.native
  def describeInstancePatchStatesForPatchGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancePatchStatesForPatchGroupResult, Unit]
  ): Request[DescribeInstancePatchStatesForPatchGroupResult, AWSError] = js.native
  /**
    * Retrieves the high-level patch state for the instances in the specified patch group.
    */
  def describeInstancePatchStatesForPatchGroup(params: DescribeInstancePatchStatesForPatchGroupRequest): Request[DescribeInstancePatchStatesForPatchGroupResult, AWSError] = js.native
  def describeInstancePatchStatesForPatchGroup(
    params: DescribeInstancePatchStatesForPatchGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancePatchStatesForPatchGroupResult, Unit]
  ): Request[DescribeInstancePatchStatesForPatchGroupResult, AWSError] = js.native
  /**
    * Retrieves information about the patches on the specified instance and their state relative to the patch baseline being used for the instance.
    */
  def describeInstancePatches(): Request[DescribeInstancePatchesResult, AWSError] = js.native
  def describeInstancePatches(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancePatchesResult, Unit]): Request[DescribeInstancePatchesResult, AWSError] = js.native
  /**
    * Retrieves information about the patches on the specified instance and their state relative to the patch baseline being used for the instance.
    */
  def describeInstancePatches(params: DescribeInstancePatchesRequest): Request[DescribeInstancePatchesResult, AWSError] = js.native
  def describeInstancePatches(
    params: DescribeInstancePatchesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancePatchesResult, Unit]
  ): Request[DescribeInstancePatchesResult, AWSError] = js.native
  /**
    * Describes a specific delete inventory operation.
    */
  def describeInventoryDeletions(): Request[DescribeInventoryDeletionsResult, AWSError] = js.native
  def describeInventoryDeletions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInventoryDeletionsResult, Unit]): Request[DescribeInventoryDeletionsResult, AWSError] = js.native
  /**
    * Describes a specific delete inventory operation.
    */
  def describeInventoryDeletions(params: DescribeInventoryDeletionsRequest): Request[DescribeInventoryDeletionsResult, AWSError] = js.native
  def describeInventoryDeletions(
    params: DescribeInventoryDeletionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInventoryDeletionsResult, Unit]
  ): Request[DescribeInventoryDeletionsResult, AWSError] = js.native
  /**
    * Retrieves the individual task executions (one per target) for a particular task run as part of a maintenance window execution.
    */
  def describeMaintenanceWindowExecutionTaskInvocations(): Request[DescribeMaintenanceWindowExecutionTaskInvocationsResult, AWSError] = js.native
  def describeMaintenanceWindowExecutionTaskInvocations(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
      Unit
    ]
  ): Request[DescribeMaintenanceWindowExecutionTaskInvocationsResult, AWSError] = js.native
  /**
    * Retrieves the individual task executions (one per target) for a particular task run as part of a maintenance window execution.
    */
  def describeMaintenanceWindowExecutionTaskInvocations(params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest): Request[DescribeMaintenanceWindowExecutionTaskInvocationsResult, AWSError] = js.native
  def describeMaintenanceWindowExecutionTaskInvocations(
    params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
      Unit
    ]
  ): Request[DescribeMaintenanceWindowExecutionTaskInvocationsResult, AWSError] = js.native
  /**
    * For a given maintenance window execution, lists the tasks that were run.
    */
  def describeMaintenanceWindowExecutionTasks(): Request[DescribeMaintenanceWindowExecutionTasksResult, AWSError] = js.native
  def describeMaintenanceWindowExecutionTasks(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowExecutionTasksResult, Unit]
  ): Request[DescribeMaintenanceWindowExecutionTasksResult, AWSError] = js.native
  /**
    * For a given maintenance window execution, lists the tasks that were run.
    */
  def describeMaintenanceWindowExecutionTasks(params: DescribeMaintenanceWindowExecutionTasksRequest): Request[DescribeMaintenanceWindowExecutionTasksResult, AWSError] = js.native
  def describeMaintenanceWindowExecutionTasks(
    params: DescribeMaintenanceWindowExecutionTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowExecutionTasksResult, Unit]
  ): Request[DescribeMaintenanceWindowExecutionTasksResult, AWSError] = js.native
  /**
    * Lists the executions of a maintenance window. This includes information about when the maintenance window was scheduled to be active, and information about tasks registered and run with the maintenance window.
    */
  def describeMaintenanceWindowExecutions(): Request[DescribeMaintenanceWindowExecutionsResult, AWSError] = js.native
  def describeMaintenanceWindowExecutions(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowExecutionsResult, Unit]
  ): Request[DescribeMaintenanceWindowExecutionsResult, AWSError] = js.native
  /**
    * Lists the executions of a maintenance window. This includes information about when the maintenance window was scheduled to be active, and information about tasks registered and run with the maintenance window.
    */
  def describeMaintenanceWindowExecutions(params: DescribeMaintenanceWindowExecutionsRequest): Request[DescribeMaintenanceWindowExecutionsResult, AWSError] = js.native
  def describeMaintenanceWindowExecutions(
    params: DescribeMaintenanceWindowExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowExecutionsResult, Unit]
  ): Request[DescribeMaintenanceWindowExecutionsResult, AWSError] = js.native
  /**
    * Retrieves information about upcoming executions of a maintenance window.
    */
  def describeMaintenanceWindowSchedule(): Request[DescribeMaintenanceWindowScheduleResult, AWSError] = js.native
  def describeMaintenanceWindowSchedule(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowScheduleResult, Unit]
  ): Request[DescribeMaintenanceWindowScheduleResult, AWSError] = js.native
  /**
    * Retrieves information about upcoming executions of a maintenance window.
    */
  def describeMaintenanceWindowSchedule(params: DescribeMaintenanceWindowScheduleRequest): Request[DescribeMaintenanceWindowScheduleResult, AWSError] = js.native
  def describeMaintenanceWindowSchedule(
    params: DescribeMaintenanceWindowScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowScheduleResult, Unit]
  ): Request[DescribeMaintenanceWindowScheduleResult, AWSError] = js.native
  /**
    * Lists the targets registered with the maintenance window.
    */
  def describeMaintenanceWindowTargets(): Request[DescribeMaintenanceWindowTargetsResult, AWSError] = js.native
  def describeMaintenanceWindowTargets(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowTargetsResult, Unit]
  ): Request[DescribeMaintenanceWindowTargetsResult, AWSError] = js.native
  /**
    * Lists the targets registered with the maintenance window.
    */
  def describeMaintenanceWindowTargets(params: DescribeMaintenanceWindowTargetsRequest): Request[DescribeMaintenanceWindowTargetsResult, AWSError] = js.native
  def describeMaintenanceWindowTargets(
    params: DescribeMaintenanceWindowTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowTargetsResult, Unit]
  ): Request[DescribeMaintenanceWindowTargetsResult, AWSError] = js.native
  /**
    * Lists the tasks in a maintenance window.
    */
  def describeMaintenanceWindowTasks(): Request[DescribeMaintenanceWindowTasksResult, AWSError] = js.native
  def describeMaintenanceWindowTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowTasksResult, Unit]): Request[DescribeMaintenanceWindowTasksResult, AWSError] = js.native
  /**
    * Lists the tasks in a maintenance window.
    */
  def describeMaintenanceWindowTasks(params: DescribeMaintenanceWindowTasksRequest): Request[DescribeMaintenanceWindowTasksResult, AWSError] = js.native
  def describeMaintenanceWindowTasks(
    params: DescribeMaintenanceWindowTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowTasksResult, Unit]
  ): Request[DescribeMaintenanceWindowTasksResult, AWSError] = js.native
  /**
    * Retrieves the maintenance windows in an AWS account.
    */
  def describeMaintenanceWindows(): Request[DescribeMaintenanceWindowsResult, AWSError] = js.native
  def describeMaintenanceWindows(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowsResult, Unit]): Request[DescribeMaintenanceWindowsResult, AWSError] = js.native
  /**
    * Retrieves the maintenance windows in an AWS account.
    */
  def describeMaintenanceWindows(params: DescribeMaintenanceWindowsRequest): Request[DescribeMaintenanceWindowsResult, AWSError] = js.native
  def describeMaintenanceWindows(
    params: DescribeMaintenanceWindowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowsResult, Unit]
  ): Request[DescribeMaintenanceWindowsResult, AWSError] = js.native
  /**
    * Retrieves information about the maintenance window targets or tasks that an instance is associated with.
    */
  def describeMaintenanceWindowsForTarget(): Request[DescribeMaintenanceWindowsForTargetResult, AWSError] = js.native
  def describeMaintenanceWindowsForTarget(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowsForTargetResult, Unit]
  ): Request[DescribeMaintenanceWindowsForTargetResult, AWSError] = js.native
  /**
    * Retrieves information about the maintenance window targets or tasks that an instance is associated with.
    */
  def describeMaintenanceWindowsForTarget(params: DescribeMaintenanceWindowsForTargetRequest): Request[DescribeMaintenanceWindowsForTargetResult, AWSError] = js.native
  def describeMaintenanceWindowsForTarget(
    params: DescribeMaintenanceWindowsForTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMaintenanceWindowsForTargetResult, Unit]
  ): Request[DescribeMaintenanceWindowsForTargetResult, AWSError] = js.native
  /**
    * Query a set of OpsItems. You must have permission in AWS Identity and Access Management (IAM) to query a list of OpsItems. For more information, see Getting Started with OpsCenter in the AWS Systems Manager User Guide. Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager OpsCenter in the AWS Systems Manager User Guide. 
    */
  def describeOpsItems(): Request[DescribeOpsItemsResponse, AWSError] = js.native
  def describeOpsItems(callback: js.Function2[/* err */ AWSError, /* data */ DescribeOpsItemsResponse, Unit]): Request[DescribeOpsItemsResponse, AWSError] = js.native
  /**
    * Query a set of OpsItems. You must have permission in AWS Identity and Access Management (IAM) to query a list of OpsItems. For more information, see Getting Started with OpsCenter in the AWS Systems Manager User Guide. Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager OpsCenter in the AWS Systems Manager User Guide. 
    */
  def describeOpsItems(params: DescribeOpsItemsRequest): Request[DescribeOpsItemsResponse, AWSError] = js.native
  def describeOpsItems(
    params: DescribeOpsItemsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOpsItemsResponse, Unit]
  ): Request[DescribeOpsItemsResponse, AWSError] = js.native
  /**
    * Get information about a parameter.  Request results are returned on a best-effort basis. If you specify MaxResults in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of MaxResults. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a NextToken. You can specify the NextToken in a subsequent call to get the next set of results. 
    */
  def describeParameters(): Request[DescribeParametersResult, AWSError] = js.native
  def describeParameters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeParametersResult, Unit]): Request[DescribeParametersResult, AWSError] = js.native
  /**
    * Get information about a parameter.  Request results are returned on a best-effort basis. If you specify MaxResults in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of MaxResults. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a NextToken. You can specify the NextToken in a subsequent call to get the next set of results. 
    */
  def describeParameters(params: DescribeParametersRequest): Request[DescribeParametersResult, AWSError] = js.native
  def describeParameters(
    params: DescribeParametersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeParametersResult, Unit]
  ): Request[DescribeParametersResult, AWSError] = js.native
  /**
    * Lists the patch baselines in your AWS account.
    */
  def describePatchBaselines(): Request[DescribePatchBaselinesResult, AWSError] = js.native
  def describePatchBaselines(callback: js.Function2[/* err */ AWSError, /* data */ DescribePatchBaselinesResult, Unit]): Request[DescribePatchBaselinesResult, AWSError] = js.native
  /**
    * Lists the patch baselines in your AWS account.
    */
  def describePatchBaselines(params: DescribePatchBaselinesRequest): Request[DescribePatchBaselinesResult, AWSError] = js.native
  def describePatchBaselines(
    params: DescribePatchBaselinesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePatchBaselinesResult, Unit]
  ): Request[DescribePatchBaselinesResult, AWSError] = js.native
  /**
    * Returns high-level aggregated patch compliance state for a patch group.
    */
  def describePatchGroupState(): Request[DescribePatchGroupStateResult, AWSError] = js.native
  def describePatchGroupState(callback: js.Function2[/* err */ AWSError, /* data */ DescribePatchGroupStateResult, Unit]): Request[DescribePatchGroupStateResult, AWSError] = js.native
  /**
    * Returns high-level aggregated patch compliance state for a patch group.
    */
  def describePatchGroupState(params: DescribePatchGroupStateRequest): Request[DescribePatchGroupStateResult, AWSError] = js.native
  def describePatchGroupState(
    params: DescribePatchGroupStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePatchGroupStateResult, Unit]
  ): Request[DescribePatchGroupStateResult, AWSError] = js.native
  /**
    * Lists all patch groups that have been registered with patch baselines.
    */
  def describePatchGroups(): Request[DescribePatchGroupsResult, AWSError] = js.native
  def describePatchGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribePatchGroupsResult, Unit]): Request[DescribePatchGroupsResult, AWSError] = js.native
  /**
    * Lists all patch groups that have been registered with patch baselines.
    */
  def describePatchGroups(params: DescribePatchGroupsRequest): Request[DescribePatchGroupsResult, AWSError] = js.native
  def describePatchGroups(
    params: DescribePatchGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePatchGroupsResult, Unit]
  ): Request[DescribePatchGroupsResult, AWSError] = js.native
  /**
    * Lists the properties of available patches organized by product, product family, classification, severity, and other properties of available patches. You can use the reported properties in the filters you specify in requests for actions such as CreatePatchBaseline, UpdatePatchBaseline, DescribeAvailablePatches, and DescribePatchBaselines. The following section lists the properties that can be used in filters for each major operating system type:  WINDOWS  Valid properties: PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY  AMAZON_LINUX  Valid properties: PRODUCT, CLASSIFICATION, SEVERITY  AMAZON_LINUX_2  Valid properties: PRODUCT, CLASSIFICATION, SEVERITY  UBUNTU   Valid properties: PRODUCT, PRIORITY  REDHAT_ENTERPRISE_LINUX  Valid properties: PRODUCT, CLASSIFICATION, SEVERITY  SUSE  Valid properties: PRODUCT, CLASSIFICATION, SEVERITY  CENTOS  Valid properties: PRODUCT, CLASSIFICATION, SEVERITY  
    */
  def describePatchProperties(): Request[DescribePatchPropertiesResult, AWSError] = js.native
  def describePatchProperties(callback: js.Function2[/* err */ AWSError, /* data */ DescribePatchPropertiesResult, Unit]): Request[DescribePatchPropertiesResult, AWSError] = js.native
  /**
    * Lists the properties of available patches organized by product, product family, classification, severity, and other properties of available patches. You can use the reported properties in the filters you specify in requests for actions such as CreatePatchBaseline, UpdatePatchBaseline, DescribeAvailablePatches, and DescribePatchBaselines. The following section lists the properties that can be used in filters for each major operating system type:  WINDOWS  Valid properties: PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY  AMAZON_LINUX  Valid properties: PRODUCT, CLASSIFICATION, SEVERITY  AMAZON_LINUX_2  Valid properties: PRODUCT, CLASSIFICATION, SEVERITY  UBUNTU   Valid properties: PRODUCT, PRIORITY  REDHAT_ENTERPRISE_LINUX  Valid properties: PRODUCT, CLASSIFICATION, SEVERITY  SUSE  Valid properties: PRODUCT, CLASSIFICATION, SEVERITY  CENTOS  Valid properties: PRODUCT, CLASSIFICATION, SEVERITY  
    */
  def describePatchProperties(params: DescribePatchPropertiesRequest): Request[DescribePatchPropertiesResult, AWSError] = js.native
  def describePatchProperties(
    params: DescribePatchPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePatchPropertiesResult, Unit]
  ): Request[DescribePatchPropertiesResult, AWSError] = js.native
  /**
    * Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30 days.
    */
  def describeSessions(): Request[DescribeSessionsResponse, AWSError] = js.native
  def describeSessions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSessionsResponse, Unit]): Request[DescribeSessionsResponse, AWSError] = js.native
  /**
    * Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30 days.
    */
  def describeSessions(params: DescribeSessionsRequest): Request[DescribeSessionsResponse, AWSError] = js.native
  def describeSessions(
    params: DescribeSessionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSessionsResponse, Unit]
  ): Request[DescribeSessionsResponse, AWSError] = js.native
  /**
    * Get detailed information about a particular Automation execution.
    */
  def getAutomationExecution(): Request[GetAutomationExecutionResult, AWSError] = js.native
  def getAutomationExecution(callback: js.Function2[/* err */ AWSError, /* data */ GetAutomationExecutionResult, Unit]): Request[GetAutomationExecutionResult, AWSError] = js.native
  /**
    * Get detailed information about a particular Automation execution.
    */
  def getAutomationExecution(params: GetAutomationExecutionRequest): Request[GetAutomationExecutionResult, AWSError] = js.native
  def getAutomationExecution(
    params: GetAutomationExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAutomationExecutionResult, Unit]
  ): Request[GetAutomationExecutionResult, AWSError] = js.native
  /**
    * Gets the state of the AWS Systems Manager Change Calendar at an optional, specified time. If you specify a time, GetCalendarState returns the state of the calendar at a specific time, and returns the next time that the Change Calendar state will transition. If you do not specify a time, GetCalendarState assumes the current time. Change Calendar entries have two possible states: OPEN or CLOSED. For more information about Systems Manager Change Calendar, see AWS Systems Manager Change Calendar in the AWS Systems Manager User Guide.
    */
  def getCalendarState(): Request[GetCalendarStateResponse, AWSError] = js.native
  def getCalendarState(callback: js.Function2[/* err */ AWSError, /* data */ GetCalendarStateResponse, Unit]): Request[GetCalendarStateResponse, AWSError] = js.native
  /**
    * Gets the state of the AWS Systems Manager Change Calendar at an optional, specified time. If you specify a time, GetCalendarState returns the state of the calendar at a specific time, and returns the next time that the Change Calendar state will transition. If you do not specify a time, GetCalendarState assumes the current time. Change Calendar entries have two possible states: OPEN or CLOSED. For more information about Systems Manager Change Calendar, see AWS Systems Manager Change Calendar in the AWS Systems Manager User Guide.
    */
  def getCalendarState(params: GetCalendarStateRequest): Request[GetCalendarStateResponse, AWSError] = js.native
  def getCalendarState(
    params: GetCalendarStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCalendarStateResponse, Unit]
  ): Request[GetCalendarStateResponse, AWSError] = js.native
  /**
    * Returns detailed information about command execution for an invocation or plugin. 
    */
  def getCommandInvocation(): Request[GetCommandInvocationResult, AWSError] = js.native
  def getCommandInvocation(callback: js.Function2[/* err */ AWSError, /* data */ GetCommandInvocationResult, Unit]): Request[GetCommandInvocationResult, AWSError] = js.native
  /**
    * Returns detailed information about command execution for an invocation or plugin. 
    */
  def getCommandInvocation(params: GetCommandInvocationRequest): Request[GetCommandInvocationResult, AWSError] = js.native
  def getCommandInvocation(
    params: GetCommandInvocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCommandInvocationResult, Unit]
  ): Request[GetCommandInvocationResult, AWSError] = js.native
  /**
    * Retrieves the Session Manager connection status for an instance to determine whether it is connected and ready to receive Session Manager connections.
    */
  def getConnectionStatus(): Request[GetConnectionStatusResponse, AWSError] = js.native
  def getConnectionStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionStatusResponse, Unit]): Request[GetConnectionStatusResponse, AWSError] = js.native
  /**
    * Retrieves the Session Manager connection status for an instance to determine whether it is connected and ready to receive Session Manager connections.
    */
  def getConnectionStatus(params: GetConnectionStatusRequest): Request[GetConnectionStatusResponse, AWSError] = js.native
  def getConnectionStatus(
    params: GetConnectionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionStatusResponse, Unit]
  ): Request[GetConnectionStatusResponse, AWSError] = js.native
  /**
    * Retrieves the default patch baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system. If you do not specify an operating system value, the default patch baseline for Windows is returned.
    */
  def getDefaultPatchBaseline(): Request[GetDefaultPatchBaselineResult, AWSError] = js.native
  def getDefaultPatchBaseline(callback: js.Function2[/* err */ AWSError, /* data */ GetDefaultPatchBaselineResult, Unit]): Request[GetDefaultPatchBaselineResult, AWSError] = js.native
  /**
    * Retrieves the default patch baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system. If you do not specify an operating system value, the default patch baseline for Windows is returned.
    */
  def getDefaultPatchBaseline(params: GetDefaultPatchBaselineRequest): Request[GetDefaultPatchBaselineResult, AWSError] = js.native
  def getDefaultPatchBaseline(
    params: GetDefaultPatchBaselineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDefaultPatchBaselineResult, Unit]
  ): Request[GetDefaultPatchBaselineResult, AWSError] = js.native
  /**
    * Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the AWS-RunPatchBaseline Systems Manager document. 
    */
  def getDeployablePatchSnapshotForInstance(): Request[GetDeployablePatchSnapshotForInstanceResult, AWSError] = js.native
  def getDeployablePatchSnapshotForInstance(
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeployablePatchSnapshotForInstanceResult, Unit]
  ): Request[GetDeployablePatchSnapshotForInstanceResult, AWSError] = js.native
  /**
    * Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the AWS-RunPatchBaseline Systems Manager document. 
    */
  def getDeployablePatchSnapshotForInstance(params: GetDeployablePatchSnapshotForInstanceRequest): Request[GetDeployablePatchSnapshotForInstanceResult, AWSError] = js.native
  def getDeployablePatchSnapshotForInstance(
    params: GetDeployablePatchSnapshotForInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeployablePatchSnapshotForInstanceResult, Unit]
  ): Request[GetDeployablePatchSnapshotForInstanceResult, AWSError] = js.native
  /**
    * Gets the contents of the specified Systems Manager document.
    */
  def getDocument(): Request[GetDocumentResult, AWSError] = js.native
  def getDocument(callback: js.Function2[/* err */ AWSError, /* data */ GetDocumentResult, Unit]): Request[GetDocumentResult, AWSError] = js.native
  /**
    * Gets the contents of the specified Systems Manager document.
    */
  def getDocument(params: GetDocumentRequest): Request[GetDocumentResult, AWSError] = js.native
  def getDocument(
    params: GetDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDocumentResult, Unit]
  ): Request[GetDocumentResult, AWSError] = js.native
  /**
    * Query inventory information.
    */
  def getInventory(): Request[GetInventoryResult, AWSError] = js.native
  def getInventory(callback: js.Function2[/* err */ AWSError, /* data */ GetInventoryResult, Unit]): Request[GetInventoryResult, AWSError] = js.native
  /**
    * Query inventory information.
    */
  def getInventory(params: GetInventoryRequest): Request[GetInventoryResult, AWSError] = js.native
  def getInventory(
    params: GetInventoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInventoryResult, Unit]
  ): Request[GetInventoryResult, AWSError] = js.native
  /**
    * Return a list of inventory type names for the account, or return a list of attribute names for a specific Inventory item type. 
    */
  def getInventorySchema(): Request[GetInventorySchemaResult, AWSError] = js.native
  def getInventorySchema(callback: js.Function2[/* err */ AWSError, /* data */ GetInventorySchemaResult, Unit]): Request[GetInventorySchemaResult, AWSError] = js.native
  /**
    * Return a list of inventory type names for the account, or return a list of attribute names for a specific Inventory item type. 
    */
  def getInventorySchema(params: GetInventorySchemaRequest): Request[GetInventorySchemaResult, AWSError] = js.native
  def getInventorySchema(
    params: GetInventorySchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInventorySchemaResult, Unit]
  ): Request[GetInventorySchemaResult, AWSError] = js.native
  /**
    * Retrieves a maintenance window.
    */
  def getMaintenanceWindow(): Request[GetMaintenanceWindowResult, AWSError] = js.native
  def getMaintenanceWindow(callback: js.Function2[/* err */ AWSError, /* data */ GetMaintenanceWindowResult, Unit]): Request[GetMaintenanceWindowResult, AWSError] = js.native
  /**
    * Retrieves a maintenance window.
    */
  def getMaintenanceWindow(params: GetMaintenanceWindowRequest): Request[GetMaintenanceWindowResult, AWSError] = js.native
  def getMaintenanceWindow(
    params: GetMaintenanceWindowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMaintenanceWindowResult, Unit]
  ): Request[GetMaintenanceWindowResult, AWSError] = js.native
  /**
    * Retrieves details about a specific a maintenance window execution.
    */
  def getMaintenanceWindowExecution(): Request[GetMaintenanceWindowExecutionResult, AWSError] = js.native
  def getMaintenanceWindowExecution(callback: js.Function2[/* err */ AWSError, /* data */ GetMaintenanceWindowExecutionResult, Unit]): Request[GetMaintenanceWindowExecutionResult, AWSError] = js.native
  /**
    * Retrieves details about a specific a maintenance window execution.
    */
  def getMaintenanceWindowExecution(params: GetMaintenanceWindowExecutionRequest): Request[GetMaintenanceWindowExecutionResult, AWSError] = js.native
  def getMaintenanceWindowExecution(
    params: GetMaintenanceWindowExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMaintenanceWindowExecutionResult, Unit]
  ): Request[GetMaintenanceWindowExecutionResult, AWSError] = js.native
  /**
    * Retrieves the details about a specific task run as part of a maintenance window execution.
    */
  def getMaintenanceWindowExecutionTask(): Request[GetMaintenanceWindowExecutionTaskResult, AWSError] = js.native
  def getMaintenanceWindowExecutionTask(
    callback: js.Function2[/* err */ AWSError, /* data */ GetMaintenanceWindowExecutionTaskResult, Unit]
  ): Request[GetMaintenanceWindowExecutionTaskResult, AWSError] = js.native
  /**
    * Retrieves the details about a specific task run as part of a maintenance window execution.
    */
  def getMaintenanceWindowExecutionTask(params: GetMaintenanceWindowExecutionTaskRequest): Request[GetMaintenanceWindowExecutionTaskResult, AWSError] = js.native
  def getMaintenanceWindowExecutionTask(
    params: GetMaintenanceWindowExecutionTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMaintenanceWindowExecutionTaskResult, Unit]
  ): Request[GetMaintenanceWindowExecutionTaskResult, AWSError] = js.native
  /**
    * Retrieves information about a specific task running on a specific target.
    */
  def getMaintenanceWindowExecutionTaskInvocation(): Request[GetMaintenanceWindowExecutionTaskInvocationResult, AWSError] = js.native
  def getMaintenanceWindowExecutionTaskInvocation(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetMaintenanceWindowExecutionTaskInvocationResult, 
      Unit
    ]
  ): Request[GetMaintenanceWindowExecutionTaskInvocationResult, AWSError] = js.native
  /**
    * Retrieves information about a specific task running on a specific target.
    */
  def getMaintenanceWindowExecutionTaskInvocation(params: GetMaintenanceWindowExecutionTaskInvocationRequest): Request[GetMaintenanceWindowExecutionTaskInvocationResult, AWSError] = js.native
  def getMaintenanceWindowExecutionTaskInvocation(
    params: GetMaintenanceWindowExecutionTaskInvocationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetMaintenanceWindowExecutionTaskInvocationResult, 
      Unit
    ]
  ): Request[GetMaintenanceWindowExecutionTaskInvocationResult, AWSError] = js.native
  /**
    * Lists the tasks in a maintenance window.
    */
  def getMaintenanceWindowTask(): Request[GetMaintenanceWindowTaskResult, AWSError] = js.native
  def getMaintenanceWindowTask(callback: js.Function2[/* err */ AWSError, /* data */ GetMaintenanceWindowTaskResult, Unit]): Request[GetMaintenanceWindowTaskResult, AWSError] = js.native
  /**
    * Lists the tasks in a maintenance window.
    */
  def getMaintenanceWindowTask(params: GetMaintenanceWindowTaskRequest): Request[GetMaintenanceWindowTaskResult, AWSError] = js.native
  def getMaintenanceWindowTask(
    params: GetMaintenanceWindowTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMaintenanceWindowTaskResult, Unit]
  ): Request[GetMaintenanceWindowTaskResult, AWSError] = js.native
  /**
    * Get information about an OpsItem by using the ID. You must have permission in AWS Identity and Access Management (IAM) to view information about an OpsItem. For more information, see Getting Started with OpsCenter in the AWS Systems Manager User Guide. Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager OpsCenter in the AWS Systems Manager User Guide. 
    */
  def getOpsItem(): Request[GetOpsItemResponse, AWSError] = js.native
  def getOpsItem(callback: js.Function2[/* err */ AWSError, /* data */ GetOpsItemResponse, Unit]): Request[GetOpsItemResponse, AWSError] = js.native
  /**
    * Get information about an OpsItem by using the ID. You must have permission in AWS Identity and Access Management (IAM) to view information about an OpsItem. For more information, see Getting Started with OpsCenter in the AWS Systems Manager User Guide. Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager OpsCenter in the AWS Systems Manager User Guide. 
    */
  def getOpsItem(params: GetOpsItemRequest): Request[GetOpsItemResponse, AWSError] = js.native
  def getOpsItem(
    params: GetOpsItemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOpsItemResponse, Unit]
  ): Request[GetOpsItemResponse, AWSError] = js.native
  /**
    * View a summary of OpsItems based on specified filters and aggregators.
    */
  def getOpsSummary(): Request[GetOpsSummaryResult, AWSError] = js.native
  def getOpsSummary(callback: js.Function2[/* err */ AWSError, /* data */ GetOpsSummaryResult, Unit]): Request[GetOpsSummaryResult, AWSError] = js.native
  /**
    * View a summary of OpsItems based on specified filters and aggregators.
    */
  def getOpsSummary(params: GetOpsSummaryRequest): Request[GetOpsSummaryResult, AWSError] = js.native
  def getOpsSummary(
    params: GetOpsSummaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOpsSummaryResult, Unit]
  ): Request[GetOpsSummaryResult, AWSError] = js.native
  /**
    * Get information about a parameter by using the parameter name. Don't confuse this API action with the GetParameters API action.
    */
  def getParameter(): Request[GetParameterResult, AWSError] = js.native
  def getParameter(callback: js.Function2[/* err */ AWSError, /* data */ GetParameterResult, Unit]): Request[GetParameterResult, AWSError] = js.native
  /**
    * Get information about a parameter by using the parameter name. Don't confuse this API action with the GetParameters API action.
    */
  def getParameter(params: GetParameterRequest): Request[GetParameterResult, AWSError] = js.native
  def getParameter(
    params: GetParameterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetParameterResult, Unit]
  ): Request[GetParameterResult, AWSError] = js.native
  /**
    * Query a list of all parameters used by the AWS account.
    */
  def getParameterHistory(): Request[GetParameterHistoryResult, AWSError] = js.native
  def getParameterHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetParameterHistoryResult, Unit]): Request[GetParameterHistoryResult, AWSError] = js.native
  /**
    * Query a list of all parameters used by the AWS account.
    */
  def getParameterHistory(params: GetParameterHistoryRequest): Request[GetParameterHistoryResult, AWSError] = js.native
  def getParameterHistory(
    params: GetParameterHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetParameterHistoryResult, Unit]
  ): Request[GetParameterHistoryResult, AWSError] = js.native
  /**
    * Get details of a parameter. Don't confuse this API action with the GetParameter API action.
    */
  def getParameters(): Request[GetParametersResult, AWSError] = js.native
  def getParameters(callback: js.Function2[/* err */ AWSError, /* data */ GetParametersResult, Unit]): Request[GetParametersResult, AWSError] = js.native
  /**
    * Get details of a parameter. Don't confuse this API action with the GetParameter API action.
    */
  def getParameters(params: GetParametersRequest): Request[GetParametersResult, AWSError] = js.native
  def getParameters(
    params: GetParametersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetParametersResult, Unit]
  ): Request[GetParametersResult, AWSError] = js.native
  /**
    * Retrieve information about one or more parameters in a specific hierarchy.   Request results are returned on a best-effort basis. If you specify MaxResults in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of MaxResults. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a NextToken. You can specify the NextToken in a subsequent call to get the next set of results. 
    */
  def getParametersByPath(): Request[GetParametersByPathResult, AWSError] = js.native
  def getParametersByPath(callback: js.Function2[/* err */ AWSError, /* data */ GetParametersByPathResult, Unit]): Request[GetParametersByPathResult, AWSError] = js.native
  /**
    * Retrieve information about one or more parameters in a specific hierarchy.   Request results are returned on a best-effort basis. If you specify MaxResults in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of MaxResults. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a NextToken. You can specify the NextToken in a subsequent call to get the next set of results. 
    */
  def getParametersByPath(params: GetParametersByPathRequest): Request[GetParametersByPathResult, AWSError] = js.native
  def getParametersByPath(
    params: GetParametersByPathRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetParametersByPathResult, Unit]
  ): Request[GetParametersByPathResult, AWSError] = js.native
  /**
    * Retrieves information about a patch baseline.
    */
  def getPatchBaseline(): Request[GetPatchBaselineResult, AWSError] = js.native
  def getPatchBaseline(callback: js.Function2[/* err */ AWSError, /* data */ GetPatchBaselineResult, Unit]): Request[GetPatchBaselineResult, AWSError] = js.native
  /**
    * Retrieves information about a patch baseline.
    */
  def getPatchBaseline(params: GetPatchBaselineRequest): Request[GetPatchBaselineResult, AWSError] = js.native
  def getPatchBaseline(
    params: GetPatchBaselineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPatchBaselineResult, Unit]
  ): Request[GetPatchBaselineResult, AWSError] = js.native
  /**
    * Retrieves the patch baseline that should be used for the specified patch group.
    */
  def getPatchBaselineForPatchGroup(): Request[GetPatchBaselineForPatchGroupResult, AWSError] = js.native
  def getPatchBaselineForPatchGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetPatchBaselineForPatchGroupResult, Unit]): Request[GetPatchBaselineForPatchGroupResult, AWSError] = js.native
  /**
    * Retrieves the patch baseline that should be used for the specified patch group.
    */
  def getPatchBaselineForPatchGroup(params: GetPatchBaselineForPatchGroupRequest): Request[GetPatchBaselineForPatchGroupResult, AWSError] = js.native
  def getPatchBaselineForPatchGroup(
    params: GetPatchBaselineForPatchGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPatchBaselineForPatchGroupResult, Unit]
  ): Request[GetPatchBaselineForPatchGroupResult, AWSError] = js.native
  /**
    *  ServiceSetting is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature. Services map a SettingId object to a setting value. AWS services teams define the default value for a SettingId. You can't create a new SettingId, but you can overwrite the default value if you have the ssm:UpdateServiceSetting permission for the setting. Use the UpdateServiceSetting API action to change the default setting. Or use the ResetServiceSetting to change the value back to the original value defined by the AWS service team. Query the current service setting for the account. 
    */
  def getServiceSetting(): Request[GetServiceSettingResult, AWSError] = js.native
  def getServiceSetting(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceSettingResult, Unit]): Request[GetServiceSettingResult, AWSError] = js.native
  /**
    *  ServiceSetting is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature. Services map a SettingId object to a setting value. AWS services teams define the default value for a SettingId. You can't create a new SettingId, but you can overwrite the default value if you have the ssm:UpdateServiceSetting permission for the setting. Use the UpdateServiceSetting API action to change the default setting. Or use the ResetServiceSetting to change the value back to the original value defined by the AWS service team. Query the current service setting for the account. 
    */
  def getServiceSetting(params: GetServiceSettingRequest): Request[GetServiceSettingResult, AWSError] = js.native
  def getServiceSetting(
    params: GetServiceSettingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceSettingResult, Unit]
  ): Request[GetServiceSettingResult, AWSError] = js.native
  /**
    * A parameter label is a user-defined alias to help you manage different versions of a parameter. When you modify a parameter, Systems Manager automatically saves a new version and increments the version number by one. A label can help you remember the purpose of a parameter when there are multiple versions.  Parameter labels have the following requirements and restrictions.   A version of a parameter can have a maximum of 10 labels.   You can't attach the same label to different versions of the same parameter. For example, if version 1 has the label Production, then you can't attach Production to version 2.   You can move a label from one version of a parameter to another.   You can't create a label when you create a new parameter. You must attach a label to a specific version of a parameter.   You can't delete a parameter label. If you no longer want to use a parameter label, then you must move it to a different version of a parameter.   A label can have a maximum of 100 characters.   Labels can contain letters (case sensitive), numbers, periods (.), hyphens (-), or underscores (_).   Labels can't begin with a number, "aws," or "ssm" (not case sensitive). If a label fails to meet these requirements, then the label is not associated with a parameter and the system displays it in the list of InvalidLabels.  
    */
  def labelParameterVersion(): Request[LabelParameterVersionResult, AWSError] = js.native
  def labelParameterVersion(callback: js.Function2[/* err */ AWSError, /* data */ LabelParameterVersionResult, Unit]): Request[LabelParameterVersionResult, AWSError] = js.native
  /**
    * A parameter label is a user-defined alias to help you manage different versions of a parameter. When you modify a parameter, Systems Manager automatically saves a new version and increments the version number by one. A label can help you remember the purpose of a parameter when there are multiple versions.  Parameter labels have the following requirements and restrictions.   A version of a parameter can have a maximum of 10 labels.   You can't attach the same label to different versions of the same parameter. For example, if version 1 has the label Production, then you can't attach Production to version 2.   You can move a label from one version of a parameter to another.   You can't create a label when you create a new parameter. You must attach a label to a specific version of a parameter.   You can't delete a parameter label. If you no longer want to use a parameter label, then you must move it to a different version of a parameter.   A label can have a maximum of 100 characters.   Labels can contain letters (case sensitive), numbers, periods (.), hyphens (-), or underscores (_).   Labels can't begin with a number, "aws," or "ssm" (not case sensitive). If a label fails to meet these requirements, then the label is not associated with a parameter and the system displays it in the list of InvalidLabels.  
    */
  def labelParameterVersion(params: LabelParameterVersionRequest): Request[LabelParameterVersionResult, AWSError] = js.native
  def labelParameterVersion(
    params: LabelParameterVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LabelParameterVersionResult, Unit]
  ): Request[LabelParameterVersionResult, AWSError] = js.native
  /**
    * Retrieves all versions of an association for a specific association ID.
    */
  def listAssociationVersions(): Request[ListAssociationVersionsResult, AWSError] = js.native
  def listAssociationVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListAssociationVersionsResult, Unit]): Request[ListAssociationVersionsResult, AWSError] = js.native
  /**
    * Retrieves all versions of an association for a specific association ID.
    */
  def listAssociationVersions(params: ListAssociationVersionsRequest): Request[ListAssociationVersionsResult, AWSError] = js.native
  def listAssociationVersions(
    params: ListAssociationVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssociationVersionsResult, Unit]
  ): Request[ListAssociationVersionsResult, AWSError] = js.native
  /**
    * Returns all State Manager associations in the current AWS account and Region. You can limit the results to a specific State Manager association document or instance by specifying a filter.
    */
  def listAssociations(): Request[ListAssociationsResult, AWSError] = js.native
  def listAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListAssociationsResult, Unit]): Request[ListAssociationsResult, AWSError] = js.native
  /**
    * Returns all State Manager associations in the current AWS account and Region. You can limit the results to a specific State Manager association document or instance by specifying a filter.
    */
  def listAssociations(params: ListAssociationsRequest): Request[ListAssociationsResult, AWSError] = js.native
  def listAssociations(
    params: ListAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssociationsResult, Unit]
  ): Request[ListAssociationsResult, AWSError] = js.native
  /**
    * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then a command invocation is created for each requested instance ID. ListCommandInvocations provide status about command execution.
    */
  def listCommandInvocations(): Request[ListCommandInvocationsResult, AWSError] = js.native
  def listCommandInvocations(callback: js.Function2[/* err */ AWSError, /* data */ ListCommandInvocationsResult, Unit]): Request[ListCommandInvocationsResult, AWSError] = js.native
  /**
    * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then a command invocation is created for each requested instance ID. ListCommandInvocations provide status about command execution.
    */
  def listCommandInvocations(params: ListCommandInvocationsRequest): Request[ListCommandInvocationsResult, AWSError] = js.native
  def listCommandInvocations(
    params: ListCommandInvocationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCommandInvocationsResult, Unit]
  ): Request[ListCommandInvocationsResult, AWSError] = js.native
  /**
    * Lists the commands requested by users of the AWS account.
    */
  def listCommands(): Request[ListCommandsResult, AWSError] = js.native
  def listCommands(callback: js.Function2[/* err */ AWSError, /* data */ ListCommandsResult, Unit]): Request[ListCommandsResult, AWSError] = js.native
  /**
    * Lists the commands requested by users of the AWS account.
    */
  def listCommands(params: ListCommandsRequest): Request[ListCommandsResult, AWSError] = js.native
  def listCommands(
    params: ListCommandsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCommandsResult, Unit]
  ): Request[ListCommandsResult, AWSError] = js.native
  /**
    * For a specified resource ID, this API action returns a list of compliance statuses for different resource types. Currently, you can only specify one resource ID per call. List results depend on the criteria specified in the filter. 
    */
  def listComplianceItems(): Request[ListComplianceItemsResult, AWSError] = js.native
  def listComplianceItems(callback: js.Function2[/* err */ AWSError, /* data */ ListComplianceItemsResult, Unit]): Request[ListComplianceItemsResult, AWSError] = js.native
  /**
    * For a specified resource ID, this API action returns a list of compliance statuses for different resource types. Currently, you can only specify one resource ID per call. List results depend on the criteria specified in the filter. 
    */
  def listComplianceItems(params: ListComplianceItemsRequest): Request[ListComplianceItemsResult, AWSError] = js.native
  def listComplianceItems(
    params: ListComplianceItemsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComplianceItemsResult, Unit]
  ): Request[ListComplianceItemsResult, AWSError] = js.native
  /**
    * Returns a summary count of compliant and non-compliant resources for a compliance type. For example, this call can return State Manager associations, patches, or custom compliance types according to the filter criteria that you specify. 
    */
  def listComplianceSummaries(): Request[ListComplianceSummariesResult, AWSError] = js.native
  def listComplianceSummaries(callback: js.Function2[/* err */ AWSError, /* data */ ListComplianceSummariesResult, Unit]): Request[ListComplianceSummariesResult, AWSError] = js.native
  /**
    * Returns a summary count of compliant and non-compliant resources for a compliance type. For example, this call can return State Manager associations, patches, or custom compliance types according to the filter criteria that you specify. 
    */
  def listComplianceSummaries(params: ListComplianceSummariesRequest): Request[ListComplianceSummariesResult, AWSError] = js.native
  def listComplianceSummaries(
    params: ListComplianceSummariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComplianceSummariesResult, Unit]
  ): Request[ListComplianceSummariesResult, AWSError] = js.native
  /**
    * List all versions for a document.
    */
  def listDocumentVersions(): Request[ListDocumentVersionsResult, AWSError] = js.native
  def listDocumentVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListDocumentVersionsResult, Unit]): Request[ListDocumentVersionsResult, AWSError] = js.native
  /**
    * List all versions for a document.
    */
  def listDocumentVersions(params: ListDocumentVersionsRequest): Request[ListDocumentVersionsResult, AWSError] = js.native
  def listDocumentVersions(
    params: ListDocumentVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDocumentVersionsResult, Unit]
  ): Request[ListDocumentVersionsResult, AWSError] = js.native
  /**
    * Returns all Systems Manager (SSM) documents in the current AWS account and Region. You can limit the results of this request by using a filter.
    */
  def listDocuments(): Request[ListDocumentsResult, AWSError] = js.native
  def listDocuments(callback: js.Function2[/* err */ AWSError, /* data */ ListDocumentsResult, Unit]): Request[ListDocumentsResult, AWSError] = js.native
  /**
    * Returns all Systems Manager (SSM) documents in the current AWS account and Region. You can limit the results of this request by using a filter.
    */
  def listDocuments(params: ListDocumentsRequest): Request[ListDocumentsResult, AWSError] = js.native
  def listDocuments(
    params: ListDocumentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDocumentsResult, Unit]
  ): Request[ListDocumentsResult, AWSError] = js.native
  /**
    * A list of inventory items returned by the request.
    */
  def listInventoryEntries(): Request[ListInventoryEntriesResult, AWSError] = js.native
  def listInventoryEntries(callback: js.Function2[/* err */ AWSError, /* data */ ListInventoryEntriesResult, Unit]): Request[ListInventoryEntriesResult, AWSError] = js.native
  /**
    * A list of inventory items returned by the request.
    */
  def listInventoryEntries(params: ListInventoryEntriesRequest): Request[ListInventoryEntriesResult, AWSError] = js.native
  def listInventoryEntries(
    params: ListInventoryEntriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInventoryEntriesResult, Unit]
  ): Request[ListInventoryEntriesResult, AWSError] = js.native
  /**
    * Returns a resource-level summary count. The summary includes information about compliant and non-compliant statuses and detailed compliance-item severity counts, according to the filter criteria you specify.
    */
  def listResourceComplianceSummaries(): Request[ListResourceComplianceSummariesResult, AWSError] = js.native
  def listResourceComplianceSummaries(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceComplianceSummariesResult, Unit]): Request[ListResourceComplianceSummariesResult, AWSError] = js.native
  /**
    * Returns a resource-level summary count. The summary includes information about compliant and non-compliant statuses and detailed compliance-item severity counts, according to the filter criteria you specify.
    */
  def listResourceComplianceSummaries(params: ListResourceComplianceSummariesRequest): Request[ListResourceComplianceSummariesResult, AWSError] = js.native
  def listResourceComplianceSummaries(
    params: ListResourceComplianceSummariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceComplianceSummariesResult, Unit]
  ): Request[ListResourceComplianceSummariesResult, AWSError] = js.native
  /**
    * Lists your resource data sync configurations. Includes information about the last time a sync attempted to start, the last sync status, and the last time a sync successfully completed. The number of sync configurations might be too large to return using a single call to ListResourceDataSync. You can limit the number of sync configurations returned by using the MaxResults parameter. To determine whether there are more sync configurations to list, check the value of NextToken in the output. If there are more sync configurations to list, you can request them by specifying the NextToken returned in the call to the parameter of a subsequent call. 
    */
  def listResourceDataSync(): Request[ListResourceDataSyncResult, AWSError] = js.native
  def listResourceDataSync(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceDataSyncResult, Unit]): Request[ListResourceDataSyncResult, AWSError] = js.native
  /**
    * Lists your resource data sync configurations. Includes information about the last time a sync attempted to start, the last sync status, and the last time a sync successfully completed. The number of sync configurations might be too large to return using a single call to ListResourceDataSync. You can limit the number of sync configurations returned by using the MaxResults parameter. To determine whether there are more sync configurations to list, check the value of NextToken in the output. If there are more sync configurations to list, you can request them by specifying the NextToken returned in the call to the parameter of a subsequent call. 
    */
  def listResourceDataSync(params: ListResourceDataSyncRequest): Request[ListResourceDataSyncResult, AWSError] = js.native
  def listResourceDataSync(
    params: ListResourceDataSyncRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceDataSyncResult, Unit]
  ): Request[ListResourceDataSyncResult, AWSError] = js.native
  /**
    * Returns a list of the tags assigned to the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    * Returns a list of the tags assigned to the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]
  ): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    * Shares a Systems Manager document publicly or privately. If you share a document privately, you must specify the AWS user account IDs for those people who can use the document. If you share a document publicly, you must specify All as the account ID.
    */
  def modifyDocumentPermission(): Request[ModifyDocumentPermissionResponse, AWSError] = js.native
  def modifyDocumentPermission(callback: js.Function2[/* err */ AWSError, /* data */ ModifyDocumentPermissionResponse, Unit]): Request[ModifyDocumentPermissionResponse, AWSError] = js.native
  /**
    * Shares a Systems Manager document publicly or privately. If you share a document privately, you must specify the AWS user account IDs for those people who can use the document. If you share a document publicly, you must specify All as the account ID.
    */
  def modifyDocumentPermission(params: ModifyDocumentPermissionRequest): Request[ModifyDocumentPermissionResponse, AWSError] = js.native
  def modifyDocumentPermission(
    params: ModifyDocumentPermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDocumentPermissionResponse, Unit]
  ): Request[ModifyDocumentPermissionResponse, AWSError] = js.native
  /**
    * Registers a compliance type and other compliance details on a designated resource. This action lets you register custom compliance details with a resource. This call overwrites existing compliance information on the resource, so you must provide a full list of compliance items each time that you send the request. ComplianceType can be one of the following:   ExecutionId: The execution ID when the patch, association, or custom compliance item was applied.   ExecutionType: Specify patch, association, or Custom:string.   ExecutionTime. The time the patch, association, or custom compliance item was applied to the instance.   Id: The patch, association, or custom compliance ID.   Title: A title.   Status: The status of the compliance item. For example, approved for patches, or Failed for associations.   Severity: A patch severity. For example, critical.   DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.   DocumentVersion: An SSM document version number. For example, 4.   Classification: A patch classification. For example, security updates.   PatchBaselineId: A patch baseline ID.   PatchSeverity: A patch severity. For example, Critical.   PatchState: A patch state. For example, InstancesWithFailedPatches.   PatchGroup: The name of a patch group.   InstalledTime: The time the association, patch, or custom compliance item was applied to the resource. Specify the time by using the following format: yyyy-MM-dd'T'HH:mm:ss'Z'  
    */
  def putComplianceItems(): Request[PutComplianceItemsResult, AWSError] = js.native
  def putComplianceItems(callback: js.Function2[/* err */ AWSError, /* data */ PutComplianceItemsResult, Unit]): Request[PutComplianceItemsResult, AWSError] = js.native
  /**
    * Registers a compliance type and other compliance details on a designated resource. This action lets you register custom compliance details with a resource. This call overwrites existing compliance information on the resource, so you must provide a full list of compliance items each time that you send the request. ComplianceType can be one of the following:   ExecutionId: The execution ID when the patch, association, or custom compliance item was applied.   ExecutionType: Specify patch, association, or Custom:string.   ExecutionTime. The time the patch, association, or custom compliance item was applied to the instance.   Id: The patch, association, or custom compliance ID.   Title: A title.   Status: The status of the compliance item. For example, approved for patches, or Failed for associations.   Severity: A patch severity. For example, critical.   DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.   DocumentVersion: An SSM document version number. For example, 4.   Classification: A patch classification. For example, security updates.   PatchBaselineId: A patch baseline ID.   PatchSeverity: A patch severity. For example, Critical.   PatchState: A patch state. For example, InstancesWithFailedPatches.   PatchGroup: The name of a patch group.   InstalledTime: The time the association, patch, or custom compliance item was applied to the resource. Specify the time by using the following format: yyyy-MM-dd'T'HH:mm:ss'Z'  
    */
  def putComplianceItems(params: PutComplianceItemsRequest): Request[PutComplianceItemsResult, AWSError] = js.native
  def putComplianceItems(
    params: PutComplianceItemsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutComplianceItemsResult, Unit]
  ): Request[PutComplianceItemsResult, AWSError] = js.native
  /**
    * Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't already exist, or updates an inventory item, if it does exist.
    */
  def putInventory(): Request[PutInventoryResult, AWSError] = js.native
  def putInventory(callback: js.Function2[/* err */ AWSError, /* data */ PutInventoryResult, Unit]): Request[PutInventoryResult, AWSError] = js.native
  /**
    * Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't already exist, or updates an inventory item, if it does exist.
    */
  def putInventory(params: PutInventoryRequest): Request[PutInventoryResult, AWSError] = js.native
  def putInventory(
    params: PutInventoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutInventoryResult, Unit]
  ): Request[PutInventoryResult, AWSError] = js.native
  /**
    * Add a parameter to the system.
    */
  def putParameter(): Request[PutParameterResult, AWSError] = js.native
  def putParameter(callback: js.Function2[/* err */ AWSError, /* data */ PutParameterResult, Unit]): Request[PutParameterResult, AWSError] = js.native
  /**
    * Add a parameter to the system.
    */
  def putParameter(params: PutParameterRequest): Request[PutParameterResult, AWSError] = js.native
  def putParameter(
    params: PutParameterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutParameterResult, Unit]
  ): Request[PutParameterResult, AWSError] = js.native
  /**
    * Defines the default patch baseline for the relevant operating system. To reset the AWS predefined patch baseline as the default, specify the full patch baseline ARN as the baseline ID value. For example, for CentOS, specify arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed instead of pb-0574b43a65ea646ed.
    */
  def registerDefaultPatchBaseline(): Request[RegisterDefaultPatchBaselineResult, AWSError] = js.native
  def registerDefaultPatchBaseline(callback: js.Function2[/* err */ AWSError, /* data */ RegisterDefaultPatchBaselineResult, Unit]): Request[RegisterDefaultPatchBaselineResult, AWSError] = js.native
  /**
    * Defines the default patch baseline for the relevant operating system. To reset the AWS predefined patch baseline as the default, specify the full patch baseline ARN as the baseline ID value. For example, for CentOS, specify arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed instead of pb-0574b43a65ea646ed.
    */
  def registerDefaultPatchBaseline(params: RegisterDefaultPatchBaselineRequest): Request[RegisterDefaultPatchBaselineResult, AWSError] = js.native
  def registerDefaultPatchBaseline(
    params: RegisterDefaultPatchBaselineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterDefaultPatchBaselineResult, Unit]
  ): Request[RegisterDefaultPatchBaselineResult, AWSError] = js.native
  /**
    * Registers a patch baseline for a patch group.
    */
  def registerPatchBaselineForPatchGroup(): Request[RegisterPatchBaselineForPatchGroupResult, AWSError] = js.native
  def registerPatchBaselineForPatchGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterPatchBaselineForPatchGroupResult, Unit]
  ): Request[RegisterPatchBaselineForPatchGroupResult, AWSError] = js.native
  /**
    * Registers a patch baseline for a patch group.
    */
  def registerPatchBaselineForPatchGroup(params: RegisterPatchBaselineForPatchGroupRequest): Request[RegisterPatchBaselineForPatchGroupResult, AWSError] = js.native
  def registerPatchBaselineForPatchGroup(
    params: RegisterPatchBaselineForPatchGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterPatchBaselineForPatchGroupResult, Unit]
  ): Request[RegisterPatchBaselineForPatchGroupResult, AWSError] = js.native
  /**
    * Registers a target with a maintenance window.
    */
  def registerTargetWithMaintenanceWindow(): Request[RegisterTargetWithMaintenanceWindowResult, AWSError] = js.native
  def registerTargetWithMaintenanceWindow(
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterTargetWithMaintenanceWindowResult, Unit]
  ): Request[RegisterTargetWithMaintenanceWindowResult, AWSError] = js.native
  /**
    * Registers a target with a maintenance window.
    */
  def registerTargetWithMaintenanceWindow(params: RegisterTargetWithMaintenanceWindowRequest): Request[RegisterTargetWithMaintenanceWindowResult, AWSError] = js.native
  def registerTargetWithMaintenanceWindow(
    params: RegisterTargetWithMaintenanceWindowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterTargetWithMaintenanceWindowResult, Unit]
  ): Request[RegisterTargetWithMaintenanceWindowResult, AWSError] = js.native
  /**
    * Adds a new task to a maintenance window.
    */
  def registerTaskWithMaintenanceWindow(): Request[RegisterTaskWithMaintenanceWindowResult, AWSError] = js.native
  def registerTaskWithMaintenanceWindow(
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterTaskWithMaintenanceWindowResult, Unit]
  ): Request[RegisterTaskWithMaintenanceWindowResult, AWSError] = js.native
  /**
    * Adds a new task to a maintenance window.
    */
  def registerTaskWithMaintenanceWindow(params: RegisterTaskWithMaintenanceWindowRequest): Request[RegisterTaskWithMaintenanceWindowResult, AWSError] = js.native
  def registerTaskWithMaintenanceWindow(
    params: RegisterTaskWithMaintenanceWindowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterTaskWithMaintenanceWindowResult, Unit]
  ): Request[RegisterTaskWithMaintenanceWindowResult, AWSError] = js.native
  /**
    * Removes tag keys from the specified resource.
    */
  def removeTagsFromResource(): Request[RemoveTagsFromResourceResult, AWSError] = js.native
  def removeTagsFromResource(callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsFromResourceResult, Unit]): Request[RemoveTagsFromResourceResult, AWSError] = js.native
  /**
    * Removes tag keys from the specified resource.
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceRequest): Request[RemoveTagsFromResourceResult, AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsFromResourceResult, Unit]
  ): Request[RemoveTagsFromResourceResult, AWSError] = js.native
  /**
    *  ServiceSetting is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature. Services map a SettingId object to a setting value. AWS services teams define the default value for a SettingId. You can't create a new SettingId, but you can overwrite the default value if you have the ssm:UpdateServiceSetting permission for the setting. Use the GetServiceSetting API action to view the current value. Use the UpdateServiceSetting API action to change the default setting.  Reset the service setting for the account to the default value as provisioned by the AWS service team. 
    */
  def resetServiceSetting(): Request[ResetServiceSettingResult, AWSError] = js.native
  def resetServiceSetting(callback: js.Function2[/* err */ AWSError, /* data */ ResetServiceSettingResult, Unit]): Request[ResetServiceSettingResult, AWSError] = js.native
  /**
    *  ServiceSetting is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature. Services map a SettingId object to a setting value. AWS services teams define the default value for a SettingId. You can't create a new SettingId, but you can overwrite the default value if you have the ssm:UpdateServiceSetting permission for the setting. Use the GetServiceSetting API action to view the current value. Use the UpdateServiceSetting API action to change the default setting.  Reset the service setting for the account to the default value as provisioned by the AWS service team. 
    */
  def resetServiceSetting(params: ResetServiceSettingRequest): Request[ResetServiceSettingResult, AWSError] = js.native
  def resetServiceSetting(
    params: ResetServiceSettingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetServiceSettingResult, Unit]
  ): Request[ResetServiceSettingResult, AWSError] = js.native
  /**
    * Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected sessions, but not terminated sessions.  This command is primarily for use by client machines to automatically reconnect during intermittent network issues. It is not intended for any other use. 
    */
  def resumeSession(): Request[ResumeSessionResponse, AWSError] = js.native
  def resumeSession(callback: js.Function2[/* err */ AWSError, /* data */ ResumeSessionResponse, Unit]): Request[ResumeSessionResponse, AWSError] = js.native
  /**
    * Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected sessions, but not terminated sessions.  This command is primarily for use by client machines to automatically reconnect during intermittent network issues. It is not intended for any other use. 
    */
  def resumeSession(params: ResumeSessionRequest): Request[ResumeSessionResponse, AWSError] = js.native
  def resumeSession(
    params: ResumeSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResumeSessionResponse, Unit]
  ): Request[ResumeSessionResponse, AWSError] = js.native
  /**
    * Sends a signal to an Automation execution to change the current behavior or status of the execution. 
    */
  def sendAutomationSignal(): Request[SendAutomationSignalResult, AWSError] = js.native
  def sendAutomationSignal(callback: js.Function2[/* err */ AWSError, /* data */ SendAutomationSignalResult, Unit]): Request[SendAutomationSignalResult, AWSError] = js.native
  /**
    * Sends a signal to an Automation execution to change the current behavior or status of the execution. 
    */
  def sendAutomationSignal(params: SendAutomationSignalRequest): Request[SendAutomationSignalResult, AWSError] = js.native
  def sendAutomationSignal(
    params: SendAutomationSignalRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendAutomationSignalResult, Unit]
  ): Request[SendAutomationSignalResult, AWSError] = js.native
  /**
    * Runs commands on one or more managed instances.
    */
  def sendCommand(): Request[SendCommandResult, AWSError] = js.native
  def sendCommand(callback: js.Function2[/* err */ AWSError, /* data */ SendCommandResult, Unit]): Request[SendCommandResult, AWSError] = js.native
  /**
    * Runs commands on one or more managed instances.
    */
  def sendCommand(params: SendCommandRequest): Request[SendCommandResult, AWSError] = js.native
  def sendCommand(
    params: SendCommandRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendCommandResult, Unit]
  ): Request[SendCommandResult, AWSError] = js.native
  /**
    * Use this API action to run an association immediately and only one time. This action can be helpful when troubleshooting associations.
    */
  def startAssociationsOnce(): Request[StartAssociationsOnceResult, AWSError] = js.native
  def startAssociationsOnce(callback: js.Function2[/* err */ AWSError, /* data */ StartAssociationsOnceResult, Unit]): Request[StartAssociationsOnceResult, AWSError] = js.native
  /**
    * Use this API action to run an association immediately and only one time. This action can be helpful when troubleshooting associations.
    */
  def startAssociationsOnce(params: StartAssociationsOnceRequest): Request[StartAssociationsOnceResult, AWSError] = js.native
  def startAssociationsOnce(
    params: StartAssociationsOnceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartAssociationsOnceResult, Unit]
  ): Request[StartAssociationsOnceResult, AWSError] = js.native
  /**
    * Initiates execution of an Automation document.
    */
  def startAutomationExecution(): Request[StartAutomationExecutionResult, AWSError] = js.native
  def startAutomationExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartAutomationExecutionResult, Unit]): Request[StartAutomationExecutionResult, AWSError] = js.native
  /**
    * Initiates execution of an Automation document.
    */
  def startAutomationExecution(params: StartAutomationExecutionRequest): Request[StartAutomationExecutionResult, AWSError] = js.native
  def startAutomationExecution(
    params: StartAutomationExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartAutomationExecutionResult, Unit]
  ): Request[StartAutomationExecutionResult, AWSError] = js.native
  /**
    * Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and token that can be used to open a WebSocket connection for sending input and receiving outputs.  AWS CLI usage: start-session is an interactive command that requires the Session Manager plugin to be installed on the client machine making the call. For information, see  Install the Session Manager Plugin for the AWS CLI in the AWS Systems Manager User Guide. AWS Tools for PowerShell usage: Start-SSMSession is not currently supported by AWS Tools for PowerShell on Windows local machines. 
    */
  def startSession(): Request[StartSessionResponse, AWSError] = js.native
  def startSession(callback: js.Function2[/* err */ AWSError, /* data */ StartSessionResponse, Unit]): Request[StartSessionResponse, AWSError] = js.native
  /**
    * Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and token that can be used to open a WebSocket connection for sending input and receiving outputs.  AWS CLI usage: start-session is an interactive command that requires the Session Manager plugin to be installed on the client machine making the call. For information, see  Install the Session Manager Plugin for the AWS CLI in the AWS Systems Manager User Guide. AWS Tools for PowerShell usage: Start-SSMSession is not currently supported by AWS Tools for PowerShell on Windows local machines. 
    */
  def startSession(params: StartSessionRequest): Request[StartSessionResponse, AWSError] = js.native
  def startSession(
    params: StartSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSessionResponse, Unit]
  ): Request[StartSessionResponse, AWSError] = js.native
  /**
    * Stop an Automation that is currently running.
    */
  def stopAutomationExecution(): Request[StopAutomationExecutionResult, AWSError] = js.native
  def stopAutomationExecution(callback: js.Function2[/* err */ AWSError, /* data */ StopAutomationExecutionResult, Unit]): Request[StopAutomationExecutionResult, AWSError] = js.native
  /**
    * Stop an Automation that is currently running.
    */
  def stopAutomationExecution(params: StopAutomationExecutionRequest): Request[StopAutomationExecutionResult, AWSError] = js.native
  def stopAutomationExecution(
    params: StopAutomationExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopAutomationExecutionResult, Unit]
  ): Request[StopAutomationExecutionResult, AWSError] = js.native
  /**
    * Permanently ends a session and closes the data connection between the Session Manager client and SSM Agent on the instance. A terminated session cannot be resumed.
    */
  def terminateSession(): Request[TerminateSessionResponse, AWSError] = js.native
  def terminateSession(callback: js.Function2[/* err */ AWSError, /* data */ TerminateSessionResponse, Unit]): Request[TerminateSessionResponse, AWSError] = js.native
  /**
    * Permanently ends a session and closes the data connection between the Session Manager client and SSM Agent on the instance. A terminated session cannot be resumed.
    */
  def terminateSession(params: TerminateSessionRequest): Request[TerminateSessionResponse, AWSError] = js.native
  def terminateSession(
    params: TerminateSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TerminateSessionResponse, Unit]
  ): Request[TerminateSessionResponse, AWSError] = js.native
  /**
    * Updates an association. You can update the association name and version, the document version, schedule, parameters, and Amazon S3 output.  In order to call this API action, your IAM user account, group, or role must be configured with permission to call the DescribeAssociation API action. If you don't have permission to call DescribeAssociation, then you receive the following error: An error occurred (AccessDeniedException) when calling the UpdateAssociation operation: User: &lt;user_arn&gt; is not authorized to perform: ssm:DescribeAssociation on resource: &lt;resource_arn&gt;   When you update an association, the association immediately runs against the specified targets. 
    */
  def updateAssociation(): Request[UpdateAssociationResult, AWSError] = js.native
  def updateAssociation(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssociationResult, Unit]): Request[UpdateAssociationResult, AWSError] = js.native
  /**
    * Updates an association. You can update the association name and version, the document version, schedule, parameters, and Amazon S3 output.  In order to call this API action, your IAM user account, group, or role must be configured with permission to call the DescribeAssociation API action. If you don't have permission to call DescribeAssociation, then you receive the following error: An error occurred (AccessDeniedException) when calling the UpdateAssociation operation: User: &lt;user_arn&gt; is not authorized to perform: ssm:DescribeAssociation on resource: &lt;resource_arn&gt;   When you update an association, the association immediately runs against the specified targets. 
    */
  def updateAssociation(params: UpdateAssociationRequest): Request[UpdateAssociationResult, AWSError] = js.native
  def updateAssociation(
    params: UpdateAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssociationResult, Unit]
  ): Request[UpdateAssociationResult, AWSError] = js.native
  /**
    * Updates the status of the Systems Manager document associated with the specified instance.
    */
  def updateAssociationStatus(): Request[UpdateAssociationStatusResult, AWSError] = js.native
  def updateAssociationStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssociationStatusResult, Unit]): Request[UpdateAssociationStatusResult, AWSError] = js.native
  /**
    * Updates the status of the Systems Manager document associated with the specified instance.
    */
  def updateAssociationStatus(params: UpdateAssociationStatusRequest): Request[UpdateAssociationStatusResult, AWSError] = js.native
  def updateAssociationStatus(
    params: UpdateAssociationStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssociationStatusResult, Unit]
  ): Request[UpdateAssociationStatusResult, AWSError] = js.native
  /**
    * Updates one or more values for an SSM document.
    */
  def updateDocument(): Request[UpdateDocumentResult, AWSError] = js.native
  def updateDocument(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDocumentResult, Unit]): Request[UpdateDocumentResult, AWSError] = js.native
  /**
    * Updates one or more values for an SSM document.
    */
  def updateDocument(params: UpdateDocumentRequest): Request[UpdateDocumentResult, AWSError] = js.native
  def updateDocument(
    params: UpdateDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDocumentResult, Unit]
  ): Request[UpdateDocumentResult, AWSError] = js.native
  /**
    * Set the default version of a document. 
    */
  def updateDocumentDefaultVersion(): Request[UpdateDocumentDefaultVersionResult, AWSError] = js.native
  def updateDocumentDefaultVersion(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDocumentDefaultVersionResult, Unit]): Request[UpdateDocumentDefaultVersionResult, AWSError] = js.native
  /**
    * Set the default version of a document. 
    */
  def updateDocumentDefaultVersion(params: UpdateDocumentDefaultVersionRequest): Request[UpdateDocumentDefaultVersionResult, AWSError] = js.native
  def updateDocumentDefaultVersion(
    params: UpdateDocumentDefaultVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDocumentDefaultVersionResult, Unit]
  ): Request[UpdateDocumentDefaultVersionResult, AWSError] = js.native
  /**
    * Updates an existing maintenance window. Only specified parameters are modified.  The value you specify for Duration determines the specific end time for the maintenance window based on the time it begins. No maintenance window tasks are permitted to start after the resulting endtime minus the number of hours you specify for Cutoff. For example, if the maintenance window starts at 3 PM, the duration is three hours, and the value you specify for Cutoff is one hour, no maintenance window tasks can start after 5 PM. 
    */
  def updateMaintenanceWindow(): Request[UpdateMaintenanceWindowResult, AWSError] = js.native
  def updateMaintenanceWindow(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMaintenanceWindowResult, Unit]): Request[UpdateMaintenanceWindowResult, AWSError] = js.native
  /**
    * Updates an existing maintenance window. Only specified parameters are modified.  The value you specify for Duration determines the specific end time for the maintenance window based on the time it begins. No maintenance window tasks are permitted to start after the resulting endtime minus the number of hours you specify for Cutoff. For example, if the maintenance window starts at 3 PM, the duration is three hours, and the value you specify for Cutoff is one hour, no maintenance window tasks can start after 5 PM. 
    */
  def updateMaintenanceWindow(params: UpdateMaintenanceWindowRequest): Request[UpdateMaintenanceWindowResult, AWSError] = js.native
  def updateMaintenanceWindow(
    params: UpdateMaintenanceWindowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMaintenanceWindowResult, Unit]
  ): Request[UpdateMaintenanceWindowResult, AWSError] = js.native
  /**
    * Modifies the target of an existing maintenance window. You can change the following:   Name   Description   Owner   IDs for an ID target   Tags for a Tag target   From any supported tag type to another. The three supported tag types are ID target, Tag target, and resource group. For more information, see Target.    If a parameter is null, then the corresponding field is not modified. 
    */
  def updateMaintenanceWindowTarget(): Request[UpdateMaintenanceWindowTargetResult, AWSError] = js.native
  def updateMaintenanceWindowTarget(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMaintenanceWindowTargetResult, Unit]): Request[UpdateMaintenanceWindowTargetResult, AWSError] = js.native
  /**
    * Modifies the target of an existing maintenance window. You can change the following:   Name   Description   Owner   IDs for an ID target   Tags for a Tag target   From any supported tag type to another. The three supported tag types are ID target, Tag target, and resource group. For more information, see Target.    If a parameter is null, then the corresponding field is not modified. 
    */
  def updateMaintenanceWindowTarget(params: UpdateMaintenanceWindowTargetRequest): Request[UpdateMaintenanceWindowTargetResult, AWSError] = js.native
  def updateMaintenanceWindowTarget(
    params: UpdateMaintenanceWindowTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMaintenanceWindowTargetResult, Unit]
  ): Request[UpdateMaintenanceWindowTargetResult, AWSError] = js.native
  /**
    * Modifies a task assigned to a maintenance window. You can't change the task type, but you can change the following values:   TaskARN. For example, you can change a RUN_COMMAND task from AWS-RunPowerShellScript to AWS-RunShellScript.   ServiceRoleArn   TaskInvocationParameters   Priority   MaxConcurrency   MaxErrors   If a parameter is null, then the corresponding field is not modified. Also, if you set Replace to true, then all fields required by the RegisterTaskWithMaintenanceWindow action are required for this request. Optional fields that aren't specified are set to null.
    */
  def updateMaintenanceWindowTask(): Request[UpdateMaintenanceWindowTaskResult, AWSError] = js.native
  def updateMaintenanceWindowTask(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMaintenanceWindowTaskResult, Unit]): Request[UpdateMaintenanceWindowTaskResult, AWSError] = js.native
  /**
    * Modifies a task assigned to a maintenance window. You can't change the task type, but you can change the following values:   TaskARN. For example, you can change a RUN_COMMAND task from AWS-RunPowerShellScript to AWS-RunShellScript.   ServiceRoleArn   TaskInvocationParameters   Priority   MaxConcurrency   MaxErrors   If a parameter is null, then the corresponding field is not modified. Also, if you set Replace to true, then all fields required by the RegisterTaskWithMaintenanceWindow action are required for this request. Optional fields that aren't specified are set to null.
    */
  def updateMaintenanceWindowTask(params: UpdateMaintenanceWindowTaskRequest): Request[UpdateMaintenanceWindowTaskResult, AWSError] = js.native
  def updateMaintenanceWindowTask(
    params: UpdateMaintenanceWindowTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMaintenanceWindowTaskResult, Unit]
  ): Request[UpdateMaintenanceWindowTaskResult, AWSError] = js.native
  /**
    * Assigns or changes an Amazon Identity and Access Management (IAM) role for the managed instance.
    */
  def updateManagedInstanceRole(): Request[UpdateManagedInstanceRoleResult, AWSError] = js.native
  def updateManagedInstanceRole(callback: js.Function2[/* err */ AWSError, /* data */ UpdateManagedInstanceRoleResult, Unit]): Request[UpdateManagedInstanceRoleResult, AWSError] = js.native
  /**
    * Assigns or changes an Amazon Identity and Access Management (IAM) role for the managed instance.
    */
  def updateManagedInstanceRole(params: UpdateManagedInstanceRoleRequest): Request[UpdateManagedInstanceRoleResult, AWSError] = js.native
  def updateManagedInstanceRole(
    params: UpdateManagedInstanceRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateManagedInstanceRoleResult, Unit]
  ): Request[UpdateManagedInstanceRoleResult, AWSError] = js.native
  /**
    * Edit or change an OpsItem. You must have permission in AWS Identity and Access Management (IAM) to update an OpsItem. For more information, see Getting Started with OpsCenter in the AWS Systems Manager User Guide. Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager OpsCenter in the AWS Systems Manager User Guide. 
    */
  def updateOpsItem(): Request[UpdateOpsItemResponse, AWSError] = js.native
  def updateOpsItem(callback: js.Function2[/* err */ AWSError, /* data */ UpdateOpsItemResponse, Unit]): Request[UpdateOpsItemResponse, AWSError] = js.native
  /**
    * Edit or change an OpsItem. You must have permission in AWS Identity and Access Management (IAM) to update an OpsItem. For more information, see Getting Started with OpsCenter in the AWS Systems Manager User Guide. Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues impacting the performance and health of their AWS resources. For more information, see AWS Systems Manager OpsCenter in the AWS Systems Manager User Guide. 
    */
  def updateOpsItem(params: UpdateOpsItemRequest): Request[UpdateOpsItemResponse, AWSError] = js.native
  def updateOpsItem(
    params: UpdateOpsItemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateOpsItemResponse, Unit]
  ): Request[UpdateOpsItemResponse, AWSError] = js.native
  /**
    * Modifies an existing patch baseline. Fields not specified in the request are left unchanged.  For information about valid key and value pairs in PatchFilters for each supported operating system type, see PatchFilter. 
    */
  def updatePatchBaseline(): Request[UpdatePatchBaselineResult, AWSError] = js.native
  def updatePatchBaseline(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePatchBaselineResult, Unit]): Request[UpdatePatchBaselineResult, AWSError] = js.native
  /**
    * Modifies an existing patch baseline. Fields not specified in the request are left unchanged.  For information about valid key and value pairs in PatchFilters for each supported operating system type, see PatchFilter. 
    */
  def updatePatchBaseline(params: UpdatePatchBaselineRequest): Request[UpdatePatchBaselineResult, AWSError] = js.native
  def updatePatchBaseline(
    params: UpdatePatchBaselineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePatchBaselineResult, Unit]
  ): Request[UpdatePatchBaselineResult, AWSError] = js.native
  /**
    * Update a resource data sync. After you create a resource data sync for a Region, you can't change the account options for that sync. For example, if you create a sync in the us-east-2 (Ohio) Region and you choose the Include only the current account option, you can't edit that sync later and choose the Include all accounts from my AWS Organizations configuration option. Instead, you must delete the first resource data sync, and create a new one.
    */
  def updateResourceDataSync(): Request[UpdateResourceDataSyncResult, AWSError] = js.native
  def updateResourceDataSync(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceDataSyncResult, Unit]): Request[UpdateResourceDataSyncResult, AWSError] = js.native
  /**
    * Update a resource data sync. After you create a resource data sync for a Region, you can't change the account options for that sync. For example, if you create a sync in the us-east-2 (Ohio) Region and you choose the Include only the current account option, you can't edit that sync later and choose the Include all accounts from my AWS Organizations configuration option. Instead, you must delete the first resource data sync, and create a new one.
    */
  def updateResourceDataSync(params: UpdateResourceDataSyncRequest): Request[UpdateResourceDataSyncResult, AWSError] = js.native
  def updateResourceDataSync(
    params: UpdateResourceDataSyncRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceDataSyncResult, Unit]
  ): Request[UpdateResourceDataSyncResult, AWSError] = js.native
  /**
    *  ServiceSetting is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature. Services map a SettingId object to a setting value. AWS services teams define the default value for a SettingId. You can't create a new SettingId, but you can overwrite the default value if you have the ssm:UpdateServiceSetting permission for the setting. Use the GetServiceSetting API action to view the current value. Or, use the ResetServiceSetting to change the value back to the original value defined by the AWS service team. Update the service setting for the account. 
    */
  def updateServiceSetting(): Request[UpdateServiceSettingResult, AWSError] = js.native
  def updateServiceSetting(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceSettingResult, Unit]): Request[UpdateServiceSettingResult, AWSError] = js.native
  /**
    *  ServiceSetting is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature. Services map a SettingId object to a setting value. AWS services teams define the default value for a SettingId. You can't create a new SettingId, but you can overwrite the default value if you have the ssm:UpdateServiceSetting permission for the setting. Use the GetServiceSetting API action to view the current value. Or, use the ResetServiceSetting to change the value back to the original value defined by the AWS service team. Update the service setting for the account. 
    */
  def updateServiceSetting(params: UpdateServiceSettingRequest): Request[UpdateServiceSettingResult, AWSError] = js.native
  def updateServiceSetting(
    params: UpdateServiceSettingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceSettingResult, Unit]
  ): Request[UpdateServiceSettingResult, AWSError] = js.native
}

