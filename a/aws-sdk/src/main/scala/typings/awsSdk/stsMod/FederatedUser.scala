package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FederatedUser extends js.Object {
  
  /**
    * The ARN that specifies the federated user that is associated with the credentials. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide. 
    */
  var Arn: arnType = js.native
  
  /**
    * The string that identifies the federated user associated with the credentials, similar to the unique ID of an IAM user.
    */
  var FederatedUserId: federatedIdType = js.native
}
object FederatedUser {
  
  @scala.inline
  def apply(Arn: arnType, FederatedUserId: federatedIdType): FederatedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], FederatedUserId = FederatedUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedUser]
  }
  
  @scala.inline
  implicit class FederatedUserOps[Self <: FederatedUser] (val x: Self) extends AnyVal {
    
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
    def setArn(value: arnType): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFederatedUserId(value: federatedIdType): Self = this.set("FederatedUserId", value.asInstanceOf[js.Any])
  }
}
