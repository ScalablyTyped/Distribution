package typings.typescriptNn5FuAjk

import typings.std.RTCRtpReceiveParameters
import typings.std.RTCRtpSynchronizationSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebRTC API interface manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection. */
trait RTCRtpReceiver extends StObject {
  
  def getContributingSources(): Array[RTCRtpContributingSource]
  
  def getParameters(): RTCRtpReceiveParameters
  
  def getStats(): Promise[RTCStatsReport]
  
  def getSynchronizationSources(): Array[RTCRtpSynchronizationSource]
  
  val track: MediaStreamTrack
  
  val transport: RTCDtlsTransport | Null
}
object RTCRtpReceiver {
  
  inline def apply(
    getContributingSources: () => Array[RTCRtpContributingSource],
    getParameters: () => RTCRtpReceiveParameters,
    getStats: () => Promise[RTCStatsReport],
    getSynchronizationSources: () => Array[RTCRtpSynchronizationSource],
    track: MediaStreamTrack
  ): RTCRtpReceiver = {
    val __obj = js.Dynamic.literal(getContributingSources = js.Any.fromFunction0(getContributingSources), getParameters = js.Any.fromFunction0(getParameters), getStats = js.Any.fromFunction0(getStats), getSynchronizationSources = js.Any.fromFunction0(getSynchronizationSources), track = track.asInstanceOf[js.Any], transport = null)
    __obj.asInstanceOf[RTCRtpReceiver]
  }
  
  extension [Self <: RTCRtpReceiver](x: Self) {
    
    inline def setGetContributingSources(value: () => Array[RTCRtpContributingSource]): Self = StObject.set(x, "getContributingSources", js.Any.fromFunction0(value))
    
    inline def setGetParameters(value: () => RTCRtpReceiveParameters): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    inline def setGetStats(value: () => Promise[RTCStatsReport]): Self = StObject.set(x, "getStats", js.Any.fromFunction0(value))
    
    inline def setGetSynchronizationSources(value: () => Array[RTCRtpSynchronizationSource]): Self = StObject.set(x, "getSynchronizationSources", js.Any.fromFunction0(value))
    
    inline def setTrack(value: MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTransport(value: RTCDtlsTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportNull: Self = StObject.set(x, "transport", null)
  }
}
