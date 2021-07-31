package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserResponse extends StObject {
  
  /**
    * The user information.
    */
  var User: js.UndefOr[typings.awsSdk.workdocsMod.User] = js.undefined
}
object UpdateUserResponse {
  
  @scala.inline
  def apply(): UpdateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserResponse]
  }
  
  @scala.inline
  implicit class UpdateUserResponseMutableBuilder[Self <: UpdateUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
