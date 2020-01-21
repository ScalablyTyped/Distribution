package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayMulticastDomainAssociation extends js.Object {
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
  /**
    * The type of resource, for example a VPC attachment.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.native
  /**
    * The subnet associated with the transit gateway multicast domain.
    */
  var Subnet: js.UndefOr[SubnetAssociation] = js.native
  /**
    * The ID of the transit gateway attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.native
}

object TransitGatewayMulticastDomainAssociation {
  @scala.inline
  def apply(
    ResourceId: String = null,
    ResourceType: TransitGatewayAttachmentResourceType = null,
    Subnet: SubnetAssociation = null,
    TransitGatewayAttachmentId: String = null
  ): TransitGatewayMulticastDomainAssociation = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Subnet != null) __obj.updateDynamic("Subnet")(Subnet.asInstanceOf[js.Any])
    if (TransitGatewayAttachmentId != null) __obj.updateDynamic("TransitGatewayAttachmentId")(TransitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayMulticastDomainAssociation]
  }
}

