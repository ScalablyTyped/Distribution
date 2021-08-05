package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentVersionResponse extends StObject {
  
  var SegmentResponse: typings.awsSdk.pinpointMod.SegmentResponse
}
object GetSegmentVersionResponse {
  
  inline def apply(SegmentResponse: SegmentResponse): GetSegmentVersionResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentVersionResponse]
  }
  
  extension [Self <: GetSegmentVersionResponse](x: Self) {
    
    inline def setSegmentResponse(value: SegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
  }
}
