package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCallAnalyticsJobResponse extends StObject {
  
  /**
    * Provides detailed information about the specified Call Analytics job, including job status and, if applicable, failure reason.
    */
  var CallAnalyticsJob: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.CallAnalyticsJob] = js.undefined
}
object GetCallAnalyticsJobResponse {
  
  inline def apply(): GetCallAnalyticsJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCallAnalyticsJobResponse]
  }
  
  extension [Self <: GetCallAnalyticsJobResponse](x: Self) {
    
    inline def setCallAnalyticsJob(value: CallAnalyticsJob): Self = StObject.set(x, "CallAnalyticsJob", value.asInstanceOf[js.Any])
    
    inline def setCallAnalyticsJobUndefined: Self = StObject.set(x, "CallAnalyticsJob", js.undefined)
  }
}
