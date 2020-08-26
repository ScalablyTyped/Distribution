package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.native
  /**
    * A description of the output.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The address where you want to send the output.
    */
  var Destination: js.UndefOr[string] = js.native
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var Encryption: js.UndefOr[typings.awsSdk.mediaconnectMod.Encryption] = js.native
  /**
    * The ARN of the entitlement on the originator''s flow. This value is relevant only on entitled flows.
    */
  var EntitlementArn: js.UndefOr[string] = js.native
  /**
    * The input ARN of the AWS Elemental MediaLive channel. This parameter is relevant only for outputs that were added by creating a MediaLive input.
    */
  var MediaLiveInputArn: js.UndefOr[string] = js.native
  /**
    * The name of the output. This value must be unique within the current flow.
    */
  var Name: string = js.native
  /**
    * The ARN of the output.
    */
  var OutputArn: string = js.native
  /**
    * The port to use when content is distributed to this output.
    */
  var Port: js.UndefOr[integer] = js.native
  /**
    * Attributes related to the transport stream that are used in the output.
    */
  var Transport: js.UndefOr[typings.awsSdk.mediaconnectMod.Transport] = js.native
  /**
    * The name of the VPC interface attachment to use for this output.
    */
  var VpcInterfaceAttachment: js.UndefOr[typings.awsSdk.mediaconnectMod.VpcInterfaceAttachment] = js.native
}

object Output {
  @scala.inline
  def apply(Name: string, OutputArn: string): Output = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OutputArn = OutputArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
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
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputArn(value: string): Self = this.set("OutputArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataTransferSubscriberFeePercent(value: integer): Self = this.set("DataTransferSubscriberFeePercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTransferSubscriberFeePercent: Self = this.set("DataTransferSubscriberFeePercent", js.undefined)
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
    def setEntitlementArn(value: string): Self = this.set("EntitlementArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlementArn: Self = this.set("EntitlementArn", js.undefined)
    @scala.inline
    def setMediaLiveInputArn(value: string): Self = this.set("MediaLiveInputArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaLiveInputArn: Self = this.set("MediaLiveInputArn", js.undefined)
    @scala.inline
    def setPort(value: integer): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setTransport(value: Transport): Self = this.set("Transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("Transport", js.undefined)
    @scala.inline
    def setVpcInterfaceAttachment(value: VpcInterfaceAttachment): Self = this.set("VpcInterfaceAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcInterfaceAttachment: Self = this.set("VpcInterfaceAttachment", js.undefined)
  }
  
}

