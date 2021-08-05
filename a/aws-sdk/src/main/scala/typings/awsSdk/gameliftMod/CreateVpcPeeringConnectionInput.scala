package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcPeeringConnectionInput extends StObject {
  
  /**
    * A unique identifier for a fleet. You can use either the fleet ID or ARN value. This tells Amazon GameLift which GameLift VPC to peer with. 
    */
  var FleetId: typings.awsSdk.gameliftMod.FleetId
  
  /**
    * A unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You can find your Account ID in the AWS Management Console under account settings.
    */
  var PeerVpcAwsAccountId: NonZeroAndMaxString
  
  /**
    * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same Region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
    */
  var PeerVpcId: NonZeroAndMaxString
}
object CreateVpcPeeringConnectionInput {
  
  inline def apply(FleetId: FleetId, PeerVpcAwsAccountId: NonZeroAndMaxString, PeerVpcId: NonZeroAndMaxString): CreateVpcPeeringConnectionInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], PeerVpcAwsAccountId = PeerVpcAwsAccountId.asInstanceOf[js.Any], PeerVpcId = PeerVpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcPeeringConnectionInput]
  }
  
  extension [Self <: CreateVpcPeeringConnectionInput](x: Self) {
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setPeerVpcAwsAccountId(value: NonZeroAndMaxString): Self = StObject.set(x, "PeerVpcAwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setPeerVpcId(value: NonZeroAndMaxString): Self = StObject.set(x, "PeerVpcId", value.asInstanceOf[js.Any])
  }
}
