package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCTransportStats
  extends StObject
     with RTCStats {
  
  var bytesReceived: js.UndefOr[Double] = js.undefined
  
  var bytesSent: js.UndefOr[Double] = js.undefined
  
  var dtlsCipher: js.UndefOr[java.lang.String] = js.undefined
  
  var dtlsState: RTCDtlsTransportState
  
  var localCertificateId: js.UndefOr[java.lang.String] = js.undefined
  
  var remoteCertificateId: js.UndefOr[java.lang.String] = js.undefined
  
  var rtcpTransportStatsId: js.UndefOr[java.lang.String] = js.undefined
  
  var selectedCandidatePairId: js.UndefOr[java.lang.String] = js.undefined
  
  var srtpCipher: js.UndefOr[java.lang.String] = js.undefined
  
  var tlsVersion: js.UndefOr[java.lang.String] = js.undefined
}
object RTCTransportStats {
  
  inline def apply(
    dtlsState: RTCDtlsTransportState,
    id: java.lang.String,
    timestamp: DOMHighResTimeStamp,
    `type`: RTCStatsType
  ): RTCTransportStats = {
    val __obj = js.Dynamic.literal(dtlsState = dtlsState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTransportStats]
  }
  
  extension [Self <: RTCTransportStats](x: Self) {
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    inline def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    inline def setDtlsCipher(value: java.lang.String): Self = StObject.set(x, "dtlsCipher", value.asInstanceOf[js.Any])
    
    inline def setDtlsCipherUndefined: Self = StObject.set(x, "dtlsCipher", js.undefined)
    
    inline def setDtlsState(value: RTCDtlsTransportState): Self = StObject.set(x, "dtlsState", value.asInstanceOf[js.Any])
    
    inline def setLocalCertificateId(value: java.lang.String): Self = StObject.set(x, "localCertificateId", value.asInstanceOf[js.Any])
    
    inline def setLocalCertificateIdUndefined: Self = StObject.set(x, "localCertificateId", js.undefined)
    
    inline def setRemoteCertificateId(value: java.lang.String): Self = StObject.set(x, "remoteCertificateId", value.asInstanceOf[js.Any])
    
    inline def setRemoteCertificateIdUndefined: Self = StObject.set(x, "remoteCertificateId", js.undefined)
    
    inline def setRtcpTransportStatsId(value: java.lang.String): Self = StObject.set(x, "rtcpTransportStatsId", value.asInstanceOf[js.Any])
    
    inline def setRtcpTransportStatsIdUndefined: Self = StObject.set(x, "rtcpTransportStatsId", js.undefined)
    
    inline def setSelectedCandidatePairId(value: java.lang.String): Self = StObject.set(x, "selectedCandidatePairId", value.asInstanceOf[js.Any])
    
    inline def setSelectedCandidatePairIdUndefined: Self = StObject.set(x, "selectedCandidatePairId", js.undefined)
    
    inline def setSrtpCipher(value: java.lang.String): Self = StObject.set(x, "srtpCipher", value.asInstanceOf[js.Any])
    
    inline def setSrtpCipherUndefined: Self = StObject.set(x, "srtpCipher", js.undefined)
    
    inline def setTlsVersion(value: java.lang.String): Self = StObject.set(x, "tlsVersion", value.asInstanceOf[js.Any])
    
    inline def setTlsVersionUndefined: Self = StObject.set(x, "tlsVersion", js.undefined)
  }
}
