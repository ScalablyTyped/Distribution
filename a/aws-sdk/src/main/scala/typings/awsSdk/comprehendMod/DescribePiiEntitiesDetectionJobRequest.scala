package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePiiEntitiesDetectionJobRequest extends StObject {
  
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.comprehendMod.JobId
}
object DescribePiiEntitiesDetectionJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): DescribePiiEntitiesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePiiEntitiesDetectionJobRequest]
  }
  
  @scala.inline
  implicit class DescribePiiEntitiesDetectionJobRequestMutableBuilder[Self <: DescribePiiEntitiesDetectionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
