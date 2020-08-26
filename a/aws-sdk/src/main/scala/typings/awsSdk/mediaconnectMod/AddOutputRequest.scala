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
  def apply(Protocol: Protocol): AddOutputRequest = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOutputRequest]
  }
  @scala.inline
  implicit class AddOutputRequestOps[Self <: AddOutputRequest] (val x: Self) extends AnyVal {
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
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDestination(value: string): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("Destination", js.undefined)
    @scala.inline
    def setEncryption(value: Encryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    @scala.inline
    def setMaxLatency(value: integer): Self = this.set("MaxLatency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLatency: Self = this.set("MaxLatency", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setPort(value: integer): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
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
    @scala.inline
    def setVpcInterfaceAttachment(value: VpcInterfaceAttachment): Self = this.set("VpcInterfaceAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcInterfaceAttachment: Self = this.set("VpcInterfaceAttachment", js.undefined)
  }
  
}

