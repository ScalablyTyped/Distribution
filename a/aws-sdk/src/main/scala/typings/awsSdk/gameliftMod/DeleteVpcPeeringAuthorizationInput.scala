package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcPeeringAuthorizationInput extends StObject {
  
  /**
    * A unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find your Account ID in the AWS Management Console under account settings.
    */
  var GameLiftAwsAccountId: NonZeroAndMaxString
  
  /**
    * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same Region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
    */
  var PeerVpcId: NonZeroAndMaxString
}
object DeleteVpcPeeringAuthorizationInput {
  
  inline def apply(GameLiftAwsAccountId: NonZeroAndMaxString, PeerVpcId: NonZeroAndMaxString): DeleteVpcPeeringAuthorizationInput = {
    val __obj = js.Dynamic.literal(GameLiftAwsAccountId = GameLiftAwsAccountId.asInstanceOf[js.Any], PeerVpcId = PeerVpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcPeeringAuthorizationInput]
  }
  
  extension [Self <: DeleteVpcPeeringAuthorizationInput](x: Self) {
    
    inline def setGameLiftAwsAccountId(value: NonZeroAndMaxString): Self = StObject.set(x, "GameLiftAwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setPeerVpcId(value: NonZeroAndMaxString): Self = StObject.set(x, "PeerVpcId", value.asInstanceOf[js.Any])
  }
}
