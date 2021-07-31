package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminCreateUserResponse extends StObject {
  
  /**
    * The newly created user.
    */
  var User: js.UndefOr[UserType] = js.undefined
}
object AdminCreateUserResponse {
  
  @scala.inline
  def apply(): AdminCreateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminCreateUserResponse]
  }
  
  @scala.inline
  implicit class AdminCreateUserResponseMutableBuilder[Self <: AdminCreateUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: UserType): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
