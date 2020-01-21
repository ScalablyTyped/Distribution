package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointDetails extends js.Object {
  /**
    * A list of address allocation IDs that are required to attach an Elastic IP address to your SFTP server's endpoint. This is only valid in the UpdateServer API.  This property can only be use when EndpointType is set to VPC. 
    */
  var AddressAllocationIds: js.UndefOr[typings.awsSdk.transferMod.AddressAllocationIds] = js.native
  /**
    * A list of subnet IDs that are required to host your SFTP server endpoint in your VPC.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.transferMod.SubnetIds] = js.native
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.transferMod.VpcEndpointId] = js.native
  /**
    * The VPC ID of the virtual private cloud in which the SFTP server's endpoint will be hosted.
    */
  var VpcId: js.UndefOr[typings.awsSdk.transferMod.VpcId] = js.native
}

object EndpointDetails {
  @scala.inline
  def apply(
    AddressAllocationIds: AddressAllocationIds = null,
    SubnetIds: SubnetIds = null,
    VpcEndpointId: VpcEndpointId = null,
    VpcId: VpcId = null
  ): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    if (AddressAllocationIds != null) __obj.updateDynamic("AddressAllocationIds")(AddressAllocationIds.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (VpcEndpointId != null) __obj.updateDynamic("VpcEndpointId")(VpcEndpointId.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointDetails]
  }
}

