package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSentimentDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the sentiment detection job to stop.
    */
  var JobId: typings.awsSdk.comprehendMod.JobId
}
object StopSentimentDetectionJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): StopSentimentDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSentimentDetectionJobRequest]
  }
  
  @scala.inline
  implicit class StopSentimentDetectionJobRequestMutableBuilder[Self <: StopSentimentDetectionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
