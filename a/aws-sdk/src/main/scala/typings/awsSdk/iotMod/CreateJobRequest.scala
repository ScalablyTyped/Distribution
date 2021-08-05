package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobRequest extends StObject {
  
  /**
    * Allows you to create criteria to abort a job.
    */
  var abortConfig: js.UndefOr[AbortConfig] = js.undefined
  
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.undefined
  
  /**
    * The job document.  If the job document resides in an S3 bucket, you must use a placeholder link when specifying the document. The placeholder link is of the following form:  ${aws:iot:s3-presigned-url:https://s3.amazonaws.com/bucket/key}  where bucket is your bucket name and key is the object in the bucket to which you are linking. 
    */
  var document: js.UndefOr[JobDocument] = js.undefined
  
  /**
    * An S3 link to the job document.
    */
  var documentSource: js.UndefOr[JobDocumentSource] = js.undefined
  
  /**
    * Allows you to create a staged rollout of the job.
    */
  var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined
  
  /**
    * A job identifier which must be unique for your AWS account. We recommend using a UUID. Alpha-numeric characters, "-" and "_" are valid for use here.
    */
  var jobId: JobId
  
  /**
    * The namespace used to indicate that a job is a customer-managed job. When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that contain the value in the following format.  $aws/things/THING_NAME/jobs/JOB_ID/notify-namespace-NAMESPACE_ID/   The namespaceId feature is in public preview. 
    */
  var namespaceId: js.UndefOr[NamespaceId] = js.undefined
  
  /**
    * Configuration information for pre-signed S3 URLs.
    */
  var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined
  
  /**
    * Metadata which can be used to manage the job.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group.
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.undefined
  
  /**
    * A list of things and thing groups to which the job should be sent.
    */
  var targets: JobTargets
  
  /**
    * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the time expires, it will be automatically set to TIMED_OUT.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
}
object CreateJobRequest {
  
  inline def apply(jobId: JobId, targets: JobTargets): CreateJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  
  extension [Self <: CreateJobRequest](x: Self) {
    
    inline def setAbortConfig(value: AbortConfig): Self = StObject.set(x, "abortConfig", value.asInstanceOf[js.Any])
    
    inline def setAbortConfigUndefined: Self = StObject.set(x, "abortConfig", js.undefined)
    
    inline def setDescription(value: JobDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocument(value: JobDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentSource(value: JobDocumentSource): Self = StObject.set(x, "documentSource", value.asInstanceOf[js.Any])
    
    inline def setDocumentSourceUndefined: Self = StObject.set(x, "documentSource", js.undefined)
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setJobExecutionsRolloutConfig(value: JobExecutionsRolloutConfig): Self = StObject.set(x, "jobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    
    inline def setJobExecutionsRolloutConfigUndefined: Self = StObject.set(x, "jobExecutionsRolloutConfig", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setNamespaceId(value: NamespaceId): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
    
    inline def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
    
    inline def setPresignedUrlConfig(value: PresignedUrlConfig): Self = StObject.set(x, "presignedUrlConfig", value.asInstanceOf[js.Any])
    
    inline def setPresignedUrlConfigUndefined: Self = StObject.set(x, "presignedUrlConfig", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setTargetSelection(value: TargetSelection): Self = StObject.set(x, "targetSelection", value.asInstanceOf[js.Any])
    
    inline def setTargetSelectionUndefined: Self = StObject.set(x, "targetSelection", js.undefined)
    
    inline def setTargets(value: JobTargets): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: TargetArn*): Self = StObject.set(x, "targets", js.Array(value :_*))
    
    inline def setTimeoutConfig(value: TimeoutConfig): Self = StObject.set(x, "timeoutConfig", value.asInstanceOf[js.Any])
    
    inline def setTimeoutConfigUndefined: Self = StObject.set(x, "timeoutConfig", js.undefined)
  }
}
