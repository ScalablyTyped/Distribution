package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowOutputRequest extends js.Object {
  /**
    * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var CidrAllowList: js.UndefOr[listOfString] = js.native
  /**
    * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the end user.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The IP address where you want to send the output.
    */
  var Destination: js.UndefOr[string] = js.native
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var Encryption: js.UndefOr[UpdateEncryption] = js.native
  /**
    * The flow that is associated with the output that you want to update.
    */
  var FlowArn: string = js.native
  /**
    * The maximum latency in milliseconds for Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[integer] = js.native
  /**
    * The ARN of the output that you want to update.
    */
  var OutputArn: string = js.native
  /**
    * The port to use when content is distributed to this output.
    */
  var Port: js.UndefOr[integer] = js.native
  /**
    * The protocol to use for the output.
    */
  var Protocol: js.UndefOr[typings.awsSdk.mediaconnectMod.Protocol] = js.native
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
  /**
    * The name of the VPC interface attachment to use for this output.
    */
  var VpcInterfaceAttachment: js.UndefOr[typings.awsSdk.mediaconnectMod.VpcInterfaceAttachment] = js.native
}

object UpdateFlowOutputRequest {
  @scala.inline
  def apply(
    FlowArn: string,
    OutputArn: string,
    CidrAllowList: listOfString = null,
    Description: string = null,
    Destination: string = null,
    Encryption: UpdateEncryption = null,
    MaxLatency: js.UndefOr[integer] = js.undefined,
    Port: js.UndefOr[integer] = js.undefined,
    Protocol: Protocol = null,
    RemoteId: string = null,
    SmoothingLatency: js.UndefOr[integer] = js.undefined,
    StreamId: string = null,
    VpcInterfaceAttachment: VpcInterfaceAttachment = null
  ): UpdateFlowOutputRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], OutputArn = OutputArn.asInstanceOf[js.Any])
    if (CidrAllowList != null) __obj.updateDynamic("CidrAllowList")(CidrAllowList.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Destination != null) __obj.updateDynamic("Destination")(Destination.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxLatency)) __obj.updateDynamic("MaxLatency")(MaxLatency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port.get.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (RemoteId != null) __obj.updateDynamic("RemoteId")(RemoteId.asInstanceOf[js.Any])
    if (!js.isUndefined(SmoothingLatency)) __obj.updateDynamic("SmoothingLatency")(SmoothingLatency.get.asInstanceOf[js.Any])
    if (StreamId != null) __obj.updateDynamic("StreamId")(StreamId.asInstanceOf[js.Any])
    if (VpcInterfaceAttachment != null) __obj.updateDynamic("VpcInterfaceAttachment")(VpcInterfaceAttachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowOutputRequest]
  }
}

