package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIdentitiesResponse extends js.Object {
  
  /**
    * <p>An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and
    *          IdentityId.</p>
    */
  var UnprocessedIdentityIds: js.UndefOr[js.Array[UnprocessedIdentityId]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "DeleteIdentitiesResponse")
@js.native
object DeleteIdentitiesResponse extends js.Object {
  
  def filterSensitiveLog(obj: DeleteIdentitiesResponse): js.Any = js.native
}
