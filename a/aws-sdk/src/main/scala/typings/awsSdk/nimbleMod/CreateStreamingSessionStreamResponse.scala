package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamingSessionStreamResponse extends StObject {
  
  /**
    * The stream.
    */
  var stream: js.UndefOr[StreamingSessionStream] = js.undefined
}
object CreateStreamingSessionStreamResponse {
  
  inline def apply(): CreateStreamingSessionStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamingSessionStreamResponse]
  }
  
  extension [Self <: CreateStreamingSessionStreamResponse](x: Self) {
    
    inline def setStream(value: StreamingSessionStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
