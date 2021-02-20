package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSegmentResponse extends StObject {
  
  var SegmentResponse: typings.awsSdk.pinpointMod.SegmentResponse = js.native
}
object GetSegmentResponse {
  
  @scala.inline
  def apply(SegmentResponse: SegmentResponse): GetSegmentResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentResponse]
  }
  
  @scala.inline
  implicit class GetSegmentResponseMutableBuilder[Self <: GetSegmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentResponse(value: SegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
  }
}
