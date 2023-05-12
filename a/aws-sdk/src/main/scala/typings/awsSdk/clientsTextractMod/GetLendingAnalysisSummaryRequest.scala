package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLendingAnalysisSummaryRequest extends StObject {
  
  /**
    *  A unique identifier for the lending or text-detection job. The JobId is returned from StartLendingAnalysis. A JobId value is only valid for 7 days.
    */
  var JobId: typings.awsSdk.clientsTextractMod.JobId
}
object GetLendingAnalysisSummaryRequest {
  
  inline def apply(JobId: JobId): GetLendingAnalysisSummaryRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLendingAnalysisSummaryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLendingAnalysisSummaryRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
