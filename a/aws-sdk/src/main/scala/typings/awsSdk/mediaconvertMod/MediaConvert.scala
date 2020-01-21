package typings.awsSdk.mediaconvertMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConvert extends Service {
  @JSName("config")
  var config_MediaConvert: ConfigBase with ClientConfiguration = js.native
  /**
    * Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.
    */
  def associateCertificate(): Request[AssociateCertificateResponse, AWSError] = js.native
  def associateCertificate(callback: js.Function2[/* err */ AWSError, /* data */ AssociateCertificateResponse, Unit]): Request[AssociateCertificateResponse, AWSError] = js.native
  /**
    * Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.
    */
  def associateCertificate(params: AssociateCertificateRequest): Request[AssociateCertificateResponse, AWSError] = js.native
  def associateCertificate(
    params: AssociateCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateCertificateResponse, Unit]
  ): Request[AssociateCertificateResponse, AWSError] = js.native
  /**
    * Permanently cancel a job. Once you have canceled a job, you can't start it again.
    */
  def cancelJob(): Request[CancelJobResponse, AWSError] = js.native
  def cancelJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelJobResponse, Unit]): Request[CancelJobResponse, AWSError] = js.native
  /**
    * Permanently cancel a job. Once you have canceled a job, you can't start it again.
    */
  def cancelJob(params: CancelJobRequest): Request[CancelJobResponse, AWSError] = js.native
  def cancelJob(
    params: CancelJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelJobResponse, Unit]
  ): Request[CancelJobResponse, AWSError] = js.native
  /**
    * Create a new transcoding job. For information about jobs and job settings, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createJob(): Request[CreateJobResponse, AWSError] = js.native
  def createJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResponse, Unit]): Request[CreateJobResponse, AWSError] = js.native
  /**
    * Create a new transcoding job. For information about jobs and job settings, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createJob(params: CreateJobRequest): Request[CreateJobResponse, AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResponse, Unit]
  ): Request[CreateJobResponse, AWSError] = js.native
  /**
    * Create a new job template. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createJobTemplate(): Request[CreateJobTemplateResponse, AWSError] = js.native
  def createJobTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobTemplateResponse, Unit]): Request[CreateJobTemplateResponse, AWSError] = js.native
  /**
    * Create a new job template. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createJobTemplate(params: CreateJobTemplateRequest): Request[CreateJobTemplateResponse, AWSError] = js.native
  def createJobTemplate(
    params: CreateJobTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobTemplateResponse, Unit]
  ): Request[CreateJobTemplateResponse, AWSError] = js.native
  /**
    * Create a new preset. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createPreset(): Request[CreatePresetResponse, AWSError] = js.native
  def createPreset(callback: js.Function2[/* err */ AWSError, /* data */ CreatePresetResponse, Unit]): Request[CreatePresetResponse, AWSError] = js.native
  /**
    * Create a new preset. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createPreset(params: CreatePresetRequest): Request[CreatePresetResponse, AWSError] = js.native
  def createPreset(
    params: CreatePresetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePresetResponse, Unit]
  ): Request[CreatePresetResponse, AWSError] = js.native
  /**
    * Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html
    */
  def createQueue(): Request[CreateQueueResponse, AWSError] = js.native
  def createQueue(callback: js.Function2[/* err */ AWSError, /* data */ CreateQueueResponse, Unit]): Request[CreateQueueResponse, AWSError] = js.native
  /**
    * Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html
    */
  def createQueue(params: CreateQueueRequest): Request[CreateQueueResponse, AWSError] = js.native
  def createQueue(
    params: CreateQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateQueueResponse, Unit]
  ): Request[CreateQueueResponse, AWSError] = js.native
  /**
    * Permanently delete a job template you have created.
    */
  def deleteJobTemplate(): Request[DeleteJobTemplateResponse, AWSError] = js.native
  def deleteJobTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobTemplateResponse, Unit]): Request[DeleteJobTemplateResponse, AWSError] = js.native
  /**
    * Permanently delete a job template you have created.
    */
  def deleteJobTemplate(params: DeleteJobTemplateRequest): Request[DeleteJobTemplateResponse, AWSError] = js.native
  def deleteJobTemplate(
    params: DeleteJobTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobTemplateResponse, Unit]
  ): Request[DeleteJobTemplateResponse, AWSError] = js.native
  /**
    * Permanently delete a preset you have created.
    */
  def deletePreset(): Request[DeletePresetResponse, AWSError] = js.native
  def deletePreset(callback: js.Function2[/* err */ AWSError, /* data */ DeletePresetResponse, Unit]): Request[DeletePresetResponse, AWSError] = js.native
  /**
    * Permanently delete a preset you have created.
    */
  def deletePreset(params: DeletePresetRequest): Request[DeletePresetResponse, AWSError] = js.native
  def deletePreset(
    params: DeletePresetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePresetResponse, Unit]
  ): Request[DeletePresetResponse, AWSError] = js.native
  /**
    * Permanently delete a queue you have created.
    */
  def deleteQueue(): Request[DeleteQueueResponse, AWSError] = js.native
  def deleteQueue(callback: js.Function2[/* err */ AWSError, /* data */ DeleteQueueResponse, Unit]): Request[DeleteQueueResponse, AWSError] = js.native
  /**
    * Permanently delete a queue you have created.
    */
  def deleteQueue(params: DeleteQueueRequest): Request[DeleteQueueResponse, AWSError] = js.native
  def deleteQueue(
    params: DeleteQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteQueueResponse, Unit]
  ): Request[DeleteQueueResponse, AWSError] = js.native
  /**
    * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
    */
  def describeEndpoints(): Request[DescribeEndpointsResponse, AWSError] = js.native
  def describeEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]): Request[DescribeEndpointsResponse, AWSError] = js.native
  /**
    * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
    */
  def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse, AWSError] = js.native
  def describeEndpoints(
    params: DescribeEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]
  ): Request[DescribeEndpointsResponse, AWSError] = js.native
  /**
    * Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and an AWS Elemental MediaConvert resource.
    */
  def disassociateCertificate(): Request[DisassociateCertificateResponse, AWSError] = js.native
  def disassociateCertificate(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateCertificateResponse, Unit]): Request[DisassociateCertificateResponse, AWSError] = js.native
  /**
    * Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and an AWS Elemental MediaConvert resource.
    */
  def disassociateCertificate(params: DisassociateCertificateRequest): Request[DisassociateCertificateResponse, AWSError] = js.native
  def disassociateCertificate(
    params: DisassociateCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateCertificateResponse, Unit]
  ): Request[DisassociateCertificateResponse, AWSError] = js.native
  /**
    * Retrieve the JSON for a specific completed transcoding job.
    */
  def getJob(): Request[GetJobResponse, AWSError] = js.native
  def getJob(callback: js.Function2[/* err */ AWSError, /* data */ GetJobResponse, Unit]): Request[GetJobResponse, AWSError] = js.native
  /**
    * Retrieve the JSON for a specific completed transcoding job.
    */
  def getJob(params: GetJobRequest): Request[GetJobResponse, AWSError] = js.native
  def getJob(params: GetJobRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetJobResponse, Unit]): Request[GetJobResponse, AWSError] = js.native
  /**
    * Retrieve the JSON for a specific job template.
    */
  def getJobTemplate(): Request[GetJobTemplateResponse, AWSError] = js.native
  def getJobTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetJobTemplateResponse, Unit]): Request[GetJobTemplateResponse, AWSError] = js.native
  /**
    * Retrieve the JSON for a specific job template.
    */
  def getJobTemplate(params: GetJobTemplateRequest): Request[GetJobTemplateResponse, AWSError] = js.native
  def getJobTemplate(
    params: GetJobTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetJobTemplateResponse, Unit]
  ): Request[GetJobTemplateResponse, AWSError] = js.native
  /**
    * Retrieve the JSON for a specific preset.
    */
  def getPreset(): Request[GetPresetResponse, AWSError] = js.native
  def getPreset(callback: js.Function2[/* err */ AWSError, /* data */ GetPresetResponse, Unit]): Request[GetPresetResponse, AWSError] = js.native
  /**
    * Retrieve the JSON for a specific preset.
    */
  def getPreset(params: GetPresetRequest): Request[GetPresetResponse, AWSError] = js.native
  def getPreset(
    params: GetPresetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPresetResponse, Unit]
  ): Request[GetPresetResponse, AWSError] = js.native
  /**
    * Retrieve the JSON for a specific queue.
    */
  def getQueue(): Request[GetQueueResponse, AWSError] = js.native
  def getQueue(callback: js.Function2[/* err */ AWSError, /* data */ GetQueueResponse, Unit]): Request[GetQueueResponse, AWSError] = js.native
  /**
    * Retrieve the JSON for a specific queue.
    */
  def getQueue(params: GetQueueRequest): Request[GetQueueResponse, AWSError] = js.native
  def getQueue(
    params: GetQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQueueResponse, Unit]
  ): Request[GetQueueResponse, AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
    */
  def listJobTemplates(): Request[ListJobTemplatesResponse, AWSError] = js.native
  def listJobTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListJobTemplatesResponse, Unit]): Request[ListJobTemplatesResponse, AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
    */
  def listJobTemplates(params: ListJobTemplatesRequest): Request[ListJobTemplatesResponse, AWSError] = js.native
  def listJobTemplates(
    params: ListJobTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobTemplatesResponse, Unit]
  ): Request[ListJobTemplatesResponse, AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process, completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the twenty next most recent jobs, use the nextToken string returned with the array.
    */
  def listJobs(): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]): Request[ListJobsResponse, AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process, completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the twenty next most recent jobs, use the nextToken string returned with the array.
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]
  ): Request[ListJobsResponse, AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
    */
  def listPresets(): Request[ListPresetsResponse, AWSError] = js.native
  def listPresets(callback: js.Function2[/* err */ AWSError, /* data */ ListPresetsResponse, Unit]): Request[ListPresetsResponse, AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
    */
  def listPresets(params: ListPresetsRequest): Request[ListPresetsResponse, AWSError] = js.native
  def listPresets(
    params: ListPresetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPresetsResponse, Unit]
  ): Request[ListPresetsResponse, AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of them. To retrieve the next twenty queues, use the nextToken string returned with the array.
    */
  def listQueues(): Request[ListQueuesResponse, AWSError] = js.native
  def listQueues(callback: js.Function2[/* err */ AWSError, /* data */ ListQueuesResponse, Unit]): Request[ListQueuesResponse, AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of them. To retrieve the next twenty queues, use the nextToken string returned with the array.
    */
  def listQueues(params: ListQueuesRequest): Request[ListQueuesResponse, AWSError] = js.native
  def listQueues(
    params: ListQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQueuesResponse, Unit]
  ): Request[ListQueuesResponse, AWSError] = js.native
  /**
    * Retrieve the tags for a MediaConvert resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieve the tags for a MediaConvert resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Modify one of your existing job templates.
    */
  def updateJobTemplate(): Request[UpdateJobTemplateResponse, AWSError] = js.native
  def updateJobTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobTemplateResponse, Unit]): Request[UpdateJobTemplateResponse, AWSError] = js.native
  /**
    * Modify one of your existing job templates.
    */
  def updateJobTemplate(params: UpdateJobTemplateRequest): Request[UpdateJobTemplateResponse, AWSError] = js.native
  def updateJobTemplate(
    params: UpdateJobTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobTemplateResponse, Unit]
  ): Request[UpdateJobTemplateResponse, AWSError] = js.native
  /**
    * Modify one of your existing presets.
    */
  def updatePreset(): Request[UpdatePresetResponse, AWSError] = js.native
  def updatePreset(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePresetResponse, Unit]): Request[UpdatePresetResponse, AWSError] = js.native
  /**
    * Modify one of your existing presets.
    */
  def updatePreset(params: UpdatePresetRequest): Request[UpdatePresetResponse, AWSError] = js.native
  def updatePreset(
    params: UpdatePresetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePresetResponse, Unit]
  ): Request[UpdatePresetResponse, AWSError] = js.native
  /**
    * Modify one of your existing queues.
    */
  def updateQueue(): Request[UpdateQueueResponse, AWSError] = js.native
  def updateQueue(callback: js.Function2[/* err */ AWSError, /* data */ UpdateQueueResponse, Unit]): Request[UpdateQueueResponse, AWSError] = js.native
  /**
    * Modify one of your existing queues.
    */
  def updateQueue(params: UpdateQueueRequest): Request[UpdateQueueResponse, AWSError] = js.native
  def updateQueue(
    params: UpdateQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateQueueResponse, Unit]
  ): Request[UpdateQueueResponse, AWSError] = js.native
}

