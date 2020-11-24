package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserResponse extends js.Object {
  
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
  implicit class DescribeUserResponseOps[Self <: DescribeUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setServerId(value: ServerId): Self = this.set("ServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: DescribedUser): Self = this.set("User", value.asInstanceOf[js.Any])
  }
}
