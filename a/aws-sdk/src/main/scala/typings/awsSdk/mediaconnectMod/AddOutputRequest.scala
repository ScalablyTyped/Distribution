package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOutputRequest extends js.Object {
  /**
    * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var CidrAllowList: js.UndefOr[listOfString] = js.native
  /**
    * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the end user.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The IP address from which video will be sent to output destinations.
    */
  var Destination: js.UndefOr[string] = js.native
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var Encryption: js.UndefOr[typings.awsSdk.mediaconnectMod.Encryption] = js.native
  /**
    * The maximum latency in milliseconds for Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[integer] = js.native
  /**
    * The name of the output. This value must be unique within the current flow.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The port to use when content is distributed to this output.
    */
  var Port: js.UndefOr[integer] = js.native
  /**
    * The protocol to use for the output.
    */
  var Protocol: typings.awsSdk.mediaconnectMod.Protocol = js.native
  /**
    * The remote ID for the Zixi-pull output stream.
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

object AddOutputRequest {
  @scala.inline
  def apply(
    Protocol: Protocol,
    CidrAllowList: listOfString = null,
    Description: string = null,
    Destination: string = null,
    Encryption: Encryption = null,
    MaxLatency: js.UndefOr[integer] = js.undefined,
    Name: string = null,
    Port: js.UndefOr[integer] = js.undefined,
    RemoteId: string = null,
    SmoothingLatency: js.UndefOr[integer] = js.undefined,
    StreamId: string = null,
    VpcInterfaceAttachment: VpcInterfaceAttachment = null
  ): AddOutputRequest = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any])
    if (CidrAllowList != null) __obj.updateDynamic("CidrAllowList")(CidrAllowList.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Destination != null) __obj.updateDynamic("Destination")(Destination.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxLatency)) __obj.updateDynamic("MaxLatency")(MaxLatency.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port.get.asInstanceOf[js.Any])
    if (RemoteId != null) __obj.updateDynamic("RemoteId")(RemoteId.asInstanceOf[js.Any])
    if (!js.isUndefined(SmoothingLatency)) __obj.updateDynamic("SmoothingLatency")(SmoothingLatency.get.asInstanceOf[js.Any])
    if (StreamId != null) __obj.updateDynamic("StreamId")(StreamId.asInstanceOf[js.Any])
    if (VpcInterfaceAttachment != null) __obj.updateDynamic("VpcInterfaceAttachment")(VpcInterfaceAttachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOutputRequest]
  }
}

