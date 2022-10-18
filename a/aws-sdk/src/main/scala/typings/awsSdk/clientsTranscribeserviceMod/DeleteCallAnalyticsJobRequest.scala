package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCallAnalyticsJobRequest extends StObject {
  
  /**
    * The name of the Call Analytics job you want to delete. Job names are case sensitive.
    */
  var CallAnalyticsJobName: typings.awsSdk.clientsTranscribeserviceMod.CallAnalyticsJobName
}
object DeleteCallAnalyticsJobRequest {
  
  inline def apply(CallAnalyticsJobName: CallAnalyticsJobName): DeleteCallAnalyticsJobRequest = {
    val __obj = js.Dynamic.literal(CallAnalyticsJobName = CallAnalyticsJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCallAnalyticsJobRequest]
  }
  
  extension [Self <: DeleteCallAnalyticsJobRequest](x: Self) {
    
    inline def setCallAnalyticsJobName(value: CallAnalyticsJobName): Self = StObject.set(x, "CallAnalyticsJobName", value.asInstanceOf[js.Any])
  }
}
