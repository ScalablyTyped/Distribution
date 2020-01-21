package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSourceRequest extends js.Object {
  /**
    * The type of encryption that is used on the content ingested from this source.
    */
  var Decryption: js.UndefOr[Encryption] = js.native
  /**
    * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow originator, and the ARN is generated as part of the originator's flow.
    */
  var EntitlementArn: js.UndefOr[string] = js.native
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
    * The name of the source.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The protocol that is used by the source.
    */
  var Protocol: js.UndefOr[typings.awsSdk.mediaconnectMod.Protocol] = js.native
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[string] = js.native
  /**
    * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var WhitelistCidr: js.UndefOr[string] = js.native
}

object SetSourceRequest {
  @scala.inline
  def apply(
    Decryption: Encryption = null,
    Description: string = null,
    EntitlementArn: string = null,
    IngestPort: Int | Double = null,
    MaxBitrate: Int | Double = null,
    MaxLatency: Int | Double = null,
    Name: string = null,
    Protocol: Protocol = null,
    StreamId: string = null,
    WhitelistCidr: string = null
  ): SetSourceRequest = {
    val __obj = js.Dynamic.literal()
    if (Decryption != null) __obj.updateDynamic("Decryption")(Decryption.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EntitlementArn != null) __obj.updateDynamic("EntitlementArn")(EntitlementArn.asInstanceOf[js.Any])
    if (IngestPort != null) __obj.updateDynamic("IngestPort")(IngestPort.asInstanceOf[js.Any])
    if (MaxBitrate != null) __obj.updateDynamic("MaxBitrate")(MaxBitrate.asInstanceOf[js.Any])
    if (MaxLatency != null) __obj.updateDynamic("MaxLatency")(MaxLatency.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (StreamId != null) __obj.updateDynamic("StreamId")(StreamId.asInstanceOf[js.Any])
    if (WhitelistCidr != null) __obj.updateDynamic("WhitelistCidr")(WhitelistCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSourceRequest]
  }
}

