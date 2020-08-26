package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayRequestOptions extends js.Object {
  /**
    * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs. The default is 64512.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.native
  /**
    * Enable or disable automatic acceptance of attachment requests. Disabled by default.
    */
  var AutoAcceptSharedAttachments: js.UndefOr[AutoAcceptSharedAttachmentsValue] = js.native
  /**
    * Enable or disable automatic association with the default association route table. Enabled by default.
    */
  var DefaultRouteTableAssociation: js.UndefOr[DefaultRouteTableAssociationValue] = js.native
  /**
    * Enable or disable automatic propagation of routes to the default propagation route table. Enabled by default.
    */
  var DefaultRouteTablePropagation: js.UndefOr[DefaultRouteTablePropagationValue] = js.native
  /**
    * Enable or disable DNS support. Enabled by default.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.native
  /**
    * Indicates whether multicast is enabled on the transit gateway
    */
  var MulticastSupport: js.UndefOr[MulticastSupportValue] = js.native
  /**
    * Enable or disable Equal Cost Multipath Protocol support. Enabled by default.
    */
  var VpnEcmpSupport: js.UndefOr[VpnEcmpSupportValue] = js.native
}

object TransitGatewayRequestOptions {
  @scala.inline
  def apply(): TransitGatewayRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRequestOptions]
  }
  @scala.inline
  implicit class TransitGatewayRequestOptionsOps[Self <: TransitGatewayRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmazonSideAsn(value: Long): Self = this.set("AmazonSideAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmazonSideAsn: Self = this.set("AmazonSideAsn", js.undefined)
    @scala.inline
    def setAutoAcceptSharedAttachments(value: AutoAcceptSharedAttachmentsValue): Self = this.set("AutoAcceptSharedAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAcceptSharedAttachments: Self = this.set("AutoAcceptSharedAttachments", js.undefined)
    @scala.inline
    def setDefaultRouteTableAssociation(value: DefaultRouteTableAssociationValue): Self = this.set("DefaultRouteTableAssociation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRouteTableAssociation: Self = this.set("DefaultRouteTableAssociation", js.undefined)
    @scala.inline
    def setDefaultRouteTablePropagation(value: DefaultRouteTablePropagationValue): Self = this.set("DefaultRouteTablePropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRouteTablePropagation: Self = this.set("DefaultRouteTablePropagation", js.undefined)
    @scala.inline
    def setDnsSupport(value: DnsSupportValue): Self = this.set("DnsSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsSupport: Self = this.set("DnsSupport", js.undefined)
    @scala.inline
    def setMulticastSupport(value: MulticastSupportValue): Self = this.set("MulticastSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulticastSupport: Self = this.set("MulticastSupport", js.undefined)
    @scala.inline
    def setVpnEcmpSupport(value: VpnEcmpSupportValue): Self = this.set("VpnEcmpSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnEcmpSupport: Self = this.set("VpnEcmpSupport", js.undefined)
  }
  
}

