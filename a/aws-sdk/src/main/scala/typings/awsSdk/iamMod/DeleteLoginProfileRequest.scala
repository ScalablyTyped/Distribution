package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLoginProfileRequest extends StObject {
  
  /**
    * The name of the user whose password you want to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType = js.native
}
object DeleteLoginProfileRequest {
  
  @scala.inline
  def apply(UserName: userNameType): DeleteLoginProfileRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoginProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteLoginProfileRequestMutableBuilder[Self <: DeleteLoginProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
