package typings.awsSdk.elastictranscoderMod

import typings.awsSdk.anon.ReadJobRequestwaiterWaite
import typings.awsSdk.awsSdkStrings.jobComplete
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticTranscoder extends Service {
  
  /**
    * The CancelJob operation cancels an unfinished job.  You can only cancel a job that has a status of Submitted. To prevent a pipeline from starting to process a job while you're getting the job identifier, use UpdatePipelineStatus to temporarily pause the pipeline. 
    */
  def cancelJob(): Request[CancelJobResponse, AWSError] = js.native
  def cancelJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelJobResponse, Unit]): Request[CancelJobResponse, AWSError] = js.native
  /**
    * The CancelJob operation cancels an unfinished job.  You can only cancel a job that has a status of Submitted. To prevent a pipeline from starting to process a job while you're getting the job identifier, use UpdatePipelineStatus to temporarily pause the pipeline. 
    */
  def cancelJob(params: CancelJobRequest): Request[CancelJobResponse, AWSError] = js.native
  def cancelJob(
    params: CancelJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelJobResponse, Unit]
  ): Request[CancelJobResponse, AWSError] = js.native
  
  @JSName("config")
  var config_ElasticTranscoder: ConfigBase with ClientConfiguration = js.native
  
  /**
    * When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus information about the job that is created. If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another output for the Apple iPhone 4s), you currently must use the Elastic Transcoder API to list the jobs (as opposed to the AWS Console).
    */
  def createJob(): Request[CreateJobResponse, AWSError] = js.native
  def createJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResponse, Unit]): Request[CreateJobResponse, AWSError] = js.native
  /**
    * When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus information about the job that is created. If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another output for the Apple iPhone 4s), you currently must use the Elastic Transcoder API to list the jobs (as opposed to the AWS Console).
    */
  def createJob(params: CreateJobRequest): Request[CreateJobResponse, AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResponse, Unit]
  ): Request[CreateJobResponse, AWSError] = js.native
  
  /**
    * The CreatePipeline operation creates a pipeline with settings that you specify.
    */
  def createPipeline(): Request[CreatePipelineResponse, AWSError] = js.native
  def createPipeline(callback: js.Function2[/* err */ AWSError, /* data */ CreatePipelineResponse, Unit]): Request[CreatePipelineResponse, AWSError] = js.native
  /**
    * The CreatePipeline operation creates a pipeline with settings that you specify.
    */
  def createPipeline(params: CreatePipelineRequest): Request[CreatePipelineResponse, AWSError] = js.native
  def createPipeline(
    params: CreatePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePipelineResponse, Unit]
  ): Request[CreatePipelineResponse, AWSError] = js.native
  
  /**
    * The CreatePreset operation creates a preset with settings that you specify.  Elastic Transcoder checks the CreatePreset settings to ensure that they meet Elastic Transcoder requirements and to determine whether they comply with H.264 standards. If your settings are not valid for Elastic Transcoder, Elastic Transcoder returns an HTTP 400 response (ValidationException) and does not create the preset. If the settings are valid for Elastic Transcoder but aren't strictly compliant with the H.264 standard, Elastic Transcoder creates the preset and returns a warning message in the response. This helps you determine whether your settings comply with the H.264 standard while giving you greater flexibility with respect to the video that Elastic Transcoder produces.  Elastic Transcoder uses the H.264 video-compression format. For more information, see the International Telecommunication Union publication Recommendation ITU-T H.264: Advanced video coding for generic audiovisual services.
    */
  def createPreset(): Request[CreatePresetResponse, AWSError] = js.native
  def createPreset(callback: js.Function2[/* err */ AWSError, /* data */ CreatePresetResponse, Unit]): Request[CreatePresetResponse, AWSError] = js.native
  /**
    * The CreatePreset operation creates a preset with settings that you specify.  Elastic Transcoder checks the CreatePreset settings to ensure that they meet Elastic Transcoder requirements and to determine whether they comply with H.264 standards. If your settings are not valid for Elastic Transcoder, Elastic Transcoder returns an HTTP 400 response (ValidationException) and does not create the preset. If the settings are valid for Elastic Transcoder but aren't strictly compliant with the H.264 standard, Elastic Transcoder creates the preset and returns a warning message in the response. This helps you determine whether your settings comply with the H.264 standard while giving you greater flexibility with respect to the video that Elastic Transcoder produces.  Elastic Transcoder uses the H.264 video-compression format. For more information, see the International Telecommunication Union publication Recommendation ITU-T H.264: Advanced video coding for generic audiovisual services.
    */
  def createPreset(params: CreatePresetRequest): Request[CreatePresetResponse, AWSError] = js.native
  def createPreset(
    params: CreatePresetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePresetResponse, Unit]
  ): Request[CreatePresetResponse, AWSError] = js.native
  
  /**
    * The DeletePipeline operation removes a pipeline.  You can only delete a pipeline that has never been used or that is not currently in use (doesn't contain any active jobs). If the pipeline is currently in use, DeletePipeline returns an error. 
    */
  def deletePipeline(): Request[DeletePipelineResponse, AWSError] = js.native
  def deletePipeline(callback: js.Function2[/* err */ AWSError, /* data */ DeletePipelineResponse, Unit]): Request[DeletePipelineResponse, AWSError] = js.native
  /**
    * The DeletePipeline operation removes a pipeline.  You can only delete a pipeline that has never been used or that is not currently in use (doesn't contain any active jobs). If the pipeline is currently in use, DeletePipeline returns an error. 
    */
  def deletePipeline(params: DeletePipelineRequest): Request[DeletePipelineResponse, AWSError] = js.native
  def deletePipeline(
    params: DeletePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePipelineResponse, Unit]
  ): Request[DeletePipelineResponse, AWSError] = js.native
  
  /**
    * The DeletePreset operation removes a preset that you've added in an AWS region.  You can't delete the default presets that are included with Elastic Transcoder. 
    */
  def deletePreset(): Request[DeletePresetResponse, AWSError] = js.native
  def deletePreset(callback: js.Function2[/* err */ AWSError, /* data */ DeletePresetResponse, Unit]): Request[DeletePresetResponse, AWSError] = js.native
  /**
    * The DeletePreset operation removes a preset that you've added in an AWS region.  You can't delete the default presets that are included with Elastic Transcoder. 
    */
  def deletePreset(params: DeletePresetRequest): Request[DeletePresetResponse, AWSError] = js.native
  def deletePreset(
    params: DeletePresetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePresetResponse, Unit]
  ): Request[DeletePresetResponse, AWSError] = js.native
  
  /**
    * The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline. Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one element for each job that satisfies the search criteria.
    */
  def listJobsByPipeline(): Request[ListJobsByPipelineResponse, AWSError] = js.native
  def listJobsByPipeline(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsByPipelineResponse, Unit]): Request[ListJobsByPipelineResponse, AWSError] = js.native
  /**
    * The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline. Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one element for each job that satisfies the search criteria.
    */
  def listJobsByPipeline(params: ListJobsByPipelineRequest): Request[ListJobsByPipelineResponse, AWSError] = js.native
  def listJobsByPipeline(
    params: ListJobsByPipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsByPipelineResponse, Unit]
  ): Request[ListJobsByPipelineResponse, AWSError] = js.native
  
  /**
    * The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one element for each job that satisfies the search criteria.
    */
  def listJobsByStatus(): Request[ListJobsByStatusResponse, AWSError] = js.native
  def listJobsByStatus(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsByStatusResponse, Unit]): Request[ListJobsByStatusResponse, AWSError] = js.native
  /**
    * The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one element for each job that satisfies the search criteria.
    */
  def listJobsByStatus(params: ListJobsByStatusRequest): Request[ListJobsByStatusResponse, AWSError] = js.native
  def listJobsByStatus(
    params: ListJobsByStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsByStatusResponse, Unit]
  ): Request[ListJobsByStatusResponse, AWSError] = js.native
  
  /**
    * The ListPipelines operation gets a list of the pipelines associated with the current AWS account.
    */
  def listPipelines(): Request[ListPipelinesResponse, AWSError] = js.native
  def listPipelines(callback: js.Function2[/* err */ AWSError, /* data */ ListPipelinesResponse, Unit]): Request[ListPipelinesResponse, AWSError] = js.native
  /**
    * The ListPipelines operation gets a list of the pipelines associated with the current AWS account.
    */
  def listPipelines(params: ListPipelinesRequest): Request[ListPipelinesResponse, AWSError] = js.native
  def listPipelines(
    params: ListPipelinesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPipelinesResponse, Unit]
  ): Request[ListPipelinesResponse, AWSError] = js.native
  
  /**
    * The ListPresets operation gets a list of the default presets included with Elastic Transcoder and the presets that you've added in an AWS region.
    */
  def listPresets(): Request[ListPresetsResponse, AWSError] = js.native
  def listPresets(callback: js.Function2[/* err */ AWSError, /* data */ ListPresetsResponse, Unit]): Request[ListPresetsResponse, AWSError] = js.native
  /**
    * The ListPresets operation gets a list of the default presets included with Elastic Transcoder and the presets that you've added in an AWS region.
    */
  def listPresets(params: ListPresetsRequest): Request[ListPresetsResponse, AWSError] = js.native
  def listPresets(
    params: ListPresetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPresetsResponse, Unit]
  ): Request[ListPresetsResponse, AWSError] = js.native
  
  /**
    * The ReadJob operation returns detailed information about a job.
    */
  def readJob(): Request[ReadJobResponse, AWSError] = js.native
  def readJob(callback: js.Function2[/* err */ AWSError, /* data */ ReadJobResponse, Unit]): Request[ReadJobResponse, AWSError] = js.native
  /**
    * The ReadJob operation returns detailed information about a job.
    */
  def readJob(params: ReadJobRequest): Request[ReadJobResponse, AWSError] = js.native
  def readJob(
    params: ReadJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReadJobResponse, Unit]
  ): Request[ReadJobResponse, AWSError] = js.native
  
  /**
    * The ReadPipeline operation gets detailed information about a pipeline.
    */
  def readPipeline(): Request[ReadPipelineResponse, AWSError] = js.native
  def readPipeline(callback: js.Function2[/* err */ AWSError, /* data */ ReadPipelineResponse, Unit]): Request[ReadPipelineResponse, AWSError] = js.native
  /**
    * The ReadPipeline operation gets detailed information about a pipeline.
    */
  def readPipeline(params: ReadPipelineRequest): Request[ReadPipelineResponse, AWSError] = js.native
  def readPipeline(
    params: ReadPipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReadPipelineResponse, Unit]
  ): Request[ReadPipelineResponse, AWSError] = js.native
  
  /**
    * The ReadPreset operation gets detailed information about a preset.
    */
  def readPreset(): Request[ReadPresetResponse, AWSError] = js.native
  def readPreset(callback: js.Function2[/* err */ AWSError, /* data */ ReadPresetResponse, Unit]): Request[ReadPresetResponse, AWSError] = js.native
  /**
    * The ReadPreset operation gets detailed information about a preset.
    */
  def readPreset(params: ReadPresetRequest): Request[ReadPresetResponse, AWSError] = js.native
  def readPreset(
    params: ReadPresetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReadPresetResponse, Unit]
  ): Request[ReadPresetResponse, AWSError] = js.native
  
  /**
    * The TestRole operation tests the IAM role used to create the pipeline. The TestRole action lets you determine whether the IAM role you are using has sufficient permissions to let Elastic Transcoder perform tasks associated with the transcoding process. The action attempts to assume the specified IAM role, checks read access to the input and output buckets, and tries to send a test notification to Amazon SNS topics that you specify.
    */
  def testRole(): Request[TestRoleResponse, AWSError] = js.native
  def testRole(callback: js.Function2[/* err */ AWSError, /* data */ TestRoleResponse, Unit]): Request[TestRoleResponse, AWSError] = js.native
  /**
    * The TestRole operation tests the IAM role used to create the pipeline. The TestRole action lets you determine whether the IAM role you are using has sufficient permissions to let Elastic Transcoder perform tasks associated with the transcoding process. The action attempts to assume the specified IAM role, checks read access to the input and output buckets, and tries to send a test notification to Amazon SNS topics that you specify.
    */
  def testRole(params: TestRoleRequest): Request[TestRoleResponse, AWSError] = js.native
  def testRole(
    params: TestRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestRoleResponse, Unit]
  ): Request[TestRoleResponse, AWSError] = js.native
  
  /**
    *  Use the UpdatePipeline operation to update settings for a pipeline.  When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and that Elastic Transcoder has not started to process are affected in addition to jobs that you submit after you change settings.  
    */
  def updatePipeline(): Request[UpdatePipelineResponse, AWSError] = js.native
  def updatePipeline(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineResponse, Unit]): Request[UpdatePipelineResponse, AWSError] = js.native
  /**
    *  Use the UpdatePipeline operation to update settings for a pipeline.  When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and that Elastic Transcoder has not started to process are affected in addition to jobs that you submit after you change settings.  
    */
  def updatePipeline(params: UpdatePipelineRequest): Request[UpdatePipelineResponse, AWSError] = js.native
  def updatePipeline(
    params: UpdatePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineResponse, Unit]
  ): Request[UpdatePipelineResponse, AWSError] = js.native
  
  /**
    * With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS) notifications for a pipeline. When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the request.
    */
  def updatePipelineNotifications(): Request[UpdatePipelineNotificationsResponse, AWSError] = js.native
  def updatePipelineNotifications(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineNotificationsResponse, Unit]): Request[UpdatePipelineNotificationsResponse, AWSError] = js.native
  /**
    * With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS) notifications for a pipeline. When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the request.
    */
  def updatePipelineNotifications(params: UpdatePipelineNotificationsRequest): Request[UpdatePipelineNotificationsResponse, AWSError] = js.native
  def updatePipelineNotifications(
    params: UpdatePipelineNotificationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineNotificationsResponse, Unit]
  ): Request[UpdatePipelineNotificationsResponse, AWSError] = js.native
  
  /**
    * The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the processing of jobs. Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after Elastic Transcoder has started processing them; if you pause the pipeline to which you submitted the jobs, you have more time to get the job IDs for the jobs that you want to cancel, and to send a CancelJob request. 
    */
  def updatePipelineStatus(): Request[UpdatePipelineStatusResponse, AWSError] = js.native
  def updatePipelineStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineStatusResponse, Unit]): Request[UpdatePipelineStatusResponse, AWSError] = js.native
  /**
    * The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the processing of jobs. Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after Elastic Transcoder has started processing them; if you pause the pipeline to which you submitted the jobs, you have more time to get the job IDs for the jobs that you want to cancel, and to send a CancelJob request. 
    */
  def updatePipelineStatus(params: UpdatePipelineStatusRequest): Request[UpdatePipelineStatusResponse, AWSError] = js.native
  def updatePipelineStatus(
    params: UpdatePipelineStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineStatusResponse, Unit]
  ): Request[UpdatePipelineStatusResponse, AWSError] = js.native
  
  /**
    * Waits for the jobComplete state by periodically calling the underlying ElasticTranscoder.readJoboperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_jobComplete(state: jobComplete): Request[ReadJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_jobComplete(state: jobComplete, callback: js.Function2[/* err */ AWSError, /* data */ ReadJobResponse, Unit]): Request[ReadJobResponse, AWSError] = js.native
  /**
    * Waits for the jobComplete state by periodically calling the underlying ElasticTranscoder.readJoboperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_jobComplete(state: jobComplete, params: ReadJobRequestwaiterWaite): Request[ReadJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_jobComplete(
    state: jobComplete,
    params: ReadJobRequestwaiterWaite,
    callback: js.Function2[/* err */ AWSError, /* data */ ReadJobResponse, Unit]
  ): Request[ReadJobResponse, AWSError] = js.native
}
