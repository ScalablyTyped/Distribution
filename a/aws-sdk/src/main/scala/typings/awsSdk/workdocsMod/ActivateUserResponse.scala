package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivateUserResponse extends StObject {
  
  /**
    * The user information.
    */
  var User: js.UndefOr[typings.awsSdk.workdocsMod.User] = js.native
}
object ActivateUserResponse {
  
  @scala.inline
  def apply(): ActivateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivateUserResponse]
  }
  
  @scala.inline
  implicit class ActivateUserResponseMutableBuilder[Self <: ActivateUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
