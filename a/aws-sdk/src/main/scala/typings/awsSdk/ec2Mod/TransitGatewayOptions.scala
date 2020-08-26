package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayOptions extends js.Object {
  /**
    * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.native
  /**
    * The ID of the default association route table.
    */
  var AssociationDefaultRouteTableId: js.UndefOr[String] = js.native
  /**
    * Indicates whether attachment requests are automatically accepted.
    */
  var AutoAcceptSharedAttachments: js.UndefOr[AutoAcceptSharedAttachmentsValue] = js.native
  /**
    * Indicates whether resource attachments are automatically associated with the default association route table.
    */
  var DefaultRouteTableAssociation: js.UndefOr[DefaultRouteTableAssociationValue] = js.native
  /**
    * Indicates whether resource attachments automatically propagate routes to the default propagation route table.
    */
  var DefaultRouteTablePropagation: js.UndefOr[DefaultRouteTablePropagationValue] = js.native
  /**
    * Indicates whether DNS support is enabled.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.native
  /**
    * Indicates whether multicast is enabled on the transit gateway
    */
  var MulticastSupport: js.UndefOr[MulticastSupportValue] = js.native
  /**
    * The ID of the default propagation route table.
    */
  var PropagationDefaultRouteTableId: js.UndefOr[String] = js.native
  /**
    * Indicates whether Equal Cost Multipath Protocol support is enabled.
    */
  var VpnEcmpSupport: js.UndefOr[VpnEcmpSupportValue] = js.native
}

object TransitGatewayOptions {
  @scala.inline
  def apply(): TransitGatewayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayOptions]
  }
  @scala.inline
  implicit class TransitGatewayOptionsOps[Self <: TransitGatewayOptions] (val x: Self) extends AnyVal {
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
    def setAssociationDefaultRouteTableId(value: String): Self = this.set("AssociationDefaultRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationDefaultRouteTableId: Self = this.set("AssociationDefaultRouteTableId", js.undefined)
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
    def setPropagationDefaultRouteTableId(value: String): Self = this.set("PropagationDefaultRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropagationDefaultRouteTableId: Self = this.set("PropagationDefaultRouteTableId", js.undefined)
    @scala.inline
    def setVpnEcmpSupport(value: VpnEcmpSupportValue): Self = this.set("VpnEcmpSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnEcmpSupport: Self = this.set("VpnEcmpSupport", js.undefined)
  }
  
}

