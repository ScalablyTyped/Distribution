package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var UserArn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the user account.
    */
  var UserId: js.UndefOr[typings.awsSdk.connectMod.UserId] = js.native
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
    def setUserArn(value: ARN): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
    
    @scala.inline
    def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
