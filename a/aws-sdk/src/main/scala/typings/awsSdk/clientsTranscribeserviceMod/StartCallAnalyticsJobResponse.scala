package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCallAnalyticsJobResponse extends StObject {
  
  /**
    * Provides detailed information about the current Call Analytics job, including job status and, if applicable, failure reason.
    */
  var CallAnalyticsJob: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.CallAnalyticsJob] = js.undefined
}
object StartCallAnalyticsJobResponse {
  
  inline def apply(): StartCallAnalyticsJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartCallAnalyticsJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartCallAnalyticsJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCallAnalyticsJob(value: CallAnalyticsJob): Self = StObject.set(x, "CallAnalyticsJob", value.asInstanceOf[js.Any])
    
    inline def setCallAnalyticsJobUndefined: Self = StObject.set(x, "CallAnalyticsJob", js.undefined)
  }
}
