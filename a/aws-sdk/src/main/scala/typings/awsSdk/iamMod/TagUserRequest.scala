package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagUserRequest extends StObject {
  
  /**
    * The list of tags that you want to attach to the IAM user. Each tag consists of a key name and an associated value.
    */
  var Tags: tagListType
  
  /**
    * The name of the IAM user to which you want to add tags. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType
}
object TagUserRequest {
  
  inline def apply(Tags: tagListType, UserName: existingUserNameType): TagUserRequest = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagUserRequest]
  }
  
  extension [Self <: TagUserRequest](x: Self) {
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
