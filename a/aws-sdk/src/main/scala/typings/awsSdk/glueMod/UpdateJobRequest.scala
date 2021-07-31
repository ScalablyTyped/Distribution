package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobRequest extends StObject {
  
  /**
    * The name of the job definition to update.
    */
  var JobName: NameString
  
  /**
    * Specifies the values with which to update the job definition.
    */
  var JobUpdate: typings.awsSdk.glueMod.JobUpdate
}
object UpdateJobRequest {
  
  @scala.inline
  def apply(JobName: NameString, JobUpdate: JobUpdate): UpdateJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], JobUpdate = JobUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobRequest]
  }
  
  @scala.inline
  implicit class UpdateJobRequestMutableBuilder[Self <: UpdateJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUpdate(value: JobUpdate): Self = StObject.set(x, "JobUpdate", value.asInstanceOf[js.Any])
  }
}
