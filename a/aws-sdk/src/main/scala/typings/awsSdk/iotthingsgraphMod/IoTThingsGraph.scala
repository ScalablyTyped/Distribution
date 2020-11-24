package typings.awsSdk.iotthingsgraphMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IoTThingsGraph extends Service {
  
  /**
    * Associates a device with a concrete thing that is in the user's registry. A thing can be associated with only one device at a time. If you associate a thing with a new device id, its previous association will be removed.
    */
  def associateEntityToThing(): Request[AssociateEntityToThingResponse, AWSError] = js.native
  def associateEntityToThing(callback: js.Function2[/* err */ AWSError, /* data */ AssociateEntityToThingResponse, Unit]): Request[AssociateEntityToThingResponse, AWSError] = js.native
  /**
    * Associates a device with a concrete thing that is in the user's registry. A thing can be associated with only one device at a time. If you associate a thing with a new device id, its previous association will be removed.
    */
  def associateEntityToThing(params: AssociateEntityToThingRequest): Request[AssociateEntityToThingResponse, AWSError] = js.native
  def associateEntityToThing(
    params: AssociateEntityToThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateEntityToThingResponse, Unit]
  ): Request[AssociateEntityToThingResponse, AWSError] = js.native
  
  @JSName("config")
  var config_IoTThingsGraph: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a workflow template. Workflows can be created only in the user's namespace. (The public namespace contains only entities.) The workflow can contain only entities in the specified namespace. The workflow is validated against the entities in the latest version of the user's namespace unless another namespace version is specified in the request.
    */
  def createFlowTemplate(): Request[CreateFlowTemplateResponse, AWSError] = js.native
  def createFlowTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateFlowTemplateResponse, Unit]): Request[CreateFlowTemplateResponse, AWSError] = js.native
  /**
    * Creates a workflow template. Workflows can be created only in the user's namespace. (The public namespace contains only entities.) The workflow can contain only entities in the specified namespace. The workflow is validated against the entities in the latest version of the user's namespace unless another namespace version is specified in the request.
    */
  def createFlowTemplate(params: CreateFlowTemplateRequest): Request[CreateFlowTemplateResponse, AWSError] = js.native
  def createFlowTemplate(
    params: CreateFlowTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFlowTemplateResponse, Unit]
  ): Request[CreateFlowTemplateResponse, AWSError] = js.native
  
  /**
    * Creates a system instance.  This action validates the system instance, prepares the deployment-related resources. For Greengrass deployments, it updates the Greengrass group that is specified by the greengrassGroupName parameter. It also adds a file to the S3 bucket specified by the s3BucketName parameter. You need to call DeploySystemInstance after running this action. For Greengrass deployments, since this action modifies and adds resources to a Greengrass group and an S3 bucket on the caller's behalf, the calling identity must have write permissions to both the specified Greengrass group and S3 bucket. Otherwise, the call will fail with an authorization error. For cloud deployments, this action requires a flowActionsRoleArn value. This is an IAM role that has permissions to access AWS services, such as AWS Lambda and AWS IoT, that the flow uses when it executes. If the definition document doesn't specify a version of the user's namespace, the latest version will be used by default.
    */
  def createSystemInstance(): Request[CreateSystemInstanceResponse, AWSError] = js.native
  def createSystemInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateSystemInstanceResponse, Unit]): Request[CreateSystemInstanceResponse, AWSError] = js.native
  /**
    * Creates a system instance.  This action validates the system instance, prepares the deployment-related resources. For Greengrass deployments, it updates the Greengrass group that is specified by the greengrassGroupName parameter. It also adds a file to the S3 bucket specified by the s3BucketName parameter. You need to call DeploySystemInstance after running this action. For Greengrass deployments, since this action modifies and adds resources to a Greengrass group and an S3 bucket on the caller's behalf, the calling identity must have write permissions to both the specified Greengrass group and S3 bucket. Otherwise, the call will fail with an authorization error. For cloud deployments, this action requires a flowActionsRoleArn value. This is an IAM role that has permissions to access AWS services, such as AWS Lambda and AWS IoT, that the flow uses when it executes. If the definition document doesn't specify a version of the user's namespace, the latest version will be used by default.
    */
  def createSystemInstance(params: CreateSystemInstanceRequest): Request[CreateSystemInstanceResponse, AWSError] = js.native
  def createSystemInstance(
    params: CreateSystemInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSystemInstanceResponse, Unit]
  ): Request[CreateSystemInstanceResponse, AWSError] = js.native
  
  /**
    * Creates a system. The system is validated against the entities in the latest version of the user's namespace unless another namespace version is specified in the request.
    */
  def createSystemTemplate(): Request[CreateSystemTemplateResponse, AWSError] = js.native
  def createSystemTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateSystemTemplateResponse, Unit]): Request[CreateSystemTemplateResponse, AWSError] = js.native
  /**
    * Creates a system. The system is validated against the entities in the latest version of the user's namespace unless another namespace version is specified in the request.
    */
  def createSystemTemplate(params: CreateSystemTemplateRequest): Request[CreateSystemTemplateResponse, AWSError] = js.native
  def createSystemTemplate(
    params: CreateSystemTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSystemTemplateResponse, Unit]
  ): Request[CreateSystemTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes a workflow. Any new system or deployment that contains this workflow will fail to update or deploy. Existing deployments that contain the workflow will continue to run (since they use a snapshot of the workflow taken at the time of deployment).
    */
  def deleteFlowTemplate(): Request[DeleteFlowTemplateResponse, AWSError] = js.native
  def deleteFlowTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlowTemplateResponse, Unit]): Request[DeleteFlowTemplateResponse, AWSError] = js.native
  /**
    * Deletes a workflow. Any new system or deployment that contains this workflow will fail to update or deploy. Existing deployments that contain the workflow will continue to run (since they use a snapshot of the workflow taken at the time of deployment).
    */
  def deleteFlowTemplate(params: DeleteFlowTemplateRequest): Request[DeleteFlowTemplateResponse, AWSError] = js.native
  def deleteFlowTemplate(
    params: DeleteFlowTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlowTemplateResponse, Unit]
  ): Request[DeleteFlowTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes the specified namespace. This action deletes all of the entities in the namespace. Delete the systems and flows that use entities in the namespace before performing this action.
    */
  def deleteNamespace(): Request[DeleteNamespaceResponse, AWSError] = js.native
  def deleteNamespace(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamespaceResponse, Unit]): Request[DeleteNamespaceResponse, AWSError] = js.native
  /**
    * Deletes the specified namespace. This action deletes all of the entities in the namespace. Delete the systems and flows that use entities in the namespace before performing this action.
    */
  def deleteNamespace(params: DeleteNamespaceRequest): Request[DeleteNamespaceResponse, AWSError] = js.native
  def deleteNamespace(
    params: DeleteNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamespaceResponse, Unit]
  ): Request[DeleteNamespaceResponse, AWSError] = js.native
  
  /**
    * Deletes a system instance. Only system instances that have never been deployed, or that have been undeployed can be deleted. Users can create a new system instance that has the same ID as a deleted system instance.
    */
  def deleteSystemInstance(): Request[DeleteSystemInstanceResponse, AWSError] = js.native
  def deleteSystemInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSystemInstanceResponse, Unit]): Request[DeleteSystemInstanceResponse, AWSError] = js.native
  /**
    * Deletes a system instance. Only system instances that have never been deployed, or that have been undeployed can be deleted. Users can create a new system instance that has the same ID as a deleted system instance.
    */
  def deleteSystemInstance(params: DeleteSystemInstanceRequest): Request[DeleteSystemInstanceResponse, AWSError] = js.native
  def deleteSystemInstance(
    params: DeleteSystemInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSystemInstanceResponse, Unit]
  ): Request[DeleteSystemInstanceResponse, AWSError] = js.native
  
  /**
    * Deletes a system. New deployments can't contain the system after its deletion. Existing deployments that contain the system will continue to work because they use a snapshot of the system that is taken when it is deployed.
    */
  def deleteSystemTemplate(): Request[DeleteSystemTemplateResponse, AWSError] = js.native
  def deleteSystemTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSystemTemplateResponse, Unit]): Request[DeleteSystemTemplateResponse, AWSError] = js.native
  /**
    * Deletes a system. New deployments can't contain the system after its deletion. Existing deployments that contain the system will continue to work because they use a snapshot of the system that is taken when it is deployed.
    */
  def deleteSystemTemplate(params: DeleteSystemTemplateRequest): Request[DeleteSystemTemplateResponse, AWSError] = js.native
  def deleteSystemTemplate(
    params: DeleteSystemTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSystemTemplateResponse, Unit]
  ): Request[DeleteSystemTemplateResponse, AWSError] = js.native
  
  /**
    *  Greengrass and Cloud Deployments  Deploys the system instance to the target specified in CreateSystemInstance.   Greengrass Deployments  If the system or any workflows and entities have been updated before this action is called, then the deployment will create a new Amazon Simple Storage Service resource file and then deploy it. Since this action creates a Greengrass deployment on the caller's behalf, the calling identity must have write permissions to the specified Greengrass group. Otherwise, the call will fail with an authorization error. For information about the artifacts that get added to your Greengrass core device when you use this API, see AWS IoT Things Graph and AWS IoT Greengrass.
    */
  def deploySystemInstance(): Request[DeploySystemInstanceResponse, AWSError] = js.native
  def deploySystemInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeploySystemInstanceResponse, Unit]): Request[DeploySystemInstanceResponse, AWSError] = js.native
  /**
    *  Greengrass and Cloud Deployments  Deploys the system instance to the target specified in CreateSystemInstance.   Greengrass Deployments  If the system or any workflows and entities have been updated before this action is called, then the deployment will create a new Amazon Simple Storage Service resource file and then deploy it. Since this action creates a Greengrass deployment on the caller's behalf, the calling identity must have write permissions to the specified Greengrass group. Otherwise, the call will fail with an authorization error. For information about the artifacts that get added to your Greengrass core device when you use this API, see AWS IoT Things Graph and AWS IoT Greengrass.
    */
  def deploySystemInstance(params: DeploySystemInstanceRequest): Request[DeploySystemInstanceResponse, AWSError] = js.native
  def deploySystemInstance(
    params: DeploySystemInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeploySystemInstanceResponse, Unit]
  ): Request[DeploySystemInstanceResponse, AWSError] = js.native
  
  /**
    * Deprecates the specified workflow. This action marks the workflow for deletion. Deprecated flows can't be deployed, but existing deployments will continue to run.
    */
  def deprecateFlowTemplate(): Request[DeprecateFlowTemplateResponse, AWSError] = js.native
  def deprecateFlowTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeprecateFlowTemplateResponse, Unit]): Request[DeprecateFlowTemplateResponse, AWSError] = js.native
  /**
    * Deprecates the specified workflow. This action marks the workflow for deletion. Deprecated flows can't be deployed, but existing deployments will continue to run.
    */
  def deprecateFlowTemplate(params: DeprecateFlowTemplateRequest): Request[DeprecateFlowTemplateResponse, AWSError] = js.native
  def deprecateFlowTemplate(
    params: DeprecateFlowTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeprecateFlowTemplateResponse, Unit]
  ): Request[DeprecateFlowTemplateResponse, AWSError] = js.native
  
  /**
    * Deprecates the specified system.
    */
  def deprecateSystemTemplate(): Request[DeprecateSystemTemplateResponse, AWSError] = js.native
  def deprecateSystemTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeprecateSystemTemplateResponse, Unit]): Request[DeprecateSystemTemplateResponse, AWSError] = js.native
  /**
    * Deprecates the specified system.
    */
  def deprecateSystemTemplate(params: DeprecateSystemTemplateRequest): Request[DeprecateSystemTemplateResponse, AWSError] = js.native
  def deprecateSystemTemplate(
    params: DeprecateSystemTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeprecateSystemTemplateResponse, Unit]
  ): Request[DeprecateSystemTemplateResponse, AWSError] = js.native
  
  /**
    * Gets the latest version of the user's namespace and the public version that it is tracking.
    */
  def describeNamespace(): Request[DescribeNamespaceResponse, AWSError] = js.native
  def describeNamespace(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNamespaceResponse, Unit]): Request[DescribeNamespaceResponse, AWSError] = js.native
  /**
    * Gets the latest version of the user's namespace and the public version that it is tracking.
    */
  def describeNamespace(params: DescribeNamespaceRequest): Request[DescribeNamespaceResponse, AWSError] = js.native
  def describeNamespace(
    params: DescribeNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNamespaceResponse, Unit]
  ): Request[DescribeNamespaceResponse, AWSError] = js.native
  
  /**
    * Dissociates a device entity from a concrete thing. The action takes only the type of the entity that you need to dissociate because only one entity of a particular type can be associated with a thing.
    */
  def dissociateEntityFromThing(): Request[DissociateEntityFromThingResponse, AWSError] = js.native
  def dissociateEntityFromThing(callback: js.Function2[/* err */ AWSError, /* data */ DissociateEntityFromThingResponse, Unit]): Request[DissociateEntityFromThingResponse, AWSError] = js.native
  /**
    * Dissociates a device entity from a concrete thing. The action takes only the type of the entity that you need to dissociate because only one entity of a particular type can be associated with a thing.
    */
  def dissociateEntityFromThing(params: DissociateEntityFromThingRequest): Request[DissociateEntityFromThingResponse, AWSError] = js.native
  def dissociateEntityFromThing(
    params: DissociateEntityFromThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DissociateEntityFromThingResponse, Unit]
  ): Request[DissociateEntityFromThingResponse, AWSError] = js.native
  
  /**
    * Gets definitions of the specified entities. Uses the latest version of the user's namespace by default. This API returns the following TDM entities.   Properties   States   Events   Actions   Capabilities   Mappings   Devices   Device Models   Services   This action doesn't return definitions for systems, flows, and deployments.
    */
  def getEntities(): Request[GetEntitiesResponse, AWSError] = js.native
  def getEntities(callback: js.Function2[/* err */ AWSError, /* data */ GetEntitiesResponse, Unit]): Request[GetEntitiesResponse, AWSError] = js.native
  /**
    * Gets definitions of the specified entities. Uses the latest version of the user's namespace by default. This API returns the following TDM entities.   Properties   States   Events   Actions   Capabilities   Mappings   Devices   Device Models   Services   This action doesn't return definitions for systems, flows, and deployments.
    */
  def getEntities(params: GetEntitiesRequest): Request[GetEntitiesResponse, AWSError] = js.native
  def getEntities(
    params: GetEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEntitiesResponse, Unit]
  ): Request[GetEntitiesResponse, AWSError] = js.native
  
  /**
    * Gets the latest version of the DefinitionDocument and FlowTemplateSummary for the specified workflow.
    */
  def getFlowTemplate(): Request[GetFlowTemplateResponse, AWSError] = js.native
  def getFlowTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetFlowTemplateResponse, Unit]): Request[GetFlowTemplateResponse, AWSError] = js.native
  /**
    * Gets the latest version of the DefinitionDocument and FlowTemplateSummary for the specified workflow.
    */
  def getFlowTemplate(params: GetFlowTemplateRequest): Request[GetFlowTemplateResponse, AWSError] = js.native
  def getFlowTemplate(
    params: GetFlowTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFlowTemplateResponse, Unit]
  ): Request[GetFlowTemplateResponse, AWSError] = js.native
  
  /**
    * Gets revisions of the specified workflow. Only the last 100 revisions are stored. If the workflow has been deprecated, this action will return revisions that occurred before the deprecation. This action won't work for workflows that have been deleted.
    */
  def getFlowTemplateRevisions(): Request[GetFlowTemplateRevisionsResponse, AWSError] = js.native
  def getFlowTemplateRevisions(callback: js.Function2[/* err */ AWSError, /* data */ GetFlowTemplateRevisionsResponse, Unit]): Request[GetFlowTemplateRevisionsResponse, AWSError] = js.native
  /**
    * Gets revisions of the specified workflow. Only the last 100 revisions are stored. If the workflow has been deprecated, this action will return revisions that occurred before the deprecation. This action won't work for workflows that have been deleted.
    */
  def getFlowTemplateRevisions(params: GetFlowTemplateRevisionsRequest): Request[GetFlowTemplateRevisionsResponse, AWSError] = js.native
  def getFlowTemplateRevisions(
    params: GetFlowTemplateRevisionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFlowTemplateRevisionsResponse, Unit]
  ): Request[GetFlowTemplateRevisionsResponse, AWSError] = js.native
  
  /**
    * Gets the status of a namespace deletion task.
    */
  def getNamespaceDeletionStatus(): Request[GetNamespaceDeletionStatusResponse, AWSError] = js.native
  def getNamespaceDeletionStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetNamespaceDeletionStatusResponse, Unit]): Request[GetNamespaceDeletionStatusResponse, AWSError] = js.native
  /**
    * Gets the status of a namespace deletion task.
    */
  def getNamespaceDeletionStatus(params: GetNamespaceDeletionStatusRequest): Request[GetNamespaceDeletionStatusResponse, AWSError] = js.native
  def getNamespaceDeletionStatus(
    params: GetNamespaceDeletionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNamespaceDeletionStatusResponse, Unit]
  ): Request[GetNamespaceDeletionStatusResponse, AWSError] = js.native
  
  /**
    * Gets a system instance.
    */
  def getSystemInstance(): Request[GetSystemInstanceResponse, AWSError] = js.native
  def getSystemInstance(callback: js.Function2[/* err */ AWSError, /* data */ GetSystemInstanceResponse, Unit]): Request[GetSystemInstanceResponse, AWSError] = js.native
  /**
    * Gets a system instance.
    */
  def getSystemInstance(params: GetSystemInstanceRequest): Request[GetSystemInstanceResponse, AWSError] = js.native
  def getSystemInstance(
    params: GetSystemInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSystemInstanceResponse, Unit]
  ): Request[GetSystemInstanceResponse, AWSError] = js.native
  
  /**
    * Gets a system.
    */
  def getSystemTemplate(): Request[GetSystemTemplateResponse, AWSError] = js.native
  def getSystemTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetSystemTemplateResponse, Unit]): Request[GetSystemTemplateResponse, AWSError] = js.native
  /**
    * Gets a system.
    */
  def getSystemTemplate(params: GetSystemTemplateRequest): Request[GetSystemTemplateResponse, AWSError] = js.native
  def getSystemTemplate(
    params: GetSystemTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSystemTemplateResponse, Unit]
  ): Request[GetSystemTemplateResponse, AWSError] = js.native
  
  /**
    * Gets revisions made to the specified system template. Only the previous 100 revisions are stored. If the system has been deprecated, this action will return the revisions that occurred before its deprecation. This action won't work with systems that have been deleted.
    */
  def getSystemTemplateRevisions(): Request[GetSystemTemplateRevisionsResponse, AWSError] = js.native
  def getSystemTemplateRevisions(callback: js.Function2[/* err */ AWSError, /* data */ GetSystemTemplateRevisionsResponse, Unit]): Request[GetSystemTemplateRevisionsResponse, AWSError] = js.native
  /**
    * Gets revisions made to the specified system template. Only the previous 100 revisions are stored. If the system has been deprecated, this action will return the revisions that occurred before its deprecation. This action won't work with systems that have been deleted.
    */
  def getSystemTemplateRevisions(params: GetSystemTemplateRevisionsRequest): Request[GetSystemTemplateRevisionsResponse, AWSError] = js.native
  def getSystemTemplateRevisions(
    params: GetSystemTemplateRevisionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSystemTemplateRevisionsResponse, Unit]
  ): Request[GetSystemTemplateRevisionsResponse, AWSError] = js.native
  
  /**
    * Gets the status of the specified upload.
    */
  def getUploadStatus(): Request[GetUploadStatusResponse, AWSError] = js.native
  def getUploadStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetUploadStatusResponse, Unit]): Request[GetUploadStatusResponse, AWSError] = js.native
  /**
    * Gets the status of the specified upload.
    */
  def getUploadStatus(params: GetUploadStatusRequest): Request[GetUploadStatusResponse, AWSError] = js.native
  def getUploadStatus(
    params: GetUploadStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUploadStatusResponse, Unit]
  ): Request[GetUploadStatusResponse, AWSError] = js.native
  
  /**
    * Returns a list of objects that contain information about events in a flow execution.
    */
  def listFlowExecutionMessages(): Request[ListFlowExecutionMessagesResponse, AWSError] = js.native
  def listFlowExecutionMessages(callback: js.Function2[/* err */ AWSError, /* data */ ListFlowExecutionMessagesResponse, Unit]): Request[ListFlowExecutionMessagesResponse, AWSError] = js.native
  /**
    * Returns a list of objects that contain information about events in a flow execution.
    */
  def listFlowExecutionMessages(params: ListFlowExecutionMessagesRequest): Request[ListFlowExecutionMessagesResponse, AWSError] = js.native
  def listFlowExecutionMessages(
    params: ListFlowExecutionMessagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFlowExecutionMessagesResponse, Unit]
  ): Request[ListFlowExecutionMessagesResponse, AWSError] = js.native
  
  /**
    * Lists all tags on an AWS IoT Things Graph resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all tags on an AWS IoT Things Graph resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Searches for entities of the specified type. You can search for entities in your namespace and the public namespace that you're tracking.
    */
  def searchEntities(): Request[SearchEntitiesResponse, AWSError] = js.native
  def searchEntities(callback: js.Function2[/* err */ AWSError, /* data */ SearchEntitiesResponse, Unit]): Request[SearchEntitiesResponse, AWSError] = js.native
  /**
    * Searches for entities of the specified type. You can search for entities in your namespace and the public namespace that you're tracking.
    */
  def searchEntities(params: SearchEntitiesRequest): Request[SearchEntitiesResponse, AWSError] = js.native
  def searchEntities(
    params: SearchEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchEntitiesResponse, Unit]
  ): Request[SearchEntitiesResponse, AWSError] = js.native
  
  /**
    * Searches for AWS IoT Things Graph workflow execution instances.
    */
  def searchFlowExecutions(): Request[SearchFlowExecutionsResponse, AWSError] = js.native
  def searchFlowExecutions(callback: js.Function2[/* err */ AWSError, /* data */ SearchFlowExecutionsResponse, Unit]): Request[SearchFlowExecutionsResponse, AWSError] = js.native
  /**
    * Searches for AWS IoT Things Graph workflow execution instances.
    */
  def searchFlowExecutions(params: SearchFlowExecutionsRequest): Request[SearchFlowExecutionsResponse, AWSError] = js.native
  def searchFlowExecutions(
    params: SearchFlowExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchFlowExecutionsResponse, Unit]
  ): Request[SearchFlowExecutionsResponse, AWSError] = js.native
  
  /**
    * Searches for summary information about workflows.
    */
  def searchFlowTemplates(): Request[SearchFlowTemplatesResponse, AWSError] = js.native
  def searchFlowTemplates(callback: js.Function2[/* err */ AWSError, /* data */ SearchFlowTemplatesResponse, Unit]): Request[SearchFlowTemplatesResponse, AWSError] = js.native
  /**
    * Searches for summary information about workflows.
    */
  def searchFlowTemplates(params: SearchFlowTemplatesRequest): Request[SearchFlowTemplatesResponse, AWSError] = js.native
  def searchFlowTemplates(
    params: SearchFlowTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchFlowTemplatesResponse, Unit]
  ): Request[SearchFlowTemplatesResponse, AWSError] = js.native
  
  /**
    * Searches for system instances in the user's account.
    */
  def searchSystemInstances(): Request[SearchSystemInstancesResponse, AWSError] = js.native
  def searchSystemInstances(callback: js.Function2[/* err */ AWSError, /* data */ SearchSystemInstancesResponse, Unit]): Request[SearchSystemInstancesResponse, AWSError] = js.native
  /**
    * Searches for system instances in the user's account.
    */
  def searchSystemInstances(params: SearchSystemInstancesRequest): Request[SearchSystemInstancesResponse, AWSError] = js.native
  def searchSystemInstances(
    params: SearchSystemInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchSystemInstancesResponse, Unit]
  ): Request[SearchSystemInstancesResponse, AWSError] = js.native
  
  /**
    * Searches for summary information about systems in the user's account. You can filter by the ID of a workflow to return only systems that use the specified workflow.
    */
  def searchSystemTemplates(): Request[SearchSystemTemplatesResponse, AWSError] = js.native
  def searchSystemTemplates(callback: js.Function2[/* err */ AWSError, /* data */ SearchSystemTemplatesResponse, Unit]): Request[SearchSystemTemplatesResponse, AWSError] = js.native
  /**
    * Searches for summary information about systems in the user's account. You can filter by the ID of a workflow to return only systems that use the specified workflow.
    */
  def searchSystemTemplates(params: SearchSystemTemplatesRequest): Request[SearchSystemTemplatesResponse, AWSError] = js.native
  def searchSystemTemplates(
    params: SearchSystemTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchSystemTemplatesResponse, Unit]
  ): Request[SearchSystemTemplatesResponse, AWSError] = js.native
  
  /**
    * Searches for things associated with the specified entity. You can search by both device and device model. For example, if two different devices, camera1 and camera2, implement the camera device model, the user can associate thing1 to camera1 and thing2 to camera2. SearchThings(camera2) will return only thing2, but SearchThings(camera) will return both thing1 and thing2. This action searches for exact matches and doesn't perform partial text matching.
    */
  def searchThings(): Request[SearchThingsResponse, AWSError] = js.native
  def searchThings(callback: js.Function2[/* err */ AWSError, /* data */ SearchThingsResponse, Unit]): Request[SearchThingsResponse, AWSError] = js.native
  /**
    * Searches for things associated with the specified entity. You can search by both device and device model. For example, if two different devices, camera1 and camera2, implement the camera device model, the user can associate thing1 to camera1 and thing2 to camera2. SearchThings(camera2) will return only thing2, but SearchThings(camera) will return both thing1 and thing2. This action searches for exact matches and doesn't perform partial text matching.
    */
  def searchThings(params: SearchThingsRequest): Request[SearchThingsResponse, AWSError] = js.native
  def searchThings(
    params: SearchThingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchThingsResponse, Unit]
  ): Request[SearchThingsResponse, AWSError] = js.native
  
  /**
    * Creates a tag for the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Creates a tag for the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a system instance from its target (Cloud or Greengrass).
    */
  def undeploySystemInstance(): Request[UndeploySystemInstanceResponse, AWSError] = js.native
  def undeploySystemInstance(callback: js.Function2[/* err */ AWSError, /* data */ UndeploySystemInstanceResponse, Unit]): Request[UndeploySystemInstanceResponse, AWSError] = js.native
  /**
    * Removes a system instance from its target (Cloud or Greengrass).
    */
  def undeploySystemInstance(params: UndeploySystemInstanceRequest): Request[UndeploySystemInstanceResponse, AWSError] = js.native
  def undeploySystemInstance(
    params: UndeploySystemInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UndeploySystemInstanceResponse, Unit]
  ): Request[UndeploySystemInstanceResponse, AWSError] = js.native
  
  /**
    * Removes a tag from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the specified workflow. All deployed systems and system instances that use the workflow will see the changes in the flow when it is redeployed. If you don't want this behavior, copy the workflow (creating a new workflow with a different ID), and update the copy. The workflow can contain only entities in the specified namespace. 
    */
  def updateFlowTemplate(): Request[UpdateFlowTemplateResponse, AWSError] = js.native
  def updateFlowTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowTemplateResponse, Unit]): Request[UpdateFlowTemplateResponse, AWSError] = js.native
  /**
    * Updates the specified workflow. All deployed systems and system instances that use the workflow will see the changes in the flow when it is redeployed. If you don't want this behavior, copy the workflow (creating a new workflow with a different ID), and update the copy. The workflow can contain only entities in the specified namespace. 
    */
  def updateFlowTemplate(params: UpdateFlowTemplateRequest): Request[UpdateFlowTemplateResponse, AWSError] = js.native
  def updateFlowTemplate(
    params: UpdateFlowTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowTemplateResponse, Unit]
  ): Request[UpdateFlowTemplateResponse, AWSError] = js.native
  
  /**
    * Updates the specified system. You don't need to run this action after updating a workflow. Any deployment that uses the system will see the changes in the system when it is redeployed.
    */
  def updateSystemTemplate(): Request[UpdateSystemTemplateResponse, AWSError] = js.native
  def updateSystemTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSystemTemplateResponse, Unit]): Request[UpdateSystemTemplateResponse, AWSError] = js.native
  /**
    * Updates the specified system. You don't need to run this action after updating a workflow. Any deployment that uses the system will see the changes in the system when it is redeployed.
    */
  def updateSystemTemplate(params: UpdateSystemTemplateRequest): Request[UpdateSystemTemplateResponse, AWSError] = js.native
  def updateSystemTemplate(
    params: UpdateSystemTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSystemTemplateResponse, Unit]
  ): Request[UpdateSystemTemplateResponse, AWSError] = js.native
  
  /**
    * Asynchronously uploads one or more entity definitions to the user's namespace. The document parameter is required if syncWithPublicNamespace and deleteExistingEntites are false. If the syncWithPublicNamespace parameter is set to true, the user's namespace will synchronize with the latest version of the public namespace. If deprecateExistingEntities is set to true, all entities in the latest version will be deleted before the new DefinitionDocument is uploaded. When a user uploads entity definitions for the first time, the service creates a new namespace for the user. The new namespace tracks the public namespace. Currently users can have only one namespace. The namespace version increments whenever a user uploads entity definitions that are backwards-incompatible and whenever a user sets the syncWithPublicNamespace parameter or the deprecateExistingEntities parameter to true. The IDs for all of the entities should be in URN format. Each entity must be in the user's namespace. Users can't create entities in the public namespace, but entity definitions can refer to entities in the public namespace. Valid entities are Device, DeviceModel, Service, Capability, State, Action, Event, Property, Mapping, Enum. 
    */
  def uploadEntityDefinitions(): Request[UploadEntityDefinitionsResponse, AWSError] = js.native
  def uploadEntityDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ UploadEntityDefinitionsResponse, Unit]): Request[UploadEntityDefinitionsResponse, AWSError] = js.native
  /**
    * Asynchronously uploads one or more entity definitions to the user's namespace. The document parameter is required if syncWithPublicNamespace and deleteExistingEntites are false. If the syncWithPublicNamespace parameter is set to true, the user's namespace will synchronize with the latest version of the public namespace. If deprecateExistingEntities is set to true, all entities in the latest version will be deleted before the new DefinitionDocument is uploaded. When a user uploads entity definitions for the first time, the service creates a new namespace for the user. The new namespace tracks the public namespace. Currently users can have only one namespace. The namespace version increments whenever a user uploads entity definitions that are backwards-incompatible and whenever a user sets the syncWithPublicNamespace parameter or the deprecateExistingEntities parameter to true. The IDs for all of the entities should be in URN format. Each entity must be in the user's namespace. Users can't create entities in the public namespace, but entity definitions can refer to entities in the public namespace. Valid entities are Device, DeviceModel, Service, Capability, State, Action, Event, Property, Mapping, Enum. 
    */
  def uploadEntityDefinitions(params: UploadEntityDefinitionsRequest): Request[UploadEntityDefinitionsResponse, AWSError] = js.native
  def uploadEntityDefinitions(
    params: UploadEntityDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UploadEntityDefinitionsResponse, Unit]
  ): Request[UploadEntityDefinitionsResponse, AWSError] = js.native
}
