package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobResponse extends StObject {
  
  /**
    * The job description.
    */
  var description: js.UndefOr[JobDescription] = js.undefined
  
  /**
    * The job ARN.
    */
  var jobArn: js.UndefOr[JobArn] = js.undefined
  
  /**
    * The unique identifier you assigned to this job.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
}
object CreateJobResponse {
  
  @scala.inline
  def apply(): CreateJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobResponse]
  }
  
  @scala.inline
  implicit class CreateJobResponseMutableBuilder[Self <: CreateJobResponse] (val x: Self) extends AnyVal {
    
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
