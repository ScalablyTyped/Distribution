package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagUserRequest extends StObject {
  
  /**
    * The list of tags that you want to attach to the user. Each tag consists of a key name and an associated value.
    */
  var Tags: tagListType
  
  /**
    * The name of the user that you want to add tags to. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@-
    */
  var UserName: existingUserNameType
}
object TagUserRequest {
  
  @scala.inline
  def apply(Tags: tagListType, UserName: existingUserNameType): TagUserRequest = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagUserRequest]
  }
  
  @scala.inline
  implicit class TagUserRequestMutableBuilder[Self <: TagUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
