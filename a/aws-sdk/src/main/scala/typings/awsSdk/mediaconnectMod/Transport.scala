package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport extends js.Object {
  
  /**
    * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var CidrAllowList: js.UndefOr[listOfString] = js.native
  
  /**
    * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
    */
  var MaxBitrate: js.UndefOr[integer] = js.native
  
  /**
    * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[integer] = js.native
  
  /**
    * The protocol that is used by the source or output.
    */
  var Protocol: typings.awsSdk.mediaconnectMod.Protocol = js.native
  
  /**
    * The remote ID for the Zixi-pull stream.
    */
  var RemoteId: js.UndefOr[string] = js.native
  
  /**
    * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
    */
  var SmoothingLatency: js.UndefOr[integer] = js.native
  
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[string] = js.native
}
object Transport {
  
  @scala.inline
  def apply(Protocol: Protocol): Transport = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transport]
  }
  
  @scala.inline
  implicit class TransportOps[Self <: Transport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProtocol(value: Protocol): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrAllowListVarargs(value: string*): Self = this.set("CidrAllowList", js.Array(value :_*))
    
    @scala.inline
    def setCidrAllowList(value: listOfString): Self = this.set("CidrAllowList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrAllowList: Self = this.set("CidrAllowList", js.undefined)
    
    @scala.inline
    def setMaxBitrate(value: integer): Self = this.set("MaxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBitrate: Self = this.set("MaxBitrate", js.undefined)
    
    @scala.inline
    def setMaxLatency(value: integer): Self = this.set("MaxLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLatency: Self = this.set("MaxLatency", js.undefined)
    
    @scala.inline
    def setRemoteId(value: string): Self = this.set("RemoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteId: Self = this.set("RemoteId", js.undefined)
    
    @scala.inline
    def setSmoothingLatency(value: integer): Self = this.set("SmoothingLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmoothingLatency: Self = this.set("SmoothingLatency", js.undefined)
    
    @scala.inline
    def setStreamId(value: string): Self = this.set("StreamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamId: Self = this.set("StreamId", js.undefined)
  }
}
