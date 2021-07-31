package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserRequest extends StObject {
  
  /**
    * The name of the user to get information about. This parameter is optional. If it is not included, it defaults to the user making the request. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.undefined
}
object GetUserRequest {
  
  @scala.inline
  def apply(): GetUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserRequest]
  }
  
  @scala.inline
  implicit class GetUserRequestMutableBuilder[Self <: GetUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
