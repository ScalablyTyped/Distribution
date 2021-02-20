package typings.awsSdk.codepipelineMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodePipeline extends Service {
  
  /**
    * Returns information about a specified job and whether that job has been received by the job worker. Used for custom actions only.
    */
  def acknowledgeJob(): Request[AcknowledgeJobOutput, AWSError] = js.native
  def acknowledgeJob(callback: js.Function2[/* err */ AWSError, /* data */ AcknowledgeJobOutput, Unit]): Request[AcknowledgeJobOutput, AWSError] = js.native
  /**
    * Returns information about a specified job and whether that job has been received by the job worker. Used for custom actions only.
    */
  def acknowledgeJob(params: AcknowledgeJobInput): Request[AcknowledgeJobOutput, AWSError] = js.native
  def acknowledgeJob(
    params: AcknowledgeJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AcknowledgeJobOutput, Unit]
  ): Request[AcknowledgeJobOutput, AWSError] = js.native
  
  /**
    * Confirms a job worker has received the specified job. Used for partner actions only.
    */
  def acknowledgeThirdPartyJob(): Request[AcknowledgeThirdPartyJobOutput, AWSError] = js.native
  def acknowledgeThirdPartyJob(callback: js.Function2[/* err */ AWSError, /* data */ AcknowledgeThirdPartyJobOutput, Unit]): Request[AcknowledgeThirdPartyJobOutput, AWSError] = js.native
  /**
    * Confirms a job worker has received the specified job. Used for partner actions only.
    */
  def acknowledgeThirdPartyJob(params: AcknowledgeThirdPartyJobInput): Request[AcknowledgeThirdPartyJobOutput, AWSError] = js.native
  def acknowledgeThirdPartyJob(
    params: AcknowledgeThirdPartyJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AcknowledgeThirdPartyJobOutput, Unit]
  ): Request[AcknowledgeThirdPartyJobOutput, AWSError] = js.native
  
  @JSName("config")
  var config_CodePipeline: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for custom actions.
    */
  def createCustomActionType(): Request[CreateCustomActionTypeOutput, AWSError] = js.native
  def createCustomActionType(callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomActionTypeOutput, Unit]): Request[CreateCustomActionTypeOutput, AWSError] = js.native
  /**
    * Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for custom actions.
    */
  def createCustomActionType(params: CreateCustomActionTypeInput): Request[CreateCustomActionTypeOutput, AWSError] = js.native
  def createCustomActionType(
    params: CreateCustomActionTypeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomActionTypeOutput, Unit]
  ): Request[CreateCustomActionTypeOutput, AWSError] = js.native
  
  /**
    * Creates a pipeline.  In the pipeline structure, you must include either artifactStore or artifactStores in your pipeline, but you cannot use both. If you create a cross-region action in your pipeline, you must use artifactStores. 
    */
  def createPipeline(): Request[CreatePipelineOutput, AWSError] = js.native
  def createPipeline(callback: js.Function2[/* err */ AWSError, /* data */ CreatePipelineOutput, Unit]): Request[CreatePipelineOutput, AWSError] = js.native
  /**
    * Creates a pipeline.  In the pipeline structure, you must include either artifactStore or artifactStores in your pipeline, but you cannot use both. If you create a cross-region action in your pipeline, you must use artifactStores. 
    */
  def createPipeline(params: CreatePipelineInput): Request[CreatePipelineOutput, AWSError] = js.native
  def createPipeline(
    params: CreatePipelineInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePipelineOutput, Unit]
  ): Request[CreatePipelineOutput, AWSError] = js.native
  
  /**
    * Marks a custom action as deleted. PollForJobs for the custom action fails after the action is marked for deletion. Used for custom actions only.  To re-create a custom action after it has been deleted you must use a string in the version field that has never been used before. This string can be an incremented version number, for example. To restore a deleted custom action, use a JSON file that is identical to the deleted action, including the original string in the version field. 
    */
  def deleteCustomActionType(): Request[js.Object, AWSError] = js.native
  def deleteCustomActionType(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Marks a custom action as deleted. PollForJobs for the custom action fails after the action is marked for deletion. Used for custom actions only.  To re-create a custom action after it has been deleted you must use a string in the version field that has never been used before. This string can be an incremented version number, for example. To restore a deleted custom action, use a JSON file that is identical to the deleted action, including the original string in the version field. 
    */
  def deleteCustomActionType(params: DeleteCustomActionTypeInput): Request[js.Object, AWSError] = js.native
  def deleteCustomActionType(
    params: DeleteCustomActionTypeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified pipeline.
    */
  def deletePipeline(): Request[js.Object, AWSError] = js.native
  def deletePipeline(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified pipeline.
    */
  def deletePipeline(params: DeletePipelineInput): Request[js.Object, AWSError] = js.native
  def deletePipeline(
    params: DeletePipelineInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a previously created webhook by name. Deleting the webhook stops AWS CodePipeline from starting a pipeline every time an external event occurs. The API returns successfully when trying to delete a webhook that is already deleted. If a deleted webhook is re-created by calling PutWebhook with the same name, it will have a different URL.
    */
  def deleteWebhook(): Request[DeleteWebhookOutput, AWSError] = js.native
  def deleteWebhook(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebhookOutput, Unit]): Request[DeleteWebhookOutput, AWSError] = js.native
  /**
    * Deletes a previously created webhook by name. Deleting the webhook stops AWS CodePipeline from starting a pipeline every time an external event occurs. The API returns successfully when trying to delete a webhook that is already deleted. If a deleted webhook is re-created by calling PutWebhook with the same name, it will have a different URL.
    */
  def deleteWebhook(params: DeleteWebhookInput): Request[DeleteWebhookOutput, AWSError] = js.native
  def deleteWebhook(
    params: DeleteWebhookInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebhookOutput, Unit]
  ): Request[DeleteWebhookOutput, AWSError] = js.native
  
  /**
    * Removes the connection between the webhook that was created by CodePipeline and the external tool with events to be detected. Currently supported only for webhooks that target an action type of GitHub.
    */
  def deregisterWebhookWithThirdParty(): Request[DeregisterWebhookWithThirdPartyOutput, AWSError] = js.native
  def deregisterWebhookWithThirdParty(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterWebhookWithThirdPartyOutput, Unit]): Request[DeregisterWebhookWithThirdPartyOutput, AWSError] = js.native
  /**
    * Removes the connection between the webhook that was created by CodePipeline and the external tool with events to be detected. Currently supported only for webhooks that target an action type of GitHub.
    */
  def deregisterWebhookWithThirdParty(params: DeregisterWebhookWithThirdPartyInput): Request[DeregisterWebhookWithThirdPartyOutput, AWSError] = js.native
  def deregisterWebhookWithThirdParty(
    params: DeregisterWebhookWithThirdPartyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterWebhookWithThirdPartyOutput, Unit]
  ): Request[DeregisterWebhookWithThirdPartyOutput, AWSError] = js.native
  
  /**
    * Prevents artifacts in a pipeline from transitioning to the next stage in the pipeline.
    */
  def disableStageTransition(): Request[js.Object, AWSError] = js.native
  def disableStageTransition(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Prevents artifacts in a pipeline from transitioning to the next stage in the pipeline.
    */
  def disableStageTransition(params: DisableStageTransitionInput): Request[js.Object, AWSError] = js.native
  def disableStageTransition(
    params: DisableStageTransitionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Enables artifacts in a pipeline to transition to a stage in a pipeline.
    */
  def enableStageTransition(): Request[js.Object, AWSError] = js.native
  def enableStageTransition(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables artifacts in a pipeline to transition to a stage in a pipeline.
    */
  def enableStageTransition(params: EnableStageTransitionInput): Request[js.Object, AWSError] = js.native
  def enableStageTransition(
    params: EnableStageTransitionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Returns information about a job. Used for custom actions only.  When this API is called, AWS CodePipeline returns temporary credentials for the S3 bucket used to store artifacts for the pipeline, if the action requires access to that S3 bucket for input or output artifacts. This API also returns any secret values defined for the action. 
    */
  def getJobDetails(): Request[GetJobDetailsOutput, AWSError] = js.native
  def getJobDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetJobDetailsOutput, Unit]): Request[GetJobDetailsOutput, AWSError] = js.native
  /**
    * Returns information about a job. Used for custom actions only.  When this API is called, AWS CodePipeline returns temporary credentials for the S3 bucket used to store artifacts for the pipeline, if the action requires access to that S3 bucket for input or output artifacts. This API also returns any secret values defined for the action. 
    */
  def getJobDetails(params: GetJobDetailsInput): Request[GetJobDetailsOutput, AWSError] = js.native
  def getJobDetails(
    params: GetJobDetailsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetJobDetailsOutput, Unit]
  ): Request[GetJobDetailsOutput, AWSError] = js.native
  
  /**
    * Returns the metadata, structure, stages, and actions of a pipeline. Can be used to return the entire structure of a pipeline in JSON format, which can then be modified and used to update the pipeline structure with UpdatePipeline.
    */
  def getPipeline(): Request[GetPipelineOutput, AWSError] = js.native
  def getPipeline(callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineOutput, Unit]): Request[GetPipelineOutput, AWSError] = js.native
  /**
    * Returns the metadata, structure, stages, and actions of a pipeline. Can be used to return the entire structure of a pipeline in JSON format, which can then be modified and used to update the pipeline structure with UpdatePipeline.
    */
  def getPipeline(params: GetPipelineInput): Request[GetPipelineOutput, AWSError] = js.native
  def getPipeline(
    params: GetPipelineInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineOutput, Unit]
  ): Request[GetPipelineOutput, AWSError] = js.native
  
  /**
    * Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution ID, and the name, version, and status of the pipeline.
    */
  def getPipelineExecution(): Request[GetPipelineExecutionOutput, AWSError] = js.native
  def getPipelineExecution(callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineExecutionOutput, Unit]): Request[GetPipelineExecutionOutput, AWSError] = js.native
  /**
    * Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution ID, and the name, version, and status of the pipeline.
    */
  def getPipelineExecution(params: GetPipelineExecutionInput): Request[GetPipelineExecutionOutput, AWSError] = js.native
  def getPipelineExecution(
    params: GetPipelineExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineExecutionOutput, Unit]
  ): Request[GetPipelineExecutionOutput, AWSError] = js.native
  
  /**
    * Returns information about the state of a pipeline, including the stages and actions.  Values returned in the revisionId and revisionUrl fields indicate the source revision information, such as the commit ID, for the current state. 
    */
  def getPipelineState(): Request[GetPipelineStateOutput, AWSError] = js.native
  def getPipelineState(callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineStateOutput, Unit]): Request[GetPipelineStateOutput, AWSError] = js.native
  /**
    * Returns information about the state of a pipeline, including the stages and actions.  Values returned in the revisionId and revisionUrl fields indicate the source revision information, such as the commit ID, for the current state. 
    */
  def getPipelineState(params: GetPipelineStateInput): Request[GetPipelineStateOutput, AWSError] = js.native
  def getPipelineState(
    params: GetPipelineStateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineStateOutput, Unit]
  ): Request[GetPipelineStateOutput, AWSError] = js.native
  
  /**
    * Requests the details of a job for a third party action. Used for partner actions only.  When this API is called, AWS CodePipeline returns temporary credentials for the S3 bucket used to store artifacts for the pipeline, if the action requires access to that S3 bucket for input or output artifacts. This API also returns any secret values defined for the action. 
    */
  def getThirdPartyJobDetails(): Request[GetThirdPartyJobDetailsOutput, AWSError] = js.native
  def getThirdPartyJobDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetThirdPartyJobDetailsOutput, Unit]): Request[GetThirdPartyJobDetailsOutput, AWSError] = js.native
  /**
    * Requests the details of a job for a third party action. Used for partner actions only.  When this API is called, AWS CodePipeline returns temporary credentials for the S3 bucket used to store artifacts for the pipeline, if the action requires access to that S3 bucket for input or output artifacts. This API also returns any secret values defined for the action. 
    */
  def getThirdPartyJobDetails(params: GetThirdPartyJobDetailsInput): Request[GetThirdPartyJobDetailsOutput, AWSError] = js.native
  def getThirdPartyJobDetails(
    params: GetThirdPartyJobDetailsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetThirdPartyJobDetailsOutput, Unit]
  ): Request[GetThirdPartyJobDetailsOutput, AWSError] = js.native
  
  /**
    * Lists the action executions that have occurred in a pipeline.
    */
  def listActionExecutions(): Request[ListActionExecutionsOutput, AWSError] = js.native
  def listActionExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListActionExecutionsOutput, Unit]): Request[ListActionExecutionsOutput, AWSError] = js.native
  /**
    * Lists the action executions that have occurred in a pipeline.
    */
  def listActionExecutions(params: ListActionExecutionsInput): Request[ListActionExecutionsOutput, AWSError] = js.native
  def listActionExecutions(
    params: ListActionExecutionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListActionExecutionsOutput, Unit]
  ): Request[ListActionExecutionsOutput, AWSError] = js.native
  
  /**
    * Gets a summary of all AWS CodePipeline action types associated with your account.
    */
  def listActionTypes(): Request[ListActionTypesOutput, AWSError] = js.native
  def listActionTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListActionTypesOutput, Unit]): Request[ListActionTypesOutput, AWSError] = js.native
  /**
    * Gets a summary of all AWS CodePipeline action types associated with your account.
    */
  def listActionTypes(params: ListActionTypesInput): Request[ListActionTypesOutput, AWSError] = js.native
  def listActionTypes(
    params: ListActionTypesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListActionTypesOutput, Unit]
  ): Request[ListActionTypesOutput, AWSError] = js.native
  
  /**
    * Gets a summary of the most recent executions for a pipeline.
    */
  def listPipelineExecutions(): Request[ListPipelineExecutionsOutput, AWSError] = js.native
  def listPipelineExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListPipelineExecutionsOutput, Unit]): Request[ListPipelineExecutionsOutput, AWSError] = js.native
  /**
    * Gets a summary of the most recent executions for a pipeline.
    */
  def listPipelineExecutions(params: ListPipelineExecutionsInput): Request[ListPipelineExecutionsOutput, AWSError] = js.native
  def listPipelineExecutions(
    params: ListPipelineExecutionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPipelineExecutionsOutput, Unit]
  ): Request[ListPipelineExecutionsOutput, AWSError] = js.native
  
  /**
    * Gets a summary of all of the pipelines associated with your account.
    */
  def listPipelines(): Request[ListPipelinesOutput, AWSError] = js.native
  def listPipelines(callback: js.Function2[/* err */ AWSError, /* data */ ListPipelinesOutput, Unit]): Request[ListPipelinesOutput, AWSError] = js.native
  /**
    * Gets a summary of all of the pipelines associated with your account.
    */
  def listPipelines(params: ListPipelinesInput): Request[ListPipelinesOutput, AWSError] = js.native
  def listPipelines(
    params: ListPipelinesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPipelinesOutput, Unit]
  ): Request[ListPipelinesOutput, AWSError] = js.native
  
  /**
    * Gets the set of key-value pairs (metadata) that are used to manage the resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Gets the set of key-value pairs (metadata) that are used to manage the resource.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Gets a listing of all the webhooks in this AWS Region for this account. The output lists all webhooks and includes the webhook URL and ARN and the configuration for each webhook.
    */
  def listWebhooks(): Request[ListWebhooksOutput, AWSError] = js.native
  def listWebhooks(callback: js.Function2[/* err */ AWSError, /* data */ ListWebhooksOutput, Unit]): Request[ListWebhooksOutput, AWSError] = js.native
  /**
    * Gets a listing of all the webhooks in this AWS Region for this account. The output lists all webhooks and includes the webhook URL and ARN and the configuration for each webhook.
    */
  def listWebhooks(params: ListWebhooksInput): Request[ListWebhooksOutput, AWSError] = js.native
  def listWebhooks(
    params: ListWebhooksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWebhooksOutput, Unit]
  ): Request[ListWebhooksOutput, AWSError] = js.native
  
  /**
    * Returns information about any jobs for AWS CodePipeline to act on. PollForJobs is valid only for action types with "Custom" in the owner field. If the action type contains "AWS" or "ThirdParty" in the owner field, the PollForJobs action returns an error.  When this API is called, AWS CodePipeline returns temporary credentials for the S3 bucket used to store artifacts for the pipeline, if the action requires access to that S3 bucket for input or output artifacts. This API also returns any secret values defined for the action. 
    */
  def pollForJobs(): Request[PollForJobsOutput, AWSError] = js.native
  def pollForJobs(callback: js.Function2[/* err */ AWSError, /* data */ PollForJobsOutput, Unit]): Request[PollForJobsOutput, AWSError] = js.native
  /**
    * Returns information about any jobs for AWS CodePipeline to act on. PollForJobs is valid only for action types with "Custom" in the owner field. If the action type contains "AWS" or "ThirdParty" in the owner field, the PollForJobs action returns an error.  When this API is called, AWS CodePipeline returns temporary credentials for the S3 bucket used to store artifacts for the pipeline, if the action requires access to that S3 bucket for input or output artifacts. This API also returns any secret values defined for the action. 
    */
  def pollForJobs(params: PollForJobsInput): Request[PollForJobsOutput, AWSError] = js.native
  def pollForJobs(
    params: PollForJobsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PollForJobsOutput, Unit]
  ): Request[PollForJobsOutput, AWSError] = js.native
  
  /**
    * Determines whether there are any third party jobs for a job worker to act on. Used for partner actions only.  When this API is called, AWS CodePipeline returns temporary credentials for the S3 bucket used to store artifacts for the pipeline, if the action requires access to that S3 bucket for input or output artifacts. 
    */
  def pollForThirdPartyJobs(): Request[PollForThirdPartyJobsOutput, AWSError] = js.native
  def pollForThirdPartyJobs(callback: js.Function2[/* err */ AWSError, /* data */ PollForThirdPartyJobsOutput, Unit]): Request[PollForThirdPartyJobsOutput, AWSError] = js.native
  /**
    * Determines whether there are any third party jobs for a job worker to act on. Used for partner actions only.  When this API is called, AWS CodePipeline returns temporary credentials for the S3 bucket used to store artifacts for the pipeline, if the action requires access to that S3 bucket for input or output artifacts. 
    */
  def pollForThirdPartyJobs(params: PollForThirdPartyJobsInput): Request[PollForThirdPartyJobsOutput, AWSError] = js.native
  def pollForThirdPartyJobs(
    params: PollForThirdPartyJobsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PollForThirdPartyJobsOutput, Unit]
  ): Request[PollForThirdPartyJobsOutput, AWSError] = js.native
  
  /**
    * Provides information to AWS CodePipeline about new revisions to a source.
    */
  def putActionRevision(): Request[PutActionRevisionOutput, AWSError] = js.native
  def putActionRevision(callback: js.Function2[/* err */ AWSError, /* data */ PutActionRevisionOutput, Unit]): Request[PutActionRevisionOutput, AWSError] = js.native
  /**
    * Provides information to AWS CodePipeline about new revisions to a source.
    */
  def putActionRevision(params: PutActionRevisionInput): Request[PutActionRevisionOutput, AWSError] = js.native
  def putActionRevision(
    params: PutActionRevisionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutActionRevisionOutput, Unit]
  ): Request[PutActionRevisionOutput, AWSError] = js.native
  
  /**
    * Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and Rejected.
    */
  def putApprovalResult(): Request[PutApprovalResultOutput, AWSError] = js.native
  def putApprovalResult(callback: js.Function2[/* err */ AWSError, /* data */ PutApprovalResultOutput, Unit]): Request[PutApprovalResultOutput, AWSError] = js.native
  /**
    * Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and Rejected.
    */
  def putApprovalResult(params: PutApprovalResultInput): Request[PutApprovalResultOutput, AWSError] = js.native
  def putApprovalResult(
    params: PutApprovalResultInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutApprovalResultOutput, Unit]
  ): Request[PutApprovalResultOutput, AWSError] = js.native
  
  /**
    * Represents the failure of a job as returned to the pipeline by a job worker. Used for custom actions only.
    */
  def putJobFailureResult(): Request[js.Object, AWSError] = js.native
  def putJobFailureResult(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Represents the failure of a job as returned to the pipeline by a job worker. Used for custom actions only.
    */
  def putJobFailureResult(params: PutJobFailureResultInput): Request[js.Object, AWSError] = js.native
  def putJobFailureResult(
    params: PutJobFailureResultInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Represents the success of a job as returned to the pipeline by a job worker. Used for custom actions only.
    */
  def putJobSuccessResult(): Request[js.Object, AWSError] = js.native
  def putJobSuccessResult(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Represents the success of a job as returned to the pipeline by a job worker. Used for custom actions only.
    */
  def putJobSuccessResult(params: PutJobSuccessResultInput): Request[js.Object, AWSError] = js.native
  def putJobSuccessResult(
    params: PutJobSuccessResultInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Represents the failure of a third party job as returned to the pipeline by a job worker. Used for partner actions only.
    */
  def putThirdPartyJobFailureResult(): Request[js.Object, AWSError] = js.native
  def putThirdPartyJobFailureResult(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Represents the failure of a third party job as returned to the pipeline by a job worker. Used for partner actions only.
    */
  def putThirdPartyJobFailureResult(params: PutThirdPartyJobFailureResultInput): Request[js.Object, AWSError] = js.native
  def putThirdPartyJobFailureResult(
    params: PutThirdPartyJobFailureResultInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Represents the success of a third party job as returned to the pipeline by a job worker. Used for partner actions only.
    */
  def putThirdPartyJobSuccessResult(): Request[js.Object, AWSError] = js.native
  def putThirdPartyJobSuccessResult(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Represents the success of a third party job as returned to the pipeline by a job worker. Used for partner actions only.
    */
  def putThirdPartyJobSuccessResult(params: PutThirdPartyJobSuccessResultInput): Request[js.Object, AWSError] = js.native
  def putThirdPartyJobSuccessResult(
    params: PutThirdPartyJobSuccessResultInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Defines a webhook and returns a unique webhook URL generated by CodePipeline. This URL can be supplied to third party source hosting providers to call every time there's a code change. When CodePipeline receives a POST request on this URL, the pipeline defined in the webhook is started as long as the POST request satisfied the authentication and filtering requirements supplied when defining the webhook. RegisterWebhookWithThirdParty and DeregisterWebhookWithThirdParty APIs can be used to automatically configure supported third parties to call the generated webhook URL.
    */
  def putWebhook(): Request[PutWebhookOutput, AWSError] = js.native
  def putWebhook(callback: js.Function2[/* err */ AWSError, /* data */ PutWebhookOutput, Unit]): Request[PutWebhookOutput, AWSError] = js.native
  /**
    * Defines a webhook and returns a unique webhook URL generated by CodePipeline. This URL can be supplied to third party source hosting providers to call every time there's a code change. When CodePipeline receives a POST request on this URL, the pipeline defined in the webhook is started as long as the POST request satisfied the authentication and filtering requirements supplied when defining the webhook. RegisterWebhookWithThirdParty and DeregisterWebhookWithThirdParty APIs can be used to automatically configure supported third parties to call the generated webhook URL.
    */
  def putWebhook(params: PutWebhookInput): Request[PutWebhookOutput, AWSError] = js.native
  def putWebhook(
    params: PutWebhookInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutWebhookOutput, Unit]
  ): Request[PutWebhookOutput, AWSError] = js.native
  
  /**
    * Configures a connection between the webhook that was created and the external tool with events to be detected.
    */
  def registerWebhookWithThirdParty(): Request[RegisterWebhookWithThirdPartyOutput, AWSError] = js.native
  def registerWebhookWithThirdParty(callback: js.Function2[/* err */ AWSError, /* data */ RegisterWebhookWithThirdPartyOutput, Unit]): Request[RegisterWebhookWithThirdPartyOutput, AWSError] = js.native
  /**
    * Configures a connection between the webhook that was created and the external tool with events to be detected.
    */
  def registerWebhookWithThirdParty(params: RegisterWebhookWithThirdPartyInput): Request[RegisterWebhookWithThirdPartyOutput, AWSError] = js.native
  def registerWebhookWithThirdParty(
    params: RegisterWebhookWithThirdPartyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterWebhookWithThirdPartyOutput, Unit]
  ): Request[RegisterWebhookWithThirdPartyOutput, AWSError] = js.native
  
  /**
    * Resumes the pipeline execution by retrying the last failed actions in a stage. You can retry a stage immediately if any of the actions in the stage fail. When you retry, all actions that are still in progress continue working, and failed actions are triggered again.
    */
  def retryStageExecution(): Request[RetryStageExecutionOutput, AWSError] = js.native
  def retryStageExecution(callback: js.Function2[/* err */ AWSError, /* data */ RetryStageExecutionOutput, Unit]): Request[RetryStageExecutionOutput, AWSError] = js.native
  /**
    * Resumes the pipeline execution by retrying the last failed actions in a stage. You can retry a stage immediately if any of the actions in the stage fail. When you retry, all actions that are still in progress continue working, and failed actions are triggered again.
    */
  def retryStageExecution(params: RetryStageExecutionInput): Request[RetryStageExecutionOutput, AWSError] = js.native
  def retryStageExecution(
    params: RetryStageExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RetryStageExecutionOutput, Unit]
  ): Request[RetryStageExecutionOutput, AWSError] = js.native
  
  /**
    * Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location specified as part of the pipeline.
    */
  def startPipelineExecution(): Request[StartPipelineExecutionOutput, AWSError] = js.native
  def startPipelineExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartPipelineExecutionOutput, Unit]): Request[StartPipelineExecutionOutput, AWSError] = js.native
  /**
    * Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location specified as part of the pipeline.
    */
  def startPipelineExecution(params: StartPipelineExecutionInput): Request[StartPipelineExecutionOutput, AWSError] = js.native
  def startPipelineExecution(
    params: StartPipelineExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartPipelineExecutionOutput, Unit]
  ): Request[StartPipelineExecutionOutput, AWSError] = js.native
  
  /**
    * Stops the specified pipeline execution. You choose to either stop the pipeline execution by completing in-progress actions without starting subsequent actions, or by abandoning in-progress actions. While completing or abandoning in-progress actions, the pipeline execution is in a Stopping state. After all in-progress actions are completed or abandoned, the pipeline execution is in a Stopped state.
    */
  def stopPipelineExecution(): Request[StopPipelineExecutionOutput, AWSError] = js.native
  def stopPipelineExecution(callback: js.Function2[/* err */ AWSError, /* data */ StopPipelineExecutionOutput, Unit]): Request[StopPipelineExecutionOutput, AWSError] = js.native
  /**
    * Stops the specified pipeline execution. You choose to either stop the pipeline execution by completing in-progress actions without starting subsequent actions, or by abandoning in-progress actions. While completing or abandoning in-progress actions, the pipeline execution is in a Stopping state. After all in-progress actions are completed or abandoned, the pipeline execution is in a Stopped state.
    */
  def stopPipelineExecution(params: StopPipelineExecutionInput): Request[StopPipelineExecutionOutput, AWSError] = js.native
  def stopPipelineExecution(
    params: StopPipelineExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StopPipelineExecutionOutput, Unit]
  ): Request[StopPipelineExecutionOutput, AWSError] = js.native
  
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource. 
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource. 
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Removes tags from an AWS resource.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes tags from an AWS resource.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Updates a specified pipeline with edits or changes to its structure. Use a JSON file with the pipeline structure and UpdatePipeline to provide the full structure of the pipeline. Updating the pipeline increases the version number of the pipeline by 1.
    */
  def updatePipeline(): Request[UpdatePipelineOutput, AWSError] = js.native
  def updatePipeline(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineOutput, Unit]): Request[UpdatePipelineOutput, AWSError] = js.native
  /**
    * Updates a specified pipeline with edits or changes to its structure. Use a JSON file with the pipeline structure and UpdatePipeline to provide the full structure of the pipeline. Updating the pipeline increases the version number of the pipeline by 1.
    */
  def updatePipeline(params: UpdatePipelineInput): Request[UpdatePipelineOutput, AWSError] = js.native
  def updatePipeline(
    params: UpdatePipelineInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineOutput, Unit]
  ): Request[UpdatePipelineOutput, AWSError] = js.native
}
