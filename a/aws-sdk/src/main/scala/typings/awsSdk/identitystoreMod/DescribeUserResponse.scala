package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserResponse extends StObject {
  
  /**
    * The identifier for a user in the identity store.
    */
  var UserId: ResourceId
  
  /**
    * Contains the user’s username value. The length limit is 128 characters. This value can consist of letters, accented characters, symbols, numbers and punctuation. The characters “&lt;&gt;;:%” are excluded. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store.
    */
  var UserName: typings.awsSdk.identitystoreMod.UserName
}
object DescribeUserResponse {
  
  @scala.inline
  def apply(UserId: ResourceId, UserName: UserName): DescribeUserResponse = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserResponse]
  }
  
  @scala.inline
  implicit class DescribeUserResponseMutableBuilder[Self <: DescribeUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserId(value: ResourceId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
