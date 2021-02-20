package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUserProfileRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user to delete from AWS CodeStar.
    */
  var userArn: UserArn = js.native
}
object DeleteUserProfileRequest {
  
  @scala.inline
  def apply(userArn: UserArn): DeleteUserProfileRequest = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteUserProfileRequestMutableBuilder[Self <: DeleteUserProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
