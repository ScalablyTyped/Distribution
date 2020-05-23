package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    Protocol: Protocol,
    CidrAllowList: listOfString = null,
    MaxBitrate: js.UndefOr[integer] = js.undefined,
    MaxLatency: js.UndefOr[integer] = js.undefined,
    RemoteId: string = null,
    SmoothingLatency: js.UndefOr[integer] = js.undefined,
    StreamId: string = null
  ): Transport = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any])
    if (CidrAllowList != null) __obj.updateDynamic("CidrAllowList")(CidrAllowList.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxBitrate)) __obj.updateDynamic("MaxBitrate")(MaxBitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxLatency)) __obj.updateDynamic("MaxLatency")(MaxLatency.get.asInstanceOf[js.Any])
    if (RemoteId != null) __obj.updateDynamic("RemoteId")(RemoteId.asInstanceOf[js.Any])
    if (!js.isUndefined(SmoothingLatency)) __obj.updateDynamic("SmoothingLatency")(SmoothingLatency.get.asInstanceOf[js.Any])
    if (StreamId != null) __obj.updateDynamic("StreamId")(StreamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transport]
  }
}

