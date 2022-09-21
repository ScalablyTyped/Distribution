package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpTransceiverInit extends StObject {
  
  var direction: js.UndefOr[RTCRtpTransceiverDirection] = js.undefined
  
  var sendEncodings: js.UndefOr[Array[RTCRtpEncodingParameters]] = js.undefined
  
  var streams: js.UndefOr[Array[MediaStream]] = js.undefined
}
object RTCRtpTransceiverInit {
  
  inline def apply(): RTCRtpTransceiverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpTransceiverInit]
  }
  
  extension [Self <: RTCRtpTransceiverInit](x: Self) {
    
    inline def setDirection(value: RTCRtpTransceiverDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setSendEncodings(value: Array[RTCRtpEncodingParameters]): Self = StObject.set(x, "sendEncodings", value.asInstanceOf[js.Any])
    
    inline def setSendEncodingsUndefined: Self = StObject.set(x, "sendEncodings", js.undefined)
    
    inline def setStreams(value: Array[MediaStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
  }
}
