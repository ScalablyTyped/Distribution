package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamRequest extends StObject {
  
  /**
    * The stream ID.
    */
  var streamId: StreamId
}
object DescribeStreamRequest {
  
  inline def apply(streamId: StreamId): DescribeStreamRequest = {
    val __obj = js.Dynamic.literal(streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamRequest]
  }
  
  extension [Self <: DescribeStreamRequest](x: Self) {
    
    inline def setStreamId(value: StreamId): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
  }
}
