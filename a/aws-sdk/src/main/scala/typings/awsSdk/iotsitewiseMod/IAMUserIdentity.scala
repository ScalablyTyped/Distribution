package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAMUserIdentity extends js.Object {
  
  /**
    * The ARN of the IAM user. IAM users must have the iotsitewise:CreatePresignedPortalUrl permission to sign in to the portal. For more information, see IAM ARNs in the IAM User Guide.  If you delete the IAM user, access policies that contain this identity include an empty arn. You can delete the access policy for the IAM user that no longer exists. 
    */
  var arn: ARN = js.native
}
object IAMUserIdentity {
  
  @scala.inline
  def apply(arn: ARN): IAMUserIdentity = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAMUserIdentity]
  }
  
  @scala.inline
  implicit class IAMUserIdentityOps[Self <: IAMUserIdentity] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ARN): Self = this.set("arn", value.asInstanceOf[js.Any])
  }
}
