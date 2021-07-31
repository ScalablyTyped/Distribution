package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserResponse extends StObject {
  
  /**
    * The user information.
    */
  var User: js.UndefOr[typings.awsSdk.workdocsMod.User] = js.undefined
}
object CreateUserResponse {
  
  @scala.inline
  def apply(): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserResponse]
  }
  
  @scala.inline
  implicit class CreateUserResponseMutableBuilder[Self <: CreateUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
