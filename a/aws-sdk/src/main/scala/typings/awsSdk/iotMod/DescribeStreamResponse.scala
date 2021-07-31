package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamResponse extends StObject {
  
  /**
    * Information about the stream.
    */
  var streamInfo: js.UndefOr[StreamInfo] = js.undefined
}
object DescribeStreamResponse {
  
  @scala.inline
  def apply(): DescribeStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamResponse]
  }
  
  @scala.inline
  implicit class DescribeStreamResponseMutableBuilder[Self <: DescribeStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamInfo(value: StreamInfo): Self = StObject.set(x, "streamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamInfoUndefined: Self = StObject.set(x, "streamInfo", js.undefined)
  }
}
