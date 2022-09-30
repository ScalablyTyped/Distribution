package typings.awsSdk.migrationhuborchestratorMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationHubOrchestrator extends Service {
  
  @JSName("config")
  var config_MigrationHubOrchestrator: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Create a workflow to orchestrate your migrations.
    */
  def createWorkflow(): Request[CreateMigrationWorkflowResponse, AWSError] = js.native
  def createWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ CreateMigrationWorkflowResponse, Unit]): Request[CreateMigrationWorkflowResponse, AWSError] = js.native
  /**
    * Create a workflow to orchestrate your migrations.
    */
  def createWorkflow(params: CreateMigrationWorkflowRequest): Request[CreateMigrationWorkflowResponse, AWSError] = js.native
  def createWorkflow(
    params: CreateMigrationWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMigrationWorkflowResponse, Unit]
  ): Request[CreateMigrationWorkflowResponse, AWSError] = js.native
  
  /**
    * Create a step in the migration workflow.
    */
  def createWorkflowStep(): Request[CreateWorkflowStepResponse, AWSError] = js.native
  def createWorkflowStep(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkflowStepResponse, Unit]): Request[CreateWorkflowStepResponse, AWSError] = js.native
  /**
    * Create a step in the migration workflow.
    */
  def createWorkflowStep(params: CreateWorkflowStepRequest): Request[CreateWorkflowStepResponse, AWSError] = js.native
  def createWorkflowStep(
    params: CreateWorkflowStepRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkflowStepResponse, Unit]
  ): Request[CreateWorkflowStepResponse, AWSError] = js.native
  
  /**
    * Create a step group in a migration workflow.
    */
  def createWorkflowStepGroup(): Request[CreateWorkflowStepGroupResponse, AWSError] = js.native
  def createWorkflowStepGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkflowStepGroupResponse, Unit]): Request[CreateWorkflowStepGroupResponse, AWSError] = js.native
  /**
    * Create a step group in a migration workflow.
    */
  def createWorkflowStepGroup(params: CreateWorkflowStepGroupRequest): Request[CreateWorkflowStepGroupResponse, AWSError] = js.native
  def createWorkflowStepGroup(
    params: CreateWorkflowStepGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkflowStepGroupResponse, Unit]
  ): Request[CreateWorkflowStepGroupResponse, AWSError] = js.native
  
  /**
    * Delete a migration workflow. You must pause a running workflow in Migration Hub Orchestrator console to delete it.
    */
  def deleteWorkflow(): Request[DeleteMigrationWorkflowResponse, AWSError] = js.native
  def deleteWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMigrationWorkflowResponse, Unit]): Request[DeleteMigrationWorkflowResponse, AWSError] = js.native
  /**
    * Delete a migration workflow. You must pause a running workflow in Migration Hub Orchestrator console to delete it.
    */
  def deleteWorkflow(params: DeleteMigrationWorkflowRequest): Request[DeleteMigrationWorkflowResponse, AWSError] = js.native
  def deleteWorkflow(
    params: DeleteMigrationWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMigrationWorkflowResponse, Unit]
  ): Request[DeleteMigrationWorkflowResponse, AWSError] = js.native
  
  /**
    * Delete a step in a migration workflow. Pause the workflow to delete a running step.
    */
  def deleteWorkflowStep(): Request[DeleteWorkflowStepResponse, AWSError] = js.native
  def deleteWorkflowStep(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkflowStepResponse, Unit]): Request[DeleteWorkflowStepResponse, AWSError] = js.native
  /**
    * Delete a step in a migration workflow. Pause the workflow to delete a running step.
    */
  def deleteWorkflowStep(params: DeleteWorkflowStepRequest): Request[DeleteWorkflowStepResponse, AWSError] = js.native
  def deleteWorkflowStep(
    params: DeleteWorkflowStepRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkflowStepResponse, Unit]
  ): Request[DeleteWorkflowStepResponse, AWSError] = js.native
  
  /**
    * Delete a step group in a migration workflow.
    */
  def deleteWorkflowStepGroup(): Request[DeleteWorkflowStepGroupResponse, AWSError] = js.native
  def deleteWorkflowStepGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkflowStepGroupResponse, Unit]): Request[DeleteWorkflowStepGroupResponse, AWSError] = js.native
  /**
    * Delete a step group in a migration workflow.
    */
  def deleteWorkflowStepGroup(params: DeleteWorkflowStepGroupRequest): Request[DeleteWorkflowStepGroupResponse, AWSError] = js.native
  def deleteWorkflowStepGroup(
    params: DeleteWorkflowStepGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkflowStepGroupResponse, Unit]
  ): Request[DeleteWorkflowStepGroupResponse, AWSError] = js.native
  
  /**
    * Get the template you want to use for creating a migration workflow.
    */
  def getTemplate(): Request[GetMigrationWorkflowTemplateResponse, AWSError] = js.native
  def getTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetMigrationWorkflowTemplateResponse, Unit]): Request[GetMigrationWorkflowTemplateResponse, AWSError] = js.native
  /**
    * Get the template you want to use for creating a migration workflow.
    */
  def getTemplate(params: GetMigrationWorkflowTemplateRequest): Request[GetMigrationWorkflowTemplateResponse, AWSError] = js.native
  def getTemplate(
    params: GetMigrationWorkflowTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMigrationWorkflowTemplateResponse, Unit]
  ): Request[GetMigrationWorkflowTemplateResponse, AWSError] = js.native
  
  /**
    * Get a specific step in a template.
    */
  def getTemplateStep(): Request[GetTemplateStepResponse, AWSError] = js.native
  def getTemplateStep(callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateStepResponse, Unit]): Request[GetTemplateStepResponse, AWSError] = js.native
  /**
    * Get a specific step in a template.
    */
  def getTemplateStep(params: GetTemplateStepRequest): Request[GetTemplateStepResponse, AWSError] = js.native
  def getTemplateStep(
    params: GetTemplateStepRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateStepResponse, Unit]
  ): Request[GetTemplateStepResponse, AWSError] = js.native
  
  /**
    * Get a step group in a template.
    */
  def getTemplateStepGroup(): Request[GetTemplateStepGroupResponse, AWSError] = js.native
  def getTemplateStepGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateStepGroupResponse, Unit]): Request[GetTemplateStepGroupResponse, AWSError] = js.native
  /**
    * Get a step group in a template.
    */
  def getTemplateStepGroup(params: GetTemplateStepGroupRequest): Request[GetTemplateStepGroupResponse, AWSError] = js.native
  def getTemplateStepGroup(
    params: GetTemplateStepGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateStepGroupResponse, Unit]
  ): Request[GetTemplateStepGroupResponse, AWSError] = js.native
  
  /**
    * Get migration workflow.
    */
  def getWorkflow(): Request[GetMigrationWorkflowResponse, AWSError] = js.native
  def getWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ GetMigrationWorkflowResponse, Unit]): Request[GetMigrationWorkflowResponse, AWSError] = js.native
  /**
    * Get migration workflow.
    */
  def getWorkflow(params: GetMigrationWorkflowRequest): Request[GetMigrationWorkflowResponse, AWSError] = js.native
  def getWorkflow(
    params: GetMigrationWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMigrationWorkflowResponse, Unit]
  ): Request[GetMigrationWorkflowResponse, AWSError] = js.native
  
  /**
    * Get a step in the migration workflow.
    */
  def getWorkflowStep(): Request[GetWorkflowStepResponse, AWSError] = js.native
  def getWorkflowStep(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowStepResponse, Unit]): Request[GetWorkflowStepResponse, AWSError] = js.native
  /**
    * Get a step in the migration workflow.
    */
  def getWorkflowStep(params: GetWorkflowStepRequest): Request[GetWorkflowStepResponse, AWSError] = js.native
  def getWorkflowStep(
    params: GetWorkflowStepRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowStepResponse, Unit]
  ): Request[GetWorkflowStepResponse, AWSError] = js.native
  
  /**
    * Get the step group of a migration workflow.
    */
  def getWorkflowStepGroup(): Request[GetWorkflowStepGroupResponse, AWSError] = js.native
  def getWorkflowStepGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowStepGroupResponse, Unit]): Request[GetWorkflowStepGroupResponse, AWSError] = js.native
  /**
    * Get the step group of a migration workflow.
    */
  def getWorkflowStepGroup(params: GetWorkflowStepGroupRequest): Request[GetWorkflowStepGroupResponse, AWSError] = js.native
  def getWorkflowStepGroup(
    params: GetWorkflowStepGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowStepGroupResponse, Unit]
  ): Request[GetWorkflowStepGroupResponse, AWSError] = js.native
  
  /**
    * List AWS Migration Hub Orchestrator plugins.
    */
  def listPlugins(): Request[ListPluginsResponse, AWSError] = js.native
  def listPlugins(callback: js.Function2[/* err */ AWSError, /* data */ ListPluginsResponse, Unit]): Request[ListPluginsResponse, AWSError] = js.native
  /**
    * List AWS Migration Hub Orchestrator plugins.
    */
  def listPlugins(params: ListPluginsRequest): Request[ListPluginsResponse, AWSError] = js.native
  def listPlugins(
    params: ListPluginsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPluginsResponse, Unit]
  ): Request[ListPluginsResponse, AWSError] = js.native
  
  /**
    * List the tags added to a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List the tags added to a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * List the step groups in a template.
    */
  def listTemplateStepGroups(): Request[ListTemplateStepGroupsResponse, AWSError] = js.native
  def listTemplateStepGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateStepGroupsResponse, Unit]): Request[ListTemplateStepGroupsResponse, AWSError] = js.native
  /**
    * List the step groups in a template.
    */
  def listTemplateStepGroups(params: ListTemplateStepGroupsRequest): Request[ListTemplateStepGroupsResponse, AWSError] = js.native
  def listTemplateStepGroups(
    params: ListTemplateStepGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateStepGroupsResponse, Unit]
  ): Request[ListTemplateStepGroupsResponse, AWSError] = js.native
  
  /**
    * List the steps in a template.
    */
  def listTemplateSteps(): Request[ListTemplateStepsResponse, AWSError] = js.native
  def listTemplateSteps(callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateStepsResponse, Unit]): Request[ListTemplateStepsResponse, AWSError] = js.native
  /**
    * List the steps in a template.
    */
  def listTemplateSteps(params: ListTemplateStepsRequest): Request[ListTemplateStepsResponse, AWSError] = js.native
  def listTemplateSteps(
    params: ListTemplateStepsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateStepsResponse, Unit]
  ): Request[ListTemplateStepsResponse, AWSError] = js.native
  
  /**
    * List the templates available in Migration Hub Orchestrator to create a migration workflow.
    */
  def listTemplates(): Request[ListMigrationWorkflowTemplatesResponse, AWSError] = js.native
  def listTemplates(
    callback: js.Function2[/* err */ AWSError, /* data */ ListMigrationWorkflowTemplatesResponse, Unit]
  ): Request[ListMigrationWorkflowTemplatesResponse, AWSError] = js.native
  /**
    * List the templates available in Migration Hub Orchestrator to create a migration workflow.
    */
  def listTemplates(params: ListMigrationWorkflowTemplatesRequest): Request[ListMigrationWorkflowTemplatesResponse, AWSError] = js.native
  def listTemplates(
    params: ListMigrationWorkflowTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMigrationWorkflowTemplatesResponse, Unit]
  ): Request[ListMigrationWorkflowTemplatesResponse, AWSError] = js.native
  
  /**
    * List the step groups in a migration workflow.
    */
  def listWorkflowStepGroups(): Request[ListWorkflowStepGroupsResponse, AWSError] = js.native
  def listWorkflowStepGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkflowStepGroupsResponse, Unit]): Request[ListWorkflowStepGroupsResponse, AWSError] = js.native
  /**
    * List the step groups in a migration workflow.
    */
  def listWorkflowStepGroups(params: ListWorkflowStepGroupsRequest): Request[ListWorkflowStepGroupsResponse, AWSError] = js.native
  def listWorkflowStepGroups(
    params: ListWorkflowStepGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkflowStepGroupsResponse, Unit]
  ): Request[ListWorkflowStepGroupsResponse, AWSError] = js.native
  
  /**
    * List the steps in a workflow.
    */
  def listWorkflowSteps(): Request[ListWorkflowStepsResponse, AWSError] = js.native
  def listWorkflowSteps(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkflowStepsResponse, Unit]): Request[ListWorkflowStepsResponse, AWSError] = js.native
  /**
    * List the steps in a workflow.
    */
  def listWorkflowSteps(params: ListWorkflowStepsRequest): Request[ListWorkflowStepsResponse, AWSError] = js.native
  def listWorkflowSteps(
    params: ListWorkflowStepsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkflowStepsResponse, Unit]
  ): Request[ListWorkflowStepsResponse, AWSError] = js.native
  
  /**
    * List the migration workflows.
    */
  def listWorkflows(): Request[ListMigrationWorkflowsResponse, AWSError] = js.native
  def listWorkflows(callback: js.Function2[/* err */ AWSError, /* data */ ListMigrationWorkflowsResponse, Unit]): Request[ListMigrationWorkflowsResponse, AWSError] = js.native
  /**
    * List the migration workflows.
    */
  def listWorkflows(params: ListMigrationWorkflowsRequest): Request[ListMigrationWorkflowsResponse, AWSError] = js.native
  def listWorkflows(
    params: ListMigrationWorkflowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMigrationWorkflowsResponse, Unit]
  ): Request[ListMigrationWorkflowsResponse, AWSError] = js.native
  
  /**
    * Retry a failed step in a migration workflow.
    */
  def retryWorkflowStep(): Request[RetryWorkflowStepResponse, AWSError] = js.native
  def retryWorkflowStep(callback: js.Function2[/* err */ AWSError, /* data */ RetryWorkflowStepResponse, Unit]): Request[RetryWorkflowStepResponse, AWSError] = js.native
  /**
    * Retry a failed step in a migration workflow.
    */
  def retryWorkflowStep(params: RetryWorkflowStepRequest): Request[RetryWorkflowStepResponse, AWSError] = js.native
  def retryWorkflowStep(
    params: RetryWorkflowStepRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RetryWorkflowStepResponse, Unit]
  ): Request[RetryWorkflowStepResponse, AWSError] = js.native
  
  /**
    * Start a migration workflow.
    */
  def startWorkflow(): Request[StartMigrationWorkflowResponse, AWSError] = js.native
  def startWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ StartMigrationWorkflowResponse, Unit]): Request[StartMigrationWorkflowResponse, AWSError] = js.native
  /**
    * Start a migration workflow.
    */
  def startWorkflow(params: StartMigrationWorkflowRequest): Request[StartMigrationWorkflowResponse, AWSError] = js.native
  def startWorkflow(
    params: StartMigrationWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartMigrationWorkflowResponse, Unit]
  ): Request[StartMigrationWorkflowResponse, AWSError] = js.native
  
  /**
    * Stop an ongoing migration workflow.
    */
  def stopWorkflow(): Request[StopMigrationWorkflowResponse, AWSError] = js.native
  def stopWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ StopMigrationWorkflowResponse, Unit]): Request[StopMigrationWorkflowResponse, AWSError] = js.native
  /**
    * Stop an ongoing migration workflow.
    */
  def stopWorkflow(params: StopMigrationWorkflowRequest): Request[StopMigrationWorkflowResponse, AWSError] = js.native
  def stopWorkflow(
    params: StopMigrationWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopMigrationWorkflowResponse, Unit]
  ): Request[StopMigrationWorkflowResponse, AWSError] = js.native
  
  /**
    * Tag a resource by specifying its Amazon Resource Name (ARN).
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Tag a resource by specifying its Amazon Resource Name (ARN).
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Deletes the tags for a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Deletes the tags for a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Update a migration workflow.
    */
  def updateWorkflow(): Request[UpdateMigrationWorkflowResponse, AWSError] = js.native
  def updateWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMigrationWorkflowResponse, Unit]): Request[UpdateMigrationWorkflowResponse, AWSError] = js.native
  /**
    * Update a migration workflow.
    */
  def updateWorkflow(params: UpdateMigrationWorkflowRequest): Request[UpdateMigrationWorkflowResponse, AWSError] = js.native
  def updateWorkflow(
    params: UpdateMigrationWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMigrationWorkflowResponse, Unit]
  ): Request[UpdateMigrationWorkflowResponse, AWSError] = js.native
  
  /**
    * Update a step in a migration workflow.
    */
  def updateWorkflowStep(): Request[UpdateWorkflowStepResponse, AWSError] = js.native
  def updateWorkflowStep(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkflowStepResponse, Unit]): Request[UpdateWorkflowStepResponse, AWSError] = js.native
  /**
    * Update a step in a migration workflow.
    */
  def updateWorkflowStep(params: UpdateWorkflowStepRequest): Request[UpdateWorkflowStepResponse, AWSError] = js.native
  def updateWorkflowStep(
    params: UpdateWorkflowStepRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkflowStepResponse, Unit]
  ): Request[UpdateWorkflowStepResponse, AWSError] = js.native
  
  /**
    * Update the step group in a migration workflow.
    */
  def updateWorkflowStepGroup(): Request[UpdateWorkflowStepGroupResponse, AWSError] = js.native
  def updateWorkflowStepGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkflowStepGroupResponse, Unit]): Request[UpdateWorkflowStepGroupResponse, AWSError] = js.native
  /**
    * Update the step group in a migration workflow.
    */
  def updateWorkflowStepGroup(params: UpdateWorkflowStepGroupRequest): Request[UpdateWorkflowStepGroupResponse, AWSError] = js.native
  def updateWorkflowStepGroup(
    params: UpdateWorkflowStepGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkflowStepGroupResponse, Unit]
  ): Request[UpdateWorkflowStepGroupResponse, AWSError] = js.native
}
