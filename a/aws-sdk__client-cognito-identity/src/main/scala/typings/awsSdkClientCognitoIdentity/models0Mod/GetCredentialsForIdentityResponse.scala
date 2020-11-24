package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCredentialsForIdentityResponse extends js.Object {
  
  /**
    * <p>Credentials for the provided identity ID.</p>
    */
  var Credentials: js.UndefOr[typings.awsSdkClientCognitoIdentity.models0Mod.Credentials] = js.native
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetCredentialsForIdentityResponse")
@js.native
object GetCredentialsForIdentityResponse extends js.Object {
  
  def filterSensitiveLog(obj: GetCredentialsForIdentityResponse): js.Any = js.native
}
