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
  def apply(
    Name: string,
    SourceArn: string,
    DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.undefined,
    Decryption: Encryption = null,
    Description: string = null,
    EntitlementArn: string = null,
    IngestIp: string = null,
    IngestPort: js.UndefOr[integer] = js.undefined,
    Transport: Transport = null,
    VpcInterfaceName: string = null,
    WhitelistCidr: string = null
  ): Source = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    if (!js.isUndefined(DataTransferSubscriberFeePercent)) __obj.updateDynamic("DataTransferSubscriberFeePercent")(DataTransferSubscriberFeePercent.get.asInstanceOf[js.Any])
    if (Decryption != null) __obj.updateDynamic("Decryption")(Decryption.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EntitlementArn != null) __obj.updateDynamic("EntitlementArn")(EntitlementArn.asInstanceOf[js.Any])
    if (IngestIp != null) __obj.updateDynamic("IngestIp")(IngestIp.asInstanceOf[js.Any])
    if (!js.isUndefined(IngestPort)) __obj.updateDynamic("IngestPort")(IngestPort.get.asInstanceOf[js.Any])
    if (Transport != null) __obj.updateDynamic("Transport")(Transport.asInstanceOf[js.Any])
    if (VpcInterfaceName != null) __obj.updateDynamic("VpcInterfaceName")(VpcInterfaceName.asInstanceOf[js.Any])
    if (WhitelistCidr != null) __obj.updateDynamic("WhitelistCidr")(WhitelistCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

