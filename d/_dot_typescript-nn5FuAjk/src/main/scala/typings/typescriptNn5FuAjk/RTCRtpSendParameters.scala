package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpSendParameters
  extends StObject
     with RTCRtpParameters {
  
  var degradationPreference: js.UndefOr[RTCDegradationPreference] = js.undefined
  
  var encodings: Array[RTCRtpEncodingParameters]
  
  var transactionId: java.lang.String
}
object RTCRtpSendParameters {
  
  inline def apply(
    codecs: Array[RTCRtpCodecParameters],
    encodings: Array[RTCRtpEncodingParameters],
    headerExtensions: Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters,
    transactionId: java.lang.String
  ): RTCRtpSendParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any], rtcp = rtcp.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpSendParameters]
  }
  
  extension [Self <: RTCRtpSendParameters](x: Self) {
    
    inline def setDegradationPreference(value: RTCDegradationPreference): Self = StObject.set(x, "degradationPreference", value.asInstanceOf[js.Any])
    
    inline def setDegradationPreferenceUndefined: Self = StObject.set(x, "degradationPreference", js.undefined)
    
    inline def setEncodings(value: Array[RTCRtpEncodingParameters]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: java.lang.String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
  }
}
