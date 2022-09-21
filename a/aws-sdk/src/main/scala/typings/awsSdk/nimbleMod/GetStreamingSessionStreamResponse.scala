package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamingSessionStreamResponse extends StObject {
  
  /**
    * The stream.
    */
  var stream: js.UndefOr[StreamingSessionStream] = js.undefined
}
object GetStreamingSessionStreamResponse {
  
  inline def apply(): GetStreamingSessionStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamingSessionStreamResponse]
  }
  
  extension [Self <: GetStreamingSessionStreamResponse](x: Self) {
    
    inline def setStream(value: StreamingSessionStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
