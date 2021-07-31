package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRxNormInferenceJobResponse extends StObject {
  
  /**
    * The identifier generated for the job. To get the status of job, use this identifier with the DescribeRxNormInferenceJob operation.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendmedicalMod.JobId] = js.undefined
}
object StopRxNormInferenceJobResponse {
  
  @scala.inline
  def apply(): StopRxNormInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRxNormInferenceJobResponse]
  }
  
  @scala.inline
  implicit class StopRxNormInferenceJobResponseMutableBuilder[Self <: StopRxNormInferenceJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
