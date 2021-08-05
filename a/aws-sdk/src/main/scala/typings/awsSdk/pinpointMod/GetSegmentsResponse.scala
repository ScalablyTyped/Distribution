package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentsResponse extends StObject {
  
  var SegmentsResponse: typings.awsSdk.pinpointMod.SegmentsResponse
}
object GetSegmentsResponse {
  
  inline def apply(SegmentsResponse: SegmentsResponse): GetSegmentsResponse = {
    val __obj = js.Dynamic.literal(SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentsResponse]
  }
  
  extension [Self <: GetSegmentsResponse](x: Self) {
    
    inline def setSegmentsResponse(value: SegmentsResponse): Self = StObject.set(x, "SegmentsResponse", value.asInstanceOf[js.Any])
  }
}
