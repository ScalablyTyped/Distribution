package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTargetsWithJobRequest extends StObject {
  
  /**
    * An optional comment string describing why the job was associated with the targets.
    */
  var comment: js.UndefOr[Comment] = js.undefined
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId
  
  /**
    * The namespace used to indicate that a job is a customer-managed job. When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that contain the value in the following format.  $aws/things/THING_NAME/jobs/JOB_ID/notify-namespace-NAMESPACE_ID/   The namespaceId feature is in public preview. 
    */
  var namespaceId: js.UndefOr[NamespaceId] = js.undefined
  
  /**
    * A list of thing group ARNs that define the targets of the job.
    */
  var targets: JobTargets
}
object AssociateTargetsWithJobRequest {
  
  @scala.inline
  def apply(jobId: JobId, targets: JobTargets): AssociateTargetsWithJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTargetsWithJobRequest]
  }
  
  @scala.inline
  implicit class AssociateTargetsWithJobRequestMutableBuilder[Self <: AssociateTargetsWithJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceId(value: NamespaceId): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
    
    @scala.inline
    def setTargets(value: JobTargets): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: TargetArn*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
