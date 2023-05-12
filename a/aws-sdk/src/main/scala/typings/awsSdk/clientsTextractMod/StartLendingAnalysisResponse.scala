package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartLendingAnalysisResponse extends StObject {
  
  /**
    * A unique identifier for the lending or text-detection job. The JobId is returned from StartLendingAnalysis. A JobId value is only valid for 7 days.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsTextractMod.JobId] = js.undefined
}
object StartLendingAnalysisResponse {
  
  inline def apply(): StartLendingAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartLendingAnalysisResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartLendingAnalysisResponse] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
