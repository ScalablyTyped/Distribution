package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpParameters extends StObject {
  
  var codecs: Array[RTCRtpCodecParameters]
  
  var headerExtensions: Array[RTCRtpHeaderExtensionParameters]
  
  var rtcp: RTCRtcpParameters
}
object RTCRtpParameters {
  
  inline def apply(
    codecs: Array[RTCRtpCodecParameters],
    headerExtensions: Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters
  ): RTCRtpParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any], rtcp = rtcp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpParameters]
  }
  
  extension [Self <: RTCRtpParameters](x: Self) {
    
    inline def setCodecs(value: Array[RTCRtpCodecParameters]): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    inline def setHeaderExtensions(value: Array[RTCRtpHeaderExtensionParameters]): Self = StObject.set(x, "headerExtensions", value.asInstanceOf[js.Any])
    
    inline def setRtcp(value: RTCRtcpParameters): Self = StObject.set(x, "rtcp", value.asInstanceOf[js.Any])
  }
}
