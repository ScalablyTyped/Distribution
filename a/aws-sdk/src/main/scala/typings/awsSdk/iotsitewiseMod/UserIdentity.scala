package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserIdentity extends StObject {
  
  /**
    * The AWS SSO ID of the user.
    */
  var id: IdentityId = js.native
}
object UserIdentity {
  
  @scala.inline
  def apply(id: IdentityId): UserIdentity = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentity]
  }
  
  @scala.inline
  implicit class UserIdentityMutableBuilder[Self <: UserIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IdentityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
