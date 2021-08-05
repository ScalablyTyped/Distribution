package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transport extends StObject {
  
  /**
    * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var CidrAllowList: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
    */
  var MaxBitrate: js.UndefOr[integer] = js.undefined
  
  /**
    * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[integer] = js.undefined
  
  /**
    * The protocol that is used by the source or output.
    */
  var Protocol: typings.awsSdk.mediaconnectMod.Protocol
  
  /**
    * The remote ID for the Zixi-pull stream.
    */
  var RemoteId: js.UndefOr[string] = js.undefined
  
  /**
    * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
    */
  var SmoothingLatency: js.UndefOr[integer] = js.undefined
  
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[string] = js.undefined
}
object Transport {
  
  inline def apply(Protocol: Protocol): Transport = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transport]
  }
  
  extension [Self <: Transport](x: Self) {
    
    inline def setCidrAllowList(value: listOfString): Self = StObject.set(x, "CidrAllowList", value.asInstanceOf[js.Any])
    
    inline def setCidrAllowListUndefined: Self = StObject.set(x, "CidrAllowList", js.undefined)
    
    inline def setCidrAllowListVarargs(value: string*): Self = StObject.set(x, "CidrAllowList", js.Array(value :_*))
    
    inline def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    inline def setMaxLatency(value: integer): Self = StObject.set(x, "MaxLatency", value.asInstanceOf[js.Any])
    
    inline def setMaxLatencyUndefined: Self = StObject.set(x, "MaxLatency", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setRemoteId(value: string): Self = StObject.set(x, "RemoteId", value.asInstanceOf[js.Any])
    
    inline def setRemoteIdUndefined: Self = StObject.set(x, "RemoteId", js.undefined)
    
    inline def setSmoothingLatency(value: integer): Self = StObject.set(x, "SmoothingLatency", value.asInstanceOf[js.Any])
    
    inline def setSmoothingLatencyUndefined: Self = StObject.set(x, "SmoothingLatency", js.undefined)
    
    inline def setStreamId(value: string): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
  }
}
