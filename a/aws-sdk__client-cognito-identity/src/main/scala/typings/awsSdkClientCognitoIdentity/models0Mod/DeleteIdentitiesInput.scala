package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIdentitiesInput extends js.Object {
  
  /**
    * <p>A list of 1-60 identities that you want to delete.</p>
    */
  var IdentityIdsToDelete: js.UndefOr[js.Array[String]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "DeleteIdentitiesInput")
@js.native
object DeleteIdentitiesInput extends js.Object {
  
  def filterSensitiveLog(obj: DeleteIdentitiesInput): js.Any = js.native
}
