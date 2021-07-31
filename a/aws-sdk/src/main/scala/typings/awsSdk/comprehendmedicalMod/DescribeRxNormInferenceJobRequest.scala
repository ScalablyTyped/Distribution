package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRxNormInferenceJobRequest extends StObject {
  
  /**
    * The identifier that Amazon Comprehend Medical generated for the job. The StartRxNormInferenceJob operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.comprehendmedicalMod.JobId
}
object DescribeRxNormInferenceJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): DescribeRxNormInferenceJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRxNormInferenceJobRequest]
  }
  
  @scala.inline
  implicit class DescribeRxNormInferenceJobRequestMutableBuilder[Self <: DescribeRxNormInferenceJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
