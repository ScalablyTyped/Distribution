package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStreamRequest extends StObject {
  
  /**
    * The stream ID.
    */
  var streamId: StreamId = js.native
}
object DescribeStreamRequest {
  
  @scala.inline
  def apply(streamId: StreamId): DescribeStreamRequest = {
    val __obj = js.Dynamic.literal(streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamRequest]
  }
  
  @scala.inline
  implicit class DescribeStreamRequestMutableBuilder[Self <: DescribeStreamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamId(value: StreamId): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
  }
}
