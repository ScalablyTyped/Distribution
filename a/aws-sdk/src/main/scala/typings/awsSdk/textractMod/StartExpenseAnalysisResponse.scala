package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartExpenseAnalysisResponse extends StObject {
  
  /**
    * A unique identifier for the text detection job. The JobId is returned from StartExpenseAnalysis. A JobId value is only valid for 7 days.
    */
  var JobId: js.UndefOr[typings.awsSdk.textractMod.JobId] = js.undefined
}
object StartExpenseAnalysisResponse {
  
  inline def apply(): StartExpenseAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartExpenseAnalysisResponse]
  }
  
  extension [Self <: StartExpenseAnalysisResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
