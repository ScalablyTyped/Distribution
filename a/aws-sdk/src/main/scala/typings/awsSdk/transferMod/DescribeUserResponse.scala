package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserResponse extends StObject {
  
  /**
    * A system-assigned unique identifier for a server that has this user assigned.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
  
  /**
    * An array containing the properties of the user account for the ServerID value that you specified.
    */
  var User: DescribedUser = js.native
}
object DescribeUserResponse {
  
  @scala.inline
  def apply(ServerId: ServerId, User: DescribedUser): DescribeUserResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserResponse]
  }
  
  @scala.inline
  implicit class DescribeUserResponseMutableBuilder[Self <: DescribeUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: DescribedUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
  }
}
