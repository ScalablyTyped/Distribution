package typings.awsSdk.identitystoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserResponse extends js.Object {
  
  /**
    * The identifier for a user in the identity store.
    */
  var UserId: ResourceId = js.native
  
  /**
    * Contains the user’s username value. The length limit is 128 characters. This value can consist of letters, accented characters, symbols, numbers and punctuation. The characters “&lt;&gt;;:%” are excluded. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store.
    */
  var UserName: typings.awsSdk.identitystoreMod.UserName = js.native
}
object DescribeUserResponse {
  
  @scala.inline
  def apply(UserId: ResourceId, UserName: UserName): DescribeUserResponse = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
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
    def setUserId(value: ResourceId): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: UserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
}
