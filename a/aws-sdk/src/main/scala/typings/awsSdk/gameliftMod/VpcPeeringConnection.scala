package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnection extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift fleet resource for this connection. 
    */
  var FleetArn: js.UndefOr[typings.awsSdk.gameliftMod.FleetArn] = js.native
  /**
    * A unique identifier for a fleet. This ID determines the ID of the Amazon GameLift VPC for your fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
  /**
    * A unique identifier for the VPC that contains the Amazon GameLift fleet for this connection. This VPC is managed by Amazon GameLift and does not appear in your AWS account. 
    */
  var GameLiftVpcId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * CIDR block of IPv4 addresses assigned to the VPC peering connection for the GameLift VPC. The peered VPC also has an IPv4 CIDR block associated with it; these blocks cannot overlap or the peering connection cannot be created. 
    */
  var IpV4CidrBlock: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same Region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
    */
  var PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * The status information about the connection. Status indicates if a connection is pending, successful, or failed.
    */
  var Status: js.UndefOr[VpcPeeringConnectionStatus] = js.native
  /**
    * A unique identifier that is automatically assigned to the connection record. This ID is referenced in VPC peering connection events, and is used when deleting a connection with DeleteVpcPeeringConnection. 
    */
  var VpcPeeringConnectionId: js.UndefOr[NonZeroAndMaxString] = js.native
}

object VpcPeeringConnection {
  @scala.inline
  def apply(
    FleetArn: FleetArn = null,
    FleetId: FleetId = null,
    GameLiftVpcId: NonZeroAndMaxString = null,
    IpV4CidrBlock: NonZeroAndMaxString = null,
    PeerVpcId: NonZeroAndMaxString = null,
    Status: VpcPeeringConnectionStatus = null,
    VpcPeeringConnectionId: NonZeroAndMaxString = null
  ): VpcPeeringConnection = {
    val __obj = js.Dynamic.literal()
    if (FleetArn != null) __obj.updateDynamic("FleetArn")(FleetArn.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (GameLiftVpcId != null) __obj.updateDynamic("GameLiftVpcId")(GameLiftVpcId.asInstanceOf[js.Any])
    if (IpV4CidrBlock != null) __obj.updateDynamic("IpV4CidrBlock")(IpV4CidrBlock.asInstanceOf[js.Any])
    if (PeerVpcId != null) __obj.updateDynamic("PeerVpcId")(PeerVpcId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (VpcPeeringConnectionId != null) __obj.updateDynamic("VpcPeeringConnectionId")(VpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcPeeringConnection]
  }
}

