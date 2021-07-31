package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobRequest extends StObject {
  
  /**
    * The 39-character job ID for the job that you want to cancel, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsSdk.snowballMod.JobId
}
object CancelJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): CancelJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRequest]
  }
  
  @scala.inline
  implicit class CancelJobRequestMutableBuilder[Self <: CancelJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
