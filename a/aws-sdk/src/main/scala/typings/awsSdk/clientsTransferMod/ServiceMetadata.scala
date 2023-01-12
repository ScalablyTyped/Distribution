package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceMetadata extends StObject {
  
  /**
    * The Server ID (ServerId), Session ID (SessionId) and user (UserName) make up the UserDetails.
    */
  var UserDetails: typings.awsSdk.clientsTransferMod.UserDetails
}
object ServiceMetadata {
  
  inline def apply(UserDetails: UserDetails): ServiceMetadata = {
    val __obj = js.Dynamic.literal(UserDetails = UserDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceMetadata] (val x: Self) extends AnyVal {
    
    inline def setUserDetails(value: UserDetails): Self = StObject.set(x, "UserDetails", value.asInstanceOf[js.Any])
  }
}
