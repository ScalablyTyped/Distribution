package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoginProfileResponse extends StObject {
  
  /**
    * A structure containing the user name and password create date for the user.
    */
  var LoginProfile: typings.awsSdk.iamMod.LoginProfile = js.native
}
object GetLoginProfileResponse {
  
  @scala.inline
  def apply(LoginProfile: LoginProfile): GetLoginProfileResponse = {
    val __obj = js.Dynamic.literal(LoginProfile = LoginProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoginProfileResponse]
  }
  
  @scala.inline
  implicit class GetLoginProfileResponseMutableBuilder[Self <: GetLoginProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoginProfile(value: LoginProfile): Self = StObject.set(x, "LoginProfile", value.asInstanceOf[js.Any])
  }
}
