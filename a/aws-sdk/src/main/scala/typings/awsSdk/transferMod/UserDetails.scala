package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDetails extends StObject {
  
  /**
    * The system-assigned unique identifier for a Transfer server instance. 
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
  
  /**
    * The system-assigned unique identifier for a session that corresponds to the workflow.
    */
  var SessionId: js.UndefOr[typings.awsSdk.transferMod.SessionId] = js.undefined
  
  /**
    * A unique string that identifies a user account associated with a server.
    */
  var UserName: typings.awsSdk.transferMod.UserName
}
object UserDetails {
  
  inline def apply(ServerId: ServerId, UserName: UserName): UserDetails = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDetails]
  }
  
  extension [Self <: UserDetails](x: Self) {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
