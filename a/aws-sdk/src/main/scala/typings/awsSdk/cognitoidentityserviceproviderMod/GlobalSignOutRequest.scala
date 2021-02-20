package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalSignOutRequest extends StObject {
  
  /**
    * The access token.
    */
  var AccessToken: TokenModelType = js.native
}
object GlobalSignOutRequest {
  
  @scala.inline
  def apply(AccessToken: TokenModelType): GlobalSignOutRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalSignOutRequest]
  }
  
  @scala.inline
  implicit class GlobalSignOutRequestMutableBuilder[Self <: GlobalSignOutRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
  }
}
