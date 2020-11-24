package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpenIdTokenForDeveloperIdentityResponse extends js.Object {
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  
  /**
    * <p>An OpenID token.</p>
    */
  var Token: js.UndefOr[String] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetOpenIdTokenForDeveloperIdentityResponse")
@js.native
object GetOpenIdTokenForDeveloperIdentityResponse extends js.Object {
  
  def filterSensitiveLog(obj: GetOpenIdTokenForDeveloperIdentityResponse): js.Any = js.native
}
