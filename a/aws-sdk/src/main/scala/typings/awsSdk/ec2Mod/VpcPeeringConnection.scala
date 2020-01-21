package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnection extends js.Object {
  /**
    * Information about the accepter VPC. CIDR block information is only returned when describing an active VPC peering connection.
    */
  var AccepterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.native
  /**
    * The time that an unaccepted VPC peering connection will expire.
    */
  var ExpirationTime: js.UndefOr[DateTime] = js.native
  /**
    * Information about the requester VPC. CIDR block information is only returned when describing an active VPC peering connection.
    */
  var RequesterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.native
  /**
    * The status of the VPC peering connection.
    */
  var Status: js.UndefOr[VpcPeeringConnectionStateReason] = js.native
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.native
}

object VpcPeeringConnection {
  @scala.inline
  def apply(
    AccepterVpcInfo: VpcPeeringConnectionVpcInfo = null,
    ExpirationTime: DateTime = null,
    RequesterVpcInfo: VpcPeeringConnectionVpcInfo = null,
    Status: VpcPeeringConnectionStateReason = null,
    Tags: TagList = null,
    VpcPeeringConnectionId: String = null
  ): VpcPeeringConnection = {
    val __obj = js.Dynamic.literal()
    if (AccepterVpcInfo != null) __obj.updateDynamic("AccepterVpcInfo")(AccepterVpcInfo.asInstanceOf[js.Any])
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime.asInstanceOf[js.Any])
    if (RequesterVpcInfo != null) __obj.updateDynamic("RequesterVpcInfo")(RequesterVpcInfo.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcPeeringConnectionId != null) __obj.updateDynamic("VpcPeeringConnectionId")(VpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcPeeringConnection]
  }
}

