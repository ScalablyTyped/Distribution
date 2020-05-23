package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowSourceRequest extends js.Object {
  /**
    * The type of encryption used on the content ingested from this source.
    */
  var Decryption: js.UndefOr[UpdateEncryption] = js.native
  /**
    * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow originator, and the ARN is generated as part of the originator's flow.
    */
  var EntitlementArn: js.UndefOr[string] = js.native
  /**
    * The flow that is associated with the source that you want to update.
    */
  var FlowArn: string = js.native
  /**
    * The port that the flow will be listening on for incoming content.
    */
  var IngestPort: js.UndefOr[integer] = js.native
  /**
    * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
    */
  var MaxBitrate: js.UndefOr[integer] = js.native
  /**
    * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[integer] = js.native
  /**
    * The protocol that is used by the source.
    */
  var Protocol: js.UndefOr[typings.awsSdk.mediaconnectMod.Protocol] = js.native
  /**
    * The ARN of the source that you want to update.
    */
  var SourceArn: string = js.native
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[string] = js.native
  /**
    * The name of the VPC Interface to configure this Source with.
    */
  var VpcInterfaceName: js.UndefOr[string] = js.native
  /**
    * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var WhitelistCidr: js.UndefOr[string] = js.native
}

object UpdateFlowSourceRequest {
  @scala.inline
  def apply(
    FlowArn: string,
    SourceArn: string,
    Decryption: UpdateEncryption = null,
    Description: string = null,
    EntitlementArn: string = null,
    IngestPort: js.UndefOr[integer] = js.undefined,
    MaxBitrate: js.UndefOr[integer] = js.undefined,
    MaxLatency: js.UndefOr[integer] = js.undefined,
    Protocol: Protocol = null,
    StreamId: string = null,
    VpcInterfaceName: string = null,
    WhitelistCidr: string = null
  ): UpdateFlowSourceRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    if (Decryption != null) __obj.updateDynamic("Decryption")(Decryption.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EntitlementArn != null) __obj.updateDynamic("EntitlementArn")(EntitlementArn.asInstanceOf[js.Any])
    if (!js.isUndefined(IngestPort)) __obj.updateDynamic("IngestPort")(IngestPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxBitrate)) __obj.updateDynamic("MaxBitrate")(MaxBitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxLatency)) __obj.updateDynamic("MaxLatency")(MaxLatency.get.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (StreamId != null) __obj.updateDynamic("StreamId")(StreamId.asInstanceOf[js.Any])
    if (VpcInterfaceName != null) __obj.updateDynamic("VpcInterfaceName")(VpcInterfaceName.asInstanceOf[js.Any])
    if (WhitelistCidr != null) __obj.updateDynamic("WhitelistCidr")(WhitelistCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowSourceRequest]
  }
}

