package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserRequest extends StObject {
  
  /**
    * A system-assigned unique identifier for a server instance that has the user assigned to it.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
  
  /**
    * A unique string that identifies a user that is being deleted from a server.
    */
  var UserName: typings.awsSdk.transferMod.UserName
}
object DeleteUserRequest {
  
  inline def apply(ServerId: ServerId, UserName: UserName): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserRequest]
  }
  
  extension [Self <: DeleteUserRequest](x: Self) {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
