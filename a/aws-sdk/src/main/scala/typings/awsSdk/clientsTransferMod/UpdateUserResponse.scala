package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserResponse extends StObject {
  
  /**
    * A system-assigned unique identifier for a server instance that the user account is assigned to.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
  
  /**
    * The unique identifier for a user that is assigned to a server instance that was specified in the request.
    */
  var UserName: typings.awsSdk.clientsTransferMod.UserName
}
object UpdateUserResponse {
  
  inline def apply(ServerId: ServerId, UserName: UserName): UpdateUserResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserResponse]
  }
  
  extension [Self <: UpdateUserResponse](x: Self) {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
