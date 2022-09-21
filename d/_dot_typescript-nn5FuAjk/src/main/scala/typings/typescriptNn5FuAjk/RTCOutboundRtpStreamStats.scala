package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCOutboundRtpStreamStats
  extends StObject
     with RTCSentRtpStreamStats {
  
  var firCount: js.UndefOr[Double] = js.undefined
  
  var framesEncoded: js.UndefOr[Double] = js.undefined
  
  var nackCount: js.UndefOr[Double] = js.undefined
  
  var pliCount: js.UndefOr[Double] = js.undefined
  
  var qpSum: js.UndefOr[Double] = js.undefined
  
  var remoteId: js.UndefOr[java.lang.String] = js.undefined
}
object RTCOutboundRtpStreamStats {
  
  inline def apply(
    id: java.lang.String,
    kind: java.lang.String,
    ssrc: Double,
    timestamp: DOMHighResTimeStamp,
    `type`: RTCStatsType
  ): RTCOutboundRtpStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOutboundRtpStreamStats]
  }
  
  extension [Self <: RTCOutboundRtpStreamStats](x: Self) {
    
    inline def setFirCount(value: Double): Self = StObject.set(x, "firCount", value.asInstanceOf[js.Any])
    
    inline def setFirCountUndefined: Self = StObject.set(x, "firCount", js.undefined)
    
    inline def setFramesEncoded(value: Double): Self = StObject.set(x, "framesEncoded", value.asInstanceOf[js.Any])
    
    inline def setFramesEncodedUndefined: Self = StObject.set(x, "framesEncoded", js.undefined)
    
    inline def setNackCount(value: Double): Self = StObject.set(x, "nackCount", value.asInstanceOf[js.Any])
    
    inline def setNackCountUndefined: Self = StObject.set(x, "nackCount", js.undefined)
    
    inline def setPliCount(value: Double): Self = StObject.set(x, "pliCount", value.asInstanceOf[js.Any])
    
    inline def setPliCountUndefined: Self = StObject.set(x, "pliCount", js.undefined)
    
    inline def setQpSum(value: Double): Self = StObject.set(x, "qpSum", value.asInstanceOf[js.Any])
    
    inline def setQpSumUndefined: Self = StObject.set(x, "qpSum", js.undefined)
    
    inline def setRemoteId(value: java.lang.String): Self = StObject.set(x, "remoteId", value.asInstanceOf[js.Any])
    
    inline def setRemoteIdUndefined: Self = StObject.set(x, "remoteId", js.undefined)
  }
}
