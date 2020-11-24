package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends js.Object
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ErrorCode")
@js.native
object ErrorCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCode with String] = js.native
  
  @js.native
  sealed trait ACCESS_DENIED extends ErrorCode
  /* "AccessDenied" */ @js.native
  object ACCESS_DENIED extends TopLevel[ACCESS_DENIED with String]
  
  @js.native
  sealed trait INTERNAL_SERVER_ERROR extends ErrorCode
  /* "InternalServerError" */ @js.native
  object INTERNAL_SERVER_ERROR extends TopLevel[INTERNAL_SERVER_ERROR with String]
}
