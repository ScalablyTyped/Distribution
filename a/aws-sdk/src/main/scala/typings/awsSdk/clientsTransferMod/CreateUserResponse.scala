package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserResponse extends StObject {
  
  /**
    * The identifier of the server that the user is attached to.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
  
  /**
    * A unique string that identifies a user account associated with a server.
    */
  var UserName: typings.awsSdk.clientsTransferMod.UserName
}
object CreateUserResponse {
  
  inline def apply(ServerId: ServerId, UserName: UserName): CreateUserResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUserResponse] (val x: Self) extends AnyVal {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
