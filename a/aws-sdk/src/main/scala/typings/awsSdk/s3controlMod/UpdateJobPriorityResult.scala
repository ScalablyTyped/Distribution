package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobPriorityResult extends StObject {
  
  /**
    * The ID for the job whose priority Amazon S3 updated.
    */
  var JobId: typings.awsSdk.s3controlMod.JobId = js.native
  
  /**
    * The new priority assigned to the specified job.
    */
  var Priority: JobPriority = js.native
}
object UpdateJobPriorityResult {
  
  @scala.inline
  def apply(JobId: JobId, Priority: JobPriority): UpdateJobPriorityResult = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobPriorityResult]
  }
  
  @scala.inline
  implicit class UpdateJobPriorityResultMutableBuilder[Self <: UpdateJobPriorityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: JobPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
  }
}
