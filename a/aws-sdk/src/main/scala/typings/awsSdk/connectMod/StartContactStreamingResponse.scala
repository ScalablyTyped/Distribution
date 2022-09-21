package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartContactStreamingResponse extends StObject {
  
  /**
    * The identifier of the streaming configuration enabled. 
    */
  var StreamingId: typings.awsSdk.connectMod.StreamingId
}
object StartContactStreamingResponse {
  
  inline def apply(StreamingId: StreamingId): StartContactStreamingResponse = {
    val __obj = js.Dynamic.literal(StreamingId = StreamingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartContactStreamingResponse]
  }
  
  extension [Self <: StartContactStreamingResponse](x: Self) {
    
    inline def setStreamingId(value: StreamingId): Self = StObject.set(x, "StreamingId", value.asInstanceOf[js.Any])
  }
}
