package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpCapabilities extends StObject {
  
  var codecs: Array[RTCRtpCodecCapability]
  
  var headerExtensions: Array[RTCRtpHeaderExtensionCapability]
}
object RTCRtpCapabilities {
  
  inline def apply(codecs: Array[RTCRtpCodecCapability], headerExtensions: Array[RTCRtpHeaderExtensionCapability]): RTCRtpCapabilities = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCapabilities]
  }
  
  extension [Self <: RTCRtpCapabilities](x: Self) {
    
    inline def setCodecs(value: Array[RTCRtpCodecCapability]): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    inline def setHeaderExtensions(value: Array[RTCRtpHeaderExtensionCapability]): Self = StObject.set(x, "headerExtensions", value.asInstanceOf[js.Any])
  }
}
