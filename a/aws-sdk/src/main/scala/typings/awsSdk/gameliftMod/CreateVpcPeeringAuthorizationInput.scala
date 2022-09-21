package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcPeeringAuthorizationInput extends StObject {
  
  /**
    * A unique identifier for the Amazon Web Services account that you use to manage your GameLift fleet. You can find your Account ID in the Amazon Web Services Management Console under account settings.
    */
  var GameLiftAwsAccountId: NonZeroAndMaxString
  
  /**
    * A unique identifier for a VPC with resources to be accessed by your GameLift fleet. The VPC must be in the same Region as your fleet. To look up a VPC ID, use the VPC Dashboard in the Amazon Web Services Management Console. Learn more about VPC peering in VPC Peering with GameLift Fleets.
    */
  var PeerVpcId: NonZeroAndMaxString
}
object CreateVpcPeeringAuthorizationInput {
  
  inline def apply(GameLiftAwsAccountId: NonZeroAndMaxString, PeerVpcId: NonZeroAndMaxString): CreateVpcPeeringAuthorizationInput = {
    val __obj = js.Dynamic.literal(GameLiftAwsAccountId = GameLiftAwsAccountId.asInstanceOf[js.Any], PeerVpcId = PeerVpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcPeeringAuthorizationInput]
  }
  
  extension [Self <: CreateVpcPeeringAuthorizationInput](x: Self) {
    
    inline def setGameLiftAwsAccountId(value: NonZeroAndMaxString): Self = StObject.set(x, "GameLiftAwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setPeerVpcId(value: NonZeroAndMaxString): Self = StObject.set(x, "PeerVpcId", value.asInstanceOf[js.Any])
  }
}
