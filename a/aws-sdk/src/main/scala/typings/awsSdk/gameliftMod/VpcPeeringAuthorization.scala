package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcPeeringAuthorization extends StObject {
  
  /**
    * Time stamp indicating when this authorization was issued. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Time stamp indicating when this authorization expires (24 hours after issuance). Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var ExpirationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * A unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find your Account ID in the AWS Management Console under account settings.
    */
  var GameLiftAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * 
    */
  var PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same Region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
    */
  var PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.native
}
object VpcPeeringAuthorization {
  
  @scala.inline
  def apply(): VpcPeeringAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringAuthorization]
  }
  
  @scala.inline
  implicit class VpcPeeringAuthorizationMutableBuilder[Self <: VpcPeeringAuthorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: Timestamp): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    @scala.inline
    def setGameLiftAwsAccountId(value: NonZeroAndMaxString): Self = StObject.set(x, "GameLiftAwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameLiftAwsAccountIdUndefined: Self = StObject.set(x, "GameLiftAwsAccountId", js.undefined)
    
    @scala.inline
    def setPeerVpcAwsAccountId(value: NonZeroAndMaxString): Self = StObject.set(x, "PeerVpcAwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerVpcAwsAccountIdUndefined: Self = StObject.set(x, "PeerVpcAwsAccountId", js.undefined)
    
    @scala.inline
    def setPeerVpcId(value: NonZeroAndMaxString): Self = StObject.set(x, "PeerVpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerVpcIdUndefined: Self = StObject.set(x, "PeerVpcId", js.undefined)
  }
}
