package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserRequest extends StObject {
  
  /**
    * A system-assigned unique identifier for a server that has this user assigned.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
  
  /**
    * The name of the user assigned to one or more servers. User names are part of the sign-in credentials to use the AWS Transfer Family service and perform file transfer tasks.
    */
  var UserName: typings.awsSdk.transferMod.UserName = js.native
}
object DescribeUserRequest {
  
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): DescribeUserRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserRequest]
  }
  
  @scala.inline
  implicit class DescribeUserRequestMutableBuilder[Self <: DescribeUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
