package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobRequest extends StObject {
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId = js.native
}
object DescribeJobRequest {
  
  @scala.inline
  def apply(jobId: JobId): DescribeJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobRequest]
  }
  
  @scala.inline
  implicit class DescribeJobRequestMutableBuilder[Self <: DescribeJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
