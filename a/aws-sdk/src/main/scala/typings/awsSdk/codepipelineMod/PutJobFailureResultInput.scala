package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutJobFailureResultInput extends StObject {
  
  /**
    * The details about the failure of a job.
    */
  var failureDetails: FailureDetails
  
  /**
    * The unique system-generated ID of the job that failed. This is the same ID returned from PollForJobs.
    */
  var jobId: JobId
}
object PutJobFailureResultInput {
  
  inline def apply(failureDetails: FailureDetails, jobId: JobId): PutJobFailureResultInput = {
    val __obj = js.Dynamic.literal(failureDetails = failureDetails.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutJobFailureResultInput]
  }
  
  extension [Self <: PutJobFailureResultInput](x: Self) {
    
    inline def setFailureDetails(value: FailureDetails): Self = StObject.set(x, "failureDetails", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
