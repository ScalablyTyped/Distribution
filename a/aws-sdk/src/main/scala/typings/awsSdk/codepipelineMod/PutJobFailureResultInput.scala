package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutJobFailureResultInput extends StObject {
  
  /**
    * The details about the failure of a job.
    */
  var failureDetails: FailureDetails = js.native
  
  /**
    * The unique system-generated ID of the job that failed. This is the same ID returned from PollForJobs.
    */
  var jobId: JobId = js.native
}
object PutJobFailureResultInput {
  
  @scala.inline
  def apply(failureDetails: FailureDetails, jobId: JobId): PutJobFailureResultInput = {
    val __obj = js.Dynamic.literal(failureDetails = failureDetails.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutJobFailureResultInput]
  }
  
  @scala.inline
  implicit class PutJobFailureResultInputMutableBuilder[Self <: PutJobFailureResultInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureDetails(value: FailureDetails): Self = StObject.set(x, "failureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
