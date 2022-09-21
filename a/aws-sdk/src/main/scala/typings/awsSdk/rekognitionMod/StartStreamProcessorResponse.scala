package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartStreamProcessorResponse extends StObject {
  
  /**
    *  A unique identifier for the stream processing session. 
    */
  var SessionId: js.UndefOr[StartStreamProcessorSessionId] = js.undefined
}
object StartStreamProcessorResponse {
  
  inline def apply(): StartStreamProcessorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartStreamProcessorResponse]
  }
  
  extension [Self <: StartStreamProcessorResponse](x: Self) {
    
    inline def setSessionId(value: StartStreamProcessorSessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
  }
}
