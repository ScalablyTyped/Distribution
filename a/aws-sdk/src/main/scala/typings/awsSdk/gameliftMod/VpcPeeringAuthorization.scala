package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcPeeringAuthorization extends js.Object {
  
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
  implicit class VpcPeeringAuthorizationOps[Self <: VpcPeeringAuthorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: Timestamp): Self = this.set("ExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationTime: Self = this.set("ExpirationTime", js.undefined)
    
    @scala.inline
    def setGameLiftAwsAccountId(value: NonZeroAndMaxString): Self = this.set("GameLiftAwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameLiftAwsAccountId: Self = this.set("GameLiftAwsAccountId", js.undefined)
    
    @scala.inline
    def setPeerVpcAwsAccountId(value: NonZeroAndMaxString): Self = this.set("PeerVpcAwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerVpcAwsAccountId: Self = this.set("PeerVpcAwsAccountId", js.undefined)
    
    @scala.inline
    def setPeerVpcId(value: NonZeroAndMaxString): Self = this.set("PeerVpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerVpcId: Self = this.set("PeerVpcId", js.undefined)
  }
}
