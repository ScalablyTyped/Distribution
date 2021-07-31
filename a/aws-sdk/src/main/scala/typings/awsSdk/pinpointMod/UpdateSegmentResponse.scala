package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSegmentResponse extends StObject {
  
  var SegmentResponse: typings.awsSdk.pinpointMod.SegmentResponse
}
object UpdateSegmentResponse {
  
  @scala.inline
  def apply(SegmentResponse: SegmentResponse): UpdateSegmentResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSegmentResponse]
  }
  
  @scala.inline
  implicit class UpdateSegmentResponseMutableBuilder[Self <: UpdateSegmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentResponse(value: SegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
  }
}
