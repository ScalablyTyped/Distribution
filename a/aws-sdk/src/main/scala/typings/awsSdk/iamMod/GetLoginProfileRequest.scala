package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoginProfileRequest extends StObject {
  
  /**
    * The name of the user whose login profile you want to retrieve. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType
}
object GetLoginProfileRequest {
  
  @scala.inline
  def apply(UserName: userNameType): GetLoginProfileRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoginProfileRequest]
  }
  
  @scala.inline
  implicit class GetLoginProfileRequestMutableBuilder[Self <: GetLoginProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
