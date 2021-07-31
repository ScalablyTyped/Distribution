package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePHIDetectionJobRequest extends StObject {
  
  /**
    * The identifier that Amazon Comprehend Medical generated for the job. The StartPHIDetectionJob operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.comprehendmedicalMod.JobId
}
object DescribePHIDetectionJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): DescribePHIDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePHIDetectionJobRequest]
  }
  
  @scala.inline
  implicit class DescribePHIDetectionJobRequestMutableBuilder[Self <: DescribePHIDetectionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
