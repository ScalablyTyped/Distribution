package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAMUserIdentity extends StObject {
  
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
  implicit class IAMUserIdentityMutableBuilder[Self <: IAMUserIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
