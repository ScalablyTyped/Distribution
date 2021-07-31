package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobRequest extends StObject {
  
  /**
    * The unique identifier for a job.
    */
  var JobId: string
}
object GetJobRequest {
  
  @scala.inline
  def apply(JobId: string): GetJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRequest]
  }
  
  @scala.inline
  implicit class GetJobRequestMutableBuilder[Self <: GetJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: string): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
