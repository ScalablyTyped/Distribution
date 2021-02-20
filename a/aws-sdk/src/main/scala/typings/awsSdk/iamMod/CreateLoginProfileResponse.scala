package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLoginProfileResponse extends StObject {
  
  /**
    * A structure containing the user name and password create date.
    */
  var LoginProfile: typings.awsSdk.iamMod.LoginProfile = js.native
}
object CreateLoginProfileResponse {
  
  @scala.inline
  def apply(LoginProfile: LoginProfile): CreateLoginProfileResponse = {
    val __obj = js.Dynamic.literal(LoginProfile = LoginProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoginProfileResponse]
  }
  
  @scala.inline
  implicit class CreateLoginProfileResponseMutableBuilder[Self <: CreateLoginProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoginProfile(value: LoginProfile): Self = StObject.set(x, "LoginProfile", value.asInstanceOf[js.Any])
  }
}
