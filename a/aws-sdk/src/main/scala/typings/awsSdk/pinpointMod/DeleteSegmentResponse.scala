package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSegmentResponse extends StObject {
  
  var SegmentResponse: typings.awsSdk.pinpointMod.SegmentResponse
}
object DeleteSegmentResponse {
  
  @scala.inline
  def apply(SegmentResponse: SegmentResponse): DeleteSegmentResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSegmentResponse]
  }
  
  @scala.inline
  implicit class DeleteSegmentResponseMutableBuilder[Self <: DeleteSegmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentResponse(value: SegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
  }
}
