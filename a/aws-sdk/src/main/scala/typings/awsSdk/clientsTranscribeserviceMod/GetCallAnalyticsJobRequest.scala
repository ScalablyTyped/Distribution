package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCallAnalyticsJobRequest extends StObject {
  
  /**
    * The name of the Call Analytics job you want information about. Job names are case sensitive.
    */
  var CallAnalyticsJobName: typings.awsSdk.clientsTranscribeserviceMod.CallAnalyticsJobName
}
object GetCallAnalyticsJobRequest {
  
  inline def apply(CallAnalyticsJobName: CallAnalyticsJobName): GetCallAnalyticsJobRequest = {
    val __obj = js.Dynamic.literal(CallAnalyticsJobName = CallAnalyticsJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCallAnalyticsJobRequest]
  }
  
  extension [Self <: GetCallAnalyticsJobRequest](x: Self) {
    
    inline def setCallAnalyticsJobName(value: CallAnalyticsJobName): Self = StObject.set(x, "CallAnalyticsJobName", value.asInstanceOf[js.Any])
  }
}
