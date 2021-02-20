package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelJobRequest extends StObject {
  
  /**
    * The unique identifier for a job.
    */
  var JobId: string = js.native
}
object CancelJobRequest {
  
  @scala.inline
  def apply(JobId: string): CancelJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRequest]
  }
  
  @scala.inline
  implicit class CancelJobRequestMutableBuilder[Self <: CancelJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: string): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
