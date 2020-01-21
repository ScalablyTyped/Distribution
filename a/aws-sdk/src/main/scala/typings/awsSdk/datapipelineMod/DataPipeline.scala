package typings.awsSdk.datapipelineMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPipeline extends Service {
  @JSName("config")
  var config_DataPipeline: ConfigBase with ClientConfiguration = js.native
  /**
    * Validates the specified pipeline and starts processing pipeline tasks. If the pipeline does not pass validation, activation fails. If you need to pause the pipeline to investigate an issue with a component, such as a data source or script, call DeactivatePipeline. To activate a finished pipeline, modify the end date for the pipeline and then activate it.
    */
  def activatePipeline(): Request[ActivatePipelineOutput, AWSError] = js.native
  def activatePipeline(callback: js.Function2[/* err */ AWSError, /* data */ ActivatePipelineOutput, Unit]): Request[ActivatePipelineOutput, AWSError] = js.native
  /**
    * Validates the specified pipeline and starts processing pipeline tasks. If the pipeline does not pass validation, activation fails. If you need to pause the pipeline to investigate an issue with a component, such as a data source or script, call DeactivatePipeline. To activate a finished pipeline, modify the end date for the pipeline and then activate it.
    */
  def activatePipeline(params: ActivatePipelineInput): Request[ActivatePipelineOutput, AWSError] = js.native
  def activatePipeline(
    params: ActivatePipelineInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ActivatePipelineOutput, Unit]
  ): Request[ActivatePipelineOutput, AWSError] = js.native
  /**
    * Adds or modifies tags for the specified pipeline.
    */
  def addTags(): Request[AddTagsOutput, AWSError] = js.native
  def addTags(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsOutput, Unit]): Request[AddTagsOutput, AWSError] = js.native
  /**
    * Adds or modifies tags for the specified pipeline.
    */
  def addTags(params: AddTagsInput): Request[AddTagsOutput, AWSError] = js.native
  def addTags(params: AddTagsInput, callback: js.Function2[/* err */ AWSError, /* data */ AddTagsOutput, Unit]): Request[AddTagsOutput, AWSError] = js.native
  /**
    * Creates a new, empty pipeline. Use PutPipelineDefinition to populate the pipeline.
    */
  def createPipeline(): Request[CreatePipelineOutput, AWSError] = js.native
  def createPipeline(callback: js.Function2[/* err */ AWSError, /* data */ CreatePipelineOutput, Unit]): Request[CreatePipelineOutput, AWSError] = js.native
  /**
    * Creates a new, empty pipeline. Use PutPipelineDefinition to populate the pipeline.
    */
  def createPipeline(params: CreatePipelineInput): Request[CreatePipelineOutput, AWSError] = js.native
  def createPipeline(
    params: CreatePipelineInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePipelineOutput, Unit]
  ): Request[CreatePipelineOutput, AWSError] = js.native
  /**
    * Deactivates the specified running pipeline. The pipeline is set to the DEACTIVATING state until the deactivation process completes. To resume a deactivated pipeline, use ActivatePipeline. By default, the pipeline resumes from the last completed execution. Optionally, you can specify the date and time to resume the pipeline.
    */
  def deactivatePipeline(): Request[DeactivatePipelineOutput, AWSError] = js.native
  def deactivatePipeline(callback: js.Function2[/* err */ AWSError, /* data */ DeactivatePipelineOutput, Unit]): Request[DeactivatePipelineOutput, AWSError] = js.native
  /**
    * Deactivates the specified running pipeline. The pipeline is set to the DEACTIVATING state until the deactivation process completes. To resume a deactivated pipeline, use ActivatePipeline. By default, the pipeline resumes from the last completed execution. Optionally, you can specify the date and time to resume the pipeline.
    */
  def deactivatePipeline(params: DeactivatePipelineInput): Request[DeactivatePipelineOutput, AWSError] = js.native
  def deactivatePipeline(
    params: DeactivatePipelineInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeactivatePipelineOutput, Unit]
  ): Request[DeactivatePipelineOutput, AWSError] = js.native
  /**
    * Deletes a pipeline, its pipeline definition, and its run history. AWS Data Pipeline attempts to cancel instances associated with the pipeline that are currently being processed by task runners. Deleting a pipeline cannot be undone. You cannot query or restore a deleted pipeline. To temporarily pause a pipeline instead of deleting it, call SetStatus with the status set to PAUSE on individual components. Components that are paused by SetStatus can be resumed.
    */
  def deletePipeline(): Request[js.Object, AWSError] = js.native
  def deletePipeline(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a pipeline, its pipeline definition, and its run history. AWS Data Pipeline attempts to cancel instances associated with the pipeline that are currently being processed by task runners. Deleting a pipeline cannot be undone. You cannot query or restore a deleted pipeline. To temporarily pause a pipeline instead of deleting it, call SetStatus with the status set to PAUSE on individual components. Components that are paused by SetStatus can be resumed.
    */
  def deletePipeline(params: DeletePipelineInput): Request[js.Object, AWSError] = js.native
  def deletePipeline(
    params: DeletePipelineInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Gets the object definitions for a set of objects associated with the pipeline. Object definitions are composed of a set of fields that define the properties of the object.
    */
  def describeObjects(): Request[DescribeObjectsOutput, AWSError] = js.native
  def describeObjects(callback: js.Function2[/* err */ AWSError, /* data */ DescribeObjectsOutput, Unit]): Request[DescribeObjectsOutput, AWSError] = js.native
  /**
    * Gets the object definitions for a set of objects associated with the pipeline. Object definitions are composed of a set of fields that define the properties of the object.
    */
  def describeObjects(params: DescribeObjectsInput): Request[DescribeObjectsOutput, AWSError] = js.native
  def describeObjects(
    params: DescribeObjectsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeObjectsOutput, Unit]
  ): Request[DescribeObjectsOutput, AWSError] = js.native
  /**
    * Retrieves metadata about one or more pipelines. The information retrieved includes the name of the pipeline, the pipeline identifier, its current state, and the user account that owns the pipeline. Using account credentials, you can retrieve metadata about pipelines that you or your IAM users have created. If you are using an IAM user account, you can retrieve metadata about only those pipelines for which you have read permissions. To retrieve the full pipeline definition instead of metadata about the pipeline, call GetPipelineDefinition.
    */
  def describePipelines(): Request[DescribePipelinesOutput, AWSError] = js.native
  def describePipelines(callback: js.Function2[/* err */ AWSError, /* data */ DescribePipelinesOutput, Unit]): Request[DescribePipelinesOutput, AWSError] = js.native
  /**
    * Retrieves metadata about one or more pipelines. The information retrieved includes the name of the pipeline, the pipeline identifier, its current state, and the user account that owns the pipeline. Using account credentials, you can retrieve metadata about pipelines that you or your IAM users have created. If you are using an IAM user account, you can retrieve metadata about only those pipelines for which you have read permissions. To retrieve the full pipeline definition instead of metadata about the pipeline, call GetPipelineDefinition.
    */
  def describePipelines(params: DescribePipelinesInput): Request[DescribePipelinesOutput, AWSError] = js.native
  def describePipelines(
    params: DescribePipelinesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePipelinesOutput, Unit]
  ): Request[DescribePipelinesOutput, AWSError] = js.native
  /**
    * Task runners call EvaluateExpression to evaluate a string in the context of the specified object. For example, a task runner can evaluate SQL queries stored in Amazon S3.
    */
  def evaluateExpression(): Request[EvaluateExpressionOutput, AWSError] = js.native
  def evaluateExpression(callback: js.Function2[/* err */ AWSError, /* data */ EvaluateExpressionOutput, Unit]): Request[EvaluateExpressionOutput, AWSError] = js.native
  /**
    * Task runners call EvaluateExpression to evaluate a string in the context of the specified object. For example, a task runner can evaluate SQL queries stored in Amazon S3.
    */
  def evaluateExpression(params: EvaluateExpressionInput): Request[EvaluateExpressionOutput, AWSError] = js.native
  def evaluateExpression(
    params: EvaluateExpressionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ EvaluateExpressionOutput, Unit]
  ): Request[EvaluateExpressionOutput, AWSError] = js.native
  /**
    * Gets the definition of the specified pipeline. You can call GetPipelineDefinition to retrieve the pipeline definition that you provided using PutPipelineDefinition.
    */
  def getPipelineDefinition(): Request[GetPipelineDefinitionOutput, AWSError] = js.native
  def getPipelineDefinition(callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineDefinitionOutput, Unit]): Request[GetPipelineDefinitionOutput, AWSError] = js.native
  /**
    * Gets the definition of the specified pipeline. You can call GetPipelineDefinition to retrieve the pipeline definition that you provided using PutPipelineDefinition.
    */
  def getPipelineDefinition(params: GetPipelineDefinitionInput): Request[GetPipelineDefinitionOutput, AWSError] = js.native
  def getPipelineDefinition(
    params: GetPipelineDefinitionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineDefinitionOutput, Unit]
  ): Request[GetPipelineDefinitionOutput, AWSError] = js.native
  /**
    * Lists the pipeline identifiers for all active pipelines that you have permission to access.
    */
  def listPipelines(): Request[ListPipelinesOutput, AWSError] = js.native
  def listPipelines(callback: js.Function2[/* err */ AWSError, /* data */ ListPipelinesOutput, Unit]): Request[ListPipelinesOutput, AWSError] = js.native
  /**
    * Lists the pipeline identifiers for all active pipelines that you have permission to access.
    */
  def listPipelines(params: ListPipelinesInput): Request[ListPipelinesOutput, AWSError] = js.native
  def listPipelines(
    params: ListPipelinesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPipelinesOutput, Unit]
  ): Request[ListPipelinesOutput, AWSError] = js.native
  /**
    * Task runners call PollForTask to receive a task to perform from AWS Data Pipeline. The task runner specifies which tasks it can perform by setting a value for the workerGroup parameter. The task returned can come from any of the pipelines that match the workerGroup value passed in by the task runner and that was launched using the IAM user credentials specified by the task runner. If tasks are ready in the work queue, PollForTask returns a response immediately. If no tasks are available in the queue, PollForTask uses long-polling and holds on to a poll connection for up to a 90 seconds, during which time the first newly scheduled task is handed to the task runner. To accomodate this, set the socket timeout in your task runner to 90 seconds. The task runner should not call PollForTask again on the same workerGroup until it receives a response, and this can take up to 90 seconds. 
    */
  def pollForTask(): Request[PollForTaskOutput, AWSError] = js.native
  def pollForTask(callback: js.Function2[/* err */ AWSError, /* data */ PollForTaskOutput, Unit]): Request[PollForTaskOutput, AWSError] = js.native
  /**
    * Task runners call PollForTask to receive a task to perform from AWS Data Pipeline. The task runner specifies which tasks it can perform by setting a value for the workerGroup parameter. The task returned can come from any of the pipelines that match the workerGroup value passed in by the task runner and that was launched using the IAM user credentials specified by the task runner. If tasks are ready in the work queue, PollForTask returns a response immediately. If no tasks are available in the queue, PollForTask uses long-polling and holds on to a poll connection for up to a 90 seconds, during which time the first newly scheduled task is handed to the task runner. To accomodate this, set the socket timeout in your task runner to 90 seconds. The task runner should not call PollForTask again on the same workerGroup until it receives a response, and this can take up to 90 seconds. 
    */
  def pollForTask(params: PollForTaskInput): Request[PollForTaskOutput, AWSError] = js.native
  def pollForTask(
    params: PollForTaskInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PollForTaskOutput, Unit]
  ): Request[PollForTaskOutput, AWSError] = js.native
  /**
    * Adds tasks, schedules, and preconditions to the specified pipeline. You can use PutPipelineDefinition to populate a new pipeline.  PutPipelineDefinition also validates the configuration as it adds it to the pipeline. Changes to the pipeline are saved unless one of the following three validation errors exists in the pipeline.   An object is missing a name or identifier field. A string or reference field is empty. The number of objects in the pipeline exceeds the maximum allowed objects. The pipeline is in a FINISHED state.   Pipeline object definitions are passed to the PutPipelineDefinition action and returned by the GetPipelineDefinition action. 
    */
  def putPipelineDefinition(): Request[PutPipelineDefinitionOutput, AWSError] = js.native
  def putPipelineDefinition(callback: js.Function2[/* err */ AWSError, /* data */ PutPipelineDefinitionOutput, Unit]): Request[PutPipelineDefinitionOutput, AWSError] = js.native
  /**
    * Adds tasks, schedules, and preconditions to the specified pipeline. You can use PutPipelineDefinition to populate a new pipeline.  PutPipelineDefinition also validates the configuration as it adds it to the pipeline. Changes to the pipeline are saved unless one of the following three validation errors exists in the pipeline.   An object is missing a name or identifier field. A string or reference field is empty. The number of objects in the pipeline exceeds the maximum allowed objects. The pipeline is in a FINISHED state.   Pipeline object definitions are passed to the PutPipelineDefinition action and returned by the GetPipelineDefinition action. 
    */
  def putPipelineDefinition(params: PutPipelineDefinitionInput): Request[PutPipelineDefinitionOutput, AWSError] = js.native
  def putPipelineDefinition(
    params: PutPipelineDefinitionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPipelineDefinitionOutput, Unit]
  ): Request[PutPipelineDefinitionOutput, AWSError] = js.native
  /**
    * Queries the specified pipeline for the names of objects that match the specified set of conditions.
    */
  def queryObjects(): Request[QueryObjectsOutput, AWSError] = js.native
  def queryObjects(callback: js.Function2[/* err */ AWSError, /* data */ QueryObjectsOutput, Unit]): Request[QueryObjectsOutput, AWSError] = js.native
  /**
    * Queries the specified pipeline for the names of objects that match the specified set of conditions.
    */
  def queryObjects(params: QueryObjectsInput): Request[QueryObjectsOutput, AWSError] = js.native
  def queryObjects(
    params: QueryObjectsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ QueryObjectsOutput, Unit]
  ): Request[QueryObjectsOutput, AWSError] = js.native
  /**
    * Removes existing tags from the specified pipeline.
    */
  def removeTags(): Request[RemoveTagsOutput, AWSError] = js.native
  def removeTags(callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsOutput, Unit]): Request[RemoveTagsOutput, AWSError] = js.native
  /**
    * Removes existing tags from the specified pipeline.
    */
  def removeTags(params: RemoveTagsInput): Request[RemoveTagsOutput, AWSError] = js.native
  def removeTags(
    params: RemoveTagsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsOutput, Unit]
  ): Request[RemoveTagsOutput, AWSError] = js.native
  /**
    * Task runners call ReportTaskProgress when assigned a task to acknowledge that it has the task. If the web service does not receive this acknowledgement within 2 minutes, it assigns the task in a subsequent PollForTask call. After this initial acknowledgement, the task runner only needs to report progress every 15 minutes to maintain its ownership of the task. You can change this reporting time from 15 minutes by specifying a reportProgressTimeout field in your pipeline. If a task runner does not report its status after 5 minutes, AWS Data Pipeline assumes that the task runner is unable to process the task and reassigns the task in a subsequent response to PollForTask. Task runners should call ReportTaskProgress every 60 seconds.
    */
  def reportTaskProgress(): Request[ReportTaskProgressOutput, AWSError] = js.native
  def reportTaskProgress(callback: js.Function2[/* err */ AWSError, /* data */ ReportTaskProgressOutput, Unit]): Request[ReportTaskProgressOutput, AWSError] = js.native
  /**
    * Task runners call ReportTaskProgress when assigned a task to acknowledge that it has the task. If the web service does not receive this acknowledgement within 2 minutes, it assigns the task in a subsequent PollForTask call. After this initial acknowledgement, the task runner only needs to report progress every 15 minutes to maintain its ownership of the task. You can change this reporting time from 15 minutes by specifying a reportProgressTimeout field in your pipeline. If a task runner does not report its status after 5 minutes, AWS Data Pipeline assumes that the task runner is unable to process the task and reassigns the task in a subsequent response to PollForTask. Task runners should call ReportTaskProgress every 60 seconds.
    */
  def reportTaskProgress(params: ReportTaskProgressInput): Request[ReportTaskProgressOutput, AWSError] = js.native
  def reportTaskProgress(
    params: ReportTaskProgressInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ReportTaskProgressOutput, Unit]
  ): Request[ReportTaskProgressOutput, AWSError] = js.native
  /**
    * Task runners call ReportTaskRunnerHeartbeat every 15 minutes to indicate that they are operational. If the AWS Data Pipeline Task Runner is launched on a resource managed by AWS Data Pipeline, the web service can use this call to detect when the task runner application has failed and restart a new instance.
    */
  def reportTaskRunnerHeartbeat(): Request[ReportTaskRunnerHeartbeatOutput, AWSError] = js.native
  def reportTaskRunnerHeartbeat(callback: js.Function2[/* err */ AWSError, /* data */ ReportTaskRunnerHeartbeatOutput, Unit]): Request[ReportTaskRunnerHeartbeatOutput, AWSError] = js.native
  /**
    * Task runners call ReportTaskRunnerHeartbeat every 15 minutes to indicate that they are operational. If the AWS Data Pipeline Task Runner is launched on a resource managed by AWS Data Pipeline, the web service can use this call to detect when the task runner application has failed and restart a new instance.
    */
  def reportTaskRunnerHeartbeat(params: ReportTaskRunnerHeartbeatInput): Request[ReportTaskRunnerHeartbeatOutput, AWSError] = js.native
  def reportTaskRunnerHeartbeat(
    params: ReportTaskRunnerHeartbeatInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ReportTaskRunnerHeartbeatOutput, Unit]
  ): Request[ReportTaskRunnerHeartbeatOutput, AWSError] = js.native
  /**
    * Requests that the status of the specified physical or logical pipeline objects be updated in the specified pipeline. This update might not occur immediately, but is eventually consistent. The status that can be set depends on the type of object (for example, DataNode or Activity). You cannot perform this operation on FINISHED pipelines and attempting to do so returns InvalidRequestException.
    */
  def setStatus(): Request[js.Object, AWSError] = js.native
  def setStatus(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Requests that the status of the specified physical or logical pipeline objects be updated in the specified pipeline. This update might not occur immediately, but is eventually consistent. The status that can be set depends on the type of object (for example, DataNode or Activity). You cannot perform this operation on FINISHED pipelines and attempting to do so returns InvalidRequestException.
    */
  def setStatus(params: SetStatusInput): Request[js.Object, AWSError] = js.native
  def setStatus(params: SetStatusInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Task runners call SetTaskStatus to notify AWS Data Pipeline that a task is completed and provide information about the final status. A task runner makes this call regardless of whether the task was sucessful. A task runner does not need to call SetTaskStatus for tasks that are canceled by the web service during a call to ReportTaskProgress.
    */
  def setTaskStatus(): Request[SetTaskStatusOutput, AWSError] = js.native
  def setTaskStatus(callback: js.Function2[/* err */ AWSError, /* data */ SetTaskStatusOutput, Unit]): Request[SetTaskStatusOutput, AWSError] = js.native
  /**
    * Task runners call SetTaskStatus to notify AWS Data Pipeline that a task is completed and provide information about the final status. A task runner makes this call regardless of whether the task was sucessful. A task runner does not need to call SetTaskStatus for tasks that are canceled by the web service during a call to ReportTaskProgress.
    */
  def setTaskStatus(params: SetTaskStatusInput): Request[SetTaskStatusOutput, AWSError] = js.native
  def setTaskStatus(
    params: SetTaskStatusInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SetTaskStatusOutput, Unit]
  ): Request[SetTaskStatusOutput, AWSError] = js.native
  /**
    * Validates the specified pipeline definition to ensure that it is well formed and can be run without error.
    */
  def validatePipelineDefinition(): Request[ValidatePipelineDefinitionOutput, AWSError] = js.native
  def validatePipelineDefinition(callback: js.Function2[/* err */ AWSError, /* data */ ValidatePipelineDefinitionOutput, Unit]): Request[ValidatePipelineDefinitionOutput, AWSError] = js.native
  /**
    * Validates the specified pipeline definition to ensure that it is well formed and can be run without error.
    */
  def validatePipelineDefinition(params: ValidatePipelineDefinitionInput): Request[ValidatePipelineDefinitionOutput, AWSError] = js.native
  def validatePipelineDefinition(
    params: ValidatePipelineDefinitionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ValidatePipelineDefinitionOutput, Unit]
  ): Request[ValidatePipelineDefinitionOutput, AWSError] = js.native
}

