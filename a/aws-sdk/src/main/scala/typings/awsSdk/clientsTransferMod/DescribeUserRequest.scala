package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserRequest extends StObject {
  
  /**
    * A system-assigned unique identifier for a server that has this user assigned.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
  
  /**
    * The name of the user assigned to one or more servers. User names are part of the sign-in credentials to use the Transfer Family service and perform file transfer tasks.
    */
  var UserName: typings.awsSdk.clientsTransferMod.UserName
}
object DescribeUserRequest {
  
  inline def apply(ServerId: ServerId, UserName: UserName): DescribeUserRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserRequest]
  }
  
  extension [Self <: DescribeUserRequest](x: Self) {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
