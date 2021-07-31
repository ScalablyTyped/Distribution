package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagUserRequest extends StObject {
  
  /**
    * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified user.
    */
  var TagKeys: tagKeyListType
  
  /**
    * The name of the IAM user from which you want to remove tags. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@-
    */
  var UserName: existingUserNameType
}
object UntagUserRequest {
  
  @scala.inline
  def apply(TagKeys: tagKeyListType, UserName: existingUserNameType): UntagUserRequest = {
    val __obj = js.Dynamic.literal(TagKeys = TagKeys.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagUserRequest]
  }
  
  @scala.inline
  implicit class UntagUserRequestMutableBuilder[Self <: UntagUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagKeys(value: tagKeyListType): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: tagKeyType*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
    
    @scala.inline
    def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
