package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyUser extends StObject {
  
  /**
    * The stable and unique string identifying the user. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var UserId: js.UndefOr[idType] = js.native
  
  /**
    * The name (friendly name, not ARN) identifying the user.
    */
  var UserName: js.UndefOr[userNameType] = js.native
}
object PolicyUser {
  
  @scala.inline
  def apply(): PolicyUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyUser]
  }
  
  @scala.inline
  implicit class PolicyUserMutableBuilder[Self <: PolicyUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserId(value: idType): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
