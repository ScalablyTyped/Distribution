package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.native
  /**
    * The type of encryption that is used on the content ingested from this source.
    */
  var Decryption: js.UndefOr[Encryption] = js.native
  /**
    * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator's flow.
    */
  var EntitlementArn: js.UndefOr[string] = js.native
  /**
    * The IP address that the flow will be listening on for incoming content.
    */
  var IngestIp: js.UndefOr[string] = js.native
  /**
    * The port that the flow will be listening on for incoming content.
    */
  var IngestPort: js.UndefOr[integer] = js.native
  /**
    * The name of the source.
    */
  var Name: string = js.native
  /**
    * The ARN of the source.
    */
  var SourceArn: string = js.native
  /**
    * Attributes related to the transport stream that are used in the source.
    */
  var Transport: js.UndefOr[typings.awsSdk.mediaconnectMod.Transport] = js.native
  /**
    * The name of the VPC Interface this Source is configured with.
    */
  var VpcInterfaceName: js.UndefOr[string] = js.native
  /**
    * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var WhitelistCidr: js.UndefOr[string] = js.native
}

object Source {
  @scala.inline
  def apply(Name: string, SourceArn: string): Source = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
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
    def setSourceArn(value: string): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataTransferSubscriberFeePercent(value: integer): Self = this.set("DataTransferSubscriberFeePercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTransferSubscriberFeePercent: Self = this.set("DataTransferSubscriberFeePercent", js.undefined)
    @scala.inline
    def setDecryption(value: Encryption): Self = this.set("Decryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecryption: Self = this.set("Decryption", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEntitlementArn(value: string): Self = this.set("EntitlementArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlementArn: Self = this.set("EntitlementArn", js.undefined)
    @scala.inline
    def setIngestIp(value: string): Self = this.set("IngestIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngestIp: Self = this.set("IngestIp", js.undefined)
    @scala.inline
    def setIngestPort(value: integer): Self = this.set("IngestPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngestPort: Self = this.set("IngestPort", js.undefined)
    @scala.inline
    def setTransport(value: Transport): Self = this.set("Transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("Transport", js.undefined)
    @scala.inline
    def setVpcInterfaceName(value: string): Self = this.set("VpcInterfaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcInterfaceName: Self = this.set("VpcInterfaceName", js.undefined)
    @scala.inline
    def setWhitelistCidr(value: string): Self = this.set("WhitelistCidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitelistCidr: Self = this.set("WhitelistCidr", js.undefined)
  }
  
}

