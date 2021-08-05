package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identity extends StObject {
  
  /**
    * An AWS SSO group identity.
    */
  var group: js.UndefOr[GroupIdentity] = js.undefined
  
  /**
    * An IAM user identity.
    */
  var iamUser: js.UndefOr[IAMUserIdentity] = js.undefined
  
  /**
    * An AWS SSO user identity.
    */
  var user: js.UndefOr[UserIdentity] = js.undefined
}
object Identity {
  
  inline def apply(): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identity]
  }
  
  extension [Self <: Identity](x: Self) {
    
    inline def setGroup(value: GroupIdentity): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setIamUser(value: IAMUserIdentity): Self = StObject.set(x, "iamUser", value.asInstanceOf[js.Any])
    
    inline def setIamUserUndefined: Self = StObject.set(x, "iamUser", js.undefined)
    
    inline def setUser(value: UserIdentity): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
