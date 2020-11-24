package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpenIdTokenResponse extends js.Object {
  
  /**
    * <p>A unique identifier in the format REGION:GUID. Note that the IdentityId returned may
    *          not match the one passed on input.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  
  /**
    * <p>An OpenID token, valid for 10 minutes.</p>
    */
  var Token: js.UndefOr[String] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetOpenIdTokenResponse")
@js.native
object GetOpenIdTokenResponse extends js.Object {
  
  def filterSensitiveLog(obj: GetOpenIdTokenResponse): js.Any = js.native
}
