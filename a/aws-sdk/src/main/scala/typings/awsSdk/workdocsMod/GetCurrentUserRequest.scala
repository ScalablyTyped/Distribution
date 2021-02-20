package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCurrentUserRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token.
    */
  var AuthenticationToken: AuthenticationHeaderType = js.native
}
object GetCurrentUserRequest {
  
  @scala.inline
  def apply(AuthenticationToken: AuthenticationHeaderType): GetCurrentUserRequest = {
    val __obj = js.Dynamic.literal(AuthenticationToken = AuthenticationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentUserRequest]
  }
  
  @scala.inline
  implicit class GetCurrentUserRequestMutableBuilder[Self <: GetCurrentUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
  }
}
