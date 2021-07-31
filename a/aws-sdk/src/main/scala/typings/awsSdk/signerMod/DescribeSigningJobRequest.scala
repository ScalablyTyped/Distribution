package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSigningJobRequest extends StObject {
  
  /**
    * The ID of the signing job on input.
    */
  var jobId: JobId
}
object DescribeSigningJobRequest {
  
  @scala.inline
  def apply(jobId: JobId): DescribeSigningJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSigningJobRequest]
  }
  
  @scala.inline
  implicit class DescribeSigningJobRequestMutableBuilder[Self <: DescribeSigningJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
