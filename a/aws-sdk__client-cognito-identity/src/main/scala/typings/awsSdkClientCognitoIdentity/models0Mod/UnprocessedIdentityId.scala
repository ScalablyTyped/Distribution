package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnprocessedIdentityId extends js.Object {
  
  /**
    * <p>The error code indicating the type of error that occurred.</p>
    */
  var ErrorCode: js.UndefOr[typings.awsSdkClientCognitoIdentity.models0Mod.ErrorCode | String] = js.native
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "UnprocessedIdentityId")
@js.native
object UnprocessedIdentityId extends js.Object {
  
  def filterSensitiveLog(obj: UnprocessedIdentityId): js.Any = js.native
}
