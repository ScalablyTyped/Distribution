package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends StObject
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ErrorCode")
@js.native
object ErrorCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCode with String] = js.native
  
  @js.native
  sealed trait ACCESS_DENIED extends ErrorCode
  /* "AccessDenied" */ val ACCESS_DENIED: typings.awsSdkClientCognitoIdentity.models0Mod.ErrorCode.ACCESS_DENIED with String = js.native
  
  @js.native
  sealed trait INTERNAL_SERVER_ERROR extends ErrorCode
  /* "InternalServerError" */ val INTERNAL_SERVER_ERROR: typings.awsSdkClientCognitoIdentity.models0Mod.ErrorCode.INTERNAL_SERVER_ERROR with String = js.native
}
