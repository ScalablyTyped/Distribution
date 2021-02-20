package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobRequest extends StObject {
  
  /**
    * Allows you to create criteria to abort a job.
    */
  var abortConfig: js.UndefOr[AbortConfig] = js.native
  
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.native
  
  /**
    * Allows you to create a staged rollout of the job.
    */
  var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.native
  
  /**
    * The ID of the job to be updated.
    */
  var jobId: JobId = js.native
  
  /**
    * The namespace used to indicate that a job is a customer-managed job. When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that contain the value in the following format.  $aws/things/THING_NAME/jobs/JOB_ID/notify-namespace-NAMESPACE_ID/   The namespaceId feature is in public preview. 
    */
  var namespaceId: js.UndefOr[NamespaceId] = js.native
  
  /**
    * Configuration information for pre-signed S3 URLs.
    */
  var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.native
  
  /**
    * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the time expires, it will be automatically set to TIMED_OUT. 
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
}
object UpdateJobRequest {
  
  @scala.inline
  def apply(jobId: JobId): UpdateJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobRequest]
  }
  
  @scala.inline
  implicit class UpdateJobRequestMutableBuilder[Self <: UpdateJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortConfig(value: AbortConfig): Self = StObject.set(x, "abortConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortConfigUndefined: Self = StObject.set(x, "abortConfig", js.undefined)
    
    @scala.inline
    def setDescription(value: JobDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setJobExecutionsRolloutConfig(value: JobExecutionsRolloutConfig): Self = StObject.set(x, "jobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobExecutionsRolloutConfigUndefined: Self = StObject.set(x, "jobExecutionsRolloutConfig", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceId(value: NamespaceId): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
    
    @scala.inline
    def setPresignedUrlConfig(value: PresignedUrlConfig): Self = StObject.set(x, "presignedUrlConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresignedUrlConfigUndefined: Self = StObject.set(x, "presignedUrlConfig", js.undefined)
    
    @scala.inline
    def setTimeoutConfig(value: TimeoutConfig): Self = StObject.set(x, "timeoutConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutConfigUndefined: Self = StObject.set(x, "timeoutConfig", js.undefined)
  }
}
