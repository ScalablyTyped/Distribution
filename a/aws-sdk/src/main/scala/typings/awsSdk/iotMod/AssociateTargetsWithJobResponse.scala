package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTargetsWithJobResponse extends StObject {
  
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.undefined
  
  /**
    * An ARN identifying the job.
    */
  var jobArn: js.UndefOr[JobArn] = js.undefined
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
}
object AssociateTargetsWithJobResponse {
  
  @scala.inline
  def apply(): AssociateTargetsWithJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTargetsWithJobResponse]
  }
  
  @scala.inline
  implicit class AssociateTargetsWithJobResponseMutableBuilder[Self <: AssociateTargetsWithJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: JobDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setJobArn(value: JobArn): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobArnUndefined: Self = StObject.set(x, "jobArn", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
  }
}
