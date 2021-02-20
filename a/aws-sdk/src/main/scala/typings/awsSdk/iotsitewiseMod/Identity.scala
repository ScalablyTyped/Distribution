package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identity extends StObject {
  
  /**
    * An AWS SSO group identity.
    */
  var group: js.UndefOr[GroupIdentity] = js.native
  
  /**
    * An IAM user identity.
    */
  var iamUser: js.UndefOr[IAMUserIdentity] = js.native
  
  /**
    * An AWS SSO user identity.
    */
  var user: js.UndefOr[UserIdentity] = js.native
}
object Identity {
  
  @scala.inline
  def apply(): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  implicit class IdentityMutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: GroupIdentity): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setIamUser(value: IAMUserIdentity): Self = StObject.set(x, "iamUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUserUndefined: Self = StObject.set(x, "iamUser", js.undefined)
    
    @scala.inline
    def setUser(value: UserIdentity): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
